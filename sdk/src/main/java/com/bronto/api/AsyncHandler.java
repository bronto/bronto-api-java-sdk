package com.bronto.api;

public interface AsyncHandler<T> {
    public void onSuccess(T result);
    public void onError(Exception e);
}
