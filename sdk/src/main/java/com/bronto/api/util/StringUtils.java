package com.bronto.api.util;

public class StringUtils {
    public static String lowerCaseFirst(String name) {
        char[] chars = name.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        return new String(chars);
    }

    public static String upperCaseFirst(String name) {
        char[] chars = name.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }

    public static String pluralize(String name) {
        if (name.endsWith("y")) {
            return name.replace("y", "ies");
        } else {
            return name + "s";
        }
    }
}
