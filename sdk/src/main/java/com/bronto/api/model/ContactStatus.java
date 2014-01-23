package com.bronto.api.model;

public enum ContactStatus {
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

    public String getApiStatus() {
        return apiStatus;
    }
}
