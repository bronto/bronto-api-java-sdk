package com.bronto.api.login;

import com.bronto.api.RichReadRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.LoginFilter;
import com.bronto.api.model.LoginObject;
import com.bronto.api.model.ReadLogins;
import com.bronto.api.model.StringValue;

import java.util.List;

public class LoginReadRequest extends RichReadRequest<LoginFilter, LoginObject> {
    private final ReadLogins logins = new ReadLogins();

    public LoginReadRequest(LoginFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public LoginReadRequest(LoginFilter filter) {
        this(filter, 1);
    }

    public LoginReadRequest() {
        this(new LoginFilter());
    }

    public LoginReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public LoginReadRequest withUsername(StringValue...names) {
        setValues(getFilter().getUsername(), names);
        return this;
    }

    public LoginReadRequest withUsername(FilterOperator op, String name) {
        addValue(getFilter().getUsername(), op, name);
        return this;
    }

    public LoginReadRequest withUsername(String...names) {
        setValues(getFilter().getUsername(), names);
        return this;
    }

    public LoginReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public List<LoginObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        logins.setFilter(getFilter());
        logins.setPageNumber(getCurrentPage());
        return service.readLogins(logins, header).getReturn();
    }
}
