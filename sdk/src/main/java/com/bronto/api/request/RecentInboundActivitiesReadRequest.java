package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadRecentInboundActivities;
import com.bronto.api.model.RecentActivityObject;
import com.bronto.api.model.RecentInboundActivitySearchRequest;
import com.bronto.api.model.SessionHeader;

public class RecentInboundActivitiesReadRequest extends RecentActivitiesReadRequest<RecentInboundActivitySearchRequest> {
    private ReadRecentInboundActivities activities = new ReadRecentInboundActivities();

    public RecentInboundActivitiesReadRequest(RecentInboundActivitySearchRequest filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public RecentInboundActivitiesReadRequest(int pageNumber) {
        this(new RecentInboundActivitySearchRequest(), pageNumber);
    }

    public RecentInboundActivitiesReadRequest() {
        this(1);
    }

    @Override
    public RecentActivitiesReadRequest withTypes(String...types) {
        setStrings(getFilter().getTypes(), types);
        return this;
    }

    @Override
    protected List<RecentActivityObject> invokeSpecificRead(BrontoSoapPortType service, SessionHeader header) throws Exception {
        activities.setFilter(getFilter());
        return service.readRecentInboundActivities(activities, header).getReturn();
    }
}
