package com.bronto.api.sms;

import com.bronto.api.BrontoClient;
import com.bronto.api.AbstractObjectOperations;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.SmsMessageObject;

public class SmsMessageOperations extends AbstractObjectOperations<SmsMessageObject> {
    public SmsMessageOperations(BrontoClient client) {
        super(client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("sMSMessages",
            "add",
            "update",
            "delete");
    }
}
