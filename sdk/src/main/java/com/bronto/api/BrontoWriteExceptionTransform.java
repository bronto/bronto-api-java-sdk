package com.bronto.api;

public interface BrontoWriteExceptionTransform<O> {
    public O transform(BrontoWriteException exception);
}
