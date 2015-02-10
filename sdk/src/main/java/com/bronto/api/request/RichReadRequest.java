package com.bronto.api.request;

import com.bronto.api.util.ConversionUtils;

import com.bronto.api.model.DateValue;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.StringValue;

import java.util.Date;
import java.util.List;

public abstract class RichReadRequest<RF, RQ, RS> extends BrontoReadRequest<RS> {
    protected final RF filter;
    protected final RQ request;

    public RichReadRequest(RF filter, RQ request, int pageNumber) {
        this.filter = filter;
        this.request = request;
        this.setCurrentPage(pageNumber);
    }

    public RF getFilter() {
        return filter;
    }

    public RQ getRequest() {
        return request;
    }

    protected DateValue getDateValue(FilterOperator op, Date date) {
        DateValue dateValue = new DateValue();
        dateValue.setOperator(op);
        dateValue.setValue(ConversionUtils.toXMLCalendar(date));
        return dateValue;
    }

    protected DateValue getDateValue(Date date) {
        return getDateValue(FilterOperator.AFTER, date);
    }

    protected StringValue getStringValue(FilterOperator op, String value) {
        StringValue stringValue = new StringValue();
        stringValue.setOperator(op);
        stringValue.setValue(value);
        return stringValue;
    }

    protected StringValue getStringValue(String value) {
        return getStringValue(FilterOperator.EQUAL_TO, value);
    }

    protected void addValue(List<StringValue> values, FilterOperator op, String value) {
        values.add(getStringValue(op, value));
    }

    protected void setValues(List<StringValue> values, String...names) {
        for (String name : names) {
            values.add(getStringValue(name));
        }
    }

    protected void setValues(List<StringValue> values, StringValue...names) {
        for (StringValue name : names) {
            values.add(name);
        }
    }

    protected void setStrings(List<String> strings, String...newIds) {
        for (String id : newIds) {
            strings.add(id);
        }
    }

    protected void setDates(List<DateValue> dates, Date...jDates) {
        for (Date jDate : jDates) {
            dates.add(getDateValue(jDate));
        }
    }

    protected void addDate(List<DateValue> dates, FilterOperator op, Date jDate) {
        dates.add(getDateValue(op, jDate));
    }

    // Don't want to force people to support cloning
    public RichReadRequest<RF, RQ, RS> copy() {
        throw new UnsupportedOperationException(String.format("%s does not support cloning.", getClass().getSimpleName()));
    }
}
