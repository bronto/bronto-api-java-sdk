package com.bronto.api.model;

public enum DeliveryStatus {
    SENT,
    SENDING,
    UNSENT,
    ARCHIVED,
    SKIPPED,
    TMP;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
