package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public interface ObjectOperations<O> {
    public O newObject();
    public Iterable<O> readAll(BrontoReadRequest<O> request);

    public O get(BrontoReadRequest<O> request);
    public List<O> read(BrontoReadRequest<O> request);

    public WriteResult add(List<O> objects);
    public WriteResult update(List<O> objects);
    public WriteResult delete(List<O> objects);

    public WriteResult add(O...objects);
    public WriteResult update(O...objects);
    public WriteResult delete(O...objects);
}
