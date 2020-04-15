/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.models;

import java.util.*;

public class UpdateRequestBuilder {
    //the instance to build
    private UpdateRequest updateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateRequestBuilder() {
        updateRequest = new UpdateRequest();
    }

    public UpdateRequestBuilder actionType(String actionType) {
        updateRequest.setActionType(actionType);
        return this;
    }

    public UpdateRequestBuilder entities(List<Entity5> entities) {
        updateRequest.setEntities(entities);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateRequest build() {
        return updateRequest;
    }
}