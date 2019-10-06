package com.puresoltechnologies.events.domain;

/**
 * This is the base interface for any event exception. Event exceptions carry an
 * additional, unique event code which can be used to identify the issue and
 * define the OCAP (out-of-control action plan).
 *
 * @author Rick-Rainer Ludwig
 *
 */
public interface EventException extends Event {

    /**
     * This method returns the message of the exception obtained by
     * {@link Exception#getMessage()}.
     *
     * @return A {@link String} with the message is returned.
     */
    String getMessage();

    /**
     * This method returns the cause of the exception obtained by
     * {@link Exception#getCause()}.
     *
     * @return A {@link Throwable} with the cause exception is returned.
     */
    Throwable getCause();

    /**
     * This method returns the stack trace of the exception obtained by
     * {@link Exception#getStackTrace()}.
     *
     * @return An array of {@link StackTraceElement} with the stack trace is
     *         returned.
     */
    StackTraceElement[] getStackTrace();

}
