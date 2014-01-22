package com.bronto.api.apitoken;

import com.bronto.api.RichReadRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ApiTokenFilter;
import com.bronto.api.model.ApiTokenObject;
import com.bronto.api.model.ReadApiTokens;
import com.bronto.api.model.StringValue;

import java.util.List;

public class ApiTokenReadRequest extends RichReadRequest<ApiTokenFilter, ApiTokenObject> {
    private final ReadApiTokens apiTokens = new ReadApiTokens();

    public ApiTokenReadRequest(ApiTokenFilter filter, int pageNumber) {
        super(filter, pageNumber);
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
    public List<ApiTokenObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        apiTokens.setFilter(getFilter());
        apiTokens.setPageNumber(getCurrentPage());
        return service.readApiTokens(apiTokens, header).getReturn();
    }
}
