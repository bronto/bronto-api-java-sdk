package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;

import com.bronto.api.model.ResultItem;
import com.bronto.api.model.WriteResult;

import java.util.ArrayList;
import java.util.List;

public abstract class AsyncWriteHandler implements AsyncHandler<WriteResult> {
    @Override
    public void onSuccess(WriteResult writeResult) {
        List<ResultItem> errors = new ArrayList<ResultItem>();
        List<ResultItem> success = new ArrayList<ResultItem>();

        for (ResultItem result : writeResult.getResults()) {
            if (result.isIsError()) {
                errors.add(result);
            } else {
                success.add(result);
            }
        }

        if (!errors.isEmpty()) {
            onErrorItems(errors);
        }

        if (!success.isEmpty()) {
            onSuccessItems(success);
        }
    }

    public abstract void onErrorItems(List<ResultItem> errors);
    public abstract void onSuccessItems(List<ResultItem> items);
}
