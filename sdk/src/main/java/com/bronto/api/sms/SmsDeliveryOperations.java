package com.bronto.api.sms;

import com.bronto.api.BrontoClient;
import com.bronto.api.AbstractObjectOperations;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.SmsDeliveryObject;

public class SmsDeliveryOperations extends AbstractObjectOperations<SmsDeliveryObject> {
    public SmsDeliveryOperations(BrontoClient client) {
        super(client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("sMSDeliveries",
            "add",
            "update",
            "delete");
    }
}
