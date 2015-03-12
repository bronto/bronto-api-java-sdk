package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.MailListFilter;
import com.bronto.api.model.MailListObject;
import com.bronto.api.model.ReadLists;
import com.bronto.api.model.StringValue;

import java.util.List;

public class MailListReadRequest extends RichReadRequest<MailListFilter, ReadLists, MailListObject> {
    public MailListReadRequest(MailListFilter filter, int pageNumber) {
        super(filter, new ReadLists(), pageNumber);
    }

    public MailListReadRequest(MailListFilter filter) {
        this(filter, 1);
    }

    public MailListReadRequest() {
        this(new MailListFilter());
    }

    public MailListReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public MailListReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public MailListReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public MailListReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public MailListReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public MailListReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public MailListReadRequest copy() {
        return new MailListReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<MailListObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readLists(request, header).getReturn();
    }
}
