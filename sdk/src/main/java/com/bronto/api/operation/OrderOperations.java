package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoClient;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.OrderObject;
import com.bronto.api.model.WriteResult;

import java.util.List;
import java.util.concurrent.Future;

public class OrderOperations extends AbstractObjectOperations<OrderObject> {
    public OrderOperations(BrontoClient client) {
        super(OrderObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("orders",
            "addOrUpdate",
            "delete");
    }

    public Future<WriteResult> addOrUpdate(List<OrderObject> orders) {
        return callWrite("addOrUpdate", orders);
    }

    public void addOrUpdate(List<OrderObject> orders, AsyncHandler<WriteResult> handler) {
        callWrite("addOrUpdate", orders, handler);
    }
}
