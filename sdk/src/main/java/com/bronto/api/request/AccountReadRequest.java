package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.AccountFilter;
import com.bronto.api.model.AccountObject;
import com.bronto.api.model.ReadAccounts;
import com.bronto.api.model.StringValue;

import java.util.List;

public class AccountReadRequest extends RichReadRequest<AccountFilter, ReadAccounts, AccountObject> {
    public AccountReadRequest(AccountFilter filter, int pageNumber) {
        super(filter, new ReadAccounts(), pageNumber);
    }

    public AccountReadRequest(AccountFilter filter) {
        this(filter, 1);
    }

    public AccountReadRequest() {
        this(new AccountFilter());
    }

    public AccountReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public AccountReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public AccountReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public AccountReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public AccountReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public AccountReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public AccountReadRequest withIncludeInfo(boolean includeInfo) {
        request.setIncludeInfo(includeInfo);
        return this;
    }

    @Override
    public AccountReadRequest copy() {
        return new AccountReadRequest(getFilter(), getCurrentPage())
            .withIncludeInfo(request.isIncludeInfo());
    }

    @Override
    public List<AccountObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readAccounts(request, header).getReturn();
    }
}
