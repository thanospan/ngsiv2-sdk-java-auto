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


import org.openapitools.client.model.GetAttributeDataResponse;
import org.openapitools.client.model.UpdateAttributeDataRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributesApi {
    private ApiClient localVarApiClient;

    public AttributesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttributesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAttributeData
     * @param entityId Id of the entity (required)
     * @param attrName Name of the attribute to be retrieved. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttributeDataCall(String entityId, String attrName, String type, String metadata, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
            .replaceAll("\\{" + "entityId" + "\\}", localVarApiClient.escapeString(entityId.toString()))
            .replaceAll("\\{" + "attrName" + "\\}", localVarApiClient.escapeString(attrName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (metadata != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metadata", metadata));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttributeDataValidateBeforeCall(String entityId, String attrName, String type, String metadata, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new ApiException("Missing the required parameter 'entityId' when calling getAttributeData(Async)");
        }
        
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new ApiException("Missing the required parameter 'attrName' when calling getAttributeData(Async)");
        }
        

        okhttp3.Call localVarCall = getAttributeDataCall(entityId, attrName, type, metadata, _callback);
        return localVarCall;

    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity (required)
     * @param attrName Name of the attribute to be retrieved. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. (optional)
     * @return GetAttributeDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetAttributeDataResponse getAttributeData(String entityId, String attrName, String type, String metadata) throws ApiException {
        ApiResponse<GetAttributeDataResponse> localVarResp = getAttributeDataWithHttpInfo(entityId, attrName, type, metadata);
        return localVarResp.getData();
    }

    /**
     * Get attribute data
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity (required)
     * @param attrName Name of the attribute to be retrieved. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. (optional)
     * @return ApiResponse&lt;GetAttributeDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetAttributeDataResponse> getAttributeDataWithHttpInfo(String entityId, String attrName, String type, String metadata) throws ApiException {
        okhttp3.Call localVarCall = getAttributeDataValidateBeforeCall(entityId, attrName, type, metadata, null);
        Type localVarReturnType = new TypeToken<GetAttributeDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get attribute data (asynchronously)
     * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity (required)
     * @param attrName Name of the attribute to be retrieved. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAttributeDataAsync(String entityId, String attrName, String type, String metadata, final ApiCallback<GetAttributeDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributeDataValidateBeforeCall(entityId, attrName, type, metadata, _callback);
        Type localVarReturnType = new TypeToken<GetAttributeDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeASingleAttribute
     * @param entityId Id of the entity. (required)
     * @param attrName Attribute name. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeASingleAttributeCall(String entityId, String attrName, String type, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
            .replaceAll("\\{" + "entityId" + "\\}", localVarApiClient.escapeString(entityId.toString()))
            .replaceAll("\\{" + "attrName" + "\\}", localVarApiClient.escapeString(attrName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeASingleAttributeValidateBeforeCall(String entityId, String attrName, String type, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new ApiException("Missing the required parameter 'entityId' when calling removeASingleAttribute(Async)");
        }
        
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new ApiException("Missing the required parameter 'attrName' when calling removeASingleAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = removeASingleAttributeCall(entityId, attrName, type, _callback);
        return localVarCall;

    }

    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity. (required)
     * @param attrName Attribute name. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void removeASingleAttribute(String entityId, String attrName, String type) throws ApiException {
        removeASingleAttributeWithHttpInfo(entityId, attrName, type);
    }

    /**
     * Remove a Single Attribute
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity. (required)
     * @param attrName Attribute name. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeASingleAttributeWithHttpInfo(String entityId, String attrName, String type) throws ApiException {
        okhttp3.Call localVarCall = removeASingleAttributeValidateBeforeCall(entityId, attrName, type, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove a Single Attribute (asynchronously)
     * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity. (required)
     * @param attrName Attribute name. (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeASingleAttributeAsync(String entityId, String attrName, String type, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeASingleAttributeValidateBeforeCall(entityId, attrName, type, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateAttributeData
     * @param entityId Id of the entity to update (required)
     * @param attrName Attribute name (required)
     * @param contentType  (required)
     * @param body  (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeDataCall(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
            .replaceAll("\\{" + "entityId" + "\\}", localVarApiClient.escapeString(entityId.toString()))
            .replaceAll("\\{" + "attrName" + "\\}", localVarApiClient.escapeString(attrName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateAttributeDataValidateBeforeCall(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new ApiException("Missing the required parameter 'entityId' when calling updateAttributeData(Async)");
        }
        
        // verify the required parameter 'attrName' is set
        if (attrName == null) {
            throw new ApiException("Missing the required parameter 'attrName' when calling updateAttributeData(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling updateAttributeData(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAttributeData(Async)");
        }
        

        okhttp3.Call localVarCall = updateAttributeDataCall(entityId, attrName, contentType, body, type, _callback);
        return localVarCall;

    }

    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity to update (required)
     * @param attrName Attribute name (required)
     * @param contentType  (required)
     * @param body  (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public void updateAttributeData(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws ApiException {
        updateAttributeDataWithHttpInfo(entityId, attrName, contentType, body, type);
    }

    /**
     * Update Attribute Data
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity to update (required)
     * @param attrName Attribute name (required)
     * @param contentType  (required)
     * @param body  (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateAttributeDataWithHttpInfo(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws ApiException {
        okhttp3.Call localVarCall = updateAttributeDataValidateBeforeCall(entityId, attrName, contentType, body, type, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Attribute Data (asynchronously)
     * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityId Id of the entity to update (required)
     * @param attrName Attribute name (required)
     * @param contentType  (required)
     * @param body  (required)
     * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateAttributeDataAsync(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateAttributeDataValidateBeforeCall(entityId, attrName, contentType, body, type, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
