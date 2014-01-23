package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.ConversionFilter;
import com.bronto.api.model.ConversionObject;
import com.bronto.api.model.ReadConversions;
import com.bronto.api.model.StringValue;

import java.util.List;

public class ConversionReadRequest extends RichReadRequest<ConversionFilter, ConversionObject> {
    private final ReadConversions conversions = new ReadConversions();

    public ConversionReadRequest(ConversionFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public ConversionReadRequest(ConversionFilter filter) {
        this(filter, 1);
    }

    public ConversionReadRequest() {
        this(new ConversionFilter());
    }

    public ConversionReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public ConversionReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public ConversionReadRequest withContactId(String...contactIds) {
        setStrings(getFilter().getContactId(), contactIds);
        return this;
    }

    public ConversionReadRequest withDeliveryId(String...deliveryIds) {
        setStrings(getFilter().getDeliveryId(), deliveryIds);
        return this;
    }

    public ConversionReadRequest withOrder(String...orderIds) {
        setStrings(getFilter().getOrderId(), orderIds);
        return this;
    }

    @Override
    public List<ConversionObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        conversions.setFilter(getFilter());
        conversions.setPageNumber(getCurrentPage());
        return service.readConversions(conversions, header).getReturn();
    }
}
