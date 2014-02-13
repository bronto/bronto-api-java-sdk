package com.bronto.api;

import com.bronto.api.request.BrontoClientRequest;
import java.util.concurrent.Future;

public interface BrontoApiAsync extends BrontoApi {
    public ExecutorService getExecutorService();
    public <T> Future<T> async(final BrontoClientRequest<T> request);
    public <T> void async(final BrontoClientRequest<T> request, final AsyncHandler<T> callback);
    public <T> AsyncObjectOperations<T> transportAsync(final Class<T> clazz);
}
