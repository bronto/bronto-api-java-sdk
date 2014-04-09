package com.bronto.api;

import com.bronto.api.model.WriteResult;
import com.bronto.api.reflect.ApiReflection;
import com.bronto.api.request.BrontoClientRequest;

public class WriteContext {
    private ApiReflection reflect;
    private String method;
    private Object writeCall;

    public BrontoClientRequest<WriteResult> getWriteRequest() {
        return reflect.createMethodRequest(method, writeCall);
    }

    public ApiReflection getReflect() {
        return reflect;
    }

    public String getMethod() {
        return method;
    }

    public Object getWriteCall() {
        return writeCall;
    }

    public WriteContext setReflect(ApiReflection reflect) {
        this.reflect = reflect;
        return this;
    }

    public WriteContext setMethod(String method) {
        this.method = method;
        return this;
    }

    public WriteContext setWriteCall(Object writeCall) {
        this.writeCall = writeCall;
        return this;
    }
}
