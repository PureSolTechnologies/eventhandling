package com.puresoltechnologies.events.impl;

import java.time.Instant;
import java.util.List;

import com.puresoltechnologies.events.domain.Action;
import com.puresoltechnologies.events.domain.Event;
import com.puresoltechnologies.events.domain.EventException;
import com.puresoltechnologies.events.domain.EventSeverity;

/**
 * This is an abstract base implementation for a component or library
 * {@link Exception} extended by an event. These kind of exceptions are used to
 * structure exceptions around context borders.
 *
 * @author Rick-Rainer Ludwig
 */
public abstract class AbstractEventException extends Exception implements EventException {

    private static final long serialVersionUID = 1743337794284893634L;

    private final Event event;

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
    public AbstractEventException(Event event, String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	this.event = event;
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
    public AbstractEventException(Event event, String message, Throwable cause) {
	super(message, cause);
	this.event = event;
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
    public AbstractEventException(Event event, String message) {
	super(message);
	this.event = event;
    }

    /**
     * This method returns the associated event.
     *
     * @return An {@link Event} is returned.
     */
    public final Event getEvent() {
	return event;
    }

    @Override
    public final String getEventCode() {
	return event.getEventCode();
    }

    @Override
    public final Instant getTime() {
	return event.getTime();
    }

    @Override
    public final String getComponentShortcut() {
	return event.getComponentShortcut();
    }

    @Override
    public final String getComponentName() {
	return event.getComponentName();
    }

    @Override
    public final int getNumber() {
	return event.getNumber();
    }

    @Override
    public final EventSeverity getSeverity() {
	return event.getSeverity();
    }

    @Override
    public final String getDescription() {
	return event.getDescription();
    }

    @Override
    public final List<Action> getActions() {
	return event.getActions();
    }

    @Override
    public String toString() {
	return event.toString() + "\n" + super.toString();
    }
}
