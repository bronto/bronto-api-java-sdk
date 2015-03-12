package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.WebformFilter;
import com.bronto.api.model.WebformObject;
import com.bronto.api.model.ReadWebforms;
import com.bronto.api.model.StringValue;

import java.util.List;

public class WebformReadRequest extends RichReadRequest<WebformFilter, ReadWebforms, WebformObject> {
    public WebformReadRequest(WebformFilter filter, int pageNumber) {
        super(filter, new ReadWebforms(), pageNumber);
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
    public WebformReadRequest copy() {
        return new WebformReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<WebformObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readWebforms(request, header).getReturn();
    }
}
