package com.bronto.api.request;

import java.util.Date;
import java.util.List;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.ReadUnsubscribes;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.model.UnsubscribeFilter;
import com.bronto.api.model.UnsubscribeObject;
import com.bronto.api.util.ConversionUtils;

public class UnsubscribeReadRequest extends RichReadRequest<UnsubscribeFilter, ReadUnsubscribes, UnsubscribeObject> {

	public UnsubscribeReadRequest(UnsubscribeFilter filter, int pageNumber) {
        super(filter, new ReadUnsubscribes(), pageNumber);
    }

	public UnsubscribeReadRequest(UnsubscribeFilter filter) {
        this(filter, 1);
    }

	public UnsubscribeReadRequest() {
        this(new UnsubscribeFilter());
    }

	public UnsubscribeReadRequest withPageNumber(int pageNumber) {
		this.setCurrentPage(pageNumber);
		return this;
	}
	
	public UnsubscribeReadRequest withContactId(String contactId) {
		getFilter().setContactId(contactId);
		return this;
	}
	
	public UnsubscribeReadRequest withDeliveryId(String deliveryId) {
		getFilter().setDeliveryId(deliveryId);
		return this;
	}
	
	public UnsubscribeReadRequest withStart(Date start) {
		getFilter().setStart(ConversionUtils.toXMLCalendar(start));
		return this;
	}
	
	public UnsubscribeReadRequest withEnd(Date end) {
		getFilter().setEnd(ConversionUtils.toXMLCalendar(end));
		return this;
	}

	@Override
	public UnsubscribeReadRequest copy() {
		return new UnsubscribeReadRequest(getFilter(), getCurrentPage());
	}

	@Override
	public List<UnsubscribeObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
		request.setFilter(filter);
		request.setPageNumber(getCurrentPage());
		return service.readUnsubscribes(request, header).getReturn();
	}

}
