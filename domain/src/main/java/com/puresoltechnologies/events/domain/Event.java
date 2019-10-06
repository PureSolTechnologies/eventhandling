package com.puresoltechnologies.events.domain;

import java.time.Instant;

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

}
