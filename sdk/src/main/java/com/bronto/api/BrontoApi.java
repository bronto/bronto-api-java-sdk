package com.bronto.api;

import com.bronto.api.request.BrontoClientRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

public interface BrontoApi {
    public static int RETRY_LIMIT = 5;

    public BrontoSoapPortType getService();
    public boolean isAuthenticated();
    public SessionHeader getSessionHeader();
    public String login();
    public <T> T invoke(final BrontoClientRequest<T> request);
    public <T> ObjectOperations<T> transport(final Class<T> clazz);
}
