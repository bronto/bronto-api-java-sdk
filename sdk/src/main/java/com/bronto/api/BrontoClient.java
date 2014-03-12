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
    private final int retryLimit;
    private final BrontoSoapPortType apiService;
    private SessionHeader header;
    private BrontoApiObserver observer;

    public BrontoClient(String apiToken, int retryLimit, long retryStep) {
        this.retryLimit = retryLimit;
        this.apiToken = apiToken;
        this.triesToBackOff = new long[retryLimit];
        header = new SessionHeader();
        apiService = new BrontoSoapApiImplService().getBrontoSoapApiImplPort();
        for (int i = 0; i < retryLimit; i++) {
            this.triesToBackOff[i] = retryStep * i;
        }
    }

    public BrontoClient(String apiToken) {
        this(apiToken, RETRY_LIMIT, RETRY_STEP);
    }

    public BrontoClient(String apiToken, int retryLimit) {
        this(apiToken, retryLimit, RETRY_STEP);
    }

    public BrontoClient(String apiToken, long retryStep) {
        this(apiToken, RETRY_LIMIT, retryStep);
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
    public BrontoApiObserver getObserver() {
        return observer;
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
        while (retry < retryLimit) {
            try {
                return request.invoke(apiService, getSessionHeader());
            } catch (Exception e) {
                BrontoClientException brontoEx = new BrontoClientException(e);
                if (brontoEx.isInvalidSession()) {
                    String sessionId = login();
                    if (observer != null) {
                        observer.onSessionRefresh(this, sessionId);
                    }
                } else if (brontoEx.isRecoverable()) {
                    retry++;
                    if (retry < retryLimit) {
                        // Backk off of the API a little bit
                        try {
                            Thread.sleep(triesToBackOff[retry]);
                        } catch (InterruptedException ie) {
                            throw new RuntimeException(ie);
                        }
                    }
                } else {
                    throw brontoEx;
                }
            }
        }
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
