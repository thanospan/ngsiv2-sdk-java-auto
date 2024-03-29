/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RetrieveEntityTypeResponse type.
 */
public class RetrieveEntityTypeResponse {
    private Attrs1 attrs;
    private int count;

    /**
     * Default constructor.
     */
    public RetrieveEntityTypeResponse() {
    }

    /**
     * Initialization constructor.
     * @param  attrs  Attrs1 value for attrs.
     * @param  count  int value for count.
     */
    public RetrieveEntityTypeResponse(
            Attrs1 attrs,
            int count) {
        this.attrs = attrs;
        this.count = count;
    }

    /**
     * Getter for Attrs.
     * @return Returns the Attrs1
     */
    @JsonGetter("attrs")
    public Attrs1 getAttrs() {
        return attrs;
    }

    /**
     * Setter for Attrs.
     * @param attrs Value for Attrs1
     */
    @JsonSetter("attrs")
    public void setAttrs(Attrs1 attrs) {
        this.attrs = attrs;
    }

    /**
     * Getter for Count.
     * @return Returns the int
     */
    @JsonGetter("count")
    public int getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * @param count Value for int
     */
    @JsonSetter("count")
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Converts this RetrieveEntityTypeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrieveEntityTypeResponse [" + "attrs=" + attrs + ", count=" + count + "]";
    }

    /**
     * Builds a new {@link RetrieveEntityTypeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveEntityTypeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(attrs, count);
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveEntityTypeResponse}.
     */
    public static class Builder {
        private Attrs1 attrs;
        private int count;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  attrs  Attrs1 value for attrs.
         * @param  count  int value for count.
         */
        public Builder(Attrs1 attrs, int count) {
            this.attrs = attrs;
            this.count = count;
        }

        /**
         * Setter for attrs.
         * @param  attrs  Attrs1 value for attrs.
         * @return Builder
         */
        public Builder attrs(Attrs1 attrs) {
            this.attrs = attrs;
            return this;
        }

        /**
         * Setter for count.
         * @param  count  int value for count.
         * @return Builder
         */
        public Builder count(int count) {
            this.count = count;
            return this;
        }

        /**
         * Builds a new {@link RetrieveEntityTypeResponse} object using the set fields.
         * @return {@link RetrieveEntityTypeResponse}
         */
        public RetrieveEntityTypeResponse build() {
            return new RetrieveEntityTypeResponse(attrs, count);
        }
    }
}
