package com.bronto.api.model;

public enum RemailActivity {
    NO_OPEN,
    OPEN_NO_CLICK,
    CLICK_NO_CONVERT;

    public String getApiActivity() {
        return name().replace("_", "").toLowerCase();
    }

    public boolean matches(String activity) {
        return getApiActivity().equals(activity);
    }
}
