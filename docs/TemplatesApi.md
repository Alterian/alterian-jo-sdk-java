# TemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadTemplateClientTemplatenameGet**](TemplatesApi.md#downloadTemplateClientTemplatenameGet) | **GET** /download/template/{client}/{templatename} | Download the rule file for a specific version of a specific template for a specific client |
| [**downloadTemplateClientTemplatenameVersionGet**](TemplatesApi.md#downloadTemplateClientTemplatenameVersionGet) | **GET** /download/template/{client}/{templatename}/{version} | Download the rule file for a specific version of a specific template for a specific client |
| [**templateClientDelete**](TemplatesApi.md#templateClientDelete) | **DELETE** /template/{client} | Delete all templates uploaded by this client. |
| [**templateClientGet**](TemplatesApi.md#templateClientGet) | **GET** /template/{client} | Get details about all templates uploaded by a specific client |
| [**templateClientTemplatenameDelete**](TemplatesApi.md#templateClientTemplatenameDelete) | **DELETE** /template/{client}/{templatename} | Delete all versions of a specific template. |
| [**templateClientTemplatenameGet**](TemplatesApi.md#templateClientTemplatenameGet) | **GET** /template/{client}/{templatename} | Get details about all versions of a specified template |
| [**templateClientTemplatenamePost**](TemplatesApi.md#templateClientTemplatenamePost) | **POST** /template/{client}/{templatename} | Upload a KTR file which defines the functionality of the template. This will generate and return a version   number. |
| [**templateClientTemplatenamePut**](TemplatesApi.md#templateClientTemplatenamePut) | **PUT** /template/{client}/{templatename} | Alter the settings of the most recent version of an existing template. This will generate and return a new   version number. |
| [**templateClientTemplatenameVersionDelete**](TemplatesApi.md#templateClientTemplatenameVersionDelete) | **DELETE** /template/{client}/{templatename}/{version} | Delete a specific version of a specific template on the server. |
| [**templateClientTemplatenameVersionGet**](TemplatesApi.md#templateClientTemplatenameVersionGet) | **GET** /template/{client}/{templatename}/{version} | Get details about a specific version of a specific template for a specific client |
| [**templateClientTemplatenameVersionPost**](TemplatesApi.md#templateClientTemplatenameVersionPost) | **POST** /template/{client}/{templatename}/{version} | Get an upgraded version of template |
| [**templateGet**](TemplatesApi.md#templateGet) | **GET** /template | Get details about all templates on the server |
| [**templateTargetClientTemplatenameVersionPost**](TemplatesApi.md#templateTargetClientTemplatenameVersionPost) | **POST** /template/{target}/{client}/{templatename}/{version} | Take a specific version of a template and publish it as a rule. |
| [**templateTargetClientTemplatenameVersionPut**](TemplatesApi.md#templateTargetClientTemplatenameVersionPut) | **PUT** /template/{target}/{client}/{templatename}/{version} | Take a specific version of a template and publish it as a rule. and check if overwriting an existing rule   which has a different template |


<a id="downloadTemplateClientTemplatenameGet"></a>
# **downloadTemplateClientTemplatenameGet**
> downloadTemplateClientTemplatenameGet(client, templatename)

Download the rule file for a specific version of a specific template for a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    try {
      apiInstance.downloadTemplateClientTemplatenameGet(client, templatename);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#downloadTemplateClientTemplatenameGet");
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
| **templatename** | **String**| The name of the template | |

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

<a id="downloadTemplateClientTemplatenameVersionGet"></a>
# **downloadTemplateClientTemplatenameVersionGet**
> downloadTemplateClientTemplatenameVersionGet(client, templatename, version)

Download the rule file for a specific version of a specific template for a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the file you want to download.
    try {
      apiInstance.downloadTemplateClientTemplatenameVersionGet(client, templatename, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#downloadTemplateClientTemplatenameVersionGet");
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
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the file you want to download. | |

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

<a id="templateClientDelete"></a>
# **templateClientDelete**
> ModelApiResponse templateClientDelete(client)

Delete all templates uploaded by this client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      ModelApiResponse result = apiInstance.templateClientDelete(client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientDelete");
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

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientGet"></a>
# **templateClientGet**
> TemplateList templateClientGet(client, from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients)

Get details about all templates uploaded by a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of Data Grids present in this template.
    Boolean basicInfo = true; // Boolean | Only retrieve the basic information about this template, like name, client and url template.
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    Boolean includePublic = true; // Boolean | Flag to indicate whether rules from the public client should be included in the results, please use   iClients=public instead
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      TemplateList result = apiInstance.templateClientGet(client, from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientGet");
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
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |
| **getAllDetails** | **Boolean**| Do we want to retrieve details of Data Grids present in this template. | [optional] |
| **basicInfo** | **Boolean**| Only retrieve the basic information about this template, like name, client and url template. | [optional] |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **includePublic** | **Boolean**| Flag to indicate whether rules from the public client should be included in the results, please use   iClients&#x3D;public instead | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**TemplateList**](TemplateList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientTemplatenameDelete"></a>
# **templateClientTemplatenameDelete**
> ModelApiResponse templateClientTemplatenameDelete(client, templatename)

Delete all versions of a specific template.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template you want to delete
    try {
      ModelApiResponse result = apiInstance.templateClientTemplatenameDelete(client, templatename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenameDelete");
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
| **templatename** | **String**| The name of the template you want to delete | |

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
| **200** | OK |  -  |

<a id="templateClientTemplatenameGet"></a>
# **templateClientTemplatenameGet**
> TemplateList templateClientTemplatenameGet(client, templatename, from, to, allversions, getAllDetails, targetClient)

Get details about all versions of a specified template

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of Data Grids present in this template.
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    try {
      TemplateList result = apiInstance.templateClientTemplatenameGet(client, templatename, from, to, allversions, getAllDetails, targetClient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenameGet");
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
| **templatename** | **String**| The name of the template | |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |
| **getAllDetails** | **Boolean**| Do we want to retrieve details of Data Grids present in this template. | [optional] |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |

### Return type

[**TemplateList**](TemplateList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientTemplatenamePost"></a>
# **templateClientTemplatenamePost**
> ResourceAndStatusResponse templateClientTemplatenamePost(client, templatename, validate, _file, settings)

Upload a KTR file which defines the functionality of the template. This will generate and return a version   number.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Boolean validate = true; // Boolean | Set to 'True' to only validate the JSON (and not save it)
    File _file = new File("/path/to/file"); // File | 
    String settings = "settings_example"; // String | 
    try {
      ResourceAndStatusResponse result = apiInstance.templateClientTemplatenamePost(client, templatename, validate, _file, settings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenamePost");
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
| **templatename** | **String**| The name of the template | |
| **validate** | **Boolean**| Set to &#39;True&#39; to only validate the JSON (and not save it) | [optional] |
| **_file** | **File**|  | [optional] |
| **settings** | **String**|  | [optional] |

### Return type

[**ResourceAndStatusResponse**](ResourceAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientTemplatenamePut"></a>
# **templateClientTemplatenamePut**
> ResourceAndStatusResponse templateClientTemplatenamePut(client, templatename, body)

Alter the settings of the most recent version of an existing template. This will generate and return a new   version number.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Object body = null; // Object | The JSON containing additional settings for this template.
    try {
      ResourceAndStatusResponse result = apiInstance.templateClientTemplatenamePut(client, templatename, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenamePut");
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
| **templatename** | **String**| The name of the template | |
| **body** | **Object**| The JSON containing additional settings for this template. | [optional] |

### Return type

[**ResourceAndStatusResponse**](ResourceAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientTemplatenameVersionDelete"></a>
# **templateClientTemplatenameVersionDelete**
> ModelApiResponse templateClientTemplatenameVersionDelete(client, templatename, version)

Delete a specific version of a specific template on the server.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the template
    try {
      ModelApiResponse result = apiInstance.templateClientTemplatenameVersionDelete(client, templatename, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenameVersionDelete");
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
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the template | |

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
| **200** | OK |  -  |

<a id="templateClientTemplatenameVersionGet"></a>
# **templateClientTemplatenameVersionGet**
> TemplateList templateClientTemplatenameVersionGet(client, templatename, version, getAllDetails, targetClient)

Get details about a specific version of a specific template for a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the template
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of Data Grids present in this template.
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    try {
      TemplateList result = apiInstance.templateClientTemplatenameVersionGet(client, templatename, version, getAllDetails, targetClient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenameVersionGet");
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
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the template | |
| **getAllDetails** | **Boolean**| Do we want to retrieve details of Data Grids present in this template. | [optional] |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |

### Return type

[**TemplateList**](TemplateList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateClientTemplatenameVersionPost"></a>
# **templateClientTemplatenameVersionPost**
> TemplateUpgradeResponse templateClientTemplatenameVersionPost(client, templatename, version, body)

Get an upgraded version of template

Post a JSON representing a Rule Designer&#39;s tile to retrieve a JSON tile where the template version has   been upgraded

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the template
    Object body = null; // Object | JSON representing the current template to upgrade
    try {
      TemplateUpgradeResponse result = apiInstance.templateClientTemplatenameVersionPost(client, templatename, version, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateClientTemplatenameVersionPost");
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
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the template | |
| **body** | **Object**| JSON representing the current template to upgrade | [optional] |

### Return type

[**TemplateUpgradeResponse**](TemplateUpgradeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateGet"></a>
# **templateGet**
> TemplateList templateGet(from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients)

Get details about all templates on the server

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean allversions = true; // Boolean | Do we want all versions of the file listed?
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of Data Grids present in this template.
    Boolean basicInfo = true; // Boolean | Only retrieve the basic information about this template, like name, client and url template.
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    Boolean includePublic = true; // Boolean | Flag to indicate whether rules from the public client should be included in the results, please use   iClients=public instead
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      TemplateList result = apiInstance.templateGet(from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateGet");
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
| **allversions** | **Boolean**| Do we want all versions of the file listed? | [optional] |
| **getAllDetails** | **Boolean**| Do we want to retrieve details of Data Grids present in this template. | [optional] |
| **basicInfo** | **Boolean**| Only retrieve the basic information about this template, like name, client and url template. | [optional] |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **includePublic** | **Boolean**| Flag to indicate whether rules from the public client should be included in the results, please use   iClients&#x3D;public instead | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**TemplateList**](TemplateList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateTargetClientTemplatenameVersionPost"></a>
# **templateTargetClientTemplatenameVersionPost**
> ResourceAndStatusResponse templateTargetClientTemplatenameVersionPost(target, client, templatename, version, paramSource, targetClient, templatePublishSettings)

Take a specific version of a template and publish it as a rule.

If a rule is already published at this target then it will be &#39;hot-swapped&#39; with this new version with no   interruption to service.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the template
    String paramSource = ""; // String | When overwriting an existing rule, this determines which value to use
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    TemplatePublishSettings templatePublishSettings = new TemplatePublishSettings(); // TemplatePublishSettings | The JSON containing additional settings for this template.
    try {
      ResourceAndStatusResponse result = apiInstance.templateTargetClientTemplatenameVersionPost(target, client, templatename, version, paramSource, targetClient, templatePublishSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateTargetClientTemplatenameVersionPost");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **client** | **String**| Client name | |
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the template | |
| **paramSource** | **String**| When overwriting an existing rule, this determines which value to use | [optional] [enum: , usetemplate, userule] |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |
| **templatePublishSettings** | [**TemplatePublishSettings**](TemplatePublishSettings.md)| The JSON containing additional settings for this template. | [optional] |

### Return type

[**ResourceAndStatusResponse**](ResourceAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="templateTargetClientTemplatenameVersionPut"></a>
# **templateTargetClientTemplatenameVersionPut**
> ModelApiResponse templateTargetClientTemplatenameVersionPut(target, client, templatename, version, targetClient, client2)

Take a specific version of a template and publish it as a rule. and check if overwriting an existing rule   which has a different template

If a rule is already published at this target then it will be &#39;hot-swapped&#39; with this new version with no   interruption to service.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String templatename = "templatename_example"; // String | The name of the template
    Integer version = 56; // Integer | The version of the template
    String targetClient = "targetClient_example"; // String | Request template's Data Grids' details with parameter information for this client.
    Client client2 = new Client(); // Client | 
    try {
      ModelApiResponse result = apiInstance.templateTargetClientTemplatenameVersionPut(target, client, templatename, version, targetClient, client2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templateTargetClientTemplatenameVersionPut");
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
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **client** | **String**| Client name | |
| **templatename** | **String**| The name of the template | |
| **version** | **Integer**| The version of the template | |
| **targetClient** | **String**| Request template&#39;s Data Grids&#39; details with parameter information for this client. | [optional] |
| **client2** | [**Client**](Client.md)|  | [optional] |

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

