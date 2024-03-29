/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Location2 type.
 */
public class Location2 {
    private String value;
    private String type;
    private Metadata3 metadata;

    /**
     * Default constructor.
     */
    public Location2() {
    }

    /**
     * Initialization constructor.
     * @param  value  String value for value.
     * @param  type  String value for type.
     * @param  metadata  Metadata3 value for metadata.
     */
    public Location2(
            String value,
            String type,
            Metadata3 metadata) {
        this.value = value;
        this.type = type;
        this.metadata = metadata;
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
     * Getter for Metadata.
     * @return Returns the Metadata3
     */
    @JsonGetter("metadata")
    public Metadata3 getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Metadata3
     */
    @JsonSetter("metadata")
    public void setMetadata(Metadata3 metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this Location2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Location2 [" + "value=" + value + ", type=" + type + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link Location2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Location2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value, type, metadata);
        return builder;
    }

    /**
     * Class to build instances of {@link Location2}.
     */
    public static class Builder {
        private String value;
        private String type;
        private Metadata3 metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  String value for value.
         * @param  type  String value for type.
         * @param  metadata  Metadata3 value for metadata.
         */
        public Builder(String value, String type, Metadata3 metadata) {
            this.value = value;
            this.type = type;
            this.metadata = metadata;
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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Metadata3 value for metadata.
         * @return Builder
         */
        public Builder metadata(Metadata3 metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link Location2} object using the set fields.
         * @return {@link Location2}
         */
        public Location2 build() {
            return new Location2(value, type, metadata);
        }
    }
}
