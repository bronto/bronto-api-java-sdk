package com.bronto.api.model;

public enum MailListStatus implements ApiValue {
    ACTIVE,
    DELETED,
    TMP;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
