package com.puresoltechnologies.events;

public abstract class AbstractEventRuntimeException extends RuntimeException implements EventRuntimeException {

    private static final long serialVersionUID = 2214641471110197591L;

    private final Package eventPackage;
    private final String libraryShortcut;
    private final int code;

    /**
     *
     * @param eventPackage       is the package which contains the events.xml file
     *                           with the event details.
     * @param libraryShortcut    is the shortcut of the library which is per default
     *                           the prefix of the event code.
     * @param code               is the number part of the event code.
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public AbstractEventRuntimeException(Package eventPackage, String libraryShortcut, int code, String message,
	    Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	this.eventPackage = eventPackage;
	this.libraryShortcut = libraryShortcut;
	this.code = code;
    }

    /**
     *
     * @param eventPackage    is the package which contains the events.xml file with
     *                        the event details.
     * @param libraryShortcut is the shortcut of the library which is per default
     *                        the prefix of the event code.
     * @param code            is the number part of the event code.
     * @param message
     * @param cause
     */
    public AbstractEventRuntimeException(Package eventPackage, String libraryShortcut, int code, String message,
	    Throwable cause) {
	super(message, cause);
	this.eventPackage = eventPackage;
	this.libraryShortcut = libraryShortcut;
	this.code = code;
    }

    /**
     *
     * @param eventPackage    is the package which contains the events.xml file with
     *                        the event details.
     * @param libraryShortcut is the shortcut of the library which is per default
     *                        the prefix of the event code.
     * @param code            is the number part of the event code.
     * @param message
     */
    public AbstractEventRuntimeException(Package eventPackage, String libraryShortcut, int code, String message) {
	super(message);
	this.eventPackage = eventPackage;
	this.libraryShortcut = libraryShortcut;
	this.code = code;
    }

    protected final Package getPackage() {
	return eventPackage;
    }

    protected final String getLibraryShortcut() {
	return libraryShortcut;
    }

    protected final int getCode() {
	return code;
    }

    @Override
    public String getEventCode() {
	return libraryShortcut + "-" + code;
    }

}
