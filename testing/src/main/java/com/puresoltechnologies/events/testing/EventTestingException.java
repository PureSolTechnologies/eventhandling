package com.puresoltechnologies.events.testing;

import com.puresoltechnologies.events.AbstractEventException;

public class EventTestingException extends AbstractEventException {

    private static final long serialVersionUID = 9154743040322684858L;

    private static final Package eventPackage = EventTestingException.class.getPackage();
    private static final String libraryShortcut = "ET";

    public EventTestingException(int code, String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(eventPackage, libraryShortcut, code, message, cause, enableSuppression, writableStackTrace);
    }

    public EventTestingException(int code, String message, Throwable cause) {
	super(eventPackage, libraryShortcut, code, message, cause);
    }

    public EventTestingException(int code, String message) {
	super(eventPackage, libraryShortcut, code, message);
    }

}
