package com.bronto.api;

public interface AsyncHandler<T, V> {
    public V onSuccess(T result);
    public void onError(Exception e);
}
