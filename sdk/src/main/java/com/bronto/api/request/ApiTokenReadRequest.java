package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ApiTokenFilter;
import com.bronto.api.model.ApiTokenObject;
import com.bronto.api.model.ReadApiTokens;
import com.bronto.api.model.StringValue;

import java.util.List;

public class ApiTokenReadRequest extends RichReadRequest<ApiTokenFilter, ReadApiTokens, ApiTokenObject> {
    public ApiTokenReadRequest(ApiTokenFilter filter, int pageNumber) {
        super(filter, new ReadApiTokens(), pageNumber);
    }

    public ApiTokenReadRequest(ApiTokenFilter filter) {
        this(filter, 1);
    }

    public ApiTokenReadRequest() {
        this(new ApiTokenFilter());
    }

    public ApiTokenReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public ApiTokenReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public ApiTokenReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public ApiTokenReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public ApiTokenReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public ApiTokenReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public ApiTokenReadRequest withAccountId(String...accountIds) {
        setStrings(getFilter().getAccountId(), accountIds);
        return this;
    }

    @Override
    public ApiTokenReadRequest copy() {
        return new ApiTokenReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<ApiTokenObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readApiTokens(request, header).getReturn();
    }
}
