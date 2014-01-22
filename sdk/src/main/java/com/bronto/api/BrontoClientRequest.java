package com.bronto.api;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

public interface BrontoClientRequest<T> {
    public T invoke(BrontoSoapPortType service, SessionHeader header) throws Exception;
}
