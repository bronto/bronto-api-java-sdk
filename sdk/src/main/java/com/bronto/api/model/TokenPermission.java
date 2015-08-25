package com.bronto.api.model;

public enum TokenPermission {
    READ,
    WRITE,
    READ_WRITE,
    SEND,
    READ_SEND,
    SEND_WRITE,
    READ_SEND_WRITE;

    public boolean canRead() {
        switch (this) {
            case READ:
            case READ_WRITE:
            case READ_SEND:
            case READ_SEND_WRITE:
                return true;
            default:
                return false;
        }
    }

    public boolean canSend() {
        switch (this) {
            case SEND:
            case READ_SEND:
            case SEND_WRITE:
            case READ_SEND_WRITE:
                return true;
            default:
                return false;
        }
    }

    public boolean canWrite() {
        switch (this) {
            case WRITE:
            case READ_WRITE:
            case SEND_WRITE:
            case READ_SEND_WRITE:
                return true;
            default:
                return false;
        }
    }
}
