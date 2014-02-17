package com.bronto.api.model;

public enum FieldVisibility implements ApiValue {
    PRIVATE,
    PUBLIC;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
