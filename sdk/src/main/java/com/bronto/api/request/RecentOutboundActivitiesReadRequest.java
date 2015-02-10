package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadRecentOutboundActivities;
import com.bronto.api.model.RecentActivityObject;
import com.bronto.api.model.RecentOutboundActivitySearchRequest;
import com.bronto.api.model.SessionHeader;

public class RecentOutboundActivitiesReadRequest extends RecentActivitiesReadRequest<RecentOutboundActivitySearchRequest, ReadRecentOutboundActivities> {
    public RecentOutboundActivitiesReadRequest(RecentOutboundActivitySearchRequest filter, int pageNumber) {
        super(filter, new ReadRecentOutboundActivities(), pageNumber);
    }

    public RecentOutboundActivitiesReadRequest(int pageNumber) {
        this(new RecentOutboundActivitySearchRequest(), pageNumber);
    }

    public RecentOutboundActivitiesReadRequest() {
        this(1);
    }

    @Override
    public RecentActivitiesReadRequest withTypes(String...types) {
        setStrings(getFilter().getTypes(), types);
        return this;
    }

    @Override
    public RecentOutboundActivitiesReadRequest copy() {
        return new RecentOutboundActivitiesReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    protected List<RecentActivityObject> invokeSpecificRead(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        return service.readRecentOutboundActivities(request, header).getReturn();
    }
}
