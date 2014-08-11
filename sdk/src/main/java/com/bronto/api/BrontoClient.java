package com.bronto.api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;

import com.bronto.api.model.ApiException_Exception;
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

    public BrontoClient(String apiToken, BrontoClientOptions options) {
        this.apiToken = apiToken;
        this.options = options;
        this.apiService = new BrontoSoapApiImplService();
        this.triesToBackOff = new int[options.getRetryLimit()];
        header = new SessionHeader();
        for (int i = 0; i < options.getRetryLimit(); i++) {
            this.triesToBackOff[i] = options.getRetryStep() * i;
        }
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
        if (timeout == null || timeout == BrontoClientException.Recoverable.READ_TIMEOUT) {
            setRequestTimeout(port, adjust);
        } else if (timeout == null || timeout == BrontoClientException.Recoverable.CONNECTION_TIMEOUT) {
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
        return invoke(new BrontoClientRequest<String>() {
            @Override
            public String invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
                return header.getSessionId();
            }
        });
    }

    private String internalAuth(BrontoSoapPortType service) {
        // TODO: place injectable session from observer
        try {
            String sessionId = service.login(apiToken);
            if (options.getObserver() != null) {
                options.getObserver().onSessionRefresh(this, sessionId);
            }
            header.setSessionId(sessionId);
            return sessionId;
        } catch (ApiException_Exception ex) {
            throw new BrontoClientException(ex);
        }
    }

    @Override
    public <T> T invoke(final BrontoClientRequest<T> request) {
        int retry = 0;
        boolean reAuthed = false;
        BrontoClientException brontoEx = null;
        BrontoSoapPortType port = getService();
        do {
            try {
                if (!isAuthenticated()) {
                    internalAuth(port);
                }
                return request.invoke(port, getSessionHeader());
            } catch (Exception e) {
                // TODO: fix this... error handler logic should be an implemented strategy
                BrontoWriteException writeEx = null;
                if (e instanceof BrontoWriteException) {
                    writeEx = (BrontoWriteException) e;
                    brontoEx = writeEx;
                } else {
                    brontoEx = new BrontoClientException(e);
                }
                if (brontoEx.isInvalidSession()) {
                    if (reAuthed) {
                        retry++;
                    } else {
                        reAuthed = true;
                        internalAuth(port);
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
        throw new RetryLimitExceededException(brontoEx);
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
