/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.fiware.lab.orion.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;
import org.fiware.lab.orion.ApiHelper;
import org.fiware.lab.orion.FIWARENGSIV2SpecificationClient;
import org.fiware.lab.orion.exceptions.ApiException;
import org.fiware.lab.orion.models.GetAttributeValueResponse;
import org.fiware.lab.orion.models.UpdateAttributeValueRequest;
import org.fiware.lab.orion.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AttributeValueControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static FIWARENGSIV2SpecificationClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AttributeValueController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAttributeValueController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This operation returns the `value` property with the value of the attribute. * If attribute
     * value is JSON Array or Object: * If `Accept` header can be expanded to `application/json` or
     * `text/plain` return the value as a JSON with a response type of application/json or
     * text/plain (whichever is the first in `Accept` header or `application/json` in case of
     * `Accept: *`). * Else return a HTTP error "406 Not Acceptable: accepted MIME types:
     * application/json, text/plain" * If attribute value is a string, number, null or boolean: * If
     * `Accept` header can be expanded to text/plain return the value as text. In case of a string,
     * citation marks are used at the begining and end. * Else return a HTTP error "406 Not
     * Acceptable: accepted MIME types: text/plain" Response: * Successful operation uses 200 OK. *
     * Errors use a non-2xx and (optionally) an error payload. See subsection on "Error Responses"
     * for more details.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetAttributeValue1() throws Exception {
        // Parameters for the API call
        String entityId = 
                "Bcn_Welt";
        String attrName = 
                "address";
        String type = null;

        // Set callback and perform API call
        GetAttributeValueResponse result = null;
        try {
            result = controller.getAttributeValue(entityId, attrName, type);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{  \"address\": \"Ronda de la Comunicacion s/n\",  \"zipCode\": 28050,  \"city\": "
                + "\"Madrid\",  \"country\": \"Spain\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * The request payload is the new attribute value. * If the request payload MIME type is
     * `application/json`, then the value of the attribute is set to the JSON object or array coded
     * in the payload (if the payload is not a valid JSON document, then an error is returned). * If
     * the request payload MIME type is `text/plain`, then the following algorithm is applied to the
     * payload: * If the payload starts and ends with citation-marks (`"`), the value is taken as a
     * string (the citation marks themselves are not considered part of the string) * If `true` or
     * `false`, the value is taken as a boolean. * If `null`, the value is taken as null. * If these
     * first three tests 'fail', the text is interpreted as a number. * If not a valid number, then
     * an error is returned and the attribute's value is unchanged. The payload MIME type in the
     * request is specified in the `Content-Type` HTTP header. Response: * Successful operation uses
     * 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on
     * "Error Responses" for more details.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUpdateAttributeValue1() throws Exception {
        // Parameters for the API call
        String entityId = 
                "Bcn_Welt";
        String attrName = 
                "address";
        UpdateAttributeValueRequest body = ApiHelper.deserialize(
                "{  \"address\": \"Ronda de la Comunicacion s/n\",  \"zipCode\": 28050,  \"city\": "
                + "\"Madrid\",  \"country\": \"Spain\"}",
                UpdateAttributeValueRequest.class);
        String type = null;

        // Set callback and perform API call
        try {
            controller.updateAttributeValue(entityId, attrName, body, type);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
