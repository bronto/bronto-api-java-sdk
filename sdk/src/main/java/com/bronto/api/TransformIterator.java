package com.bronto.api;

import java.util.Iterator;

public abstract class TransformIterator<A, B> implements Iterator<B> {
    public static <T> Iterable<T> makeIterable(final Iterator<T> iter) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return iter;
            }
        };
    }

    private final Iterator<A> original;

    public TransformIterator(Iterable<A> original) {
        this.original = original.iterator();
    }

    public abstract B transform(A object);

    @Override
    public boolean hasNext() {
        return original.hasNext();
    }

    @Override
    public B next() {
        return transform(original.next());
    }

    @Override
    public void remove() {
        original.remove();
    }
}
