/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Datum type.
 */
public class Datum {
    private String type;
    private String id;
    private Temperature3 temperature;

    /**
     * Default constructor.
     */
    public Datum() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  id  String value for id.
     * @param  temperature  Temperature3 value for temperature.
     */
    public Datum(
            String type,
            String id,
            Temperature3 temperature) {
        this.type = type;
        this.id = id;
        this.temperature = temperature;
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
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Temperature.
     * @return Returns the Temperature3
     */
    @JsonGetter("temperature")
    public Temperature3 getTemperature() {
        return temperature;
    }

    /**
     * Setter for Temperature.
     * @param temperature Value for Temperature3
     */
    @JsonSetter("temperature")
    public void setTemperature(Temperature3 temperature) {
        this.temperature = temperature;
    }

    /**
     * Converts this Datum into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Datum [" + "type=" + type + ", id=" + id + ", temperature=" + temperature + "]";
    }

    /**
     * Builds a new {@link Datum.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Datum.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id, temperature);
        return builder;
    }

    /**
     * Class to build instances of {@link Datum}.
     */
    public static class Builder {
        private String type;
        private String id;
        private Temperature3 temperature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  id  String value for id.
         * @param  temperature  Temperature3 value for temperature.
         */
        public Builder(String type, String id, Temperature3 temperature) {
            this.type = type;
            this.id = id;
            this.temperature = temperature;
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
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for temperature.
         * @param  temperature  Temperature3 value for temperature.
         * @return Builder
         */
        public Builder temperature(Temperature3 temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * Builds a new {@link Datum} object using the set fields.
         * @return {@link Datum}
         */
        public Datum build() {
            return new Datum(type, id, temperature);
        }
    }
}
