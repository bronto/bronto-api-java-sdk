package com.bronto.api.delivery;

import com.bronto.api.RichReadRequest;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.DeliveryRecipientFilter;
import com.bronto.api.model.DeliveryRecipientStatObject;
import com.bronto.api.model.ReadDeliveryRecipients;
import com.bronto.api.model.StringValue;

import java.util.List;

public class DeliveryRecipientReadRequest extends RichReadRequest<DeliveryRecipientFilter, DeliveryRecipientStatObject> {
    private final ReadDeliveryRecipients deliveryRecipients = new ReadDeliveryRecipients();

    public DeliveryRecipientReadRequest(DeliveryRecipientFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public DeliveryRecipientReadRequest(DeliveryRecipientFilter filter) {
        this(filter, 1);
    }

    public DeliveryRecipientReadRequest() {
        this(new DeliveryRecipientFilter());
    }

    public DeliveryRecipientReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public DeliveryRecipientReadRequest withDeliveryId(String deliveryId) {
        getFilter().setDeliveryId(deliveryId);
        return this;
    }

    public DeliveryRecipientReadRequest withListId(String...listIds) {
        setStrings(getFilter().getListIds(), listIds);
        return this;
    }

    public DeliveryRecipientReadRequest withSegmentId(String...segmentIds) {
        setStrings(getFilter().getSegmentIds(), segmentIds);
        return this;
    }

    public DeliveryRecipientReadRequest withContactId(String...contactIds) {
        setStrings(getFilter().getContactIds(), contactIds);
        return this;
    }

    public DeliveryRecipientReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public List<DeliveryRecipientStatObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        deliveryRecipients.setFilter(getFilter());
        deliveryRecipients.setPageNumber(getCurrentPage());
        return service.readDeliveryRecipients(deliveryRecipients, header).getReturn();
    }
}
