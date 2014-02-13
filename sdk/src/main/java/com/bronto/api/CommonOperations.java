package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;

import java.util.Iterator;

public interface CommonOperations<O> {
    public O newObject();
    public Iterable<O> readAll(BrontoReadRequest<O> request);
}
