package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToSMSKeyword;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.RemoveFromSMSKeyword;
import com.bronto.api.model.SmsKeywordObject;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public class SmsKeywordOperations extends AbstractObjectOperations<SmsKeywordObject> {
    public SmsKeywordOperations(BrontoClient client) {
        super(SmsKeywordObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("sMSKeywords",
            "add",
            "update",
            "delete",
            "class:" + AddToSMSKeyword.class.getSimpleName(),
            "class:" + RemoveFromSMSKeyword.class.getSimpleName());
    }

    private RemoveFromSMSKeyword createRemoveCall(SmsKeywordObject keyword, List<ContactObject> contacts) {
        RemoveFromSMSKeyword removeFromKeyword = new RemoveFromSMSKeyword();
        removeFromKeyword.setKeyword(keyword);
        removeFromKeyword.getContacts().addAll(contacts);
        return removeFromKeyword;
    }

    private AddToSMSKeyword createAddCall(SmsKeywordObject keyword, List<ContactObject> contacts) {
        AddToSMSKeyword addToKeyword = new AddToSMSKeyword();
        addToKeyword.setKeyword(keyword);
        addToKeyword.getContacts().addAll(contacts);
        return addToKeyword;
    }

    public Future<WriteResult> removeFromKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClientAsync("removeFromSMSKeyword", createRemoveCall(keyword, contacts));
    }

    public Future<WriteResult> addToKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClientAsync("addToSMSKeyword", createAddCall(keyword, contacts));
    }

    public void removeFromKeyword(SmsKeywordObject keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("removeFromSMSKeyword", createRemoveCall(keyword, contacts), handler);
    }

    public void addToKeyword(SmsKeywordObject keyword, List<ContactObject> contacts, AsyncHandler<WriteResult> handler) {
        callClientAsync("addToSMSKeyword", createAddCall(keyword, contacts), handler);
    }
}
