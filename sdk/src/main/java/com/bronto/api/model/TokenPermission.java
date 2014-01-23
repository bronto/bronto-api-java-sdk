package com.bronto.api.model;

public enum TokenPermission {
    READ(1),
    WRITE(2),
    READ_WRITE(3),
    SEND(4),
    READ_SEND(5),
    SEND_WRITE(6),
    READ_SEND_WRITE(7);

    private int permission;

    TokenPermission(int value) {
        this.permission = value;
    }

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
