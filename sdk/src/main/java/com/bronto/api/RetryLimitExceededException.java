package com.bronto.api;

public class RetryLimitExceededException extends BrontoClientException {
    public RetryLimitExceededException(BrontoClientException e) {
        super(e == null ? new RuntimeException("Exceeded retry limit") : e);
    }
}
