package com.bronto.api;

public class BrontoClientException extends RuntimeException {
    private boolean recoverable = false;

    public enum Recoverable {
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
        SERVER_ERROR("Internal Server Error");

        private String part;

        private Recoverable(String messagePart) {
            this.part = messagePart;
        }

        public boolean isRecoverable(String message) {
            return message.contains(this.part);
        }
    }

    public BrontoClientException(Throwable e) {
        super(e);
        for (Recoverable recover : Recoverable.values()) {
            this.recoverable = recover.isRecoverable(e.getMessage());
            if (this.recoverable) {
                break;
            }
        }
    }

    public boolean isRecoverable() {
        return recoverable;
    }
}
