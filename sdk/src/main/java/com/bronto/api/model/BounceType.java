package com.bronto.api.model;

public enum BounceType {
    CONN_PERM,
    SUB_PERM,
    CONTENT_PERM,

    CONN_TEMP,
    SUB_TEMP,
    CONTENT_TEMP,
    OTHER;

    public boolean matches(String bounceType) {
        return name().toLowerCase().equals(bounceType);
    }

    public static boolean isHardBounce(String bounceType) {
        return bounceType.endsWith("_perm");
    }

    public static boolean isSoftBounce(String bounceType) {
        return !isHardBounce(bounceType);
    }
}
