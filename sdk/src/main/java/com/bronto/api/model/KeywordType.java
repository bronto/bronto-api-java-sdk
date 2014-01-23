package com.bronto.api.model;

public enum KeywordType {
    BASIC("basic"),
    SUBSCRIPTION("subscription"),
    TEXT_TO_JOIN("text2join");

    private String type;

    KeywordType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean matches(String keywordType) {
        return getType().equals(keywordType);
    }
}
