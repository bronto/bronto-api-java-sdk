package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.DeliveryGroupFilter;
import com.bronto.api.model.DeliveryGroupObject;
import com.bronto.api.model.ReadDeliveryGroups;
import com.bronto.api.model.MemberType;
import com.bronto.api.model.StringValue;

import java.util.List;

public class DeliveryGroupReadRequest extends RichReadRequest<DeliveryGroupFilter, ReadDeliveryGroups, DeliveryGroupObject> {

    public DeliveryGroupReadRequest(DeliveryGroupFilter filter, int pageNumber) {
        super(filter, new ReadDeliveryGroups(), pageNumber);
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
    public DeliveryGroupReadRequest copy() {
        return new DeliveryGroupReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<DeliveryGroupObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readDeliveryGroups(request, header).getReturn();
    }
}
