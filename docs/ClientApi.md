# ClientApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientClientAliasAliasNameDelete**](ClientApi.md#clientClientAliasAliasNameDelete) | **DELETE** /client/{client}/alias/{aliasName} | Deletes a specific alias from the client |
| [**clientClientAliasAliasNameGet**](ClientApi.md#clientClientAliasAliasNameGet) | **GET** /client/{client}/alias/{aliasName} | Returns back information about a specific alias |
| [**clientClientAliasAliasNameTargetRuleorgroupPost**](ClientApi.md#clientClientAliasAliasNameTargetRuleorgroupPost) | **POST** /client/{client}/alias/{aliasName}/{target}/{ruleorgroup} | Creates or updates an alias |
| [**clientClientAliasAliasNameTargetRuleorgroupPut**](ClientApi.md#clientClientAliasAliasNameTargetRuleorgroupPut) | **PUT** /client/{client}/alias/{aliasName}/{target}/{ruleorgroup} | Create a new alias, must not exist. |
| [**clientClientAliasGet**](ClientApi.md#clientClientAliasGet) | **GET** /client/{client}/alias | Returns back all aliases which have been defined for a client |
| [**clientClientCopyDestinationPut**](ClientApi.md#clientClientCopyDestinationPut) | **PUT** /client/{client}/copy/{destination} | Copy an existing client to a client with a new name |
| [**clientClientDelete**](ClientApi.md#clientClientDelete) | **DELETE** /client/{client} | Delete all client files that have been uploaded to the server. |
| [**clientClientGet**](ClientApi.md#clientClientGet) | **GET** /client/{client} | Returns extended details about a client. |
| [**clientClientPost**](ClientApi.md#clientClientPost) | **POST** /client/{client} | Updates a client&#39;s parameters |
| [**clientClientPut**](ClientApi.md#clientClientPut) | **PUT** /client/{client} | Create a new client. |
| [**clientCopySourcePut**](ClientApi.md#clientCopySourcePut) | **PUT** /client/copy/{source} | Copy an existing client to a client with a new name |
| [**clientGet**](ClientApi.md#clientGet) | **GET** /client | Get a list of all clients that your login can access, and all permissions that you have |


<a id="clientClientAliasAliasNameDelete"></a>
# **clientClientAliasAliasNameDelete**
> ModelApiResponse clientClientAliasAliasNameDelete(client, aliasName)

Deletes a specific alias from the client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name
    String aliasName = "aliasName_example"; // String | The name of the alias
    try {
      ModelApiResponse result = apiInstance.clientClientAliasAliasNameDelete(client, aliasName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientAliasAliasNameDelete");
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
| **aliasName** | **String**| The name of the alias | |

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

<a id="clientClientAliasAliasNameGet"></a>
# **clientClientAliasAliasNameGet**
> ModelApiResponse clientClientAliasAliasNameGet(client, aliasName)

Returns back information about a specific alias

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name
    String aliasName = "aliasName_example"; // String | The name of the alias
    try {
      ModelApiResponse result = apiInstance.clientClientAliasAliasNameGet(client, aliasName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientAliasAliasNameGet");
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
| **aliasName** | **String**| The name of the alias | |

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

<a id="clientClientAliasAliasNameTargetRuleorgroupPost"></a>
# **clientClientAliasAliasNameTargetRuleorgroupPost**
> ModelApiResponse clientClientAliasAliasNameTargetRuleorgroupPost(client, aliasName, target, ruleorgroup)

Creates or updates an alias

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long
    String aliasName = "aliasName_example"; // String | The name of the alias
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String ruleorgroup = "ruleorgroup_example"; // String | The name of the rule or rule group to which this alias should point
    try {
      ModelApiResponse result = apiInstance.clientClientAliasAliasNameTargetRuleorgroupPost(client, aliasName, target, ruleorgroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientAliasAliasNameTargetRuleorgroupPost");
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
| **client** | **String**| Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long | |
| **aliasName** | **String**| The name of the alias | |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **ruleorgroup** | **String**| The name of the rule or rule group to which this alias should point | |

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

<a id="clientClientAliasAliasNameTargetRuleorgroupPut"></a>
# **clientClientAliasAliasNameTargetRuleorgroupPut**
> ResourceAndStatusResponse clientClientAliasAliasNameTargetRuleorgroupPut(client, aliasName, target, ruleorgroup)

Create a new alias, must not exist.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long
    String aliasName = "aliasName_example"; // String | The name of the alias
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String ruleorgroup = "ruleorgroup_example"; // String | The name of the rule or rule group to which this alias should point
    try {
      ResourceAndStatusResponse result = apiInstance.clientClientAliasAliasNameTargetRuleorgroupPut(client, aliasName, target, ruleorgroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientAliasAliasNameTargetRuleorgroupPut");
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
| **client** | **String**| Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long | |
| **aliasName** | **String**| The name of the alias | |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **ruleorgroup** | **String**| The name of the rule or rule group to which this alias should point | |

### Return type

[**ResourceAndStatusResponse**](ResourceAndStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clientClientAliasGet"></a>
# **clientClientAliasGet**
> ClientResponse clientClientAliasGet(client)

Returns back all aliases which have been defined for a client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      ClientResponse result = apiInstance.clientClientAliasGet(client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientAliasGet");
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

[**ClientResponse**](ClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clientClientCopyDestinationPut"></a>
# **clientClientCopyDestinationPut**
> ModelApiResponse clientClientCopyDestinationPut(client, destination)

Copy an existing client to a client with a new name

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | The source client
    String destination = "destination_example"; // String | The new client name
    try {
      ModelApiResponse result = apiInstance.clientClientCopyDestinationPut(client, destination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientCopyDestinationPut");
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
| **client** | **String**| The source client | |
| **destination** | **String**| The new client name | [optional] |

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

<a id="clientClientDelete"></a>
# **clientClientDelete**
> ModelApiResponse clientClientDelete(client)

Delete all client files that have been uploaded to the server.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      ModelApiResponse result = apiInstance.clientClientDelete(client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientDelete");
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

<a id="clientClientGet"></a>
# **clientClientGet**
> ClientResponse clientClientGet(client, aszip, asdata)

Returns extended details about a client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | client name, you can use * to return all clients to which your account has access
    Boolean aszip = true; // Boolean | Return back the entire client in a zip (compresses everything except files).  Requires ALL   permissions.  Note, you cannot use a wildcard with this option.
    Boolean asdata = true; // Boolean | If this is true, it will return just the client list in the data property and exclude permissions,   etc. from the result.  Useful if you simply want a list of clients.
    try {
      ClientResponse result = apiInstance.clientClientGet(client, aszip, asdata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientGet");
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
| **client** | **String**| client name, you can use * to return all clients to which your account has access | |
| **aszip** | **Boolean**| Return back the entire client in a zip (compresses everything except files).  Requires ALL   permissions.  Note, you cannot use a wildcard with this option. | [optional] |
| **asdata** | **Boolean**| If this is true, it will return just the client list in the data property and exclude permissions,   etc. from the result.  Useful if you simply want a list of clients. | [optional] |

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clientClientPost"></a>
# **clientClientPost**
> ModelApiResponse clientClientPost(client, client2)

Updates a client&#39;s parameters

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name
    Client client2 = new Client(); // Client | 
    try {
      ModelApiResponse result = apiInstance.clientClientPost(client, client2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientPost");
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

<a id="clientClientPut"></a>
# **clientClientPut**
> ModelApiResponse clientClientPut(client, client2)

Create a new client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String client = "client_example"; // String | Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long
    Client client2 = new Client(); // Client | 
    try {
      ModelApiResponse result = apiInstance.clientClientPut(client, client2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientClientPut");
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
| **client** | **String**| Client name, must begin with a letter, can only contain alphanumerics and hyphens, and must be no   more than 40 characters long | |
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

<a id="clientCopySourcePut"></a>
# **clientCopySourcePut**
> ModelApiResponse clientCopySourcePut(source, destination)

Copy an existing client to a client with a new name

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    String source = "source_example"; // String | Source client name
    String destination = "destination_example"; // String | The new client name
    try {
      ModelApiResponse result = apiInstance.clientCopySourcePut(source, destination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientCopySourcePut");
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
| **source** | **String**| Source client name | |
| **destination** | **String**| The new client name | [optional] |

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

<a id="clientGet"></a>
# **clientGet**
> ClientResponse clientGet()

Get a list of all clients that your login can access, and all permissions that you have

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientApi apiInstance = new ClientApi(defaultClient);
    try {
      ClientResponse result = apiInstance.clientGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientApi#clientGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClientResponse**](ClientResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

