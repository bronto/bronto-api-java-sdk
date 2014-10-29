package com.bronto.api.request;

import com.bronto.api.BrontoApi;

import java.util.Collections;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class BrontoReadPager<T> implements Iterator<T> {
    private Iterator<T> objects;
    private BrontoApi client;
    private BrontoReadRequest read;

    public BrontoReadPager(BrontoApi client, BrontoReadRequest<T> read) {
        this.client = client;
        this.read = read.reset();
        this.objects = this.getCurrentObjects();
    }

    public int getCurrentPage() {
        return read.getCurrentPage();
    }

    private Iterator<T> getCurrentObjects() {
		try {
			return ((List<T>) client.invoke(read)).iterator();
		} catch (Exception e) {
			if (e.getMessage().contains("End of result set")) {
				return new ArrayList<T>().iterator();
			} else {
				throw e;
			}
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
