package com.bronto.api.request;

import com.bronto.api.AsyncHandler;
import com.bronto.api.ObjectOperations;

import java.util.List;

public abstract class AsyncReadPager<T> implements AsyncHandler<List<T>> {
    private final ObjectOperations<T> ops;
    private final BrontoReadRequest<T> read;

    public AsyncReadPager(ObjectOperations<T> ops, BrontoReadRequest<T> read) {
        this.ops = ops;
        this.read = read;
    }

    public ObjectOperations<T> getOperations() {
        return ops;
    }

    public BrontoReadRequest<T> getRequest() {
        return read;
    }

    @Override
    public void onSuccess(List<T> objects) {
        while (!objects.isEmpty()) {
            readObjects(objects);
            try {
                objects = ops.read(read.next()).get();
            } catch (Exception e) {
                onError(e);
            }
        }
    }

    public abstract void readObjects(List<T> objects);
}
