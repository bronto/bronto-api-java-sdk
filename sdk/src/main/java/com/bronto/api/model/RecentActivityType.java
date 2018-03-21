package com.bronto.api.model;

public enum RecentActivityType implements ApiValue {
    BOUNCE("bounce"),
    CONTACT_SKIP("contact skip"),
    OPEN("open"),
    CLICK("click"),
    CONVERSION("conversion"),
    REPLY("reply"),
    UNSUBSCRIBE("unsubscribe"),
    FRIEND_FORWARD("friendforward"),
    SOCIAL("social"),
    WEBFORM("webform"),
    SMS_BOUNCE("sms_bounce"),
    SMS_REPLY("sms_reply");

    private String apiValue;

    RecentActivityType(String apiValue) {
        this.apiValue = apiValue;
    }

    public String getApiValue() {
        return apiValue;
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
