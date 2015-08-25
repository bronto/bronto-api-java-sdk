package com.bronto.api;

import java.util.List;

import com.bronto.api.model.WriteResult;
import com.bronto.api.request.BrontoReadRequest;

public interface ObjectOperations<O> extends CommonOperations<O> {
    public O get(BrontoReadRequest<O> request);
    public List<O> read(BrontoReadRequest<O> request);

    public WriteResult add(List<O> objects);
    public WriteResult update(List<O> objects);
    public WriteResult delete(List<O> objects);

    @SuppressWarnings("unchecked")
	public WriteResult add(O... objects);
    @SuppressWarnings("unchecked")
    public WriteResult update(O... objects);
    @SuppressWarnings("unchecked")
    public WriteResult delete(O... objects);
}
