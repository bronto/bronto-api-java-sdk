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
			/*
			 * The "end of result set" error should be handled cleanly (by
			 * returning an empty iterator), but everything else should still be
			 * handled by the existing error handling logic. So far this has
			 * only affected conversion calls, but there's no telling what other
			 * calls (if any). If there are other calls impacted, this will fix
			 * them as well.
			 */
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
