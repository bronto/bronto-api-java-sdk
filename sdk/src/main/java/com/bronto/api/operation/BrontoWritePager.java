package com.bronto.api.operation;

import java.util.Iterator;

import com.bronto.api.BrontoApi;
import com.bronto.api.model.WriteResult;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;

public class BrontoWritePager<O> implements Iterator<WriteResult> {
    private final BrontoApi client;
    private final ApiReflection reflect;
    private final BrontoWriteBatch<O> batches;

    public BrontoWritePager(BrontoApi client, ApiReflection reflect, BrontoWriteBatch<O> batches) {
        this.client = client;
        this.reflect = reflect;
        this.batches = batches;
    }

    @Override
    public boolean hasNext() {
        return batches.hasNext();
    }

    @Override
    public WriteResult next() {
        String methodName = batches.getMethod();
        final Object call = reflect.fillMethodCall(methodName, batches.next());
        BrontoClientRequest<WriteResult> request = reflect.createMethodRequest(methodName, call);
        return client.invoke(request);
    }

    @Override
    public void remove() {
        batches.remove();
    }
}
