package com.bronto.api;

import java.lang.reflect.InvocationTargetException;

public class BrontoClientException extends RuntimeException {
    private Recoverable recoverable;

    public static enum Recoverable {
        UNKNOWN_ERROR("There was an unknown API error. Please try your request again shortly."),
        INVALID_SESSION_TOKEN("Your session is invalid. Please log in again."),
        INVALID_REQUEST("There was an error in your soap request. Please examine the request and try again."),
        SHARD_OFFLINE("The API is currently undergoing maintenance. Please try your request again later."),
        READ_ERROR("There was an error reading your query results. Please try your request again shortly."),
        HTTP_HEADER_ERROR("Error Fetching http headers"),
        NO_XML_DOCUMENT("looks like we got no XML document"),
        CONNECT_ERROR("Could not connect to host"),
        WSDL_PARSE_ERROR("Parsing WSDL"),
        CONNECTION_RESET("Connection reset by peer"),
        CONNECTION_FAILED("Could not connect to host"),
        SERVICE_UNAVAILABLE("Service Temporarily Unavailable"),
        SOCKET_INTERRUPT("Unexpected end of file from server"),
        SERVER_ERROR("Internal Server Error");

        private String part;

        private Recoverable(String messagePart) {
            this.part = messagePart;
        }

        public String getMessage() {
            return part;
        }

        public boolean isRecoverable(String message) {
            if (message == null) {
                return false;
            }
            return message.contains(this.part);
        }
    }

    public BrontoClientException(Throwable e) {
        super(e instanceof InvocationTargetException ?
            ((InvocationTargetException) e).getTargetException() : e);
        for (Recoverable recover : Recoverable.values()) {
            if (recover.isRecoverable(getCause().getMessage())) {
                this.recoverable = recover;
                break;
            }
        }
    }

    public boolean isRecoverable() {
        return recoverable != null;
    }

    public Recoverable getRecoverable() {
        return recoverable;
    }

    public boolean isInvalidSession() {
        return recoverable == Recoverable.INVALID_SESSION_TOKEN;
    }

    public boolean isUnderMaintenance() {
        return recoverable == Recoverable.SHARD_OFFLINE;
    }
}
