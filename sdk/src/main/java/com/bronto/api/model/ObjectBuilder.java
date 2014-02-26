package com.bronto.api.model;

import com.bronto.api.util.ConversionUtils;
import static com.bronto.api.util.StringUtils.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SuppressWarnings("unchecked")
public class ObjectBuilder<T> {
    protected Class<T> objectClass;
    protected T object;
    private boolean empty = true;

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
            Field field = objectClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(String.format("%s: field `%s` does not exist.", objectClass.getSimpleName(), e.getMessage()));
        }
    }

    protected Method getterFor(String fieldName) {
        try {
            return objectClass.getMethod("get" + upperCaseFirst(fieldName));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(String.format("%s: method `%s` does not exist.", objectClass.getSimpleName(), e.getMessage()));
        }
    }

    public boolean isEmpty() {
        return empty;
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
            empty = false;
            return this;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <V> ObjectBuilder<T> add(String fieldName, List<V> value) {
        Field field = getField(fieldName);
        try {
            if (List.class.isAssignableFrom(field.getType())) {
                Method getter = getterFor(fieldName);
                List<V> list = (List<V>) getter.invoke(object);
                list.addAll(value);
                empty = false;
            } else if (value.size() > 0) {
                set(fieldName, value.get(0));
            }
            return this;
        } catch (ClassCastException e) {
            throw new RuntimeException(String.format("%s: %s", objectClass.getSimpleName(), e.getMessage()));
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <V> ObjectBuilder<T> add(String fieldName, V...value) {
        return add(fieldName, Arrays.asList(value));
    }

    public T get() {
        return object;
    }

    public static <T> ObjectBuilder<T> newObject(Class<T> objectClass) {
        return new ObjectBuilder(objectClass);
    }
}
