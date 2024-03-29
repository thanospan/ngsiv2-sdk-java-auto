/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Entity1 type.
 */
public class Entity1 {
    private String idPattern;
    private String type;

    /**
     * Default constructor.
     */
    public Entity1() {
    }

    /**
     * Initialization constructor.
     * @param  idPattern  String value for idPattern.
     * @param  type  String value for type.
     */
    public Entity1(
            String idPattern,
            String type) {
        this.idPattern = idPattern;
        this.type = type;
    }

    /**
     * Getter for IdPattern.
     * @return Returns the String
     */
    @JsonGetter("idPattern")
    public String getIdPattern() {
        return idPattern;
    }

    /**
     * Setter for IdPattern.
     * @param idPattern Value for String
     */
    @JsonSetter("idPattern")
    public void setIdPattern(String idPattern) {
        this.idPattern = idPattern;
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
     * Converts this Entity1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Entity1 [" + "idPattern=" + idPattern + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link Entity1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Entity1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(idPattern, type);
        return builder;
    }

    /**
     * Class to build instances of {@link Entity1}.
     */
    public static class Builder {
        private String idPattern;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  idPattern  String value for idPattern.
         * @param  type  String value for type.
         */
        public Builder(String idPattern, String type) {
            this.idPattern = idPattern;
            this.type = type;
        }

        /**
         * Setter for idPattern.
         * @param  idPattern  String value for idPattern.
         * @return Builder
         */
        public Builder idPattern(String idPattern) {
            this.idPattern = idPattern;
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
         * Builds a new {@link Entity1} object using the set fields.
         * @return {@link Entity1}
         */
        public Entity1 build() {
            return new Entity1(idPattern, type);
        }
    }
}
