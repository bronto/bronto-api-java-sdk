package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToDeliveryGroup;
import com.bronto.api.model.DeliveryGroupIds;
import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.Future;

public class DeliveryGroupOperations extends AbstractObjectOperations<DeliveryGroupObject> {
    public DeliveryGroupOperations(BrontoClient client) {
        super(DeliveryGroupObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("deliveryGroups",
            "add",
            "addOrUpdate",
            "update",
            "delete",
            "class:" + AddToDeliveryGroup.class.getSimpleName());
    }

    public Future<WriteResult> addOrUpdate(List<DeliveryGroupObject> deliveryGroups) {
        return callWrite("addOrUpdate", deliveryGroups);
    }

    public void addOrUpdate(List<DeliveryGroupObject> deliveryGroups, AsyncHandler<WriteResult> handler) {
        callWrite("addOrUpdate", deliveryGroups, handler);
    }

    private AddToDeliveryGroup createAddToDeliveryGroupCall(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids) {
        AddToDeliveryGroup add = new AddToDeliveryGroup();
        add.setDeliveryGroup(deliveryGroup);
        add.getMessageIds().addAll(ids.getMessageIds());
        add.getDeliveryIds().addAll(ids.getDeliveryIds());
        add.getMessageRuleIds().addAll(ids.getMessageRuleIds());
        return add;
    }

    public Future<WriteResult> addToDeliveryGroup(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids) {
        return callClientAsync("addToDeliveryGroup", createAddToDeliveryGroupCall(deliveryGroup, ids));
    }

    public void addToDeliveryGroup(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids, AsyncHandler<WriteResult> handler) {
        callClientAsync("addToDeliveryGroup", createAddToDeliveryGroupCall(deliveryGroup, ids), handler);
    }
}
