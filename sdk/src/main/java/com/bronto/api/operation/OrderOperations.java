package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApi;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.OrderObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;

public class OrderOperations extends AbstractObjectOperations<OrderObject> {
    public OrderOperations(BrontoApi client) {
        super(OrderObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        return new ApiReflection("orders",
            "addOrUpdate",
            "delete");
    }

    public WriteResult addOrUpdate(List<OrderObject> orders) {
        return callWrite("addOrUpdate", orders);
    }

    public WriteResult addOrUpdate(OrderObject...orders) {
        return addOrUpdate(Arrays.asList(orders));
    }
}
