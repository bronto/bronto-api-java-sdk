package com.bronto.api.model;

public enum RemailActivity implements ApiValue {
    NO_OPEN,
    OPEN_NO_CLICK,
    CLICK_NO_CONVERT;

    public String getApiValue() {
        return name().replace("_", "").toLowerCase();
    }

    public boolean matches(String activity) {
        return getApiValue().equals(activity);
    }
}
