package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.WorkflowFilter;
import com.bronto.api.model.WorkflowObject;
import com.bronto.api.model.ReadWorkflows;
import com.bronto.api.model.StringValue;

import java.util.List;

public class WorkflowReadRequest extends RichReadRequest<WorkflowFilter, ReadWorkflows, WorkflowObject> {
    public WorkflowReadRequest(WorkflowFilter filter, int pageNumber) {
        super(filter, new ReadWorkflows(), pageNumber);
    }

    public WorkflowReadRequest(WorkflowFilter filter) {
        this(filter, 1);
    }

    public WorkflowReadRequest() {
        this(new WorkflowFilter());
    }

    public WorkflowReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public WorkflowReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public WorkflowReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public WorkflowReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public WorkflowReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public WorkflowReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public WorkflowReadRequest copy() {
        return new WorkflowReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    public List<WorkflowObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readWorkflows(request, header).getReturn();
    }
}
