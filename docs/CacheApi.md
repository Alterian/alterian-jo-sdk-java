# CacheApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cacheClientGet**](CacheApi.md#cacheClientGet) | **GET** /cache/{client} | Get information about cache tables, filtered by client. |
| [**cacheClientTargetExecutePost**](CacheApi.md#cacheClientTargetExecutePost) | **POST** /cache/{client}/{target}/execute | Execute a limited set of cql commands against the cache |
| [**cacheClientTargetGet**](CacheApi.md#cacheClientTargetGet) | **GET** /cache/{client}/{target} | Get information about cache tables, filtered by client and target. |
| [**cacheClientTargetTableColumnDelete**](CacheApi.md#cacheClientTargetTableColumnDelete) | **DELETE** /cache/{client}/{target}/{table}/{column} | Delete column from a cache table. |
| [**cacheClientTargetTableColumnsDelete**](CacheApi.md#cacheClientTargetTableColumnsDelete) | **DELETE** /cache/{client}/{target}/{table}/columns | Delete unused cache table and columns |
| [**cacheClientTargetTableDelete**](CacheApi.md#cacheClientTargetTableDelete) | **DELETE** /cache/{client}/{target}/{table} | Delete data from a cache table. |
| [**cacheClientTargetTableGet**](CacheApi.md#cacheClientTargetTableGet) | **GET** /cache/{client}/{target}/{table} | Get information about a specific cache table. |
| [**cacheClientTargetTablePost**](CacheApi.md#cacheClientTargetTablePost) | **POST** /cache/{client}/{target}/table | Alter a cache table |


<a id="cacheClientGet"></a>
# **cacheClientGet**
> CacheDetailsResponse cacheClientGet(client)

Get information about cache tables, filtered by client.

Get information about cache tables, filtered by client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      CacheDetailsResponse result = apiInstance.cacheClientGet(client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientGet");
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

[**CacheDetailsResponse**](CacheDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetExecutePost"></a>
# **cacheClientTargetExecutePost**
> CacheExecuteResponse cacheClientTargetExecutePost(client, target, cacheCQL)

Execute a limited set of cql commands against the cache

insert, select, update or delete a single row of data from a single table

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    CacheCQL cacheCQL = new CacheCQL(); // CacheCQL | 
    try {
      CacheExecuteResponse result = apiInstance.cacheClientTargetExecutePost(client, target, cacheCQL);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetExecutePost");
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
| **cacheCQL** | [**CacheCQL**](CacheCQL.md)|  | [optional] |

### Return type

[**CacheExecuteResponse**](CacheExecuteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetGet"></a>
# **cacheClientTargetGet**
> CacheDetailsResponse cacheClientTargetGet(client, target, tabletype)

Get information about cache tables, filtered by client and target.

Get information about cache tables, filtered by client and target.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    TableTypeEnum tabletype = TableTypeEnum.fromValue("normal"); // TableTypeEnum | If you only want a certain type of table, provide it here
    try {
      CacheDetailsResponse result = apiInstance.cacheClientTargetGet(client, target, tabletype);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetGet");
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
| **tabletype** | [**TableTypeEnum**](.md)| If you only want a certain type of table, provide it here | [optional] [enum: normal, fieldvalue, futureevent] |

### Return type

[**CacheDetailsResponse**](CacheDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetTableColumnDelete"></a>
# **cacheClientTargetTableColumnDelete**
> CacheApiResponse cacheClientTargetTableColumnDelete(client, target, table, column, key, keys)

Delete column from a cache table.

Removes a column from a cache table.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String table = "table_example"; // String | Table name
    String column = "column_example"; // String | Column name
    String key = "key_example"; // String | Pass DESTROY_COLUMN if you would like to remove a column.  Note, there is no recovery for these   actions and removing a column which is used will cause your rules to cease functioning.
    List<String> keys = Arrays.asList(); // List<String> | Values for clustering keys. If the table has a composite key, provide the values in order.
    try {
      CacheApiResponse result = apiInstance.cacheClientTargetTableColumnDelete(client, target, table, column, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetTableColumnDelete");
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
| **table** | **String**| Table name | |
| **column** | **String**| Column name | |
| **key** | **String**| Pass DESTROY_COLUMN if you would like to remove a column.  Note, there is no recovery for these   actions and removing a column which is used will cause your rules to cease functioning. | [optional] |
| **keys** | [**List&lt;String&gt;**](String.md)| Values for clustering keys. If the table has a composite key, provide the values in order. | [optional] |

### Return type

[**CacheApiResponse**](CacheApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetTableColumnsDelete"></a>
# **cacheClientTargetTableColumnsDelete**
> CacheApiDeleteResponse cacheClientTargetTableColumnsDelete(client, target, table, preview)

Delete unused cache table and columns

Removes the columns and tables that are no longer used by any of the rules

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String table = "table_example"; // String | Table name
    Boolean preview = true; // Boolean | By default API works in preview mode and returns a list of cache columns and tables that would be   dropped. Only when preview set to false the columns are actually dropped
    try {
      CacheApiDeleteResponse result = apiInstance.cacheClientTargetTableColumnsDelete(client, target, table, preview);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetTableColumnsDelete");
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
| **table** | **String**| Table name | |
| **preview** | **Boolean**| By default API works in preview mode and returns a list of cache columns and tables that would be   dropped. Only when preview set to false the columns are actually dropped | |

### Return type

[**CacheApiDeleteResponse**](CacheApiDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetTableDelete"></a>
# **cacheClientTargetTableDelete**
> CacheApiResponse cacheClientTargetTableDelete(client, target, table, key, keys)

Delete data from a cache table.

Removes data from a cache table.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String table = "table_example"; // String | Table name
    String key = "key_example"; // String | Key to delete from cache tables; provide DELETE_ALL to clear the table and DESTROY_TABLE if you would   like to remove the table.  Note, there is no recovery for these actions and removing a table which is used will cause   your rules to cease functioning.
    List<String> keys = Arrays.asList(); // List<String> | Values for clustering keys. If the table has a composite key, provide the values in order.
    try {
      CacheApiResponse result = apiInstance.cacheClientTargetTableDelete(client, target, table, key, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetTableDelete");
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
| **table** | **String**| Table name | |
| **key** | **String**| Key to delete from cache tables; provide DELETE_ALL to clear the table and DESTROY_TABLE if you would   like to remove the table.  Note, there is no recovery for these actions and removing a table which is used will cause   your rules to cease functioning. | [optional] |
| **keys** | [**List&lt;String&gt;**](String.md)| Values for clustering keys. If the table has a composite key, provide the values in order. | [optional] |

### Return type

[**CacheApiResponse**](CacheApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetTableGet"></a>
# **cacheClientTargetTableGet**
> CacheDetailsResponse cacheClientTargetTableGet(client, target, table, key, keys, sample, pivot, fieldvalue, limit)

Get information about a specific cache table.

Get information about a specific cache table.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String table = "table_example"; // String | Table name
    String key = "key_example"; // String | If you want a row of data to be returned, provide the partition key
    List<String> keys = Arrays.asList(); // List<String> | Values for clustering keys. If the table has a composite key, provide the values in order.
    Integer sample = 56; // Integer | return a sample of n rows from the table
    Boolean pivot = true; // Boolean | Would you like the data pivoted? (Only for CSV report)
    String fieldvalue = "keyvalues"; // String | If this is a fieldvalue type table, you can ask for a list of keys or values.  If you specify   fieldvalues, you must also provide a key
    Integer limit = 56; // Integer | If you are asking for a list of values from a fieldvalue table, you can request to return only the   most recent, limited to this number.  If not provided, a system limit will be used.
    try {
      CacheDetailsResponse result = apiInstance.cacheClientTargetTableGet(client, target, table, key, keys, sample, pivot, fieldvalue, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetTableGet");
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
| **table** | **String**| Table name | |
| **key** | **String**| If you want a row of data to be returned, provide the partition key | [optional] |
| **keys** | [**List&lt;String&gt;**](String.md)| Values for clustering keys. If the table has a composite key, provide the values in order. | [optional] |
| **sample** | **Integer**| return a sample of n rows from the table | [optional] |
| **pivot** | **Boolean**| Would you like the data pivoted? (Only for CSV report) | [optional] |
| **fieldvalue** | **String**| If this is a fieldvalue type table, you can ask for a list of keys or values.  If you specify   fieldvalues, you must also provide a key | [optional] [enum: keyvalues, fieldvalues] |
| **limit** | **Integer**| If you are asking for a list of values from a fieldvalue table, you can request to return only the   most recent, limited to this number.  If not provided, a system limit will be used. | [optional] |

### Return type

[**CacheDetailsResponse**](CacheDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="cacheClientTargetTablePost"></a>
# **cacheClientTargetTablePost**
> CacheChangesResponse cacheClientTargetTablePost(client, target, cacheTableDefinition)

Alter a cache table

Ensure that the cache table includes at least the set of columns requested

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CacheApi apiInstance = new CacheApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    CacheTableDefinition cacheTableDefinition = new CacheTableDefinition(); // CacheTableDefinition | 
    try {
      CacheChangesResponse result = apiInstance.cacheClientTargetTablePost(client, target, cacheTableDefinition);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#cacheClientTargetTablePost");
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
| **cacheTableDefinition** | [**CacheTableDefinition**](CacheTableDefinition.md)|  | [optional] |

### Return type

[**CacheChangesResponse**](CacheChangesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

