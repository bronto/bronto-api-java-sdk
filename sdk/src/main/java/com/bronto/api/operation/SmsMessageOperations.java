package com.bronto.api.operation;

import com.bronto.api.BrontoClient;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.SmsMessageObject;

public class SmsMessageOperations extends AbstractObjectOperations<SmsMessageObject> {
    public SmsMessageOperations(BrontoClient client) {
        super(SmsMessageObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("sMSMessages",
            "add",
            "update",
            "delete");
    }
}
