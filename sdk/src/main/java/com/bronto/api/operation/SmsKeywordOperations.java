package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToSMSKeyword;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.RemoveFromSMSKeyword;
import com.bronto.api.model.SmsKeywordObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

public class SmsKeywordOperations extends AbstractObjectOperations<SmsKeywordObject> {
    public SmsKeywordOperations(BrontoApi client) {
        super(SmsKeywordObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection(SmsKeywordObject.class,
            "add",
            "update",
            "delete",
            "class:" + AddToSMSKeyword.class.getSimpleName(),
            "class:" + RemoveFromSMSKeyword.class.getSimpleName());
    }

    public RemoveFromSMSKeyword createRemoveCall(SmsKeywordObject keyword, List<ContactObject> contacts) {
        RemoveFromSMSKeyword removeFromKeyword = new RemoveFromSMSKeyword();
        removeFromKeyword.setKeyword(keyword);
        removeFromKeyword.getContacts().addAll(contacts);
        return removeFromKeyword;
    }

    public AddToSMSKeyword createAddCall(SmsKeywordObject keyword, List<ContactObject> contacts) {
        AddToSMSKeyword addToKeyword = new AddToSMSKeyword();
        addToKeyword.setKeyword(keyword);
        addToKeyword.getContacts().addAll(contacts);
        return addToKeyword;
    }

    public WriteResult removeFromKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClient("removeFromSMSKeyword", createRemoveCall(keyword, contacts));
    }

    public WriteResult removeFromKeyword(SmsKeywordObject keyword, ContactObject...contacts) {
        return removeFromKeyword(keyword, Arrays.asList(contacts));
    }

    public WriteResult addToKeyword(SmsKeywordObject keyword, List<ContactObject> contacts) {
        return callClient("addToSMSKeyword", createAddCall(keyword, contacts));
    }

    public WriteResult addToKeyword(SmsKeywordObject keyword, ContactObject...contacts) {
        return addToKeyword(keyword, Arrays.asList(contacts));
    }
}
