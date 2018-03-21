package com.bronto.api.operation;

import java.util.Arrays;
import java.util.List;

import com.bronto.api.BrontoApi;
import com.bronto.api.model.ObjectBuilder;
import com.bronto.api.model.OrderObject;
import com.bronto.api.model.ProductObject;
import com.bronto.api.model.WriteResult;
import com.bronto.api.reflect.ApiReflection;

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

    public ObjectBuilder<ProductObject> newProduct() {
        return ObjectBuilder.newObject(ProductObject.class);
    }

    public WriteResult addOrUpdate(List<OrderObject> orders) {
        return callWrite("addOrUpdate", orders);
    }

    public WriteResult addOrUpdate(OrderObject...orders) {
        return addOrUpdate(Arrays.asList(orders));
    }
}
