package com.bronto.api.operation;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrontoWriteBatch<O> implements Iterator<List<O>> {
    private final int batchSize;
    private final String methodName;
    private final Iterator<O> objects;
    private int currentPage = 0;

    public BrontoWriteBatch(String methodName, int batchSize, Iterable<O> objects) {
        this.methodName = methodName;
        this.batchSize = batchSize;
        this.objects = objects.iterator();
    }

    public int getBatchSize() {
        return batchSize;
    }

    public String getMethod() {
        return methodName;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public boolean hasNext() {
        return objects.hasNext();
    }

    @Override
    public List<O> next() {
        currentPage++;
        int pulledBatch = 0;
        List<O> pulledObjects = new ArrayList<O>();
        while (objects.hasNext() && pulledBatch < batchSize) {
            pulledObjects.add(objects.next());
            pulledBatch++;
        }
        return Collections.unmodifiableList(pulledObjects);
    }

    @Override
    public void remove() {
        // no-op
    }
}
