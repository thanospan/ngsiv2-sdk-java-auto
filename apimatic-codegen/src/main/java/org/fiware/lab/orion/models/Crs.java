/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Crs type.
 */
public class Crs {
    private String value;

    /**
     * Default constructor.
     */
    public Crs() {
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     */
    public Crs(
            String value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this Crs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Crs [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link Crs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Crs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link Crs}.
     */
    public static class Builder {
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  String value for value.
         */
        public Builder(String value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link Crs} object using the set fields.
         * @return {@link Crs}
         */
        public Crs build() {
            return new Crs(value);
        }
    }
}
