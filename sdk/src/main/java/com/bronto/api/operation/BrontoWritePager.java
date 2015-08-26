package com.bronto.api.operation;

import java.util.Iterator;
import java.util.List;

import com.bronto.api.BrontoApi;
import com.bronto.api.BrontoClientException.Recoverable;
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
                List<O> batch = batches.getCurrentBatch();
                long startingIndex = batches.getStartingPageIndex();
                int errorIndex = 0;
                if (bwe.getRecoverable() == Recoverable.INVALID_REQUEST && batch.size() > 1) {
                    BrontoWriteBatch<O> child = new BrontoWriteBatch<O>(batches.getMethod(), 1, batch);
                    BrontoWritePager<O> pager = new BrontoWritePager<O>(client, reflect, child, this);
                    while (pager.hasNext()) {
                        ResultItem item = pager.next().getResults().get(0);
                        if (item.isIsError()) {
                            item.setId(Long.toString(startingIndex));
                            result.getErrors().add(errorIndex);
                        }
                        result.getResults().add(item);
                        startingIndex++;
                        errorIndex++;
                    }
                } else {
                    for (O object : batches.getCurrentBatch()) {
                        ResultItem item = new ResultItem();
                        item.setId(Long.toString(startingIndex));
                        item.setIsNew(false);
                        item.setIsError(true);
                        item.setErrorCode(bwe.getCode());
                        item.setErrorString(bwe.getMessage());
                        result.getResults().add(item);
                        result.getErrors().add(errorIndex);
                        startingIndex++;
                        errorIndex++;
                    }
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
