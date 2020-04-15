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
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T18:35:25.798686+03:00[Europe/Athens]")
public class RegistrationsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
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
  }

  /**
   * Create Registration
   * Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param contentType  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void createRegistration(String contentType, CreateRegistrationRequest body) throws ApiException {
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
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "createRegistration call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Delete Registration
   * Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistration(String registrationId) throws ApiException {
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling deleteRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations/{registrationId}"
        .replace("{registrationId}", ApiClient.urlEncode(registrationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "deleteRegistration call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
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

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "listRegistrations call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<ListRegistrationsResponse>>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Retrieve Registration
   * The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param registrationId registration Id. (required)
   * @return RetrieveRegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveRegistrationResponse retrieveRegistration(String registrationId) throws ApiException {
    // verify the required parameter 'registrationId' is set
    if (registrationId == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationId' when calling retrieveRegistration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/registrations/{registrationId}"
        .replace("{registrationId}", ApiClient.urlEncode(registrationId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "retrieveRegistration call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RetrieveRegistrationResponse>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
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
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "updateRegistration call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
