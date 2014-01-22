package com.bronto.api;

import java.util.List;

public abstract class BrontoReadRequest<T> implements BrontoClientRequest<List<T>> {
    private int currentPage = 1;

    public void setCurrentPage(int page) {
        this.currentPage = page;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public BrontoReadRequest<T> next() {
        this.currentPage++;
        return this;
    }

    public BrontoReadRequest<T> reset() {
        this.currentPage = 1;
        return this;
    }
}
