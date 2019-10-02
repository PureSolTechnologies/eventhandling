package com.puresoltechnologies.events;

import java.util.Optional;

public class EventDescription {

    private final String libraryShortcut;
    private final int code;
    private final String message;
    private final Optional<String> ocap;

    public EventDescription(String libraryShortcut, int code, String message) {
	super();
	this.libraryShortcut = libraryShortcut;
	this.code = code;
	this.message = message;
	this.ocap = Optional.empty();
    }

    public EventDescription(String libraryShortcut, int code, String message, String ocap) {
	super();
	this.libraryShortcut = libraryShortcut;
	this.code = code;
	this.message = message;
	this.ocap = Optional.ofNullable(ocap);
    }

    public String getLibraryShortcut() {
	return libraryShortcut;
    }

    public int getCode() {
	return code;
    }

    public String getMessage() {
	return message;
    }

    public Optional<String> getOCAP() {
	return ocap;
    }

    @Override
    public String toString() {
	return libraryShortcut + "-" + code + ": " + message;
    }

}
