package com.bronto.api.request;

import java.util.Date;
import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.DeliveryFilter;
import com.bronto.api.model.DeliveryObject;
import com.bronto.api.model.DeliveryStatus;
import com.bronto.api.model.DeliveryType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.ReadDeliveries;
import com.bronto.api.model.SessionHeader;

public class DeliveryReadRequest extends RichReadRequest<DeliveryFilter, ReadDeliveries, DeliveryObject> {
    public DeliveryReadRequest(DeliveryFilter filter, int pageNumber) {
        super(filter, new ReadDeliveries(), pageNumber);
        withIncludeContent(false).withIncludeContent(false);
    }

    public DeliveryReadRequest(DeliveryFilter filter) {
        this(filter, 1);
    }

    public DeliveryReadRequest() {
        this(new DeliveryFilter());
    }

    public DeliveryReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public DeliveryReadRequest withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public DeliveryReadRequest withIncludeRecipients(boolean includeRecipients) {
        request.setIncludeRecipients(includeRecipients);
        return this;
    }

    public DeliveryReadRequest withIncludeContent(boolean includeContent) {
        request.setIncludeContent(includeContent);
        return this;
    }

    public DeliveryReadRequest withMessageId(String...messageIds) {
        setStrings(getFilter().getMessageId(), messageIds);
        return this;
    }

    public DeliveryReadRequest withStatus(DeliveryStatus...status) {
        for (DeliveryStatus st : status) {
            getFilter().getStatus().add(st.name().toLowerCase());
        }
        return this;
    }

    public DeliveryReadRequest withStatus(String...status) {
        setStrings(getFilter().getStatus(), status);
        return this;
    }

    public DeliveryReadRequest withDeliveryType(DeliveryType...types) {
        for (DeliveryType type : types) {
            getFilter().getDeliveryType().add(type.name().toLowerCase());
        }
        return this;
    }

    public DeliveryReadRequest withDeliveryType(String...types) {
        setStrings(getFilter().getDeliveryType(), types);
        return this;
    }

    public DeliveryReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public DeliveryReadRequest withStart(Date...dates) {
        setDates(getFilter().getStart(), dates);
        return this;
    }

    public DeliveryReadRequest withStart(FilterOperator op, Date date) {
        addDate(getFilter().getStart(), op, date);
        return this;
    }

    @Override
    public DeliveryReadRequest copy() {
        return new DeliveryReadRequest(getFilter(), getCurrentPage())
            .withIncludeRecipients(request.isIncludeRecipients())
            .withIncludeContent(request.isIncludeContent());
    }

    @Override
    public List<DeliveryObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readDeliveries(request, header).getReturn();
    }
}
