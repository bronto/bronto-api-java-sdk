package com.bronto.api.webform;

import com.bronto.api.RichReadRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.WebformFilter;
import com.bronto.api.model.WebformObject;
import com.bronto.api.model.ReadWebforms;
import com.bronto.api.model.StringValue;

import java.util.List;

public class WebformReadRequest extends RichReadRequest<WebformFilter, WebformObject> {
    private final ReadWebforms webforms = new ReadWebforms();

    public WebformReadRequest(WebformFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public WebformReadRequest(WebformFilter filter) {
        this(filter, 1);
    }

    public WebformReadRequest() {
        this(new WebformFilter());
    }

    public WebformReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public WebformReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public WebformReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public WebformReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public WebformReadRequest withType(String...types) {
        setStrings(getFilter().getWebformType(), types);
        return this;
    }

    public WebformReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public WebformReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public List<WebformObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        webforms.setFilter(getFilter());
        webforms.setPageNumber(getCurrentPage());
        return service.readWebforms(webforms, header).getReturn();
    }
}
