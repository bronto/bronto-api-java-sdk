package com.bronto.api.reflect;

import com.bronto.api.request.BrontoReadRequest;
import com.bronto.api.request.BrontoClientRequest;

import com.bronto.api.model.BrontoSoapPortType;
import com.bronto.api.model.SessionHeader;
import com.bronto.api.model.WriteResult;

import static com.bronto.api.util.StringUtils.*;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;

import java.util.Arrays;
import java.util.List;

public class ApiReflection {
    protected final String canonicalName;
    protected final List<String> writeOps;
    protected final Map<String, Class<?>> operations;
    protected final Map<String, Method> writeCache;
    protected final Map<String, Method> callCache;

    public ApiReflection(String canonicalName, String...writeOps) {
        this.canonicalName = canonicalName;
        this.writeOps = Arrays.asList(writeOps);
        this.operations = fillSupportedOperations();
        this.writeCache = new HashMap<String, Method>();
        this.callCache = new HashMap<String, Method>();
    }

    public ApiReflection(Class<?> clazz, String...writeOps) {
        // TODO: move this special casing out of here
        this(pluralize(lowerCaseFirst(clazz.getSimpleName().replace("Object", "").replace("Sms", "SMS"))), writeOps);
    }

    public List<String> getSupportedWriteOperations() {
        return writeOps;
    }

    // Override for specific handling
    protected String getListMethodForName(String name) {
        return "get" + upperCaseFirst(canonicalName);
    }

    public Method getResultsMethod(String methodName) {
        if (writeCache.containsKey(methodName)) {
            return writeCache.get(methodName);
        }

        try {
            if (!operations.containsKey(methodName)) {
                String simple = getClass().getSimpleName();
                throw new NoSuchMethodException(String.format("%s has no defined method %s", simple, methodName));
            }
            String responseName = operations.get(methodName).getName() + "Response";
            Class<?> responseClass = Class.forName(responseName);
            writeCache.put(methodName, responseClass.getMethod("getReturn"));
            return writeCache.get(methodName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public <O> Object fillMethodCall(String name, List<O> objects) {
        try {
            Class<?> methodClass = operations.get(name);
            Object method = methodClass.newInstance();
            Method listMethod = methodClass.getMethod(getListMethodForName(name));
            List<O> list = (List<O>) listMethod.invoke(method);
            list.addAll(objects);
            return method;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Map<String, Class<?>> fillSupportedOperations() {
        Map<String, Class<?>> nameToClass = new HashMap<String, Class<?>>();
        for (String name : getSupportedWriteOperations()) {
            String simpleName;
            if (name.startsWith("class")) {
                simpleName = name.split(":")[1];
                name = lowerCaseFirst(simpleName);
            } else {
                simpleName = upperCaseFirst(name) + upperCaseFirst(canonicalName);
            }
            try {
                Class<?> callClass = Class.forName("com.bronto.api.model." + simpleName);
                nameToClass.put(name, callClass);
            } catch (Exception e) {
                // TODO: log it
            }
        }
        return nameToClass;
    }

    public Method getServiceMethod(BrontoSoapPortType service, String name, Object call) throws Exception {
        if (!callCache.containsKey(name)) {
            String methodName = lowerCaseFirst(operations.get(name).getSimpleName());
            Class<?> serviceClass = service.getClass();
            Method method = serviceClass.getMethod(methodName, call.getClass(), SessionHeader.class);
            callCache.put(name, method);
        }
        return callCache.get(name);
    }

    public BrontoClientRequest<WriteResult> createMethodRequest(final String method, final Object call) {
        final Method getReturn = getResultsMethod(method);
        return new BrontoClientRequest<WriteResult>() {
            @Override
            public WriteResult invoke(BrontoSoapPortType service, SessionHeader header) throws Exception {
                Object res = getServiceMethod(service, method, call).invoke(service, call, header);
                return (WriteResult) getReturn.invoke(res);
            }
        };
    }
}
