package com.bronto.api.tag;

import com.bronto.api.RichReadRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ContentTagFilter;
import com.bronto.api.model.ContentTagObject;
import com.bronto.api.model.ReadContentTags;
import com.bronto.api.model.StringValue;

import java.util.List;

public class ContentTagReadRequest extends RichReadRequest<ContentTagFilter, ContentTagObject> {
    private final ReadContentTags contentTags = new ReadContentTags();

    public ContentTagReadRequest(ContentTagFilter filter, int pageNumber) {
        super(filter, pageNumber);
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
        contentTags.setIncludeContent(includeContent);
        return this;
    }

    @Override
    public List<ContentTagObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        contentTags.setFilter(getFilter());
        contentTags.setPageNumber(getCurrentPage());
        return service.readContentTags(contentTags, header).getReturn();
    }
}
