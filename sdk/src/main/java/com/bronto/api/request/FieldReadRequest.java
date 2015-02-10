package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.FieldType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FieldsFilter;
import com.bronto.api.model.FieldObject;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ReadFields;
import com.bronto.api.model.StringValue;

import java.util.List;

public class FieldReadRequest extends RichReadRequest<FieldsFilter, ReadFields, FieldObject> {
    public FieldReadRequest(FieldsFilter filter, int pageNumber) {
        super(filter, new ReadFields(), pageNumber);
    }

    public FieldReadRequest(FieldsFilter filter) {
        this(filter, 1);
    }

    public FieldReadRequest() {
        this(new FieldsFilter());
    }

    public FieldReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public FieldReadRequest withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public FieldReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public FieldReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public FieldReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public FieldReadRequest copy() {
        return new FieldReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<FieldObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readFields(request, header).getReturn();
    }
}
