package com.bronto.api.model;

public enum DeliveryRecipientSelection implements ApiValue {
    ELIGIBLE,
    INELIGIBLE,
    SELECTED;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
