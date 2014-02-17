package com.bronto.api.model;

public enum AccountStatus implements ApiValue {
    UNRESTRICTED("unrestricted"),
    RESTRICTED("restricted"),
    INACTIVE("inactive");

    private String apiValue;

    AccountStatus(String apiValue) {
        this.apiValue = apiValue;
    }

    public String getApiValue() {
        return apiValue;
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
