package com.puresoltechnologies.events.domain;

import java.time.Instant;
import java.util.List;

/**
 * This is the interface of an occurred event. It extends a
 * {@link EventDefinition} by additional information about the actual occurrence
 * like the timestamp.
 *
 * @author Rick-Rainer Ludwig
 */
public interface Event extends EventDefinition {

    /**
     * This method returns the time of occurrence of the event.
     *
     * @return An {@link Instant} is returned containing the time of occurrence.
     */
    Instant getTime();

    /**
     * This method returns the component or library shortcut. This shortcut shall be
     * unique in the whole system.
     *
     * @return A {@link String} is returned containing the shortcut.
     */
    @Override
    String getComponentShortcut();

    /**
     * This method returns the whole name of the component or library. This name is
     * used in event reporting to identify the component.
     *
     * @return A {@link String} containing the name is returned.
     */
    @Override
    String getComponentName();

    /**
     * This method returns a number for the event of this component or library. This
     * number must be unique for this component.
     *
     * @return An int is returned containing the number.
     */
    @Override
    int getNumber();

    @Override
    default String getEventCode() {
	return getComponentShortcut() + "-" + getNumber();
    }

    @Override
    EventSeverity getSeverity();

    @Override
    String getDescription();

    @Override
    List<Action> getActions();

}
