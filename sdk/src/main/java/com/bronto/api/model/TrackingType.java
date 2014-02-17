package com.bronto.api.model;

public enum TrackingType implements ApiValue {
    OPEN,
    CLICK,
    CONVERSION,
    BOUNCE,
    SEND,
    UNSUBSCRIBE,
    VIEW;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String trackingType) {
        return getApiValue().equals(trackingType);
    }
}
