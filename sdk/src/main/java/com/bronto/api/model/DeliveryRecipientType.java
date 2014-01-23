package com.bronto.api.model;

public enum DeliveryRecipientType {
    CONTACT(ContactObject.class),
    LIST(MailListObject.class),
    SEGMENT(SegmentObject.class),
    KEYWORD(SmsKeywordObject.class);

    private Class<?> mapperClass;

    DeliveryRecipientType(Class<?> mapper) {
        this.mapperClass = mapper;
    }

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }

    public Class<?> getMappedClass() {
        return mapperClass;
    }
}
