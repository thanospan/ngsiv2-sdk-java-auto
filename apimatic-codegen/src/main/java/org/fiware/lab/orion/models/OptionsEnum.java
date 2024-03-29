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
 * OptionsEnum to be used.
 */
public enum OptionsEnum {
    COUNT,

    KEYVALUES,

    VALUES,

    UNIQUE;


    private static TreeMap<String, OptionsEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        COUNT.value = "count";
        KEYVALUES.value = "keyValues";
        VALUES.value = "values";
        UNIQUE.value = "unique";

        valueMap.put("count", COUNT);
        valueMap.put("keyValues", KEYVALUES);
        valueMap.put("values", VALUES);
        valueMap.put("unique", UNIQUE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OptionsEnum fromString(String toConvert) {
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
     * Convert list of OptionsEnum values to list of string values.
     * @param toConvert The list of OptionsEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OptionsEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OptionsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 