package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;
import com.bronto.api.BrontoClientException;
import com.bronto.api.ObjectOperations;
import com.bronto.api.request.BrontoClientRequest;
import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.request.BrontoReadPager;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.model.WriteResult;

import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import java.util.concurrent.Future;

public abstract class AbstractObjectOperations<O> implements ObjectOperations<O> {
    protected final BrontoClient client;
    protected final ApiReflection reflect;
    protected final Class<O> clazz;

    public AbstractObjectOperations(Class<O> clazz, BrontoClient client) {
        this.clazz = clazz;
        this.client = client;
        this.reflect = getSupportedWriteOperations();
    }

    public abstract ApiReflection getSupportedWriteOperations();

    protected Future<WriteResult> callWrite(final String method, List<O> objects) {
        final Object call = reflect.fillMethodCall(method, objects);
        return callClientAsync(method, call);
    }

    protected void callWrite(final String method, List<O> objects, AsyncHandler<WriteResult> handler) {
        final Object call = reflect.fillMethodCall(method, objects);
        callClientAsync(method, call, handler);
    }

    protected Future<WriteResult> callClientAsync(final String method, final Object call) {
        return client.async(reflect.createMethodRequest(method, call));
    }

    protected void callClientAsync(final String method, final Object call, final AsyncHandler<WriteResult> handler) {
        client.async(reflect.createMethodRequest(method, call), handler);
    }

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

    @Override
    public Future<List<O>> read(final BrontoReadRequest<O> request) {
        return client.async(request);
    }

    @Override
    public void read(final BrontoReadRequest<O> request, AsyncHandler<List<O>> handler) {
        client.async(request, handler);
    }

    @Override
    public Future<O> get(final BrontoReadRequest<O> request) {
        return client.async(new BrontoClientRequest<O>() {
            @Override
            public O invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
                return request.invoke(service, header).get(0);
            }
        });
    }

    @Override
    public void get(final BrontoReadRequest<O> request, final AsyncHandler<O> handler) {
        client.async(new BrontoClientRequest<O>() {
            @Override
            public O invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
                return request.invoke(service, header).get(0);
            }
        }, handler);
    }

    @Override
    public Future<WriteResult> add(List<O> objects) {
        return callWrite("add", objects);
    }

    @Override
    public Future<WriteResult> update(List<O> objects) {
        return callWrite("update", objects);
    }

    @Override
    public Future<WriteResult> delete(List<O> objects) {
        return callWrite("delete", objects);
    }

    @Override
    public void add(List<O> objects, AsyncHandler<WriteResult> handler) {
        callWrite("add", objects, handler);
    }

    @Override
    public void update(List<O> objects, AsyncHandler<WriteResult> handler) {
        callWrite("update", objects, handler);
    }

    @Override
    public void delete(List<O> objects, AsyncHandler<WriteResult> handler) {
        callWrite("delete", objects, handler);
    }
}
