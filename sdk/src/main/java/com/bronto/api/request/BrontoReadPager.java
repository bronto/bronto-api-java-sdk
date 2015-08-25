package com.bronto.api.request;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.bronto.api.BrontoApi;
import com.bronto.api.BrontoClientException;

public class BrontoReadPager<T> implements Iterator<T> {
    private Iterator<T> objects;
    private BrontoApi client;
    private BrontoReadRequest<T> read;

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
		} catch (BrontoClientException brontoException) {
			/*
			 * Error code 116 is an end of result error. Since all the data's
			 * been read, return an empty list. All other exceptions should be
			 * handled by the existing exception-handling logic.
			 */
			if (brontoException.getCode() == 116) {
				return Collections.emptyListIterator();
			} else {
				throw brontoException;
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
