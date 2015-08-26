package com.bronto.api.operation;

import java.util.Iterator;

import com.bronto.api.BrontoApi;
import com.bronto.api.BrontoWriteException;
import com.bronto.api.BrontoWriteExceptionTransform;
import com.bronto.api.model.ResultItem;
import com.bronto.api.model.WriteResult;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;

public class BrontoWritePager<O> implements Iterator<WriteResult> {
    private final BrontoApi client;
    private final ApiReflection reflect;
    private final BrontoWriteBatch<O> batches;
    private final BrontoWriteExceptionTransform<WriteResult> handle;

    public BrontoWritePager(BrontoApi client, ApiReflection reflect, BrontoWriteBatch<O> batches, BrontoWriteExceptionTransform<WriteResult> handle) {
        this.client = client;
        this.reflect = reflect;
        this.batches = batches;
        this.handle = handle;
    }


    public BrontoWritePager(BrontoApi client, ApiReflection reflect, BrontoWriteBatch<O> batches) {
        this(client, reflect, batches, new BrontoWriteExceptionTransform<WriteResult>() {
            @Override
            public WriteResult transform(BrontoWriteException bwe) {
                WriteResult result = new WriteResult();
                for (O object : batches.getCurrentBatch()) {
                    ResultItem item = new ResultItem();
                    item.setId("-1");
                    item.setIsNew(false);
                    item.setIsError(true);
                    item.setErrorCode(bwe.getCode());
                    item.setErrorString(bwe.getMessage());
                }
                return result;
            }
        });
    }

    public BrontoWriteBatch<O> getBatches() {
        return batches;
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
        try {
            return client.invoke(request);
        } catch (BrontoWriteException bwe) {
            return handle.transform(bwe);
        }
    }

    @Override
    public void remove() {
        batches.remove();
    }
}
