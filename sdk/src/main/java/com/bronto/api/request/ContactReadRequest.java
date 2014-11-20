package com.bronto.api.request;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;

import com.bronto.api.model.ContactFilter;
import com.bronto.api.model.ContactObject;
import com.bronto.api.model.ContactStatus;
import com.bronto.api.model.FilterType;
import com.bronto.api.model.FilterOperator;
import com.bronto.api.model.ReadContacts;
import com.bronto.api.model.StringValue;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ContactReadRequest extends RichReadRequest<ContactFilter, ContactObject> {
    private final ReadContacts readContacts = new ReadContacts();

    public ContactReadRequest(ContactFilter filter, int pageNumber) {
        super(filter, pageNumber);
    }

    public ContactReadRequest(ContactFilter filter) {
        this(filter, 1);
    }

    public ContactReadRequest() {
        this(new ContactFilter());
    }

    public ContactReadRequest withPageNumber(int pageNumber) {
        this.setCurrentPage(pageNumber);
        return this;
    }

    public ContactReadRequest withIncludeLists(boolean includeLists) {
        readContacts.setIncludeLists(includeLists);
        return this;
    }

    public ContactReadRequest withIncludeSMSKeywords(boolean includeSMSKeywords) {
        readContacts.setIncludeSMSKeywords(includeSMSKeywords);
        return this;
    }

    public ContactReadRequest withIncludeRFMData(boolean includeRFMData) {
        readContacts.setIncludeRFMData(includeRFMData);
        return this;
    }

    public ContactReadRequest withIncludeGeoIPData(boolean includeGeoIPData) {
        readContacts.setIncludeGeoIPData(includeGeoIPData);
        return this;
    }

    public ContactReadRequest withIncludeTechnologyData(boolean includeTechnologyData) {
        readContacts.setIncludeTechnologyData(includeTechnologyData);
        return this;
    }

    public ContactReadRequest withIncludeEngagementData(boolean includeEngagementData) {
        readContacts.setIncludeEngagementData(includeEngagementData);
        return this;
    }

    public ContactReadRequest withIncludeFields(String...fields) {
        for (String fieldId : fields) {
            readContacts.getFields().add(fieldId);
        }
        return this;
    }

    public ContactReadRequest setIncludeFields(List<String> fields) {
        readContacts.getFields().clear();
        for (String fieldId : fields) {
            readContacts.getFields().add(fieldId);
        }
        return this;
    }

    public ContactReadRequest withEmail(String...emails) {
        setValues(getFilter().getEmail(), emails);
        return this;
    }

    public ContactReadRequest withEmail(StringValue...emails) {
        setValues(getFilter().getEmail(), emails);
        return this;
    }

    public ContactReadRequest withEmail(FilterOperator op, String email) {
        addValue(getFilter().getEmail(), op, email);
        return this;
    }

    public ContactReadRequest withId(String...ids) {
        setStrings(getFilter().getId(), ids);
        return this;
    }

    public ContactReadRequest withFilterType(FilterType type) {
        getFilter().setType(type);
        return this;
    }

    public ContactReadRequest withListId(String...listIds) {
        setStrings(getFilter().getListId(), listIds);
        return this;
    }

    public ContactReadRequest withSegmentId(String...segmentIds) {
        setStrings(getFilter().getSegmentId(), segmentIds);
        return this;
    }

    public ContactReadRequest withSource(String...source) {
        setStrings(getFilter().getSource(), source);
        return this;
    }

    public ContactReadRequest withMobileNumber(String...numbers) {
        setValues(getFilter().getMobileNumber(), numbers);
        return this;
    }

    public ContactReadRequest withMobileNumber(FilterOperator op, String number) {
        addValue(getFilter().getMobileNumber(), op, number);
        return this;
    }

    public ContactReadRequest withStatus(String...statuses) {
        setStrings(getFilter().getStatus(), statuses);
        return this;
    }

    public ContactReadRequest withStatus(ContactStatus...statuses) {
        for (ContactStatus status : statuses) {
            getFilter().getStatus().add(status.getApiValue());
        }
        return this;
    }

    public ContactReadRequest withSMSKeywordId(String...smsKeywordIDs) {
        setStrings(getFilter().getSMSKeywordID(), smsKeywordIDs);
        return this;
    }

    public ContactReadRequest withMsgPerf(String...msgPref) {
        setStrings(getFilter().getMsgPref(), msgPref);
        return this;
    }

    public ContactReadRequest withCreated(Date...created) {
        setDates(getFilter().getCreated(), created);
        return this;
    }

    public ContactReadRequest withCreated(FilterOperator op, Date created) {
        addDate(getFilter().getCreated(), op, created);
        return this;
    }

    public ContactReadRequest withModified(Date...modified) {
        setDates(getFilter().getModified(), modified);
        return this;
    }

    public ContactReadRequest withModified(FilterOperator op, Date modified) {
        addDate(getFilter().getModified(), op, modified);
        return this;
    }

    @Override
    public List<ContactObject> invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
        readContacts.setFilter(filter);
        readContacts.setPageNumber(getCurrentPage());
        return service.readContacts(readContacts, header).getReturn();
    }
}
