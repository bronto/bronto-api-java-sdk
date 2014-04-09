package com.bronto.api;

public interface BrontoApiRetryer {
    public boolean save(WriteContext context);
    public boolean retry(Object id);
}
