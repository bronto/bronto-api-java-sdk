package com.bronto.api;

public interface BrontoApiRetryer<A> {
    public boolean storeAttempt(WriteContext context);
    public boolean retry(A attempt);
}
