package com.bronto.api;

public class BrontoWriteException extends BrontoClientException {
    
	private static final long serialVersionUID = -7092677683733436684L;
	
	private final WriteContext writeContext;

    public BrontoWriteException(Throwable e, WriteContext writeContext) {
        super(e);
        this.writeContext = writeContext;
    }

    public WriteContext getWriteContext() {
        return writeContext;
    }
}
