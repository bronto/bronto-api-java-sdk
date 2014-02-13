package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApiAsync;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.ContactObject;
import com.bronto.api.model.SmsKeywordObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

public class SmsKeywordOperationsAsync extends AbstractAsyncObjectOperations<SmsKeywordObject> {
    private SmsKeywordOperations keywordOps;

    public SmsKeywordOperationsAsync(BrontoApiAsync client) {
        super(SmsKeywordObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        this.keywordOps = new SmsKeywordOperations(client);
        return keywordOps.getSupportedWriteOperations();
    }

    public Future<WriteResult> removeFromKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClientAsync("removeFromSMSKeyword", keywordOps.createRemoveCall(keyword, contacts));
    }

    public Future<WriteResult> removeFromKeyword(SmsKeywordObject keyword, ContactObject...contacts) {
        return removeFromKeyword(keyword, Arrays.asList(contacts));
    }

    public Future<WriteResult> addToKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClientAsync("addToSMSKeyword", keywordOps.createAddCall(keyword, contacts));
    }

    public Future<WriteResult> addToKeyword(SmsKeywordObject keyword, ContactObject...contacts) {
        return addToKeyword(keyword, Arrays.asList(contacts));
    }

    public void removeFromKeyword(SmsKeywordObject keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("removeFromSMSKeyword", keywordOps.createRemoveCall(keyword, contacts), handler);
    }

    public void addToKeyword(SmsKeywordObject keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addToSMSKeyword", keywordOps.createAddCall(keyword, contacts), handler);
    }
}
