package com.puresoltechnologies.events.domain;

import java.util.List;

/**
 * This is the interface of an event definition.
 *
 * @author Rick-Rainer Ludwig
 */
public interface EventDefinition {

    /**
     * This method returns the component or library shortcut. This shortcut shall be
     * unique in the whole system.
     *
     * @return A {@link String} is returned containing the shortcut.
     */
    String getComponentShortcut();

    /**
     * This method returns the whole name of the component or library. This name is
     * used in event reporting to identify the component.
     *
     * @return A {@link String} containing the name is returned.
     */
    String getComponentName();

    /**
     * This method returns a number for the event of this component or library. This
     * number must be unique for this component.
     *
     * @return An int is returned containing the number.
     */
    int getNumber();

    /**
     * This method returns the event code. The event code shall be unique for the
     * whole system to avoid confusion. It shall be used as id to identify the event
     * type and the related information.
     *
     * @return A {@link String} with the event code is returned.
     */
    default String getEventCode() {
	return getComponentShortcut() + "-" + getNumber();
    }

    /**
     * This method returns the severity of the event.
     *
     * @return An {@link EventSeverity} constant is returned defining the severity
     *         of this event.
     */
    EventSeverity getSeverity();

    /**
     * This method returns a description of this event. It should describe the
     * trigger of this event and what the cause is.
     *
     * @return A {@link String} containing the description is retuned.
     */
    String getDescription();

    /**
     * This method returns a non-null {@link List} of actions which can be performed
     * as reaction of this event.
     *
     * @return A {@link List} of {@link Action} is returned.
     */
    List<Action> getActions();

}
