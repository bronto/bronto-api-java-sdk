package com.bronto.api.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

import com.bronto.api.model.ActivityFilter;
import com.bronto.api.model.ActivityObject;
import com.bronto.api.model.ActivityPageSize;
import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadActivities;
import com.bronto.api.model.ReadDirection;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.util.ConversionUtils;

public class ActivityReadRequest extends RichReadRequest<ActivityFilter, ActivityObject> {
    private final ReadActivities activities = new ReadActivities();
    private int pageLimit;

    public ActivityReadRequest(ActivityFilter filter, int pageNumber, int pageLimit) {
        super(filter, pageNumber);
        this.pageLimit = pageLimit;
    }

    public ActivityReadRequest(ActivityFilter filter, int pageLimit) {
        this(filter, 1, pageLimit);
    }

    public ActivityReadRequest(int pageLimit) {
        this(new ActivityFilter(), pageLimit);
    }

    public ActivityReadRequest() {
        this(1);
    }

    public ActivityReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public ActivityReadRequest withPageLimit(int pageLimit) {
        this.pageLimit = pageLimit;
        return this;
    }

    public ActivityReadRequest withPageSize(ActivityPageSize size) {
        getFilter().setSize(size.getSize());
        return this;
    }

    public ActivityReadRequest withType(String...names) {
        setStrings(getFilter().getTypes(), names);
        return this;
    }

    public ActivityReadRequest withReadDirection(ReadDirection direction) {
        getFilter().setReadDirection(direction);
        return this;
    }

    public ActivityReadRequest withStart(Date start) {
        return withStart(ConversionUtils.toXMLCalendar(start));
    }

    public ActivityReadRequest withStart(XMLGregorianCalendar start) {
        getFilter().setStart(start);
        return this;
    }

    @Override
    public List<ActivityObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        if (getCurrentPage() > pageLimit) {
            return new ArrayList<ActivityObject>();
        }
        switch (getCurrentPage()) {
            case 1:
                if (getFilter().getSize() == null) {
                    withPageSize(ActivityPageSize.SMALL);
                }
                withReadDirection(ReadDirection.FIRST);
                break;
            default:
                withReadDirection(ReadDirection.NEXT);
        }
        activities.setFilter(getFilter());
        return service.readActivities(activities, header).getReturn();
    }
}
