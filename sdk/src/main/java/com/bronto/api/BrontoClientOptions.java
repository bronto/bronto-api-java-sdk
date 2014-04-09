package com.bronto.api;

public class BrontoClientOptions {
    public static int RETRY_LIMIT = 5;
    public static long RETRY_STEP = 5000l;

    private int retryLimit = RETRY_LIMIT;
    private long retryStep = RETRY_STEP;
    private BrontoApiObserver observer;
    private BrontoApiRetryer retryer;

    public int getRetryLimit() {
        return retryLimit;
    }

    public long getRetryStep() {
        return retryStep;
    }

    public BrontoApiRetryer getRetryer() {
        return retryer;
    }

    public BrontoApiObserver getObserver() {
        return observer;
    }

    public BrontoClientOptions setRetryLimit(int retryLimit) {
        this.retryLimit = retryLimit;
        return this;
    }

    public BrontoClientOptions setRetryStep(long retryStep) {
        this.retryStep = retryStep;
        return this;
    }

    public BrontoClientOptions setRetryer(BrontoApiRetryer retryer) {
        this.retryer = retryer;
        return this;
    }

    public BrontoClientOptions setObserver(BrontoApiObserver observer) {
        this.observer = observer;
        return this;
    }
}
