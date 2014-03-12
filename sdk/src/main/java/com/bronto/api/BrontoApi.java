package com.bronto.api;

import com.bronto.api.request.BrontoClientRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

public interface BrontoApi {
    public static int RETRY_LIMIT = 5;
    public static long RETRY_STEP = 5000l;

    public BrontoSoapPortType getService();
    public boolean isAuthenticated();
    public SessionHeader getSessionHeader();
    public BrontoApiObserver getObserver();
    public String login();
    public String getToken();
    public <T> T invoke(final BrontoClientRequest<T> request);
    public <T> ObjectOperations<T> transport(final Class<T> clazz);
}
