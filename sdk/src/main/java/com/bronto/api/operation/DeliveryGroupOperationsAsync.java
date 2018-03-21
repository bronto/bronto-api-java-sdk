package com.bronto.api.operation;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApiAsync;
import com.bronto.api.model.DeliveryGroupIds;
import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.WriteResult;
import com.bronto.api.reflect.ApiReflection;

public class DeliveryGroupOperationsAsync extends AbstractAsyncObjectOperations<DeliveryGroupObject> {
    private DeliveryGroupOperations deliveryGroupOps;

    public DeliveryGroupOperationsAsync(BrontoApiAsync client) {
        super(DeliveryGroupObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        this.deliveryGroupOps = new DeliveryGroupOperations(client);
        return deliveryGroupOps.getSupportedWriteOperations();
    }

    public Future<WriteResult> addOrUpdate(List<DeliveryGroupObject> deliveryGroups) {
        return callWriteAsync("addOrUpdate", deliveryGroups);
    }

    public Future<WriteResult> addOrUpdate(DeliveryGroupObject...deliveryGroups) {
        return addOrUpdate(Arrays.asList(deliveryGroups));
    }

    public <V> Future<V> addOrUpdate(List<DeliveryGroupObject> deliveryGroups, AsyncHandler<WriteResult, V> handler) {
        return callWriteAsync("addOrUpdate", deliveryGroups, handler);
    }

    public Future<WriteResult> addToDeliveryGroup(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids) {
        return callClientAsync("addToDeliveryGroup", deliveryGroupOps.createAddToDeliveryGroupCall(deliveryGroup, ids));
    }

    public <V> Future<V> addToDeliveryGroup(DeliveryGroupObject deliveryGroup, DeliveryGroupIds ids, AsyncHandler<WriteResult, V> handler) {
        return callClientAsync("addToDeliveryGroup", deliveryGroupOps.createAddToDeliveryGroupCall(deliveryGroup, ids), handler);
    }
}
