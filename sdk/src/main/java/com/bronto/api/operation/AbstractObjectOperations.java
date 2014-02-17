package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.BrontoClientException;
import com.bronto.api.ObjectOperations;
import com.bronto.api.request.BrontoClientRequest;
import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.request.BrontoReadPager;

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

public abstract class AbstractObjectOperations<O> extends AbstractCommonOperations<BrontoApi, O> implements ObjectOperations<O> {

    public AbstractObjectOperations(Class<O> clazz, BrontoApi client) {
        super(clazz, client);
    }

    protected WriteResult callWrite(final String method, List<O> objects) {
        final Object call = reflect.fillMethodCall(method, objects);
        return callClient(method, call);
    }

    protected WriteResult callClient(final String method, final Object call) {
        return client.invoke(reflect.createMethodRequest(method, call));
    }

    @Override
    public O get(BrontoReadRequest<O> request) {
        List<O> results = read(request);
        return results.isEmpty() ? null : results.get(0);
    }

    @Override
    public List<O> read(BrontoReadRequest<O> request) {
        return client.invoke(request);
    }

    @Override
    public WriteResult add(List<O> objects) {
        return callWrite("add", objects);
    }

    @Override
    public WriteResult update(List<O> objects) {
        return callWrite("update", objects);
    }

    @Override
    public WriteResult delete(List<O> objects) {
        return callWrite("delete", objects);
    }

    @Override
    public WriteResult add(O...objects) {
        return add(Arrays.asList(objects));
    }

    @Override
    public WriteResult update(O...objects) {
        return update(Arrays.asList(objects));
    }

    @Override
    public WriteResult delete(O...objects) {
        return delete(Arrays.asList(objects));
    }
}
