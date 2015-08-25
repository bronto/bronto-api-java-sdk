package com.bronto.api.request;

import java.util.Date;
import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.ReadSMSDeliveries;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.model.SmsDeliveryFilter;
import com.bronto.api.model.SmsDeliveryObject;

public class SmsDeliveryReadRequest extends RichReadRequest<SmsDeliveryFilter, ReadSMSDeliveries, SmsDeliveryObject> {
    public SmsDeliveryReadRequest(SmsDeliveryFilter filter, int pageNumber) {
        super(filter, new ReadSMSDeliveries(), pageNumber);
        withIncludeContent(false).withIncludeRecipients(false);
    }

    public SmsDeliveryReadRequest(SmsDeliveryFilter filter) {
        this(filter, 1);
    }

    public SmsDeliveryReadRequest() {
        this(new SmsDeliveryFilter());
    }

    public SmsDeliveryReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public SmsDeliveryReadRequest withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public SmsDeliveryReadRequest withSatus(String...status) {
        setStrings(getFilter().getStatus(), status);
        return this;
    }

    public SmsDeliveryReadRequest withMessageId(String...messageId) {
        setStrings(getFilter().getMessageId(), messageId);
        return this;
    }

    public SmsDeliveryReadRequest withDeliveryType(String...types) {
        setStrings(getFilter().getDeliveryType(), types);
        return this;
    }

    public SmsDeliveryReadRequest withStart(Date...dates) {
        setDates(getFilter().getStart(), dates);
        return this;
    }

    public SmsDeliveryReadRequest withIncludeContent(boolean includeContent) {
        request.setIncludeContent(includeContent);
        return this;
    }

    public SmsDeliveryReadRequest withIncludeRecipients(boolean includeRecipients) {
        request.setIncludeRecipients(includeRecipients);
        return this;
    }

    public SmsDeliveryReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public SmsDeliveryReadRequest copy() {
        return new SmsDeliveryReadRequest(getFilter(), getCurrentPage())
            .withIncludeContent(request.isIncludeContent())
            .withIncludeRecipients(request.isIncludeRecipients());
    }

    @Override
    public List<SmsDeliveryObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readSMSDeliveries(request, header).getReturn();
    }
}
