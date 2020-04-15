/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.NotifyRequest;
import org.openapitools.client.model.QueryRequest;
import org.openapitools.client.model.QueryResponse;
import org.openapitools.client.model.UpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchOperationsApi {
    private ApiClient localVarApiClient;

    public BatchOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchOperationsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for notify
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyCall(String contentType, NotifyRequest body, String options, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/notify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (options != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("options", options));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notifyValidateBeforeCall(String contentType, NotifyRequest body, String options, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling notify(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling notify(Async)");
        }
        

        okhttp3.Call localVarCall = notifyCall(contentType, body, options, _callback);
        return localVarCall;

    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void notify(String contentType, NotifyRequest body, String options) throws ApiException {
        notifyWithHttpInfo(contentType, body, options);
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> notifyWithHttpInfo(String contentType, NotifyRequest body, String options) throws ApiException {
        okhttp3.Call localVarCall = notifyValidateBeforeCall(contentType, body, options, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Notify (asynchronously)
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyAsync(String contentType, NotifyRequest body, String options, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = notifyValidateBeforeCall(contentType, body, options, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryCall(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderBy", orderBy));
        }

        if (options != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("options", options));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling query(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling query(Async)");
        }
        

        okhttp3.Call localVarCall = queryCall(contentType, body, limit, offset, orderBy, options, _callback);
        return localVarCall;

    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @return List&lt;QueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<QueryResponse> query(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws ApiException {
        ApiResponse<List<QueryResponse>> localVarResp = queryWithHttpInfo(contentType, body, limit, offset, orderBy, options);
        return localVarResp.getData();
    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;List&lt;QueryResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<QueryResponse>> queryWithHttpInfo(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(contentType, body, limit, offset, orderBy, options, null);
        Type localVarReturnType = new TypeToken<List<QueryResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Query (asynchronously)
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryAsync(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ApiCallback<List<QueryResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(contentType, body, limit, offset, orderBy, options, _callback);
        Type localVarReturnType = new TypeToken<List<QueryResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for update
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCall(String contentType, UpdateRequest body, String options, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (options != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("options", options));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateValidateBeforeCall(String contentType, UpdateRequest body, String options, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling update(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling update(Async)");
        }
        

        okhttp3.Call localVarCall = updateCall(contentType, body, options, _callback);
        return localVarCall;

    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void update(String contentType, UpdateRequest body, String options) throws ApiException {
        updateWithHttpInfo(contentType, body, options);
    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateWithHttpInfo(String contentType, UpdateRequest body, String options) throws ApiException {
        okhttp3.Call localVarCall = updateValidateBeforeCall(contentType, body, options, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update (asynchronously)
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAsync(String contentType, UpdateRequest body, String options, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateValidateBeforeCall(contentType, body, options, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
