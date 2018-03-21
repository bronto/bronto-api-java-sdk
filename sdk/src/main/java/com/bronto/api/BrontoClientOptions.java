package com.bronto.api;

import java.net.URL;

public class BrontoClientOptions {
    public static int WAIT_FOREVER = -1;
    public static int DEFAULT_RETRY_LIMIT = 5;
    public static int DEFAULT_RETRY_STEP = 5000;
    public static int DEFAULT_CONNECT_TIMEOUT= 5000;
    public static int DEFAULT_REQUEST_TIMEOUT= 30000;

    private int retryLimit = DEFAULT_RETRY_LIMIT;
    private int retryStep = DEFAULT_RETRY_STEP;
    private int connectionTimeout = DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = DEFAULT_REQUEST_TIMEOUT;
    private BrontoApiObserver observer;
    private BrontoApiRetryer<?> retryer;
	private URL wsdlURL;

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

	public URL getWsdlURL() {
		return this.wsdlURL;
	}

	public void setWsdlURL(URL wsdlURL) {
		this.wsdlURL = wsdlURL;
	}

	@Override
    public String toString() {
        return "BrontoClientOptions: [retryLimit=" + retryLimit + ", retryStep=" + retryStep + ", readTimeout=" + readTimeout + ", connectionTimeout=" + connectionTimeout + "]";
    }
}
