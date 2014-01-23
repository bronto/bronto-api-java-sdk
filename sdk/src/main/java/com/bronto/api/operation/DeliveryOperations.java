package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;

import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.util.ConversionUtils;

import com.bronto.api.model.DeliveryObject;
import com.bronto.api.model.WriteResult;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

public class DeliveryOperations extends AbstractObjectOperations<DeliveryObject> {
    public DeliveryOperations(BrontoClient client) {
        super(DeliveryObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("deliveries",
            "add",
            "update",
            "delete");
    }

    public DeliveryObject newObject(Date startDate) {
        DeliveryObject delivery = newObject();
        delivery.setStart(ConversionUtils.toXMLCalendar(startDate));
        return delivery;
    }
}
