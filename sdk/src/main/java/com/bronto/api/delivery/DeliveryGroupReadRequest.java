package com.bronto.api.delivery;

import com.bronto.api.RichReadRequest;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.DeliveryGroupFilter;
import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.ReadDeliveryGroups;
import com.bronto.api.model.MemberType;
import com.bronto.api.model.StringValue;

import java.util.List;

public class DeliveryGroupReadRequest extends RichReadRequest<DeliveryGroupFilter, DeliveryGroupObject> {
    private final ReadDeliveryGroups deliveryGroups = new ReadDeliveryGroups();

    public DeliveryGroupReadRequest(DeliveryGroupFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public DeliveryGroupReadRequest(DeliveryGroupFilter filter) {
        this(filter, 1);
    }

    public DeliveryGroupReadRequest() {
        this(new DeliveryGroupFilter());
    }

    public DeliveryGroupReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public DeliveryGroupReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public DeliveryGroupReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public DeliveryGroupReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public DeliveryGroupReadRequest withId(String...ids) {
        setStrings(getFilter().getDeliveryGroupId(), ids);
        return this;
    }

    public DeliveryGroupReadRequest withDeliveryId(String...ids) {
        setStrings(getFilter().getDeliveryId(), ids);
        return this;
    }

    public DeliveryGroupReadRequest withMessageGroupId(String...ids) {
        setStrings(getFilter().getMessageGroupId(), ids);
        return this;
    }

    public DeliveryGroupReadRequest withAutomatorId(String...ids) {
        setStrings(getFilter().getAutomatorId(), ids);
        return this;
    }

    public DeliveryGroupReadRequest withListByType(MemberType type) {
        getFilter().setListByType(type);
        return this;
    }

    @Override
    public List<DeliveryGroupObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        deliveryGroups.setFilter(getFilter());
        deliveryGroups.setPageNumber(getCurrentPage());
        return service.readDeliveryGroups(deliveryGroups, header).getReturn();
    }
}
