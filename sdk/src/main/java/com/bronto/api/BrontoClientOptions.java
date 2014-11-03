package com.bronto.api;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.WebServiceException;

public class BrontoClientOptions {
    public static int WAIT_FOREVER = -1;
    public static int DEFAULT_RETRY_LIMIT = 5;
    public static int DEFAULT_RETRY_STEP = 5000;
    public static int DEFAULT_CONNECT_TIMEOUT= 5000;
    public static int DEFAULT_REQUEST_TIMEOUT= 30000;
	public static URL DEFAULT_WSDL_URL;
	public static WebServiceException DEFAULT_WEB_SERVICE_EXCEPTION;

	/*
	 * Initializes the URL for the default Bronto API WSDL. Make sure nothing
	 * crashes on an exception.
	 */
	static  {
		URL url = null;
		WebServiceException e = null;

		try {
			url = new URL("http://api.bronto.com/v4?wsdl");
		} catch (MalformedURLException ex) {
			e = new WebServiceException(ex);
		}

		DEFAULT_WSDL_URL = url;
		DEFAULT_WEB_SERVICE_EXCEPTION = e;
	}
	
    private int retryLimit = DEFAULT_RETRY_LIMIT;
    private int retryStep = DEFAULT_RETRY_STEP;
    private int connectionTimeout = DEFAULT_CONNECT_TIMEOUT;
    private int readTimeout = DEFAULT_REQUEST_TIMEOUT;
	private URL wsdlUrl = DEFAULT_WSDL_URL;
	private WebServiceException webserviceException =
	        DEFAULT_WEB_SERVICE_EXCEPTION;
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

	public URL getWsdlUrl() {
		/*
		 * Make sure there's a WSDL URL before returning anything. When there's
		 * no URL, return the most descriptive error available.
		 */
		if (wsdlUrl != null) {
			return wsdlUrl;
		} else if (webserviceException != null) {
			throw webserviceException;
		} else {
			throw new WebServiceException(new MalformedURLException(
			        "WSDL URL is null."));
		}
	}

	public BrontoClientOptions setWsdlUrl(String url) {
		/*
		 * Clear any existing exceptions because so far nothing has gone wrong,
		 * and presumably nothing will go wrong.
		 */
		try {
			webserviceException = null;
			wsdlUrl = new URL(url);
		}

		/* Something went wrong, store the error for reference. */
		catch (MalformedURLException mue) {
			webserviceException = new WebServiceException(mue);
		}

		return this;
	}

	@Override
    public String toString() {
		return "BrontoClientOptions: [retryLimit=" + retryLimit
		        + ", retryStep=" + retryStep + ", readTimeout=" + readTimeout
		        + ", connectionTimeout=" + connectionTimeout + ", wsdlUrl="
		        + wsdlUrl + "]";
    }
}
