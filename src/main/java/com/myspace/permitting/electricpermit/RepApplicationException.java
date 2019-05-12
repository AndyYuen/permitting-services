package com.myspace.permitting.electricpermit;

public class RepApplicationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RepApplicationException() {
        super();
    }

    public RepApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RepApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepApplicationException(String message) {
        super(message);
    }

    public RepApplicationException(Throwable cause) {
        super(cause);
    }
    
    

}
