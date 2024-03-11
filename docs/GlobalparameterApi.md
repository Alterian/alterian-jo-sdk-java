# GlobalparameterApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadGlobalparameterClientParamnameGet**](GlobalparameterApi.md#downloadGlobalparameterClientParamnameGet) | **GET** /download/globalparameter/{client}/{paramname} | Download global parameter |
| [**globalparameterClientGet**](GlobalparameterApi.md#globalparameterClientGet) | **GET** /globalparameter/{client} | Get target parameter for for specific client |
| [**globalparameterClientParamnameCopyPost**](GlobalparameterApi.md#globalparameterClientParamnameCopyPost) | **POST** /globalparameter/{client}/{paramname}/copy | Create a copy of a Global Parameter and, optionally, delete the original |
| [**globalparameterClientParamnameCopyPut**](GlobalparameterApi.md#globalparameterClientParamnameCopyPut) | **PUT** /globalparameter/{client}/{paramname}/copy | Create a copy of a Global Parameter overwriting the target if it exists and, optionally, delete the original |
| [**globalparameterClientParamnameDelete**](GlobalparameterApi.md#globalparameterClientParamnameDelete) | **DELETE** /globalparameter/{client}/{paramname} | Delete a global parameter |
| [**globalparameterClientParamnameGet**](GlobalparameterApi.md#globalparameterClientParamnameGet) | **GET** /globalparameter/{client}/{paramname} | Get individual Global Parameter |
| [**globalparameterClientParamnamePut**](GlobalparameterApi.md#globalparameterClientParamnamePut) | **PUT** /globalparameter/{client}/{paramname} | Update Global Parameter |
| [**globalparameterGet**](GlobalparameterApi.md#globalparameterGet) | **GET** /globalparameter | Get global parameters for all clients |
| [**globalparameterPost**](GlobalparameterApi.md#globalparameterPost) | **POST** /globalparameter | Create Global Parameter (will fail if already exists) |


<a id="downloadGlobalparameterClientParamnameGet"></a>
# **downloadGlobalparameterClientParamnameGet**
> downloadGlobalparameterClientParamnameGet(client, paramname)

Download global parameter

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    try {
      apiInstance.downloadGlobalparameterClientParamnameGet(client, paramname);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#downloadGlobalparameterClientParamnameGet");
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
| **paramname** | **String**| parameter name | |

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
| **200** | A uuencoded octet stream containing the JSON file |  -  |

<a id="globalparameterClientGet"></a>
# **globalparameterClientGet**
> ParameterList globalparameterClientGet(client, from, to, sortProperty, sortDescending, searchText, iClients)

Get target parameter for for specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String sortProperty = "sortProperty_example"; // String | List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue.
    String sortDescending = "sortDescending_example"; // String | List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      ParameterList result = apiInstance.globalparameterClientGet(client, from, to, sortProperty, sortDescending, searchText, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientGet");
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
| **sortProperty** | **String**| List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue. | [optional] |
| **sortDescending** | **String**| List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**ParameterList**](ParameterList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Roles that the system knows about |  -  |

<a id="globalparameterClientParamnameCopyPost"></a>
# **globalparameterClientParamnameCopyPost**
> ParameterApiResponse globalparameterClientParamnameCopyPost(client, paramname, parameterCopyDetails)

Create a copy of a Global Parameter and, optionally, delete the original

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    ParameterCopyDetails parameterCopyDetails = new ParameterCopyDetails(); // ParameterCopyDetails | 
    try {
      ParameterApiResponse result = apiInstance.globalparameterClientParamnameCopyPost(client, paramname, parameterCopyDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientParamnameCopyPost");
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
| **paramname** | **String**| parameter name | |
| **parameterCopyDetails** | [**ParameterCopyDetails**](ParameterCopyDetails.md)|  | |

### Return type

[**ParameterApiResponse**](ParameterApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="globalparameterClientParamnameCopyPut"></a>
# **globalparameterClientParamnameCopyPut**
> ParameterApiResponse globalparameterClientParamnameCopyPut(client, paramname, parameterCopyDetails)

Create a copy of a Global Parameter overwriting the target if it exists and, optionally, delete the original

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    ParameterCopyDetails parameterCopyDetails = new ParameterCopyDetails(); // ParameterCopyDetails | 
    try {
      ParameterApiResponse result = apiInstance.globalparameterClientParamnameCopyPut(client, paramname, parameterCopyDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientParamnameCopyPut");
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
| **paramname** | **String**| parameter name | |
| **parameterCopyDetails** | [**ParameterCopyDetails**](ParameterCopyDetails.md)|  | |

### Return type

[**ParameterApiResponse**](ParameterApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="globalparameterClientParamnameDelete"></a>
# **globalparameterClientParamnameDelete**
> ModelApiResponse globalparameterClientParamnameDelete(client, paramname)

Delete a global parameter

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    try {
      ModelApiResponse result = apiInstance.globalparameterClientParamnameDelete(client, paramname);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientParamnameDelete");
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
| **paramname** | **String**| parameter name | |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Roles that the system knows about |  -  |

<a id="globalparameterClientParamnameGet"></a>
# **globalparameterClientParamnameGet**
> ParameterList globalparameterClientParamnameGet(client, paramname)

Get individual Global Parameter

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    try {
      ParameterList result = apiInstance.globalparameterClientParamnameGet(client, paramname);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientParamnameGet");
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
| **paramname** | **String**| parameter name | |

### Return type

[**ParameterList**](ParameterList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Roles that the system knows about |  -  |

<a id="globalparameterClientParamnamePut"></a>
# **globalparameterClientParamnamePut**
> ParameterApiResponse globalparameterClientParamnamePut(client, paramname, parameter)

Update Global Parameter

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    String client = "client_example"; // String | Client name
    String paramname = "paramname_example"; // String | parameter name
    Parameter parameter = new Parameter(); // Parameter | 
    try {
      ParameterApiResponse result = apiInstance.globalparameterClientParamnamePut(client, paramname, parameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterClientParamnamePut");
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
| **paramname** | **String**| parameter name | |
| **parameter** | [**Parameter**](Parameter.md)|  | |

### Return type

[**ParameterApiResponse**](ParameterApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="globalparameterGet"></a>
# **globalparameterGet**
> ParameterList globalparameterGet(from, to, sortProperty, sortDescending, searchText, iClients)

Get global parameters for all clients

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String sortProperty = "sortProperty_example"; // String | List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue.
    String sortDescending = "sortDescending_example"; // String | List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      ParameterList result = apiInstance.globalparameterGet(from, to, sortProperty, sortDescending, searchText, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterGet");
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
| **sortProperty** | **String**| List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue. | [optional] |
| **sortDescending** | **String**| List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**ParameterList**](ParameterList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Roles that the system knows about |  -  |

<a id="globalparameterPost"></a>
# **globalparameterPost**
> ParameterApiResponse globalparameterPost(parameter)

Create Global Parameter (will fail if already exists)

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.GlobalparameterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GlobalparameterApi apiInstance = new GlobalparameterApi(defaultClient);
    Parameter parameter = new Parameter(); // Parameter | 
    try {
      ParameterApiResponse result = apiInstance.globalparameterPost(parameter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalparameterApi#globalparameterPost");
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
| **parameter** | [**Parameter**](Parameter.md)|  | [optional] |

### Return type

[**ParameterApiResponse**](ParameterApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

