package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.MessageFilter;
import com.bronto.api.model.StringValue;

import java.util.List;

public abstract class AbstractMessageReadRequest<RQ, RS> extends RichReadRequest<MessageFilter, RQ, RS> {
    public AbstractMessageReadRequest(MessageFilter filter, RQ request, int pageNumber) {
        super(filter, request, pageNumber);
    }

    public abstract AbstractMessageReadRequest<RQ, RS> withIncludeContent(boolean includeContent);

    public AbstractMessageReadRequest<RQ, RS> withPageNumber(int pageNumber) {
        setCurrentPage(pageNumber);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withStatus(String...status) {
        setStrings(getFilter().getStatus(), status);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withMessageFolderId(String...folderIds) {
        setStrings(getFilter().getMessageFolderId(), folderIds);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public AbstractMessageReadRequest<RQ, RS> withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }
}
