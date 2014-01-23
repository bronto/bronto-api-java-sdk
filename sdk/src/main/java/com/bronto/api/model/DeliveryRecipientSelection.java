package com.bronto.api.model;

public enum DeliveryRecipientSelection {
    ELIGIBLE,
    INELIGIBLE,
    SELECTED;

    public String getApiValue() {
        return name().toLowerCase();
    }
}
