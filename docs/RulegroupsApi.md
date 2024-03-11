# RulegroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadRulegroupClientTargetRulegroupnameGet**](RulegroupsApi.md#downloadRulegroupClientTargetRulegroupnameGet) | **GET** /download/rulegroup/{client}/{target}/{rulegroupname} | Download the rulegroup file (JSON) |
| [**rulegroupClientDelete**](RulegroupsApi.md#rulegroupClientDelete) | **DELETE** /rulegroup/{client} | Delete all rule groups uploaded by this client. |
| [**rulegroupClientGet**](RulegroupsApi.md#rulegroupClientGet) | **GET** /rulegroup/{client} | Get details about all rule groups uploaded by a specific client |
| [**rulegroupClientTargetDelete**](RulegroupsApi.md#rulegroupClientTargetDelete) | **DELETE** /rulegroup/{client}/{target} | Delete all rule groups uploaded by this client in this target. |
| [**rulegroupClientTargetGet**](RulegroupsApi.md#rulegroupClientTargetGet) | **GET** /rulegroup/{client}/{target} | Get details about all rule groups uploaded by a specific client in a specific target |
| [**rulegroupClientTargetRulegroupnameCopytoPost**](RulegroupsApi.md#rulegroupClientTargetRulegroupnameCopytoPost) | **POST** /rulegroup/{client}/{target}/{rulegroupname}/copyto | Copy this rule group to the given target.  Also replicates any missing rules |
| [**rulegroupClientTargetRulegroupnameDelete**](RulegroupsApi.md#rulegroupClientTargetRulegroupnameDelete) | **DELETE** /rulegroup/{client}/{target}/{rulegroupname} | Delete all versions of a specific rulegroup. |
| [**rulegroupClientTargetRulegroupnameGet**](RulegroupsApi.md#rulegroupClientTargetRulegroupnameGet) | **GET** /rulegroup/{client}/{target}/{rulegroupname} | Get details about all versions of a specified rulegroup |
| [**rulegroupClientTargetRulegroupnamePost**](RulegroupsApi.md#rulegroupClientTargetRulegroupnamePost) | **POST** /rulegroup/{client}/{target}/{rulegroupname} | Upload a file which defines the rulegroup. This will generate and return a version number number. |
| [**rulegroupClientTargetRulegroupnamePut**](RulegroupsApi.md#rulegroupClientTargetRulegroupnamePut) | **PUT** /rulegroup/{client}/{target}/{rulegroupname} | Update an existing rulegroup. This will generate and return a version number. |
| [**rulegroupClientTargetRulegroupnameVersionDelete**](RulegroupsApi.md#rulegroupClientTargetRulegroupnameVersionDelete) | **DELETE** /rulegroup/{client}/{target}/{rulegroupname}/{version} | Delete a specific version of a specific rulegroup on the server. |
| [**rulegroupClientTargetRulegroupnameVersionGet**](RulegroupsApi.md#rulegroupClientTargetRulegroupnameVersionGet) | **GET** /rulegroup/{client}/{target}/{rulegroupname}/{version} | Get details about a specific version of a specific rulegroup for a specific client |
| [**rulegroupGet**](RulegroupsApi.md#rulegroupGet) | **GET** /rulegroup | Get details about all rule groups on the server |
| [**rulegroupPost**](RulegroupsApi.md#rulegroupPost) | **POST** /rulegroup | upload a file which defines the rulegroup. This will generate and return a version number.  Please use the   /rulegroup/client/target/name post version now. |


<a id="downloadRulegroupClientTargetRulegroupnameGet"></a>
# **downloadRulegroupClientTargetRulegroupnameGet**
> downloadRulegroupClientTargetRulegroupnameGet(client, target, rulegroupname)

Download the rulegroup file (JSON)

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulegroupname = "rulegroupname_example"; // String | rulegroup name
    try {
      apiInstance.downloadRulegroupClientTargetRulegroupnameGet(client, target, rulegroupname);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#downloadRulegroupClientTargetRulegroupnameGet");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| rulegroup name | |

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

<a id="rulegroupClientDelete"></a>
# **rulegroupClientDelete**
> rulegroupClientDelete(client)

Delete all rule groups uploaded by this client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      apiInstance.rulegroupClientDelete(client);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientDelete");
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

<a id="rulegroupClientGet"></a>
# **rulegroupClientGet**
> rulegroupClientGet(client, from, to, includeproperties, allversions)

Get details about all rule groups uploaded by a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeproperties = true; // Boolean | Do we want all details of each rule group? (default is true).
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    try {
      apiInstance.rulegroupClientGet(client, from, to, includeproperties, allversions);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientGet");
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
| **includeproperties** | **Boolean**| Do we want all details of each rule group? (default is true). | [optional] |
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |

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

<a id="rulegroupClientTargetDelete"></a>
# **rulegroupClientTargetDelete**
> rulegroupClientTargetDelete(client, target)

Delete all rule groups uploaded by this client in this target.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Where rulegroup should be published.
    try {
      apiInstance.rulegroupClientTargetDelete(client, target);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetDelete");
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
| **target** | [**TargetEnum**](.md)| Where rulegroup should be published. | [enum: dev, test, prod] |

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

<a id="rulegroupClientTargetGet"></a>
# **rulegroupClientTargetGet**
> rulegroupClientTargetGet(client, target, from, to, includeproperties, allversions)

Get details about all rule groups uploaded by a specific client in a specific target

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Where rule group should be published.
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeproperties = true; // Boolean | Do we want all details of each rule group? (default is true).
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    try {
      apiInstance.rulegroupClientTargetGet(client, target, from, to, includeproperties, allversions);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetGet");
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
| **target** | [**TargetEnum**](.md)| Where rule group should be published. | [enum: dev, test, prod] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **includeproperties** | **Boolean**| Do we want all details of each rule group? (default is true). | [optional] |
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |

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

<a id="rulegroupClientTargetRulegroupnameCopytoPost"></a>
# **rulegroupClientTargetRulegroupnameCopytoPost**
> ModelApiResponse rulegroupClientTargetRulegroupnameCopytoPost(client, target, rulegroupname, body)

Copy this rule group to the given target.  Also replicates any missing rules

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Possible values: dev | test | prod.
    String rulegroupname = "rulegroupname_example"; // String | The name of the rule group that you want to copy
    String body = "body_example"; // String | 
    try {
      ModelApiResponse result = apiInstance.rulegroupClientTargetRulegroupnameCopytoPost(client, target, rulegroupname, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnameCopytoPost");
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
| **client** | **String**| client name | |
| **target** | [**TargetEnum**](.md)| Possible values: dev | test | prod. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| The name of the rule group that you want to copy | |
| **body** | **String**|  | [optional] |

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

<a id="rulegroupClientTargetRulegroupnameDelete"></a>
# **rulegroupClientTargetRulegroupnameDelete**
> rulegroupClientTargetRulegroupnameDelete(client, target, rulegroupname)

Delete all versions of a specific rulegroup.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulegroupname = "rulegroupname_example"; // String | The name of the rulegroup you want to delete
    try {
      apiInstance.rulegroupClientTargetRulegroupnameDelete(client, target, rulegroupname);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnameDelete");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| The name of the rulegroup you want to delete | |

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

<a id="rulegroupClientTargetRulegroupnameGet"></a>
# **rulegroupClientTargetRulegroupnameGet**
> rulegroupClientTargetRulegroupnameGet(client, target, rulegroupname, from, to, includeproperties, allversions)

Get details about all versions of a specified rulegroup

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulegroupname = "rulegroupname_example"; // String | rulegroup name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeproperties = true; // Boolean | Do we want all details of each rule group? (default is true).
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    try {
      apiInstance.rulegroupClientTargetRulegroupnameGet(client, target, rulegroupname, from, to, includeproperties, allversions);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnameGet");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| rulegroup name | |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **includeproperties** | **Boolean**| Do we want all details of each rule group? (default is true). | [optional] |
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |

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

<a id="rulegroupClientTargetRulegroupnamePost"></a>
# **rulegroupClientTargetRulegroupnamePost**
> ModelApiResponse rulegroupClientTargetRulegroupnamePost(client, target, rulegroupname, rulegroupPostRequest)

Upload a file which defines the rulegroup. This will generate and return a version number number.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Possible values: dev | test | prod.
    String rulegroupname = "rulegroupname_example"; // String | The name of the rule group that you want to upload
    RulegroupPostRequest rulegroupPostRequest = new RulegroupPostRequest(); // RulegroupPostRequest | A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example.
    try {
      ModelApiResponse result = apiInstance.rulegroupClientTargetRulegroupnamePost(client, target, rulegroupname, rulegroupPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnamePost");
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
| **client** | **String**| client name | |
| **target** | [**TargetEnum**](.md)| Possible values: dev | test | prod. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| The name of the rule group that you want to upload | |
| **rulegroupPostRequest** | [**RulegroupPostRequest**](RulegroupPostRequest.md)| A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example. | |

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

<a id="rulegroupClientTargetRulegroupnamePut"></a>
# **rulegroupClientTargetRulegroupnamePut**
> ModelApiResponse rulegroupClientTargetRulegroupnamePut(client, target, rulegroupname, rulegroupPostRequest)

Update an existing rulegroup. This will generate and return a version number.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Possible values: dev | test | prod.
    String rulegroupname = "rulegroupname_example"; // String | The name of the rule group that you want to upload
    RulegroupPostRequest rulegroupPostRequest = new RulegroupPostRequest(); // RulegroupPostRequest | A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example.
    try {
      ModelApiResponse result = apiInstance.rulegroupClientTargetRulegroupnamePut(client, target, rulegroupname, rulegroupPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnamePut");
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
| **client** | **String**| client name | |
| **target** | [**TargetEnum**](.md)| Possible values: dev | test | prod. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| The name of the rule group that you want to upload | |
| **rulegroupPostRequest** | [**RulegroupPostRequest**](RulegroupPostRequest.md)| A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example. | |

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

<a id="rulegroupClientTargetRulegroupnameVersionDelete"></a>
# **rulegroupClientTargetRulegroupnameVersionDelete**
> rulegroupClientTargetRulegroupnameVersionDelete(client, target, rulegroupname, version)

Delete a specific version of a specific rulegroup on the server.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulegroupname = "rulegroupname_example"; // String | The name of the rulegroup you want to delete
    Integer version = 56; // Integer | The version of the rulegroup you want to delete
    try {
      apiInstance.rulegroupClientTargetRulegroupnameVersionDelete(client, target, rulegroupname, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnameVersionDelete");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| The name of the rulegroup you want to delete | |
| **version** | **Integer**| The version of the rulegroup you want to delete | |

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

<a id="rulegroupClientTargetRulegroupnameVersionGet"></a>
# **rulegroupClientTargetRulegroupnameVersionGet**
> rulegroupClientTargetRulegroupnameVersionGet(client, target, rulegroupname, version)

Get details about a specific version of a specific rulegroup for a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulegroupname = "rulegroupname_example"; // String | rulegroup name
    Integer version = 56; // Integer | The version of the file you want information for.
    try {
      apiInstance.rulegroupClientTargetRulegroupnameVersionGet(client, target, rulegroupname, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupClientTargetRulegroupnameVersionGet");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulegroupname** | **String**| rulegroup name | |
| **version** | **Integer**| The version of the file you want information for. | |

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

<a id="rulegroupGet"></a>
# **rulegroupGet**
> rulegroupGet(from, to, includeproperties, allversions, iClients)

Get details about all rule groups on the server

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeproperties = true; // Boolean | Do we want all details of each rule group? (default is true).
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      apiInstance.rulegroupGet(from, to, includeproperties, allversions, iClients);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupGet");
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
| **includeproperties** | **Boolean**| Do we want all details of each rule group? (default is true). | [optional] |
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

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

<a id="rulegroupPost"></a>
# **rulegroupPost**
> ModelApiResponse rulegroupPost(rulegroupPostRequest)

upload a file which defines the rulegroup. This will generate and return a version number.  Please use the   /rulegroup/client/target/name post version now.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulegroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulegroupsApi apiInstance = new RulegroupsApi(defaultClient);
    RulegroupPostRequest rulegroupPostRequest = new RulegroupPostRequest(); // RulegroupPostRequest | A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example.
    try {
      ModelApiResponse result = apiInstance.rulegroupPost(rulegroupPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulegroupsApi#rulegroupPost");
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
| **rulegroupPostRequest** | [**RulegroupPostRequest**](RulegroupPostRequest.md)| A block of JSON containing the rule group information you want to create.  Note there are many more   properties which you can set to allow you to override parameters of the rules, etc. but the simplest is provided as an   example. | |

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

