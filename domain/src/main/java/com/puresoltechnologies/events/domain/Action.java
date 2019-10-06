package com.puresoltechnologies.events.domain;

/**
 * This interface defines a single action what can be performed after a certain
 * event occurred. It is mainly used for warning, errors and fatals to tell
 * service personnel how to contain the issue and how to fix the issue.
 *
 * @author Rick-Rainer Ludwig
 *
 */
public interface Action {

    String getInstructions();

}
