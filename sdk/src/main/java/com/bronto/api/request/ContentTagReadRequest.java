package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ContentTagFilter;
import com.bronto.api.model.ContentTagObject;
import com.bronto.api.model.ReadContentTags;
import com.bronto.api.model.StringValue;

import java.util.List;

public class ContentTagReadRequest extends RichReadRequest<ContentTagFilter, ReadContentTags, ContentTagObject> {
    public ContentTagReadRequest(ContentTagFilter filter, int pageNumber) {
        super(filter, new ReadContentTags(), pageNumber);
    }

    public ContentTagReadRequest(ContentTagFilter filter) {
        this(filter, 1);
    }

    public ContentTagReadRequest() {
        this(new ContentTagFilter());
    }

    public ContentTagReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public ContentTagReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public ContentTagReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public ContentTagReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public ContentTagReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public ContentTagReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public ContentTagReadRequest withIncludeContent(boolean includeContent) {
        request.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public ContentTagReadRequest copy() {
        return new ContentTagReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<ContentTagObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readContentTags(request, header).getReturn();
    }
}
