/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class TemperatureBuilder {
    //the instance to build
    private Temperature temperature;

    /**
     * Default constructor to initialize the instance
     */
    public TemperatureBuilder() {
        temperature = new Temperature();
    }

    public TemperatureBuilder value(double value) {
        temperature.setValue(value);
        return this;
    }

    public TemperatureBuilder type(String type) {
        temperature.setType(type);
        return this;
    }

    public TemperatureBuilder metadata(Object metadata) {
        temperature.setMetadata(metadata);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Temperature build() {
        return temperature;
    }
}