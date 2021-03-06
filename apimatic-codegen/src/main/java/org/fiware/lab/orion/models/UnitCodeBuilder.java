/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class UnitCodeBuilder {
    //the instance to build
    private UnitCode unitCode;

    /**
     * Default constructor to initialize the instance
     */
    public UnitCodeBuilder() {
        unitCode = new UnitCode();
    }

    public UnitCodeBuilder value(String value) {
        unitCode.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UnitCode build() {
        return unitCode;
    }
}