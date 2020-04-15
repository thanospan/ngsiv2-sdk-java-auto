/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class Temperature10Builder {
    //the instance to build
    private Temperature10 temperature10;

    /**
     * Default constructor to initialize the instance
     */
    public Temperature10Builder() {
        temperature10 = new Temperature10();
    }

    public Temperature10Builder value(double value) {
        temperature10.setValue(value);
        return this;
    }

    public Temperature10Builder type(String type) {
        temperature10.setType(type);
        return this;
    }

    public Temperature10Builder accuracy(Integer accuracy) {
        temperature10.setAccuracy(accuracy);
        return this;
    }

    public Temperature10Builder timestamp(Timestamp timestamp) {
        temperature10.setTimestamp(timestamp);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Temperature10 build() {
        return temperature10;
    }
}