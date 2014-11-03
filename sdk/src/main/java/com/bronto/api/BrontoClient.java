package com.bronto.api;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import com.bronto.api.model.BrontoSoapApiImplService;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.operation.AbstractObjectOperations;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;

public class BrontoClient implements BrontoApi {
    private static final String[] SOAP_REQUEST_TIMEOUT = new String[] {
        "javax.xml.ws.client.receiveTimeout",
        "com.sun.xml.ws.request.timeout",
        "com.sun.xml.internal.ws.request.timeout"
    };
    private static final String[] SOAP_CONNECT_TIMEOUT = new String[] {
        "javax.xml.ws.client.connectionTimeout",
        "com.sun.xml.ws.connect.timeout",
        "com.sun.xml.internal.ws.connect.timeout"
    };

    private final int[] triesToBackOff;
    private final String apiToken;
    private final BrontoSoapApiImplService apiService;
    private final BrontoClientOptions options;
    private SessionHeader header;
    private BrontoApiObserver observer;

	/**
	 * Initializes a Bronto API client using the given API token, client
	 * options, and service implementation. The API implementation service
	 * passed here will be used, regardless of any client options provided.
	 * 
	 * @param apiToken
	 *            Your Bronto API token.
	 * @param options
	 *            Any client options.
	 * @param apiService
	 *            The API implementation service to use. This is the service
	 *            that will be used regardless of any client options passed in.
	 */
	public BrontoClient(String apiToken, BrontoClientOptions options,
	        BrontoSoapApiImplService apiService) {
		this.apiToken = apiToken;
		this.options = options;
		this.apiService = apiService;

		this.triesToBackOff = new int[options.getRetryLimit()];
        header = new SessionHeader();
        for (int i = 0; i < options.getRetryLimit(); i++) {
            this.triesToBackOff[i] = options.getRetryStep() * i;
        }
    }

	/**
	 * Initializes the Bronto API client using the given API token and options.
	 * This is the constructor that should be called to use a custom WSDL URL.
	 * 
	 * @param apiToken
	 *            Your Bronto API token.
	 * @param options
	 *            Any custom client options.
	 */
	public BrontoClient(String apiToken, BrontoClientOptions options) {

		/*
		 * This is ugly, but it ensures that the API service passed to the
		 * constructor uses a non-null WSDL location. It also allows potential
		 * future unit tests create a client with a custom-mocked API service as
		 * well.
		 */
		this(apiToken, options, (options.getWsdlURL() == null)
		        ? new BrontoSoapApiImplService()
		        : new BrontoSoapApiImplService(options.getWsdlURL()));
	}

    public BrontoClient(String apiToken) {
        this(apiToken, new BrontoClientOptions());
    }
    
    protected void backOff(int retry) {
        try {
            Thread.sleep(triesToBackOff[retry]);
        } catch (InterruptedException ie) {
            throw new BrontoClientException(ie);
        }
    }

    protected void setRequestTimeout(BrontoSoapPortType port, int adjust) {
        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
        for (String requestKey : SOAP_REQUEST_TIMEOUT) {
            requestContext.put(requestKey, options.getReadTimeout() + adjust);
        }
    }

    protected void setConnectTimeout(BrontoSoapPortType port, int adjust) {
        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
        for (String connectKey : SOAP_CONNECT_TIMEOUT) {
            requestContext.put(connectKey, options.getConnectionTimeout() + adjust);
        }
    }

    protected void setTimeouts(BrontoSoapPortType port, int adjust, BrontoClientException.Recoverable timeout) {
        Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
        if (timeout == BrontoClientException.Recoverable.READ_TIMEOUT) {
            setRequestTimeout(port, adjust);
        } else if (timeout == BrontoClientException.Recoverable.CONNECTION_TIMEOUT) {
            setConnectTimeout(port, adjust);
        }
    }

    @Override
    public BrontoSoapPortType getService() {
        BrontoSoapPortType port = apiService.getBrontoSoapApiImplPort();
        setTimeouts(port, 0, null);
        return port;
    }

    @Override
    public SessionHeader getSessionHeader() {
        return header;
    }

    @Override
    public boolean isAuthenticated() {
        return header.getSessionId() != null;
    }

    @Override
    public String getToken() {
        return apiToken;
    }

    @Override
    public BrontoClientOptions getOptions() {
        return options;
    }

    @Override
    public String login() {
        final String sessionId = invoke(new BrontoClientRequest<String>() {
            @Override
            public String invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
                return service.login(apiToken);
            }
        });
        header.setSessionId(sessionId);
        return sessionId;
    }

    @Override
    public <T> T invoke(final BrontoClientRequest<T> request) {
        int retry = 0;
        BrontoSoapPortType port = getService();
        do {
            try {
                return request.invoke(port, getSessionHeader());
            } catch (Exception e) {
                // TODO: fix this... error handler logic should be an implemented strategy
                BrontoWriteException writeEx = null;
                BrontoClientException brontoEx = null;
                if (e instanceof BrontoWriteException) {
                    writeEx = (BrontoWriteException) e;
                    brontoEx = writeEx;
                } else {
                    brontoEx = new BrontoClientException(e);
                }
                if (brontoEx.isInvalidSession()) {
                    String sessionId = login();
                    if (options.getObserver() != null) {
                        options.getObserver().onSessionRefresh(this, sessionId);
                    }
                } else if (brontoEx.isRecoverable()) {
                    // Received a timeout on a write, bail
                    if (brontoEx.isTimeout() && writeEx != null) {
                        throw brontoEx;
                    }
                    retry++;
                    if (retry < options.getRetryLimit()) {
                        if (brontoEx.isTimeout()) {
                            // Extend wait on a read timeout
                            setTimeouts(port, triesToBackOff[retry], brontoEx.getRecoverable());
                        } else {
                            // Service is unresponsive, delay and try again
                            backOff(retry);
                        }
                    } else if (options.getRetryer() != null && writeEx != null) {
                        options.getRetryer().storeAttempt(writeEx.getWriteContext());
                    }
                } else {
                    throw brontoEx;
                }
            }
        } while (retry < options.getRetryLimit());
        throw new RuntimeException("Exceeded retry limit");
    }

    @Override
    public <T> ObjectOperations<T> transport(final Class<T> clazz) {
        return new AbstractObjectOperations<T>(clazz, this) {
            @Override
            public ApiReflection getSupportedWriteOperations() {
                return new ApiReflection(clazz, "add", "update", "delete");
            }
        };
    }
}
