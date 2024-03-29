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

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.CreateRegistrationRequest;
import org.openapitools.client.model.ListRegistrationsResponse;
import org.openapitools.client.model.RetrieveRegistrationResponse;
import org.openapitools.client.model.UpdateRegistrationRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:46:31.524327+03:00[Europe/Athens]")
public class RegistrationsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public RegistrationsApi() {
    this(new ApiClient());
  }

  public RegistrationsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Create Registration
   * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param contentType  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void createRegistration(String contentType, CreateRegistrationRequest body) throws ApiException {
    createRegistrationWithHttpInfo(contentType, body);
  }

  /**
   * Create Registration
   * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param contentType  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> createRegistrationWithHttpInfo(String contentType, CreateRegistrationRequest body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createRegistrationRequestBuilder(contentType, body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createRegistration", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createRegistrationRequestBuilder(String contentType, CreateRegistrationRequest body) throws ApiException {
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling createRegistration");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete Registration
   * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistration(String registrationId) throws ApiException {
    deleteRegistrationWithHttpInfo(registrationId);
  }

  /**
   * Delete Registration
   * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteRegistrationWithHttpInfo(String registrationId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteRegistrationRequestBuilder(registrationId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteRegistration", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteRegistrationRequestBuilder(String registrationId) throws ApiException {
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations/{registrationId}"
        .replace("{registrationId}", ApiClient.urlEncode(registrationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List Registrations
   * Lists all the context provider registrations present in the system.
   * @param limit Limit the number of registrations to be retrieved (optional)
   * @param offset Skip a number of registrations (optional)
   * @param options Options dictionary (optional)
   * @return List&lt;ListRegistrationsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ListRegistrationsResponse> listRegistrations(Double limit, Double offset, String options) throws ApiException {
    ApiResponse<List<ListRegistrationsResponse>> localVarResponse = listRegistrationsWithHttpInfo(limit, offset, options);
    return localVarResponse.getData();
  }

  /**
   * List Registrations
   * Lists all the context provider registrations present in the system.
   * @param limit Limit the number of registrations to be retrieved (optional)
   * @param offset Skip a number of registrations (optional)
   * @param options Options dictionary (optional)
   * @return ApiResponse&lt;List&lt;ListRegistrationsResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<ListRegistrationsResponse>> listRegistrationsWithHttpInfo(Double limit, Double offset, String options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listRegistrationsRequestBuilder(limit, offset, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listRegistrations", localVarResponse);
        }
        return new ApiResponse<List<ListRegistrationsResponse>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<ListRegistrationsResponse>>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listRegistrationsRequestBuilder(Double limit, Double offset, String options) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations";

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("offset", offset));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("options", options));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Retrieve Registration
   * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @return RetrieveRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveRegistrationResponse retrieveRegistration(String registrationId) throws ApiException {
    ApiResponse<RetrieveRegistrationResponse> localVarResponse = retrieveRegistrationWithHttpInfo(registrationId);
    return localVarResponse.getData();
  }

  /**
   * Retrieve Registration
   * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @return ApiResponse&lt;RetrieveRegistrationResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RetrieveRegistrationResponse> retrieveRegistrationWithHttpInfo(String registrationId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = retrieveRegistrationRequestBuilder(registrationId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("retrieveRegistration", localVarResponse);
        }
        return new ApiResponse<RetrieveRegistrationResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RetrieveRegistrationResponse>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder retrieveRegistrationRequestBuilder(String registrationId) throws ApiException {
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling retrieveRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations/{registrationId}"
        .replace("{registrationId}", ApiClient.urlEncode(registrationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update Registration
   * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @param contentType  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRegistration(String registrationId, String contentType, UpdateRegistrationRequest body) throws ApiException {
    updateRegistrationWithHttpInfo(registrationId, contentType, body);
  }

  /**
   * Update Registration
   * Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @param contentType  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> updateRegistrationWithHttpInfo(String registrationId, String contentType, UpdateRegistrationRequest body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateRegistrationRequestBuilder(registrationId, contentType, body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateRegistration", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateRegistrationRequestBuilder(String registrationId, String contentType, UpdateRegistrationRequest body) throws ApiException {
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling updateRegistration");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling updateRegistration");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations/{registrationId}"
        .replace("{registrationId}", ApiClient.urlEncode(registrationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
