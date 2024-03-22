# ClusterApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clusterDecommissionDelete**](ClusterApi.md#clusterDecommissionDelete) | **DELETE** /cluster/decommission | Remove this node from the cluster |
| [**clusterDelete**](ClusterApi.md#clusterDelete) | **DELETE** /cluster | Removes from the cluster a down node that has not been seen for the longest |
| [**clusterDiscoverPost**](ClusterApi.md#clusterDiscoverPost) | **POST** /cluster/discover | Ask the cluster to rerun the discovery process. |
| [**clusterFlushPost**](ClusterApi.md#clusterFlushPost) | **POST** /cluster/flush | Make sure all data in internal caches across the entire cluster are written to disk |
| [**clusterGet**](ClusterApi.md#clusterGet) | **GET** /cluster | Find out what instances are in the cluster |
| [**clusterPost**](ClusterApi.md#clusterPost) | **POST** /cluster | Register an instance with the cluster |
| [**clusterPut**](ClusterApi.md#clusterPut) | **PUT** /cluster | Update an advanced cluster setting |
| [**clusterReregisterPost**](ClusterApi.md#clusterReregisterPost) | **POST** /cluster/reregister | Make this note reregister itself with all the other nodes in the cluster without requiring a restart |
| [**clusterStreamGet**](ClusterApi.md#clusterStreamGet) | **GET** /cluster/stream | Find out the streaming status of an instance in the cluster |
| [**clusterStreamThroughputGet**](ClusterApi.md#clusterStreamThroughputGet) | **GET** /cluster/stream/throughput | Find out the current stream throughput (Mb per sec) of an instance in the cluster |
| [**clusterStreamThroughputPost**](ClusterApi.md#clusterStreamThroughputPost) | **POST** /cluster/stream/throughput | Set the current stream throughput (Mb per sec) of an instance in the cluster |


<a id="clusterDecommissionDelete"></a>
# **clusterDecommissionDelete**
> ClusterResponse clusterDecommissionDelete(targetnode)

Remove this node from the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String targetnode = "targetnode_example"; // String | Must match the private IP address of the node, so there is no ambiguity when decommissioning
    try {
      ClusterResponse result = apiInstance.clusterDecommissionDelete(targetnode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterDecommissionDelete");
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
| **targetnode** | **String**| Must match the private IP address of the node, so there is no ambiguity when decommissioning | |

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterDelete"></a>
# **clusterDelete**
> ClusterResponse clusterDelete()

Removes from the cluster a down node that has not been seen for the longest

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    try {
      ClusterResponse result = apiInstance.clusterDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterDelete");
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

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterDiscoverPost"></a>
# **clusterDiscoverPost**
> ClusterResponse clusterDiscoverPost()

Ask the cluster to rerun the discovery process.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    try {
      ClusterResponse result = apiInstance.clusterDiscoverPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterDiscoverPost");
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

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterFlushPost"></a>
# **clusterFlushPost**
> ModelApiResponse clusterFlushPost()

Make sure all data in internal caches across the entire cluster are written to disk

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    try {
      ModelApiResponse result = apiInstance.clusterFlushPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterFlushPost");
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

<a id="clusterGet"></a>
# **clusterGet**
> ClusterResponse clusterGet(update, repair, includeSettings)

Find out what instances are in the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    Boolean update = true; // Boolean | Also ping the other instances in the cluster to check that they are present.
    Boolean repair = true; // Boolean | Request an immediate repair so this instance will definitely contain the same rules, templates, etc   as the other instances in this cluster. Only works if all instances are up
    Boolean includeSettings = true; // Boolean | Include extended details
    try {
      ClusterResponse result = apiInstance.clusterGet(update, repair, includeSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterGet");
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
| **update** | **Boolean**| Also ping the other instances in the cluster to check that they are present. | [optional] |
| **repair** | **Boolean**| Request an immediate repair so this instance will definitely contain the same rules, templates, etc   as the other instances in this cluster. Only works if all instances are up | [optional] |
| **includeSettings** | **Boolean**| Include extended details | [optional] |

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterPost"></a>
# **clusterPost**
> ClusterResponse clusterPost(cluster)

Register an instance with the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    Cluster cluster = new Cluster(); // Cluster | 
    try {
      ClusterResponse result = apiInstance.clusterPost(cluster);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterPost");
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
| **cluster** | [**Cluster**](Cluster.md)|  | [optional] |

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterPut"></a>
# **clusterPut**
> ModelApiResponse clusterPut(clusterSetting)

Update an advanced cluster setting

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    ClusterSetting clusterSetting = new ClusterSetting(); // ClusterSetting | 
    try {
      ModelApiResponse result = apiInstance.clusterPut(clusterSetting);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterPut");
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
| **clusterSetting** | [**ClusterSetting**](ClusterSetting.md)|  | [optional] |

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

<a id="clusterReregisterPost"></a>
# **clusterReregisterPost**
> ClusterResponse clusterReregisterPost(body)

Make this note reregister itself with all the other nodes in the cluster without requiring a restart

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String body = "body_example"; // String | Optional address of one seed node to register with. Same syntax as seed parameter in web.xml,   ipaddress:port
    try {
      ClusterResponse result = apiInstance.clusterReregisterPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterReregisterPost");
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
| **body** | **String**| Optional address of one seed node to register with. Same syntax as seed parameter in web.xml,   ipaddress:port | [optional] |

### Return type

[**ClusterResponse**](ClusterResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/text
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterStreamGet"></a>
# **clusterStreamGet**
> ClusterStreamResponse clusterStreamGet(targetnode)

Find out the streaming status of an instance in the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String targetnode = "targetnode_example"; // String | Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly
    try {
      ClusterStreamResponse result = apiInstance.clusterStreamGet(targetnode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterStreamGet");
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
| **targetnode** | **String**| Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly | [optional] |

### Return type

[**ClusterStreamResponse**](ClusterStreamResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterStreamThroughputGet"></a>
# **clusterStreamThroughputGet**
> ClusterThroughputResponse clusterStreamThroughputGet(targetnode)

Find out the current stream throughput (Mb per sec) of an instance in the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    String targetnode = "targetnode_example"; // String | Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly
    try {
      ClusterThroughputResponse result = apiInstance.clusterStreamThroughputGet(targetnode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterStreamThroughputGet");
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
| **targetnode** | **String**| Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly | [optional] |

### Return type

[**ClusterThroughputResponse**](ClusterThroughputResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="clusterStreamThroughputPost"></a>
# **clusterStreamThroughputPost**
> ClusterThroughputResponse clusterStreamThroughputPost(throughput, targetnode)

Set the current stream throughput (Mb per sec) of an instance in the cluster

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    Integer throughput = 50; // Integer | The maximum data rate in Mb/s that this node can send across all streams.
    String targetnode = "targetnode_example"; // String | Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly
    try {
      ClusterThroughputResponse result = apiInstance.clusterStreamThroughputPost(throughput, targetnode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterStreamThroughputPost");
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
| **throughput** | **Integer**| The maximum data rate in Mb/s that this node can send across all streams. | [default to 50] |
| **targetnode** | **String**| Which instance (identified by host name) do you want to query? Leave blank to pick an instance   randomly | [optional] |

### Return type

[**ClusterThroughputResponse**](ClusterThroughputResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

