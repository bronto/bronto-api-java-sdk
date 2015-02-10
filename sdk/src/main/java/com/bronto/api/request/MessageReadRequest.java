package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.MessageObject;
import com.bronto.api.model.ReadMessages;

import java.util.List;

public class MessageReadRequest extends AbstractMessageReadRequest<ReadMessages, MessageObject> {
    public MessageReadRequest(MessageFilter filter, int pageNumber) {
        super(filter, new ReadMessages(), pageNumber);
        withIncludeContent(false);
    }

    public MessageReadRequest(MessageFilter filter) {
        this(filter, 1);
    }

    public MessageReadRequest() {
        this(new MessageFilter());
    }

    @Override
    public MessageReadRequest withIncludeContent(boolean includeContent) {
        request.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public MessageReadRequest copy() {
        return new MessageReadRequest(getFilter(), getCurrentPage())
            .withIncludeContent(request.isIncludeContent());
    }

    @Override
    public List<MessageObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readMessages(request, header).getReturn();
    }
}
