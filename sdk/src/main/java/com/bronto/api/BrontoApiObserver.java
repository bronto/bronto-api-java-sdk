package com.bronto.api;

import com.bronto.api.request.BrontoReadRequest;

public interface BrontoApiObserver {
    public void onSessionRefresh(BrontoApi client, String sessionId);
    public void onWrite(BrontoApi client, Class<?> objectClass, Object call);
    public void onRead(BrontoApi client, Class<?> objectClass, BrontoReadRequest<?> request);
}
