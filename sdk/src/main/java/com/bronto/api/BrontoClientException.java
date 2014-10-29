package com.bronto.api;

import java.lang.reflect.InvocationTargetException;

import javax.xml.ws.soap.SOAPFaultException;

import com.bronto.api.model.ApiException_Exception;

public class BrontoClientException extends RuntimeException {
    private Recoverable recoverable;
    private int code = 0;

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
        READ_TIMEOUT("Read timed out"),
        CONNECTION_TIMEOUT("connect timed out"),
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
        if (getCause() instanceof ApiException_Exception) {
            this.code = ((ApiException_Exception) getCause()).getFaultInfo().getErrorCode();
		} else if (getCause() instanceof SOAPFaultException) {
			this.code =
			        parseCodeFromMessage(((SOAPFaultException) e).getMessage());
        }
        for (Recoverable recover : Recoverable.values()) {
            if (recover.isRecoverable(getCause().getMessage())) {
                this.recoverable = recover;
                break;
            }
        }
    }

    public int getCode() {
        return code;
    }

    public boolean isRecoverable() {
        return recoverable != null;
    }

    public Recoverable getRecoverable() {
        return recoverable;
    }

    public boolean isTimeout() {
        return (
            recoverable == Recoverable.READ_TIMEOUT ||
            recoverable == Recoverable.CONNECTION_TIMEOUT
        );
    }

    public boolean isInvalidSession() {
        return recoverable == Recoverable.INVALID_SESSION_TOKEN;
    }

    public boolean isUnderMaintenance() {
        return recoverable == Recoverable.SHARD_OFFLINE;
    }

	private int parseCodeFromMessage(String message) {
		if (message.contains(":")) {
			String codeString = message.split(":")[0];
			try {
				return Integer.parseInt(codeString);
			} catch (NumberFormatException nfe) {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
