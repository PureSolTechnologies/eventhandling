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
     *
     * @return
     */
    default String getEventCode() {
	return getComponentShortcut() + "-" + getNumber();
    }

    EventSeverity getSeverity();

    String getDescription();

    List<Action> getActions();

}
