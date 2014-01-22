package com.bronto.api.message;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.MessageObject;
import com.bronto.api.model.ReadMessages;

import java.util.List;

public class MessageReadRequest extends AbstractMessageReadRequest<MessageObject> {
    private final ReadMessages readMessages = new ReadMessages();

    public MessageReadRequest(MessageFilter filter, int pageNumber) {
        super(filter, pageNumber);
        readMessages.setIncludeContent(false);
    }

    public MessageReadRequest(MessageFilter filter) {
        this(filter, 1);
    }

    public MessageReadRequest() {
        this(new MessageFilter());
    }

    @Override
    public AbstractMessageReadRequest<MessageObject> withIncludeContent(boolean includeContent) {
        readMessages.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public List<MessageObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        readMessages.setFilter(getFilter());
        readMessages.setPageNumber(getCurrentPage());
        return service.readMessages(readMessages, header).getReturn();
    }
}
