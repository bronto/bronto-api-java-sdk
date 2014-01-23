package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public interface ObjectOperations<O> {
    public O newObject();
    public Iterable<O> readAll(BrontoReadRequest<O> request);

    public Future<O> get(BrontoReadRequest<O> request);
    public Future<List<O>> read(BrontoReadRequest<O> request);
    public Future<WriteResult> add(List<O> objects);
    public Future<WriteResult> update(List<O> objects);
    public Future<WriteResult> delete(List<O> objects);

    public void get(BrontoReadRequest<O> request, AsyncHandler<O> handler);
    public void read(BrontoReadRequest<O> request, AsyncHandler<List<O>> handler);
    public void add(List<O> objects, AsyncHandler<WriteResult> handler);
    public void update(List<O> objects, AsyncHandler<WriteResult> handler);
    public void delete(List<O> objects, AsyncHandler<WriteResult> handler);
}
