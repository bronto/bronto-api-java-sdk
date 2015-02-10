package com.bronto.api.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

import com.bronto.api.model.ActivityPageSize;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadDirection;
import com.bronto.api.model.RecentActivityObject;
import com.bronto.api.model.RecentActivityType;
import com.bronto.api.model.RecentActivitySearchRequest;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.util.ConversionUtils;

public abstract class RecentActivitiesReadRequest<T extends RecentActivitySearchRequest, RQ> extends RichReadRequest<T, RQ, RecentActivityObject> {

    public RecentActivitiesReadRequest(T filter, RQ request, int pageNumber) {
        super(filter, request, pageNumber);
    }

    public RecentActivitiesReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public RecentActivitiesReadRequest withPageSize(ActivityPageSize size) {
        getFilter().setSize(size.getSize());
        return this;
    }

    public RecentActivitiesReadRequest withContactId(String contactId) {
        getFilter().setContactId(contactId);
        return this;
    }

    public RecentActivitiesReadRequest withDeliveryId(String deliveryId) {
        getFilter().setDeliveryId(deliveryId);
        return this;
    }

    public RecentActivitiesReadRequest withStart(Date start) {
        return withStart(ConversionUtils.toXMLCalendar(start));
    }

    public RecentActivitiesReadRequest withStart(XMLGregorianCalendar start) {
        getFilter().setStart(start);
        return this;
    }

    public RecentActivitiesReadRequest withEnd(Date end) {
        return withEnd(ConversionUtils.toXMLCalendar(end));
    }

    public RecentActivitiesReadRequest withEnd(XMLGregorianCalendar end) {
        getFilter().setEnd(end);
        return this;
    }

    public RecentActivitiesReadRequest withReadDirection(ReadDirection direction) {
        getFilter().setReadDirection(direction);
        return this;
    }

    protected abstract List<RecentActivityObject> invokeSpecificRead(BrontoSoapPortType service, SessionHeader header) throws Exception;

    public RecentActivitiesReadRequest withTypes(RecentActivityType...types) {
        String[] values = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            values[i] = types[i].getApiValue();
        }
        return withTypes(values);
    }

    public abstract RecentActivitiesReadRequest withTypes(String...types);

    @Override
    public List<RecentActivityObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        switch (getCurrentPage()) {
            case 1:
                if (getFilter().getSize() == 0) {
                    withPageSize(ActivityPageSize.SMALL);
                }
                withReadDirection(ReadDirection.FIRST);
                break;
            default:
                withReadDirection(ReadDirection.NEXT);
        }
        return invokeSpecificRead(service, header);
    }
}
