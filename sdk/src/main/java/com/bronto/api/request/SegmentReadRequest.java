package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.SegmentFilter;
import com.bronto.api.model.SegmentObject;
import com.bronto.api.model.ReadSegments;
import com.bronto.api.model.StringValue;

import java.util.List;

public class SegmentReadRequest extends SizedReadRequest<SegmentFilter, ReadSegments, SegmentObject> {
    public SegmentReadRequest(SegmentFilter filter, int pageNumber, int pageSize) {
        super(filter, new ReadSegments(), pageNumber, pageSize);
    }
    
    public SegmentReadRequest(SegmentFilter filter, int pageNumber) {
    	this(filter, pageNumber, getDefaultPageSize());
    }

    public SegmentReadRequest(SegmentFilter filter) {
        this(filter, 1);
    }

    public SegmentReadRequest() {
        this(new SegmentFilter());
    }

    public SegmentReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }
    
    public SegmentReadRequest withPageSize(int pageSize) {
    	this.setPageSize(pageSize);
    	return this;
    }

    public SegmentReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public SegmentReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public SegmentReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public SegmentReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public SegmentReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public SegmentReadRequest copy() {
        return new SegmentReadRequest(getFilter(), getCurrentPage(), getPageSize());
    }

    @Override
    public List<SegmentObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        if (!isDefaultPageSize()) {
        	request.setPageSize(getPageSize());
        }
        return service.readSegments(request, header).getReturn();
    }
}
