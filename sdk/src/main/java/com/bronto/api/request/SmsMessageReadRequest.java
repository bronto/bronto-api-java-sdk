package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.ReadSMSMessages;
import com.bronto.api.model.SmsMessageObject;

import java.util.List;

public class SmsMessageReadRequest extends AbstractMessageReadRequest<ReadSMSMessages, SmsMessageObject> {
    public SmsMessageReadRequest(MessageFilter filter, int pageNumber) {
        super(filter, new ReadSMSMessages(), pageNumber);
        withIncludeContent(false);
    }

    public SmsMessageReadRequest(MessageFilter filter) {
        this(filter, 1);
    }

    public SmsMessageReadRequest() {
        this(new MessageFilter());
    }

    @Override
    public SmsMessageReadRequest withIncludeContent(boolean includeContent) {
        request.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public SmsMessageReadRequest copy() {
        return new SmsMessageReadRequest(getFilter(), getCurrentPage())
            .withIncludeContent(request.isIncludeContent());
    }

    @Override
    public List<SmsMessageObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readSMSMessages(request, header).getReturn();
    }
}
