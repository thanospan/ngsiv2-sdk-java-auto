/*
 * FIWARENGSIV2SpecificationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.fiware.lab.orion.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import org.fiware.lab.orion.*;
import org.fiware.lab.orion.models.*;
import org.fiware.lab.orion.exceptions.*;
import org.fiware.lab.orion.http.client.HttpClient;
import org.fiware.lab.orion.http.client.HttpContext;
import org.fiware.lab.orion.http.request.HttpRequest;
import org.fiware.lab.orion.http.response.HttpResponse;
import org.fiware.lab.orion.http.response.HttpStringResponse;
import org.fiware.lab.orion.http.client.APICallBack;
import org.fiware.lab.orion.controllers.syncwrapper.APICallBackCatcher;

public class APIEntryPointController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static APIEntryPointController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the APIEntryPointController class 
     */
    public static APIEntryPointController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new APIEntryPointController();
                }
            }
        }
        return instance;
    }

    /**
     * This resource does not have any attributes. Instead it offers the initial
     * API affordances in the form of the links in the JSON body.
     * It is recommended to follow the “url” link values,
     * [Link](https://tools.ietf.org/html/rfc5988) or Location headers where
     * applicable to retrieve resources. Instead of constructing your own URLs,
     * to keep your client decoupled from implementation details.
     * @return    Returns the RetrieveAPIResourcesResponse response from the API call 
     */
    public RetrieveAPIResourcesResponse retrieveAPIResources(
    ) throws Throwable {

        HttpRequest _request = _buildRetrieveAPIResourcesRequest();
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleRetrieveAPIResourcesResponse(_context);
    }

    /**
     * This resource does not have any attributes. Instead it offers the initial
     * API affordances in the form of the links in the JSON body.
     * It is recommended to follow the “url” link values,
     * [Link](https://tools.ietf.org/html/rfc5988) or Location headers where
     * applicable to retrieve resources. Instead of constructing your own URLs,
     * to keep your client decoupled from implementation details.
     */
    public void retrieveAPIResourcesAsync(
                final APICallBack<RetrieveAPIResourcesResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildRetrieveAPIResourcesRequest();
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            RetrieveAPIResourcesResponse returnValue = _handleRetrieveAPIResourcesResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for retrieveAPIResources
     */
    private HttpRequest _buildRetrieveAPIResourcesRequest() throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/v2");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for retrieveAPIResources
     * @return An object of type RetrieveAPIResourcesResponse
     */
    private RetrieveAPIResourcesResponse _handleRetrieveAPIResourcesResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        RetrieveAPIResourcesResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RetrieveAPIResourcesResponse>(){});

        return _result;
    }

}
