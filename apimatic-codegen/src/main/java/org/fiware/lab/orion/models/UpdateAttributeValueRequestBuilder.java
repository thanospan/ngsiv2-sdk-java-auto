/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class UpdateAttributeValueRequestBuilder {
    //the instance to build
    private UpdateAttributeValueRequest updateAttributeValueRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateAttributeValueRequestBuilder() {
        updateAttributeValueRequest = new UpdateAttributeValueRequest();
    }

    public UpdateAttributeValueRequestBuilder address(String address) {
        updateAttributeValueRequest.setAddress(address);
        return this;
    }

    public UpdateAttributeValueRequestBuilder zipCode(int zipCode) {
        updateAttributeValueRequest.setZipCode(zipCode);
        return this;
    }

    public UpdateAttributeValueRequestBuilder city(String city) {
        updateAttributeValueRequest.setCity(city);
        return this;
    }

    public UpdateAttributeValueRequestBuilder country(String country) {
        updateAttributeValueRequest.setCountry(country);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateAttributeValueRequest build() {
        return updateAttributeValueRequest;
    }
}