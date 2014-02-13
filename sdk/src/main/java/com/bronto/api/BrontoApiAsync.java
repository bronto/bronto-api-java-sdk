package com.bronto.api;

import com.bronto.api.request.BrontoClientRequest;
import java.util.concurrent.Future;

import java.util.concurrent.ExecutorService;

public interface BrontoApiAsync extends BrontoApi {
    public void shutdown();
    public ExecutorService getExecutorService();
    public <T> Future<T> async(final BrontoClientRequest<T> request);
    public <T> void async(final BrontoClientRequest<T> request, final AsyncHandler<T> callback);
    public <T> AsyncObjectOperations<T> transportAsync(final Class<T> clazz);
}
