package com.bronto.api.model;

public enum ContactStatus implements ApiValue {
    ACTIVE("active"),
    ONBOARDING("onboarding"),
    TRANSACTIONAL("transactional"),
    BOUNCE("bounce"),
    UNCONFIRMED("unconfirmed"),
    UNSUBSCRIBED("unsub");

    private String apiStatus;

    ContactStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    public String getApiValue() {
        return apiStatus;
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
