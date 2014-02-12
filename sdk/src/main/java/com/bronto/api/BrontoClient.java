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
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@SuppressWarnings("unchecked")
public class BrontoClient implements BrontoApi {
    private final String apiToken;
    private SessionHeader header;
    private BrontoSoapPortType apiService;
    private ExecutorService executor;
    private final int retryLimit;

    public BrontoClient(String apiToken, int retryLimit, ExecutorService executor) {
        this.executor = executor;
        this.retryLimit = retryLimit;
        this.apiToken = apiToken;
        apiService = new BrontoSoapApiImplService().getBrontoSoapApiImplPort();
        header = new SessionHeader();
    }

    public BrontoClient(String apiToken, ExecutorService service) {
        this(apiToken, RETRY_LIMIT, service);
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

    public <T> Future<T> async(final BrontoClientRequest<T> request) {
        return executor.submit(new Callable<T>() {
            @Override
            public T call() {
                return invoke(request);
            }
        });
    }

    public <T> void async(final BrontoClientRequest<T> request, final AsyncHandler<T> callback) {
        executor.submit(new Runnable() {
            @Override
            public void run() {
                T result;
                try {
                    callback.onSuccess(invoke(request));
                } catch (Exception e) {
                    callback.onError(e);
                }
            }
        });
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
