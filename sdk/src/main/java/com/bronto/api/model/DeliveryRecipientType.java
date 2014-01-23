package com.bronto.api.model;

public enum DeliveryRecipientType {
    CONTACT,
    LIST,
    SEGMENT,
    KEYWORD;

    public String getApiValue() {
        return name().toLowerCase();
    }
}
