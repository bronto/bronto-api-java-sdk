package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public interface AsyncObjectOperations<O> extends ObjectOperations<O> {
    public Future<O> getAsync(BrontoReadRequest<O> request);
    public Future<List<O>> readAsync(BrontoReadRequest<O> request);

    public Future<WriteResult> addAsync(List<O> objects);
    public Future<WriteResult> updateAsync(List<O> objects);
    public Future<WriteResult> deleteAsync(List<O> objects);

    public Future<WriteResult> addAsync(O...objects);
    public Future<WriteResult> updateAsync(O...objects);
    public Future<WriteResult> deleteAsync(O...objects);

    public void get(BrontoReadRequest<O> request, AsyncHandler<O> handler);
    public void read(BrontoReadRequest<O> request, AsyncHandler<List<O>> handler);
    public void add(List<O> objects, AsyncHandler<WriteResult> handler);
    public void update(List<O> objects, AsyncHandler<WriteResult> handler);
    public void delete(List<O> objects, AsyncHandler<WriteResult> handler);
}
