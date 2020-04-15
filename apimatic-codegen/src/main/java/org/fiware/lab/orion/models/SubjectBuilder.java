/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class SubjectBuilder {
    //the instance to build
    private Subject subject;

    /**
     * Default constructor to initialize the instance
     */
    public SubjectBuilder() {
        subject = new Subject();
    }

    public SubjectBuilder entities(List<Entity> entities) {
        subject.setEntities(entities);
        return this;
    }

    public SubjectBuilder condition(Condition condition) {
        subject.setCondition(condition);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Subject build() {
        return subject;
    }
}