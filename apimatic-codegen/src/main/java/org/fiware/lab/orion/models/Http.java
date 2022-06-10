/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Http type.
 */
public class Http {
    private String url;

    /**
     * Default constructor.
     */
    public Http() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     */
    public Http(
            String url) {
        this.url = url;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this Http into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Http [" + "url=" + url + "]";
    }

    /**
     * Builds a new {@link Http.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Http.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url);
        return builder;
    }

    /**
     * Class to build instances of {@link Http}.
     */
    public static class Builder {
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         */
        public Builder(String url) {
            this.url = url;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Http} object using the set fields.
         * @return {@link Http}
         */
        public Http build() {
            return new Http(url);
        }
    }
}
