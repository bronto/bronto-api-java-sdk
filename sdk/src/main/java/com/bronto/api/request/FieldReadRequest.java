package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.FieldObject;
import com.bronto.api.model.FieldsFilter;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.ReadFields;
import com.bronto.api.model.SessionHeader;

public class FieldReadRequest extends SizedReadRequest<FieldsFilter, ReadFields, FieldObject> {
    public FieldReadRequest(FieldsFilter filter, int pageNumber, int pageSize) {
        super(filter, new ReadFields(), pageNumber, pageSize);
    }
    
    public FieldReadRequest(FieldsFilter filter, int pageNumber) {
    	this(filter, pageNumber, getDefaultPageSize());
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
    
    public FieldReadRequest withPageSize(int pageSize) {
    	this.setPageSize(pageSize);
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
        return new FieldReadRequest(getFilter(), getCurrentPage(), getPageSize());
    }

    @Override
    public List<FieldObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        if (!isDefaultPageSize()) {
        	request.setPageSize(getPageSize());
        }
        return service.readFields(request, header).getReturn();
    }
}
