package com.bronto.api;

public class BrontoClientOptions {
    public static int RETRY_LIMIT = 5;
    public static int RETRY_STEP = 5000;
    public static int CONNECTION_TIMEOUT = 5000;
    public static int READ_TIMEOUT = 30000;

    private int retryLimit = RETRY_LIMIT;
    private int retryStep = RETRY_STEP;
    private int connectionTimeout = CONNECTION_TIMEOUT;
    private int readTimeout = READ_TIMEOUT;
    private BrontoApiObserver observer;
    private BrontoApiRetryer<?> retryer;

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public int getRetryLimit() {
        return retryLimit;
    }

    public int getRetryStep() {
        return retryStep;
    }

    public BrontoApiRetryer<?> getRetryer() {
        return retryer;
    }

    public BrontoApiObserver getObserver() {
        return observer;
    }

    public BrontoClientOptions setRetryLimit(int retryLimit) {
        this.retryLimit = retryLimit;
        return this;
    }

    public BrontoClientOptions setRetryStep(int retryStep) {
        this.retryStep = retryStep;
        return this;
    }

    public BrontoClientOptions setRetryer(BrontoApiRetryer<?> retryer) {
        this.retryer = retryer;
        return this;
    }

    public BrontoClientOptions setObserver(BrontoApiObserver observer) {
        this.observer = observer;
        return this;
    }

    public BrontoClientOptions setConnecitonTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public BrontoClientOptions setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    @Override
    public String toString() {
        return "BrontoClientOptions: [retryLimit=" + retryLimit + ", retryStep=" + retryStep + ", readTimeout=" + readTimeout + ", connectionTimeout=" + connectionTimeout + "]";
    }
}
