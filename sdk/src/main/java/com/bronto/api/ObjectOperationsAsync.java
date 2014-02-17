package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public interface ObjectOperationsAsync<O> extends CommonOperations<O> {
    public Future<O> get(BrontoReadRequest<O> request);
    public Future<List<O>> read(BrontoReadRequest<O> request);

    public Future<WriteResult> add(List<O> objects);
    public Future<WriteResult> update(List<O> objects);
    public Future<WriteResult> delete(List<O> objects);

    public Future<WriteResult> add(O...objects);
    public Future<WriteResult> update(O...objects);
    public Future<WriteResult> delete(O...objects);

    public <V> Future<V> get(BrontoReadRequest<O> request, AsyncHandler<O, V> handler);
    public <V> Future<V> read(BrontoReadRequest<O> request, AsyncHandler<List<O>, V> handler);

    public <V> Future<V> add(List<O> objects, AsyncHandler<WriteResult, V> handler);
    public <V> Future<V> update(List<O> objects, AsyncHandler<WriteResult, V> handler);
    public <V> Future<V> delete(List<O> objects, AsyncHandler<WriteResult, V> handler);
}
