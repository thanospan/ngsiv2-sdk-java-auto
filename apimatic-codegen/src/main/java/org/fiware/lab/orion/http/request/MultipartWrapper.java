/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.http.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.fiware.lab.orion.http.Headers;

/**
 * Class to wrap byteArray and headers to be sent as part of a multipart request.
 */
public class MultipartWrapper {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serializedObj;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Headers headers;

    /**
     * Initialization constructor.
     * @param serializedObj Serialized string of object to be wrapped.
     * @param headers Headers for wrapping
     */
    public MultipartWrapper(String serializedObj, Headers headers) {
        this.serializedObj = serializedObj;
        this.headers = headers;
    }

    /**
     * Getter for bytes.
     * @return Array of bytes.
     */
    public byte[] getByteArray() {
        return serializedObj.getBytes();
    }

    /**
     * Getter for headers.
     * @return headers
     */
    public Headers getHeaders() {
        return headers;
    }
}
