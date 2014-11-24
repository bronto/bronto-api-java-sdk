package com.bronto.api.request;

import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadRecentOutboundActivities;
import com.bronto.api.model.RecentActivityObject;
import com.bronto.api.model.RecentOutboundActivitySearchRequest;
import com.bronto.api.model.SessionHeader;

public class RecentOutboundActivitiesReadRequest extends RecentActivitiesReadRequest<RecentOutboundActivitySearchRequest> {
    private ReadRecentOutboundActivities activities = new ReadRecentOutboundActivities();

    public RecentOutboundActivitiesReadRequest(RecentOutboundActivitySearchRequest filter, int pageNumber) {
        super(filter, pageNumber);
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
    protected List<RecentActivityObject> invokeSpecificRead(BrontoSoapPortType service, SessionHeader header) throws Exception {
        activities.setFilter(getFilter());
        return service.readRecentOutboundActivities(activities, header).getReturn();
    }
}
