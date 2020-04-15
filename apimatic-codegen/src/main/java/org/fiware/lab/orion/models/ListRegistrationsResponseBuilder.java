/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class ListRegistrationsResponseBuilder {
    //the instance to build
    private ListRegistrationsResponse listRegistrationsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListRegistrationsResponseBuilder() {
        listRegistrationsResponse = new ListRegistrationsResponse();
    }

    public ListRegistrationsResponseBuilder id(String id) {
        listRegistrationsResponse.setId(id);
        return this;
    }

    public ListRegistrationsResponseBuilder description(String description) {
        listRegistrationsResponse.setDescription(description);
        return this;
    }

    public ListRegistrationsResponseBuilder dataProvided(DataProvided dataProvided) {
        listRegistrationsResponse.setDataProvided(dataProvided);
        return this;
    }

    public ListRegistrationsResponseBuilder provider(Provider provider) {
        listRegistrationsResponse.setProvider(provider);
        return this;
    }

    public ListRegistrationsResponseBuilder expires(String expires) {
        listRegistrationsResponse.setExpires(expires);
        return this;
    }

    public ListRegistrationsResponseBuilder status(String status) {
        listRegistrationsResponse.setStatus(status);
        return this;
    }

    public ListRegistrationsResponseBuilder forwardingInformation(ForwardingInformation forwardingInformation) {
        listRegistrationsResponse.setForwardingInformation(forwardingInformation);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListRegistrationsResponse build() {
        return listRegistrationsResponse;
    }
}