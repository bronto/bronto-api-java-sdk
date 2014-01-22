package com.bronto.api.delivery;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;
import com.bronto.api.AbstractObjectOperations;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.Future;

public class DeliveryGroupOperations extends AbstractObjectOperations<DeliveryGroupObject> {
    public DeliveryGroupOperations(BrontoClient client) {
        super(client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("deliveryGroups",
            "add",
            "addOrUpdate",
            "update",
            "delete");
    }

    public Future<WriteResult> addOrUpdate(List<DeliveryGroupObject> deliveryGroups) {
        return callWrite("addOrUpdate", deliveryGroups);
    }

    public void addOrUpdate(List<DeliveryGroupObject> deliveryGroups, AsyncHandler<WriteResult> handler) {
        callWrite("addOrUpdate", deliveryGroups, handler);
    }
}
