package com.bronto.api.model;

public enum FieldType implements ApiValue {
    TEXT,
    TEXTAREA,
    PASSWORD,
    CHECKBOX,
    RADIO,
    SELECT,
    INTEGER,
    CURRENCY,
    FLOAT,
    DATE;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
