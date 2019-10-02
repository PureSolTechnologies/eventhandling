package com.puresoltechnologies.events;

/**
 * This is the base interface for any event exception. Event exceptions carry an
 * additional, unique event code which can be used to identify the issue and
 * define the OCAP (out-of-control action plan).
 *
 * @author Rick-Rainer Ludwig
 *
 */
public interface EventException {

    String getEventCode();

    String getMessage();

    Throwable getCause();

    StackTraceElement[] getStackTrace();

}
