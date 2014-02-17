package com.bronto.api.model;

public enum KeywordType implements ApiValue {
    BASIC("basic"),
    SUBSCRIPTION("subscription"),
    TEXT_TO_JOIN("text2join");

    private String type;

    KeywordType(String type) {
        this.type = type;
    }

    public String getApiValue() {
        return type;
    }

    public boolean matches(String keywordType) {
        return getApiValue().equals(keywordType);
    }
}
