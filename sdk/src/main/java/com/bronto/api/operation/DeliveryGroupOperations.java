package com.bronto.api.operation;

import com.bronto.api.BrontoApi;
import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.AddToDeliveryGroup;
import com.bronto.api.model.DeliveryGroupIds;
import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

public class DeliveryGroupOperations extends AbstractObjectOperations<DeliveryGroupObject> {
    public DeliveryGroupOperations(BrontoApi client) {
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

    public WriteResult addOrUpdate(List<DeliveryGroupObject> deliveryGroups) {
        return callWrite("addOrUpdate", deliveryGroups);
    }

    public WriteResult addOrUpdate(DeliveryGroupObject...deliveryGroups) {
        return addOrUpdate(Arrays.asList(deliveryGroups));
    }

    public WriteResult addToDeliveryGroup(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids) {
        return callClient("addToDeliveryGroup", createAddToDeliveryGroupCall(deliveryGroup, ids));
    }

    public AddToDeliveryGroup createAddToDeliveryGroupCall(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids) {
        AddToDeliveryGroup add = new AddToDeliveryGroup();
        add.setDeliveryGroup(deliveryGroup);
        add.getMessageIds().addAll(ids.getMessageIds());
        add.getDeliveryIds().addAll(ids.getDeliveryIds());
        add.getMessageRuleIds().addAll(ids.getMessageRuleIds());
        return add;
    }
}
