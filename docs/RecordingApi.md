# RecordingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**recordingClientDelete**](RecordingApi.md#recordingClientDelete) | **DELETE** /recording/{client} | Delete all recordings created by this client. |
| [**recordingClientGet**](RecordingApi.md#recordingClientGet) | **GET** /recording/{client} | Get details about all recordings created by a specific client |
| [**recordingClientTargetDelete**](RecordingApi.md#recordingClientTargetDelete) | **DELETE** /recording/{client}/{target} | Delete all recordings created by this client in this target. |
| [**recordingClientTargetGet**](RecordingApi.md#recordingClientTargetGet) | **GET** /recording/{client}/{target} | Get details about all recordings created by a specific client in a specific target |
| [**recordingClientTargetNameDelete**](RecordingApi.md#recordingClientTargetNameDelete) | **DELETE** /recording/{client}/{target}/{name} | Delete a specific recording. |
| [**recordingClientTargetNameEventsGet**](RecordingApi.md#recordingClientTargetNameEventsGet) | **GET** /recording/{client}/{target}/{name}/events | Get raw event traffic associated with this specific recording |
| [**recordingClientTargetNameGet**](RecordingApi.md#recordingClientTargetNameGet) | **GET** /recording/{client}/{target}/{name} | Get details about a specific recording |
| [**recordingClientTargetNamePut**](RecordingApi.md#recordingClientTargetNamePut) | **PUT** /recording/{client}/{target}/{name} | Edit the details of a specific recording. |
| [**recordingClientTargetPost**](RecordingApi.md#recordingClientTargetPost) | **POST** /recording/{client}/{target} | Start or stop recording traffic for this client and target |
| [**recordingGet**](RecordingApi.md#recordingGet) | **GET** /recording | Get details about all recordings in the cluster |


<a id="recordingClientDelete"></a>
# **recordingClientDelete**
> recordingClientDelete(client)

Delete all recordings created by this client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      apiInstance.recordingClientDelete(client);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientDelete");
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
| **client** | **String**| Client name | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientGet"></a>
# **recordingClientGet**
> recordingClientGet(client, from, to)

Get details about all recordings created by a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      apiInstance.recordingClientGet(client, from, to);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientGet");
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
| **client** | **String**| Client name | |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetDelete"></a>
# **recordingClientTargetDelete**
> recordingClientTargetDelete(client, target)

Delete all recordings created by this client in this target.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Filter recordings to this client
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    try {
      apiInstance.recordingClientTargetDelete(client, target);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetDelete");
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
| **client** | **String**| Filter recordings to this client | |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetGet"></a>
# **recordingClientTargetGet**
> recordingClientTargetGet(client, target, from, to)

Get details about all recordings created by a specific client in a specific target

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Which target should we filter to?
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      apiInstance.recordingClientTargetGet(client, target, from, to);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetGet");
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
| **client** | **String**| Client name | |
| **target** | [**TargetEnum**](.md)| Which target should we filter to? | [enum: dev, test, prod] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetNameDelete"></a>
# **recordingClientTargetNameDelete**
> recordingClientTargetNameDelete(client, target, name)

Delete a specific recording.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Filter recordings to this client
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filter recordings to this target
    String name = "name_example"; // String | The name of the recording
    try {
      apiInstance.recordingClientTargetNameDelete(client, target, name);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetNameDelete");
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
| **client** | **String**| Filter recordings to this client | |
| **target** | [**TargetEnum**](.md)| Filter recordings to this target | [enum: dev, test, prod] |
| **name** | **String**| The name of the recording | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetNameEventsGet"></a>
# **recordingClientTargetNameEventsGet**
> recordingClientTargetNameEventsGet(client, target, name, since, from, to)

Get raw event traffic associated with this specific recording

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Which target should we filter to?
    String name = "name_example"; // String | The name of the recording
    String since = "since_example"; // String | Optional 'since' values for paging large data - pass in the value from the last row returned. Use instead of 'From'
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      apiInstance.recordingClientTargetNameEventsGet(client, target, name, since, from, to);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetNameEventsGet");
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
| **client** | **String**| Client name | |
| **target** | [**TargetEnum**](.md)| Which target should we filter to? | [enum: dev, test, prod] |
| **name** | **String**| The name of the recording | |
| **since** | **String**| Optional &#39;since&#39; values for paging large data - pass in the value from the last row returned. Use instead of &#39;From&#39; | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetNameGet"></a>
# **recordingClientTargetNameGet**
> recordingClientTargetNameGet(client, target, name, analysis, force)

Get details about a specific recording

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Which target should we filter to?
    String name = "name_example"; // String | The name of the recording
    Boolean analysis = true; // Boolean | Should the server also perform analysis of the recorded data so that common items can be identified?
    Boolean force = true; // Boolean | Analysis data is cached. Should the cached data be cleared and the analysis be re-performed on the   raw data?
    try {
      apiInstance.recordingClientTargetNameGet(client, target, name, analysis, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetNameGet");
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
| **client** | **String**| Client name | |
| **target** | [**TargetEnum**](.md)| Which target should we filter to? | [enum: dev, test, prod] |
| **name** | **String**| The name of the recording | |
| **analysis** | **Boolean**| Should the server also perform analysis of the recorded data so that common items can be identified? | [optional] |
| **force** | **Boolean**| Analysis data is cached. Should the cached data be cleared and the analysis be re-performed on the   raw data? | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetNamePut"></a>
# **recordingClientTargetNamePut**
> ModelApiResponse recordingClientTargetNamePut(client, target, name, body)

Edit the details of a specific recording.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | The client that this recording belongs to
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | The target that this recording belongs to
    String name = "name_example"; // String | The name of the existing recording
    String body = {"name":"my recording"}; // String | JSON containing optional additional settings for this recording.
    try {
      ModelApiResponse result = apiInstance.recordingClientTargetNamePut(client, target, name, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetNamePut");
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
| **client** | **String**| The client that this recording belongs to | |
| **target** | [**TargetEnum**](.md)| The target that this recording belongs to | [enum: dev, test, prod] |
| **name** | **String**| The name of the existing recording | |
| **body** | **String**| JSON containing optional additional settings for this recording. | [optional] |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingClientTargetPost"></a>
# **recordingClientTargetPost**
> recordingClientTargetPost(client, target, action, body)

Start or stop recording traffic for this client and target

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    String client = "client_example"; // String | The client to start recording traffic for
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | The target to start recording traffic for
    String action = "start"; // String | Start or stop recording. Will toggle the current recording state (i.e. start->stop or stop->start) if   not specified.
    String body = {"name":"my recording"}; // String | JSON containing optional additional settings for this recording.
    try {
      apiInstance.recordingClientTargetPost(client, target, action, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingClientTargetPost");
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
| **client** | **String**| The client to start recording traffic for | |
| **target** | [**TargetEnum**](.md)| The target to start recording traffic for | [enum: dev, test, prod] |
| **action** | **String**| Start or stop recording. Will toggle the current recording state (i.e. start-&gt;stop or stop-&gt;start) if   not specified. | [optional] [enum: start, stop] |
| **body** | **String**| JSON containing optional additional settings for this recording. | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="recordingGet"></a>
# **recordingGet**
> recordingGet(from, to)

Get details about all recordings in the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RecordingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RecordingApi apiInstance = new RecordingApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      apiInstance.recordingGet(from, to);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecordingApi#recordingGet");
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
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

