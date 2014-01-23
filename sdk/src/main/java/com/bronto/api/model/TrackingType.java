package com.bronto.api.model;

public enum TrackingType {
    OPEN,
    CLICK,
    CONVERSION,
    BOUNCE,
    SEND,
    UNSUBSCRIBE,
    VIEW;

    public boolean matches(String trackingType) {
        return name().toLowerCase().equals(trackingType);
    }
}
