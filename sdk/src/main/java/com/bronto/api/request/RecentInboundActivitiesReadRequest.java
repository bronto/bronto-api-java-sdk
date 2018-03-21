package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadRecentInboundActivities;
import com.bronto.api.model.RecentActivityObject;
import com.bronto.api.model.RecentInboundActivitySearchRequest;
import com.bronto.api.model.SessionHeader;

public class RecentInboundActivitiesReadRequest extends RecentActivitiesReadRequest<RecentInboundActivitySearchRequest, ReadRecentInboundActivities> {
    public RecentInboundActivitiesReadRequest(RecentInboundActivitySearchRequest filter, int pageNumber) {
        super(filter, new ReadRecentInboundActivities(), pageNumber);
    }

    public RecentInboundActivitiesReadRequest(int pageNumber) {
        this(new RecentInboundActivitySearchRequest(), pageNumber);
    }

    public RecentInboundActivitiesReadRequest() {
        this(1);
    }

    @Override
    public RecentActivitiesReadRequest<RecentInboundActivitySearchRequest, ReadRecentInboundActivities> withTypes(String...types) {
        setStrings(getFilter().getTypes(), types);
        return this;
    }

    @Override
    public RecentInboundActivitiesReadRequest copy() {
        return new RecentInboundActivitiesReadRequest(getFilter(), getCurrentPage());
    }

    @Override
    protected List<RecentActivityObject> invokeSpecificRead(BrontoSoapPortType service, SessionHeader header) throws Exception {
        request.setFilter(getFilter());
        return service.readRecentInboundActivities(request, header).getReturn();
    }
}
