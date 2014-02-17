package com.bronto.api;

public abstract class AsyncVoidHandler<T> implements AsyncHandler<T, Void> {
    @Override
    public Void onSuccess(T result) {
        onComplete(result);
        return null;
    }

    @Override
    public void onError(Exception e) {
        throw new RuntimeException(e);
    }

    public abstract void onComplete(T result);
}
