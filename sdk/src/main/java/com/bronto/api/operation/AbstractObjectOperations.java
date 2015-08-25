package com.bronto.api.operation;

import java.util.Arrays;
import java.util.List;

import com.bronto.api.BrontoApi;
import com.bronto.api.ObjectOperations;
import com.bronto.api.model.WriteResult;
import com.bronto.api.request.BrontoReadRequest;

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

    @SafeVarargs
    @Override
    public final WriteResult add(O... objects) {
        return add(Arrays.asList(objects));
    }

    @SafeVarargs
    @Override
    public final WriteResult update(O... objects) {
        return update(Arrays.asList(objects));
    }

    @SafeVarargs
    @Override
    public final WriteResult delete(O... objects) {
        return delete(Arrays.asList(objects));
    }
}
