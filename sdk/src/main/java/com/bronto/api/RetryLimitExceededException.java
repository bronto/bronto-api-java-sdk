package com.bronto.api;

public class RetryLimitExceededException extends BrontoClientException {
    
	private static final long serialVersionUID = 1359096895447715669L;

	public RetryLimitExceededException(BrontoClientException e) {
        super(e == null ? new RuntimeException("Exceeded retry limit") : e);
    }
}
