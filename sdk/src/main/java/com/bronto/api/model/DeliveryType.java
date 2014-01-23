package com.bronto.api.model;

public enum DeliveryType {
    NORMAL,
    TEST,
    TRANSACTIONAL,
    SPLIT,
    TRIGGERED,
    AUTOMATED;

    public String getApiValue() {
        return name().toLowerCase();
    }
}
