package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.HeaderFooterFilter;
import com.bronto.api.model.HeaderFooterObject;
import com.bronto.api.model.ReadHeaderFooters;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.model.StringValue;

public class HeaderFooterReadRequest 
	extends RichReadRequest<HeaderFooterFilter, ReadHeaderFooters, HeaderFooterObject> {

	public HeaderFooterReadRequest(HeaderFooterFilter filter, int pageNumber) {
		super(filter, new ReadHeaderFooters(), pageNumber);
	}
	
	public HeaderFooterReadRequest(HeaderFooterFilter filter) {
		this(filter, 1);
	}
	
	public HeaderFooterReadRequest() {
		this(new HeaderFooterFilter());
	}
	
	public HeaderFooterReadRequest withPageNumber(int pageNumber) {
		this.setCurrentPage(pageNumber);
		return this;
	}
	
	public HeaderFooterReadRequest withName(StringValue...names) {
		setValues(getFilter().getName(), names);
		return this;
	}
	
	public HeaderFooterReadRequest withName(FilterOperator op, String name) {
		addValue(getFilter().getName(), op, name);
		return this;
	}
	
	public HeaderFooterReadRequest withName(String...names) {
		setValues(getFilter().getName(), names);
		return this;
	}
	
	public HeaderFooterReadRequest withId(String...ids) {
		setStrings(getFilter().getId(), ids);
		return this;
	}
	
	public HeaderFooterReadRequest withFilterType(FilterType type) {
		getFilter().setType(type);
		return this;
	}
	
	public HeaderFooterReadRequest withPosition(String...positions) {
		setStrings(getFilter().getPosition(), positions);
		return this;
	}
	
	public HeaderFooterReadRequest withIncludeContent(boolean includeContent) {
		request.setIncludeContent(includeContent);
		return this;
	}

    @Override
    public HeaderFooterReadRequest copy() {
        return new HeaderFooterReadRequest(getFilter(), getCurrentPage())
            .withIncludeContent(request.isIncludeContent());
    }

	@Override
	public List<HeaderFooterObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
		
		request.setFilter(getFilter());
		request.setPageNumber(getCurrentPage());
		return service.readHeaderFooters(request, header).getReturn();
	}
}
