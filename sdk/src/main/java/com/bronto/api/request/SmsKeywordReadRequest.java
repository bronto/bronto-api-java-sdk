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

public class SmsKeywordReadRequest extends RichReadRequest<SmsKeywordFilter, SmsKeywordObject> {
    private final ReadSMSKeywords smsKeywords = new ReadSMSKeywords();

    public SmsKeywordReadRequest(SmsKeywordFilter filter, int pageNumber) {
        super(filter, pageNumber);
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
        withKeywordType(type.getType());
        return this;
    }

    public SmsKeywordReadRequest withIncludeDeleted(boolean includeDeleted) {
        smsKeywords.setIncludeDeleted(includeDeleted);
        return this;
    }

    public SmsKeywordReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    @Override
    public List<SmsKeywordObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        smsKeywords.setFilter(getFilter());
        smsKeywords.setPageNumber(getCurrentPage());
        return service.readSMSKeywords(smsKeywords, header).getReturn();
    }
}
