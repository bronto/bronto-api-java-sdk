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

public class SegmentReadRequest extends RichReadRequest<SegmentFilter, SegmentObject> {
    private final ReadSegments segments = new ReadSegments();

    public SegmentReadRequest(SegmentFilter filter, int pageNumber) {
        super(filter, pageNumber);
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
    public List<SegmentObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        segments.setFilter(getFilter());
        segments.setPageNumber(getCurrentPage());
        return service.readSegments(segments, header).getReturn();
    }
}
