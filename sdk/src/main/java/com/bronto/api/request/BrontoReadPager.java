package com.bronto.api.request;

import com.bronto.api.BrontoClient;

import java.util.Collections;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class BrontoReadPager<T> implements Iterator<T> {
    private Iterator<T> objects;
    private BrontoClient client;
    private BrontoReadRequest read;

    public BrontoReadPager(BrontoClient client, BrontoReadRequest<T> read) {
        this.client = client;
        this.read = read.reset();
        this.objects = this.getCurrentObjects();
    }

    public int getCurrentPage() {
        return read.getCurrentPage();
    }

    private Iterator<T> getCurrentObjects() {
        Future<List<T>> future = client.async(read);
        try {
            return future.get().iterator();
        } catch (Exception e) {
            return Collections.<T>emptyList().iterator();
        }
    }

    @Override
    public boolean hasNext() {
        if (objects.hasNext()) {
            return true;
        } else {
            read.next();
            objects = getCurrentObjects();
            return objects.hasNext();
        }
    }

    @Override
    public T next() {
        return objects.next();
    }

    @Override
    public void remove() {
        objects.remove();
    }
}
