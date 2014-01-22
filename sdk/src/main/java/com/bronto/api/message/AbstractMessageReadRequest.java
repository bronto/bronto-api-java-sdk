package com.bronto.api.message;

import com.bronto.api.RichReadRequest;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.StringValue;

import java.util.List;

public abstract class AbstractMessageReadRequest<RS> extends RichReadRequest<MessageFilter, RS> {
    public AbstractMessageReadRequest(MessageFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public abstract AbstractMessageReadRequest<RS> withIncludeContent(boolean includeContent);

    public AbstractMessageReadRequest<RS> withPageNumber(int pageNumber) {
        setCurrentPage(pageNumber);
        return this;
    }

    public AbstractMessageReadRequest<RS> withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public AbstractMessageReadRequest<RS> withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public AbstractMessageReadRequest<RS> withStatus(String...status) {
        setStrings(getFilter().getStatus(), status);
        return this;
    }

    public AbstractMessageReadRequest<RS> withMessageFolderId(String...folderIds) {
        setStrings(getFilter().getMessageFolderId(), folderIds);
        return this;
    }

    public AbstractMessageReadRequest<RS> withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public AbstractMessageReadRequest<RS> withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }
}
