/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Temperature1 type.
 */
public class Temperature1 {
    private double value;

    /**
     * Default constructor.
     */
    public Temperature1() {
    }

    /**
     * Initialization constructor.
     * @param  value  double value for value.
     */
    public Temperature1(
            double value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the double
     */
    @JsonGetter("value")
    public double getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for double
     */
    @JsonSetter("value")
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Converts this Temperature1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Temperature1 [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link Temperature1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Temperature1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link Temperature1}.
     */
    public static class Builder {
        private double value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  double value for value.
         */
        public Builder(double value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  double value for value.
         * @return Builder
         */
        public Builder value(double value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link Temperature1} object using the set fields.
         * @return {@link Temperature1}
         */
        public Temperature1 build() {
            return new Temperature1(value);
        }
    }
}
