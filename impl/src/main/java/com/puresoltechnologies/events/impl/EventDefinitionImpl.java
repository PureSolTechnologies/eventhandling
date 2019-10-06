package com.puresoltechnologies.events.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.puresoltechnologies.events.domain.Action;
import com.puresoltechnologies.events.domain.EventDefinition;
import com.puresoltechnologies.events.domain.EventSeverity;

/**
 * This is an implementation of {@link EventDefinition}.
 *
 * @author Rick-Rainer Ludwig
 */
public class EventDefinitionImpl implements EventDefinition {

    private final String componentShortcut;
    private final String componentName;
    private final int code;
    private final EventSeverity severity;
    private final String description;
    private final List<Action> actions = new ArrayList<>();

    public EventDefinitionImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description) {
	super();
	this.componentShortcut = componentShortcut;
	this.componentName = componentName;
	this.code = code;
	this.severity = severity;
	this.description = description;
    }

    public EventDefinitionImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Collection<Action> actions) {
	this(componentShortcut, componentName, code, severity, description);
	this.actions.addAll(actions);
    }

    public EventDefinitionImpl(String componentShortcut, String componentName, int code, EventSeverity severity,
	    String description, Action... actions) {
	this(componentShortcut, componentName, code, severity, description, Arrays.asList(actions));
    }

    @Override
    public String getComponentShortcut() {
	return componentShortcut;
    }

    @Override
    public String getComponentName() {
	return componentName;
    }

    @Override
    public int getNumber() {
	return code;
    }

    @Override
    public EventSeverity getSeverity() {
	return severity;
    }

    @Override
    public String getDescription() {
	return description;
    }

    @Override
    public List<Action> getActions() {
	return Collections.unmodifiableList(actions);
    }

    @Override
    public String toString() {
	return severity.name() + " " + componentShortcut + "-" + code + ": " + description;
    }

}
