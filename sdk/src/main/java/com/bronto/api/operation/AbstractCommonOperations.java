package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.BrontoClientException;
import com.bronto.api.CommonOperations;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.request.BrontoReadPager;

import java.util.Iterator;

public abstract class AbstractCommonOperations<C extends BrontoApi, O> implements CommonOperations<O> {
    protected final C client;
    protected final Class<O> clazz;
    protected final ApiReflection reflect;

    public AbstractCommonOperations(Class<O> clazz, C client) {
        this.clazz = clazz;
        this.client = client;
        this.reflect = getSupportedWriteOperations();
    }

    public abstract ApiReflection getSupportedWriteOperations();

    @Override
    public O newObject() {
        try {
            return (O) clazz.newInstance();
        } catch (Exception e) {
            throw new BrontoClientException(e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterable<O> readAll(final BrontoReadRequest<O> request) {
        return new Iterable<O>() {
            @Override
            public Iterator<O> iterator() {
                return new BrontoReadPager(client, request);
            }
        };
    }
}
