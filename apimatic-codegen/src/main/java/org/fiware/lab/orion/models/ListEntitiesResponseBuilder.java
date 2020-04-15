/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class ListEntitiesResponseBuilder {
    //the instance to build
    private ListEntitiesResponse listEntitiesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListEntitiesResponseBuilder() {
        listEntitiesResponse = new ListEntitiesResponse();
    }

    public ListEntitiesResponseBuilder type(String type) {
        listEntitiesResponse.setType(type);
        return this;
    }

    public ListEntitiesResponseBuilder id(String id) {
        listEntitiesResponse.setId(id);
        return this;
    }

    public ListEntitiesResponseBuilder temperature(Temperature temperature) {
        listEntitiesResponse.setTemperature(temperature);
        return this;
    }

    public ListEntitiesResponseBuilder speed(Speed speed) {
        listEntitiesResponse.setSpeed(speed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListEntitiesResponse build() {
        return listEntitiesResponse;
    }
}