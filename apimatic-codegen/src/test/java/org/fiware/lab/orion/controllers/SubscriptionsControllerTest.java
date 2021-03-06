/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.fiware.lab.orion.models.*;
import org.fiware.lab.orion.exceptions.*;
import org.fiware.lab.orion.APIHelper;
import org.fiware.lab.orion.Configuration;
import org.fiware.lab.orion.testing.TestHelper;
import org.fiware.lab.orion.controllers.SubscriptionsController;

import com.fasterxml.jackson.core.type.TypeReference;

public class SubscriptionsControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static SubscriptionsController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getSubscriptions();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Returns a list of all the subscriptions present in the system.

Response:

* Successful operation uses 200 OK

* Errors use a non-2xx and (optionally) an error payload. See subsection on "Error Responses" for
  more details.
     * @throws Throwable
     */
    @Test
    public void testListSubscriptions1() throws Throwable {
        // Parameters for the API call
        Double limit = 10d;
        Double offset = 20d;
        Options8Enum options = null;

        // Set callback and perform API call
        List<ListSubscriptionsResponse> result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.listSubscriptions(limit, offset, options);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", TestHelper.isArrayOfJsonObjectsProperSubsetOf(
                "[  {    \"id\": \"abcdefg\",    \"description\": \"One subscription to rule them all\",    \"subject\": {                          \"entities\": [        {          \"id\": \"Bcn_Welt\",          \"type\": \"Room\"        }      ],      \"condition\": {         \"attrs\": [ \"temperature \" ],         \"expression\": {            \"q\": \"temperature>40\"         }      }    },    \"notification\": {      \"httpCustom\": {        \"url\": \"http://localhost:1234\",        \"headers\": {          \"X-MyHeader\": \"foo\"        },        \"qs\": {          \"authToken\": \"bar\"        }      },      \"attrsFormat\": \"keyValues\",      \"attrs\": [\"temperature\", \"humidity\"],      \"timesSent\": 12,      \"lastNotification\": \"2015-10-05T16:00:00.00Z\",      \"lastFailure\": \"2015-10-06T16:00:00.00Z\"    },    \"expires\": \"2016-04-05T14:00:00.00Z\",    \"status\": \"failed\",    \"throttling\": 5  }]", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a new subscription.
The subscription is represented by a JSON object as described at the beginning of this section.

Response:

* Successful operation uses 201 Created

* Errors use a non-2xx and (optionally) an error payload. See subsection on "Error Responses" for
  more details.
     * @throws Throwable
     */
    @Test
    public void testCreateSubscription1() throws Throwable {
        // Parameters for the API call
        String contentType = "application/json";
        CreateSubscriptionRequest body = APIHelper.deserialize("{  \"description\": \"One subscription to rule them all\",  \"subject\": {    \"entities\": [      {        \"idPattern\": \".*\",        \"type\": \"Room\"      }    ],    \"condition\": {      \"attrs\": [ \"temperature\" ],      \"expression\": {        \"q\": \"temperature>40\"      }    }  },  \"notification\": {    \"http\": {      \"url\": \"http://localhost:1234\"    },    \"attrs\": [\"temperature\", \"humidity\"]  },              \"expires\": \"2016-04-05T14:00:00.00Z\",  \"throttling\": 5}", new TypeReference<CreateSubscriptionRequest>(){});

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.createSubscription(contentType, body);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Location", TestHelper.nullString);
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * Only the fields included in the request are updated in the subscription.

Response:

* Successful operation uses 204 No Content

* Errors use a non-2xx and (optionally) an error payload. See subsection on "Error Responses" for
  more details.
     * @throws Throwable
     */
    @Test
    public void testUpdateSubscription1() throws Throwable {
        // Parameters for the API call
        String subscriptionId = "abcdef";
        String contentType = "application/json";
        UpdateSubscriptionRequest body = APIHelper.deserialize("{  \"expires\": \"2016-04-05T14:00:00.00Z\"}", new TypeReference<UpdateSubscriptionRequest>(){});

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.updateSubscription(subscriptionId, contentType, body);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 204", 
                204, httpResponse.getResponse().getStatusCode());

    }

    /**
     * Cancels subscription.

Response:

* Successful operation uses 204 No Content

* Errors use a non-2xx and (optionally) an error payload. See subsection on "Error Responses" for
  more details.
     * @throws Throwable
     */
    @Test
    public void testDeleteSubscription1() throws Throwable {
        // Parameters for the API call
        String subscriptionId = "abcdef";

        // Set callback and perform API call
        controller.setHttpCallBack(httpResponse);
        try {
        controller.deleteSubscription(subscriptionId);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 204", 
                204, httpResponse.getResponse().getStatusCode());

    }

}
