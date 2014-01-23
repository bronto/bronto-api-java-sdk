package com.bronto.api.model;

public enum FieldVisibility {
    PRIVATE,
    PUBLIC;

    public String getApiValue() {
        return name().toLowerCase();
    }
}
