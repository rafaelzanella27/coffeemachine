package com.estudo.cmachine.components;

public class CafeException extends Exception {

    private static final long serialVersionUID = -4772254836087878052L;

    public CafeException() {
        super();
    }

    public CafeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CafeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CafeException(String message) {
        super(message);
    }

    public CafeException(Throwable cause) {
        super(cause);
    }
}
