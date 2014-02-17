package com.bronto.api.model;

public enum BounceType implements ApiValue {
    CONN_PERM,
    SUB_PERM,
    CONTENT_PERM,

    CONN_TEMP,
    SUB_TEMP,
    CONTENT_TEMP,
    OTHER;

    public String getApiValue() {
        return name().toLowerCase();
    }

    public boolean matches(String bounceType) {
        return getApiValue().equals(bounceType);
    }

    public static boolean isHardBounce(String bounceType) {
        return bounceType.endsWith("_perm");
    }

    public static boolean isSoftBounce(String bounceType) {
        return !isHardBounce(bounceType);
    }
}
