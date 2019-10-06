package com.puresoltechnologies.events.domain;

/**
 * This enum is used tO define the severity of an event.
 *
 * @author Rick-Rainer Ludwig
 */
public enum EventSeverity {

    INFO("This event is used to log state changes of the system and to provide information about the usage of the system for failure analysis and as context for the other event severities."), //
    WARNING("This event indicates an issue of a part of a guaranteed functionality, but the overall consistency of the system is assured."), //
    ERROR("This event indicates an issue of a guaranteed functionality which is aborted. A major functionality is not available and the overall consistency of the system cannot be assured."), //
    FATAL("This event is used to indicate a fatal issue, what causes the system/ programm to stop working. It is used to log the final conditions and information before the service or programm is shut down for failure analysis."), //
    ;

    private final String description;

    private EventSeverity(String description) {
	this.description = description;
    }

    /**
     * Provides a description of the event to be shown in event logging UIs.
     *
     * @return A {@link String} is returned containing a short description of the
     *         event.
     */
    public String getDescription() {
	return description;
    }

}
