/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class RetrieveRegistrationResponseBuilder {
    //the instance to build
    private RetrieveRegistrationResponse retrieveRegistrationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public RetrieveRegistrationResponseBuilder() {
        retrieveRegistrationResponse = new RetrieveRegistrationResponse();
    }

    public RetrieveRegistrationResponseBuilder id(String id) {
        retrieveRegistrationResponse.setId(id);
        return this;
    }

    public RetrieveRegistrationResponseBuilder description(String description) {
        retrieveRegistrationResponse.setDescription(description);
        return this;
    }

    public RetrieveRegistrationResponseBuilder dataProvided(DataProvided dataProvided) {
        retrieveRegistrationResponse.setDataProvided(dataProvided);
        return this;
    }

    public RetrieveRegistrationResponseBuilder provider(Provider provider) {
        retrieveRegistrationResponse.setProvider(provider);
        return this;
    }

    public RetrieveRegistrationResponseBuilder expires(String expires) {
        retrieveRegistrationResponse.setExpires(expires);
        return this;
    }

    public RetrieveRegistrationResponseBuilder status(String status) {
        retrieveRegistrationResponse.setStatus(status);
        return this;
    }

    public RetrieveRegistrationResponseBuilder forwardingInformation(ForwardingInformation forwardingInformation) {
        retrieveRegistrationResponse.setForwardingInformation(forwardingInformation);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RetrieveRegistrationResponse build() {
        return retrieveRegistrationResponse;
    }
}