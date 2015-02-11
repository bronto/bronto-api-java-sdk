package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.KeywordType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.SmsKeywordFilter;
import com.bronto.api.model.SmsKeywordObject;
import com.bronto.api.model.ReadSMSKeywords;
import com.bronto.api.model.StringValue;

import java.util.List;

public class SmsKeywordReadRequest extends RichReadRequest<SmsKeywordFilter, ReadSMSKeywords, SmsKeywordObject> {
    public SmsKeywordReadRequest(SmsKeywordFilter filter, int pageNumber) {
        super(filter, new ReadSMSKeywords(), pageNumber);
    }

    public SmsKeywordReadRequest(SmsKeywordFilter filter) {
        this(filter, 1);
    }

    public SmsKeywordReadRequest() {
        this(new SmsKeywordFilter());
    }

    public SmsKeywordReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public SmsKeywordReadRequest withName(StringValue...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public SmsKeywordReadRequest withName(FilterOperator op, String name) {
        addValue(getFilter().getName(), op, name);
        return this;
    }

    public SmsKeywordReadRequest withName(String...names) {
        setValues(getFilter().getName(), names);
        return this;
    }

    public SmsKeywordReadRequest withId(String...ids){
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public SmsKeywordReadRequest withKeywordType(String type) {
        getFilter().setKeywordType(type);
        return this;
    }

    public SmsKeywordReadRequest withKeywordType(KeywordType type) {
        withKeywordType(type.getApiValue());
        return this;
    }

    public SmsKeywordReadRequest withIncludeDeleted(boolean includeDeleted) {
        request.setIncludeDeleted(includeDeleted);
        return this;
    }

    public SmsKeywordReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public SmsKeywordReadRequest copy() {
        return new SmsKeywordReadRequest(getFilter(), getCurrentPage())
            .withIncludeDeleted(request.isIncludeDeleted());
    }

    @Override
    public List<SmsKeywordObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        request.setPageNumber(getCurrentPage());
        return service.readSMSKeywords(request, header).getReturn();
    }
}
