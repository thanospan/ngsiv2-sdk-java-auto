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


import org.openapitools.client.model.ListEntityTypesResponse;
import org.openapitools.client.model.RetrieveEntityTypeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TypesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TypesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for listEntityTypes
     * @param limit Limit the number of types to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param options Options dictionary. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEntityTypesCall(Double limit, Double offset, String options, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/types/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (options != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("options", options));
        }

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listEntityTypesValidateBeforeCall(Double limit, Double offset, String options, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listEntityTypesCall(limit, offset, options, _callback);
        return localVarCall;

    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param limit Limit the number of types to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param options Options dictionary. (optional)
     * @return List&lt;ListEntityTypesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ListEntityTypesResponse> listEntityTypes(Double limit, Double offset, String options) throws ApiException {
        ApiResponse<List<ListEntityTypesResponse>> localVarResp = listEntityTypesWithHttpInfo(limit, offset, options);
        return localVarResp.getData();
    }

    /**
     * List Entity Types
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param limit Limit the number of types to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param options Options dictionary. (optional)
     * @return ApiResponse&lt;List&lt;ListEntityTypesResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ListEntityTypesResponse>> listEntityTypesWithHttpInfo(Double limit, Double offset, String options) throws ApiException {
        okhttp3.Call localVarCall = listEntityTypesValidateBeforeCall(limit, offset, options, null);
        Type localVarReturnType = new TypeToken<List<ListEntityTypesResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Entity Types (asynchronously)
     * If the &#x60;values&#x60; option is not in use, this operation returns a JSON array with the entity types. Each element is a JSON object with information about the type: * &#x60;type&#x60; : the entity type name. * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. If the &#x60;values&#x60; option is used, the operation returns a JSON array with a list of entity type names as strings. Results are ordered by entity &#x60;type&#x60; in alphabetical order. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param limit Limit the number of types to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param options Options dictionary. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listEntityTypesAsync(Double limit, Double offset, String options, final ApiCallback<List<ListEntityTypesResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listEntityTypesValidateBeforeCall(limit, offset, options, _callback);
        Type localVarReturnType = new TypeToken<List<ListEntityTypesResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveEntityType
     * @param entityType Entity Type (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveEntityTypeCall(String entityType, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/types/{entityType}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveEntityTypeValidateBeforeCall(String entityType, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling retrieveEntityType(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveEntityTypeCall(entityType, _callback);
        return localVarCall;

    }

    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityType Entity Type (required)
     * @return RetrieveEntityTypeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RetrieveEntityTypeResponse retrieveEntityType(String entityType) throws ApiException {
        ApiResponse<RetrieveEntityTypeResponse> localVarResp = retrieveEntityTypeWithHttpInfo(entityType);
        return localVarResp.getData();
    }

    /**
     * Retrieve entity type
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityType Entity Type (required)
     * @return ApiResponse&lt;RetrieveEntityTypeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RetrieveEntityTypeResponse> retrieveEntityTypeWithHttpInfo(String entityType) throws ApiException {
        okhttp3.Call localVarCall = retrieveEntityTypeValidateBeforeCall(entityType, null);
        Type localVarReturnType = new TypeToken<RetrieveEntityTypeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve entity type (asynchronously)
     * This operation returns a JSON object with information about the type: * &#x60;attrs&#x60; : the set of attribute names along with all the entities of such type, represented in   a JSON object whose keys are the attribute names and whose values contain information of such   attributes (in particular a list of the types used by attributes with that name along with all the   entities). * &#x60;count&#x60; : the number of entities belonging to that type. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param entityType Entity Type (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveEntityTypeAsync(String entityType, final ApiCallback<RetrieveEntityTypeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveEntityTypeValidateBeforeCall(entityType, _callback);
        Type localVarReturnType = new TypeToken<RetrieveEntityTypeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
