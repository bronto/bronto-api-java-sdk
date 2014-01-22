package com.bronto.api.sms;

import com.bronto.api.message.AbstractMessageReadRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.ReadSMSMessages;
import com.bronto.api.model.SmsMessageObject;

import java.util.List;

public class SmsMessageReadRequest extends AbstractMessageReadRequest<SmsMessageObject> {
    private final ReadSMSMessages readMessages = new ReadSMSMessages();

    public SmsMessageReadRequest(MessageFilter filter, int pageNumber) {
        super(filter, pageNumber);
        readMessages.setIncludeContent(false);
    }

    public SmsMessageReadRequest(MessageFilter filter) {
        this(filter, 1);
    }

    public SmsMessageReadRequest() {
        this(new MessageFilter());
    }

    @Override
    public AbstractMessageReadRequest<SmsMessageObject> withIncludeContent(boolean includeContent) {
        readMessages.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public List<SmsMessageObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        readMessages.setFilter(getFilter());
        readMessages.setPageNumber(getCurrentPage());
        return service.readSMSMessages(readMessages, header).getReturn();
    }
}
