package com.bronto.api;

import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;
import com.bronto.api.operation.AbstractObjectOperations;

import com.bronto.api.model.BrontoSoapApiImplService;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BrontoClient implements BrontoApi {
    private final long[] triesToBackOff;
    private final String apiToken;
    private final BrontoSoapPortType apiService;
    private final BrontoClientOptions options;
    private SessionHeader header;
    private BrontoApiObserver observer;

    public BrontoClient(String apiToken, BrontoClientOptions options) {
        this.apiToken = apiToken;
        this.options = options;
        this.triesToBackOff = new long[options.getRetryLimit()];
        header = new SessionHeader();
        apiService = new BrontoSoapApiImplService().getBrontoSoapApiImplPort();
        for (int i = 0; i < options.getRetryLimit(); i++) {
            this.triesToBackOff[i] = options.getRetryStep() * i;
        }
    }

    public BrontoClient(String apiToken) {
        this(apiToken, new BrontoClientOptions());
    }

    @Override
    public BrontoSoapPortType getService() {
        return apiService;
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
        do {
            try {
                return request.invoke(apiService, getSessionHeader());
            } catch (Exception e) {
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
                    retry++;
                    if (retry < options.getRetryLimit()) {
                        backOff(retry);
                    } else if (options.getRetryer() != null && writeEx != null) {
                        options.getRetryer().save(writeEx.getWriteContext());
                    }
                } else {
                    throw brontoEx;
                }
            }
        } while (retry < options.getRetryLimit());
        throw new RuntimeException("Exceeded retry limit");
    }

    protected void backOff(int retry) {
        // Back off of the API a little bit
        try {
            Thread.sleep(triesToBackOff[retry]);
        } catch (InterruptedException ie) {
            throw new RuntimeException(ie);
        }
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
