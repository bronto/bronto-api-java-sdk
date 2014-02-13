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
    private final String apiToken;
    private SessionHeader header;
    private BrontoSoapPortType apiService;
    private final int retryLimit;

    public BrontoClient(String apiToken, int retryLimit) {
        this.retryLimit = retryLimit;
        this.apiToken = apiToken;
        apiService = new BrontoSoapApiImplService().getBrontoSoapApiImplPort();
        header = new SessionHeader();
    }

    public BrontoClient(String apiToken) {
        this(apiToken, RETRY_LIMIT);
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
                if (brontoEx.isRecoverable()) {
                    login();
                    retry++;
                } else {
                    throw brontoEx;
                }
            }
        }
        throw new RuntimeException("Exceeded retry limit");
    }

    @Override
    public <T> ObjectOperations<T> transport(final Class<T> clazz) {
        return new AbstractObjectOperations<T, BrontoApi>(clazz, this) {
            @Override
            public ApiReflection getSupportedWriteOperations() {
                return new ApiReflection(clazz, "add", "update", "delete");
            }
        };
    }
}
