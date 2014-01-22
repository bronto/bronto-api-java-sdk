package com.bronto.api.message;

import com.bronto.api.RichReadRequest;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.MessageFolderFilter;
import com.bronto.api.model.MessageFolderObject;
import com.bronto.api.model.ReadMessageFolders;
import com.bronto.api.model.StringValue;

import java.util.List;

public class MessageFolderReadRequest extends RichReadRequest<MessageFolderFilter, MessageFolderObject> {
    private final ReadMessageFolders messageFolders = new ReadMessageFolders();

    public MessageFolderReadRequest(MessageFolderFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public MessageFolderReadRequest(MessageFolderFilter filter) {
        this(filter, 1);
    }

    public MessageFolderReadRequest() {
        this(new MessageFolderFilter());
    }

    public MessageFolderReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public MessageFolderReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public MessageFolderReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public MessageFolderReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public MessageFolderReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public MessageFolderReadRequest withParentId(String...ids) {
        setStrings(getFilter().getParentId(), ids);
        return this;
    }

    public MessageFolderReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public List<MessageFolderObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        messageFolders.setFilter(getFilter());
        messageFolders.setPageNumber(getCurrentPage());
        return service.readMessageFolders(messageFolders, header).getReturn();
    }
}
