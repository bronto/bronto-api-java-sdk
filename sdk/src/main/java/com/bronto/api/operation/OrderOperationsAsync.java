package com.bronto.api.operation;

import com.bronto.api.AsyncHandler;
import com.bronto.api.BrontoApiAsync;

import com.bronto.api.reflect.ApiReflection;

import com.bronto.api.model.OrderObject;
import com.bronto.api.model.WriteResult;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;

public class OrderOperationsAsync extends AbstractAsyncObjectOperations<OrderObject> {
    private OrderOperations orderOps;

    public OrderOperationsAsync(BrontoApiAsync client) {
        super(OrderObject.class, client);
    }

    @Override
    public ApiReflection getSupportedWriteOperations() {
        this.orderOps = new OrderOperations(client);
        return orderOps.getSupportedWriteOperations();
    }

    public Future<WriteResult> addOrUpdate(List<OrderObject> orders) {
        return callWriteAsync("addOrUpdate", orders);
    }

    public Future<WriteResult> addOrUpdate(OrderObject...orders) {
        return addOrUpdate(Arrays.asList(orders));
    }

    public void addOrUpdate(List<OrderObject> orders, AsyncHandler<WriteResult> handler) {
        callWriteAsync("addOrUpdate", orders, handler);
    }
}
