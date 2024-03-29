/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Options7Enum to be used.
 */
public enum Options7Enum {
    COUNT,

    VALUES;


    private static TreeMap<String, Options7Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        COUNT.value = "count";
        VALUES.value = "values";

        valueMap.put("count", COUNT);
        valueMap.put("values", VALUES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Options7Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Options7Enum values to list of string values.
     * @param toConvert The list of Options7Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Options7Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Options7Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 