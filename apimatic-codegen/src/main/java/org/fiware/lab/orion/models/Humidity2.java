/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Humidity2 type.
 */
public class Humidity2 {
    private int value;
    private String type;

    /**
     * Default constructor.
     */
    public Humidity2() {
    }

    /**
     * Initialization constructor.
     * @param  value  int value for value.
     * @param  type  String value for type.
     */
    public Humidity2(
            int value,
            String type) {
        this.value = value;
        this.type = type;
    }

    /**
     * Getter for Value.
     * @return Returns the int
     */
    @JsonGetter("value")
    public int getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for int
     */
    @JsonSetter("value")
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this Humidity2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Humidity2 [" + "value=" + value + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link Humidity2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Humidity2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value, type);
        return builder;
    }

    /**
     * Class to build instances of {@link Humidity2}.
     */
    public static class Builder {
        private int value;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  int value for value.
         * @param  type  String value for type.
         */
        public Builder(int value, String type) {
            this.value = value;
            this.type = type;
        }

        /**
         * Setter for value.
         * @param  value  int value for value.
         * @return Builder
         */
        public Builder value(int value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link Humidity2} object using the set fields.
         * @return {@link Humidity2}
         */
        public Humidity2 build() {
            return new Humidity2(value, type);
        }
    }
}
