package com.bronto.api;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.bronto.api.operation.AbstractAsyncObjectOperations;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;

public class BrontoClientAsync extends BrontoClient implements BrontoApiAsync {
    private ExecutorService executor;

    public BrontoClientAsync(String apiToken, BrontoClientOptions options, ExecutorService executor) {
        super(apiToken, options);
        this.executor = executor;
    }

    public BrontoClientAsync(String apiToken, ExecutorService executor) {
        this(apiToken, new BrontoClientOptions(), executor);
    }

    public BrontoClientAsync(String apiToken) {
        this(apiToken, Executors.newSingleThreadExecutor());
    }

    @Override
    public void shutdown() {
        executor.shutdown();
    }

    @Override
    public ExecutorService getExecutorService() {
        return executor;
    }

    @Override
    public <T> Future<T> async(final BrontoClientRequest<T> request) {
        return executor.submit(new Callable<T>() {
            @Override
            public T call() {
                return invoke(request);
            }
        });
    }

    @Override
    public <T, V> Future<V> async(final BrontoClientRequest<T> request, final AsyncHandler<T, V> callback) {
        return executor.submit(new Callable<V>() {
            @Override
            public V call() {
                try {
                    return callback.onSuccess(invoke(request));
                } catch (Exception e) {
                    callback.onError(e);
                    return null;
                }
            }
        });
    }

    @Override
    public <T> ObjectOperationsAsync<T> transportAsync(final Class<T> clazz) {
        return new AbstractAsyncObjectOperations<T>(clazz, this) {
            @Override
            public ApiReflection getSupportedWriteOperations() {
                return new ApiReflection(clazz, "add", "update", "delete");
            }
        };
    }
}
