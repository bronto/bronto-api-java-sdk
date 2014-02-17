package com.bronto.api.model;

public enum MessageContentType implements ApiValue {
    HTML,
    TEXT;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String apiValue) {
        return getApiValue().equals(apiValue);
    }
}
