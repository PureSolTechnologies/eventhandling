package com.puresoltechnologies.events.impl;

import java.time.Instant;
import java.util.Collection;

import com.puresoltechnologies.events.domain.Action;
import com.puresoltechnologies.events.domain.Event;
import com.puresoltechnologies.events.domain.EventSeverity;

public class EventImpl extends EventDefinitionImpl implements Event {

    private final Instant time;

    public EventImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Action... actions) {
	super(componentShortcut, componentName, code, severity, description, actions);
	this.time = Instant.now();
    }

    public EventImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Collection<Action> actions) {
	super(componentShortcut, componentName, code, severity, description, actions);
	this.time = Instant.now();
    }

    public EventImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description) {
	super(componentShortcut, componentName, code, severity, description);
	this.time = Instant.now();
    }

    public EventImpl(Instant time, String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Action... actions) {
	super(componentShortcut, componentName, code, severity, description, actions);
	this.time = time;
    }

    public EventImpl(Instant time, String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Collection<Action> actions) {
	super(componentShortcut, componentName, code, severity, description, actions);
	this.time = time;
    }

    public EventImpl(Instant time, String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description) {
	super(componentShortcut, componentName, code, severity, description);
	this.time = time;
    }

    @Override
    public Instant getTime() {
	return time;
    }

    @Override
    public String toString() {
	return time.toString() + " " + super.toString();
    }

}
