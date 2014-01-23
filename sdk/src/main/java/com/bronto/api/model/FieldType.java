package com.bronto.api.model;

public enum FieldType {
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
}
