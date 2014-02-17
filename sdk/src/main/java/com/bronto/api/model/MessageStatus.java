package com.bronto.api.model;

public enum MessageStatus implements ApiValue {
    ACTIVE,
    DELETE,
    TMP;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
