/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Options1Enum {
    KEYVALUES, //TODO: Write general description for this element
    UPSERT; //TODO: Write general description for this element

    private static TreeMap<String, Options1Enum> valueMap = new TreeMap<String, Options1Enum>();
    private String value;

    static {
        KEYVALUES.value = "keyValues";
        UPSERT.value = "upsert";

        valueMap.put("keyValues", KEYVALUES);
        valueMap.put("upsert", UPSERT);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Options1Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Options1Enum values to list of string values
     * @param toConvert The list of Options1Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Options1Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Options1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 