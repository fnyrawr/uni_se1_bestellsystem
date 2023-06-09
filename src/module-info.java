/**
 * Module of a simple order processing application: <b>&rdquo;se1.bestellsystem&rdquo;</b>
 * <p>
 * The {@link datamodel} package exports the data model definitions.
 * The {@link system} package exports the system component interfaces.
 * </p>
 *
 * @author fkate
 * @since 0.1.0
 * @version 0.1.2
 */

module se1.bestellsystem {
    exports datamodel;
    exports system;

    requires transitive com.fasterxml.jackson.databind;
    requires transitive com.fasterxml.jackson.annotation;
    requires transitive com.fasterxml.jackson.core;
}