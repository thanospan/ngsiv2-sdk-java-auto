# RegistrationsApi

All URIs are relative to *http://orion.lab.fiware.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRegistration**](RegistrationsApi.md#createRegistration) | **POST** /v2/registrations | Create Registration |
| [**createRegistrationWithHttpInfo**](RegistrationsApi.md#createRegistrationWithHttpInfo) | **POST** /v2/registrations | Create Registration |
| [**deleteRegistration**](RegistrationsApi.md#deleteRegistration) | **DELETE** /v2/registrations/{registrationId} | Delete Registration |
| [**deleteRegistrationWithHttpInfo**](RegistrationsApi.md#deleteRegistrationWithHttpInfo) | **DELETE** /v2/registrations/{registrationId} | Delete Registration |
| [**listRegistrations**](RegistrationsApi.md#listRegistrations) | **GET** /v2/registrations | List Registrations |
| [**listRegistrationsWithHttpInfo**](RegistrationsApi.md#listRegistrationsWithHttpInfo) | **GET** /v2/registrations | List Registrations |
| [**retrieveRegistration**](RegistrationsApi.md#retrieveRegistration) | **GET** /v2/registrations/{registrationId} | Retrieve Registration |
| [**retrieveRegistrationWithHttpInfo**](RegistrationsApi.md#retrieveRegistrationWithHttpInfo) | **GET** /v2/registrations/{registrationId} | Retrieve Registration |
| [**updateRegistration**](RegistrationsApi.md#updateRegistration) | **PATCH** /v2/registrations/{registrationId} | Update Registration |
| [**updateRegistrationWithHttpInfo**](RegistrationsApi.md#updateRegistrationWithHttpInfo) | **PATCH** /v2/registrations/{registrationId} | Update Registration |



## createRegistration

> void createRegistration(contentType, body)

Create Registration

Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String contentType = "contentType_example"; // String | 
        CreateRegistrationRequest body = new CreateRegistrationRequest(); // CreateRegistrationRequest | 
        try {
            apiInstance.createRegistration(contentType, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#createRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **body** | [**CreateRegistrationRequest**](CreateRegistrationRequest.md)|  | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

## createRegistrationWithHttpInfo

> ApiResponse<Void> createRegistration createRegistrationWithHttpInfo(contentType, body)

Create Registration

Creates a new context provider registration. This is typically used for binding context sources as providers of certain data. The registration is represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 201 Created * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String contentType = "contentType_example"; // String | 
        CreateRegistrationRequest body = new CreateRegistrationRequest(); // CreateRegistrationRequest | 
        try {
            ApiResponse<Void> response = apiInstance.createRegistrationWithHttpInfo(contentType, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#createRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**|  | |
| **body** | [**CreateRegistrationRequest**](CreateRegistrationRequest.md)|  | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## deleteRegistration

> void deleteRegistration(registrationId)

Delete Registration

Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        try {
            apiInstance.deleteRegistration(registrationId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#deleteRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

## deleteRegistrationWithHttpInfo

> ApiResponse<Void> deleteRegistration deleteRegistrationWithHttpInfo(registrationId)

Delete Registration

Cancels a context provider registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        try {
            ApiResponse<Void> response = apiInstance.deleteRegistrationWithHttpInfo(registrationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#deleteRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |


## listRegistrations

> List<ListRegistrationsResponse> listRegistrations(limit, offset, options)

List Registrations

Lists all the context provider registrations present in the system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        Double limit = 3.4D; // Double | Limit the number of registrations to be retrieved
        Double offset = 3.4D; // Double | Skip a number of registrations
        String options = "count"; // String | Options dictionary
        try {
            List<ListRegistrationsResponse> result = apiInstance.listRegistrations(limit, offset, options);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#listRegistrations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Double**| Limit the number of registrations to be retrieved | [optional] |
| **offset** | **Double**| Skip a number of registrations | [optional] |
| **options** | **String**| Options dictionary | [optional] [enum: count] |

### Return type

[**List&lt;ListRegistrationsResponse&gt;**](ListRegistrationsResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## listRegistrationsWithHttpInfo

> ApiResponse<List<ListRegistrationsResponse>> listRegistrations listRegistrationsWithHttpInfo(limit, offset, options)

List Registrations

Lists all the context provider registrations present in the system.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        Double limit = 3.4D; // Double | Limit the number of registrations to be retrieved
        Double offset = 3.4D; // Double | Skip a number of registrations
        String options = "count"; // String | Options dictionary
        try {
            ApiResponse<List<ListRegistrationsResponse>> response = apiInstance.listRegistrationsWithHttpInfo(limit, offset, options);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#listRegistrations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Double**| Limit the number of registrations to be retrieved | [optional] |
| **offset** | **Double**| Skip a number of registrations | [optional] |
| **options** | **String**| Options dictionary | [optional] [enum: count] |

### Return type

ApiResponse<[**List&lt;ListRegistrationsResponse&gt;**](ListRegistrationsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## retrieveRegistration

> RetrieveRegistrationResponse retrieveRegistration(registrationId)

Retrieve Registration

The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        try {
            RetrieveRegistrationResponse result = apiInstance.retrieveRegistration(registrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#retrieveRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |

### Return type

[**RetrieveRegistrationResponse**](RetrieveRegistrationResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

## retrieveRegistrationWithHttpInfo

> ApiResponse<RetrieveRegistrationResponse> retrieveRegistration retrieveRegistrationWithHttpInfo(registrationId)

Retrieve Registration

The response is the registration represented by a JSON object as described at the beginning of this section. Response: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        try {
            ApiResponse<RetrieveRegistrationResponse> response = apiInstance.retrieveRegistrationWithHttpInfo(registrationId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#retrieveRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |

### Return type

ApiResponse<[**RetrieveRegistrationResponse**](RetrieveRegistrationResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## updateRegistration

> void updateRegistration(registrationId, contentType, body)

Update Registration

Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        String contentType = "contentType_example"; // String | 
        UpdateRegistrationRequest body = new UpdateRegistrationRequest(); // UpdateRegistrationRequest | 
        try {
            apiInstance.updateRegistration(registrationId, contentType, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#updateRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |
| **contentType** | **String**|  | |
| **body** | [**UpdateRegistrationRequest**](UpdateRegistrationRequest.md)|  | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

## updateRegistrationWithHttpInfo

> ApiResponse<Void> updateRegistration updateRegistrationWithHttpInfo(registrationId, contentType, body)

Update Registration

Only the fields included in the request are updated in the registration. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://orion.lab.fiware.org");

        RegistrationsApi apiInstance = new RegistrationsApi(defaultClient);
        String registrationId = "registrationId_example"; // String | registration Id.
        String contentType = "contentType_example"; // String | 
        UpdateRegistrationRequest body = new UpdateRegistrationRequest(); // UpdateRegistrationRequest | 
        try {
            ApiResponse<Void> response = apiInstance.updateRegistrationWithHttpInfo(registrationId, contentType, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistrationsApi#updateRegistration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registrationId** | **String**| registration Id. | |
| **contentType** | **String**|  | |
| **body** | [**UpdateRegistrationRequest**](UpdateRegistrationRequest.md)|  | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

