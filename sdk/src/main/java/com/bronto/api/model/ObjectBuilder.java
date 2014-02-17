package com.bronto.api.model;

import com.bronto.api.util.ConversionUtils;
import static com.bronto.api.util.StringUtils.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ObjectBuilder<T> {
    protected Class<T> objectClass;
    protected T object;

    public ObjectBuilder(Class<T> objectClass) {
        this.objectClass = objectClass;
        try {
            this.object = (T) objectClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Field getField(String fieldName) {
        try {
            Field field = objectClass.getField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    protected Method getterFor(String fieldName) {
        try {
            return objectClass.getMethod("get" + upperCaseFirst(fieldName));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectBuilder<T> set(String fieldName, Object value) {
        Field field = getField(fieldName);
        try {
            if (value instanceof Date) {
                value = ConversionUtils.toXMLCalendar((Date) value);
            }
            if (value instanceof ApiValue) {
                value = ((ApiValue) value).getApiValue();
            }
            // Convert any value to String, if we can
            if (field.getDeclaringClass().equals(String.class)) {
                value = value.toString();
            }
            field.set(object, value);
            return this;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectBuilder<T> add(String fieldName, List<Object> value) {
        Field field = getField(fieldName);
        try {
            if (List.class.isAssignableFrom(field.getDeclaringClass())) {
                Method getter = getterFor(fieldName);
                List<Object> list = (List<Object>) getter.invoke(object);
                list.addAll(value);
            } else if (value.size() > 0) {
                set(fieldName, value.get(0));
            }
            return this;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public ObjectBuilder<T> add(String fieldName, Object...value) {
        return add(fieldName, Arrays.asList(value));
    }

    public T get() {
        return object;
    }

    public static <T> ObjectBuilder<T> newObject(Class<T> objectClass) {
        return new ObjectBuilder(objectClass);
    }
}
