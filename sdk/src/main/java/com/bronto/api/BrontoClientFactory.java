package com.bronto.api;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import java.util.concurrent.ExecutorService;
import java.util.Date;

public class BrontoClientFactory {
    private ExecutorService service;

    public BrontoClientFactory(ExecutorService service) {
        this.service = service;
    }

    public ExecutorService getExecutorService() {
        return this.service;
    }

    public void shutdown() {
        service.shutdown();
    }

    public BrontoClient getClient(String token) {
        return new BrontoClient(token, service);
    }

    public BrontoClient getClient(String token, int limit) {
        return new BrontoClient(token, limit, service);
    }
}
