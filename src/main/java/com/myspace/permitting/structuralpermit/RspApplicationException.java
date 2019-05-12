package com.myspace.permitting.structuralpermit;

public class RspApplicationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RspApplicationException() {
        super();
    }

    public RspApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RspApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RspApplicationException(String message) {
        super(message);
    }

    public RspApplicationException(Throwable cause) {
        super(cause);
    }
    
    

}
