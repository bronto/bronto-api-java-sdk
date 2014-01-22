package com.bronto.api.workflow;

import com.bronto.api.RichReadRequest;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.WorkflowFilter;
import com.bronto.api.model.WorkflowObject;
import com.bronto.api.model.ReadWorkflows;
import com.bronto.api.model.StringValue;

import java.util.List;

public class WorkflowReadRequest extends RichReadRequest<WorkflowFilter, WorkflowObject> {
    private final ReadWorkflows workflows = new ReadWorkflows();

    public WorkflowReadRequest(WorkflowFilter filter, int pageNumber) {
        super(filter, pageNumber);
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
    public List<WorkflowObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        workflows.setFilter(getFilter());
        workflows.setPageNumber(getCurrentPage());
        return service.readWorkflows(workflows, header).getReturn();
    }
}
