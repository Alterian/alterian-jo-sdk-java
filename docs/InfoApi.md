# InfoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**infoAuditlogClientGet**](InfoApi.md#infoAuditlogClientGet) | **GET** /info/auditlog/{client} | Get audit log report |
| [**infoCachedataClientGet**](InfoApi.md#infoCachedataClientGet) | **GET** /info/cachedata/{client} | Get cache data report |
| [**infoCacheunusedcolumnsClientGet**](InfoApi.md#infoCacheunusedcolumnsClientGet) | **GET** /info/cacheunusedcolumns/{client} | Get a report on all the cache columns that are no longer used by any rules |
| [**infoClientaccessreportClientGet**](InfoApi.md#infoClientaccessreportClientGet) | **GET** /info/clientaccessreport/{client} | Report on the users able to access given client |
| [**infoConsistencyreportGet**](InfoApi.md#infoConsistencyreportGet) | **GET** /info/consistencyreport | Get the consistency report |
| [**infoConversationusagereportClientTimeseriesGet**](InfoApi.md#infoConversationusagereportClientTimeseriesGet) | **GET** /info/conversationusagereport/{client}/{timeseries} | Report on the conversation usage by a specific client |
| [**infoFieldusageTargetClientRulenameGet**](InfoApi.md#infoFieldusageTargetClientRulenameGet) | **GET** /info/fieldusage/{target}/{client}/{rulename} | Report on how fields are created, read and written within a rule |
| [**infoFlowTargetClientRulenameGet**](InfoApi.md#infoFlowTargetClientRulenameGet) | **GET** /info/flow/{target}/{client}/{rulename} | Get the JSON representation of the steps within a rule, suitable for displaying as a flowchart |
| [**infoGlobalparamreportClientGet**](InfoApi.md#infoGlobalparamreportClientGet) | **GET** /info/globalparamreport/{client} | Get report on global parameters |
| [**infoInternalrulecallreportClientTargetRulenameGet**](InfoApi.md#infoInternalrulecallreportClientTargetRulenameGet) | **GET** /info/internalrulecallreport/{client}/{target}/{rulename} | For a given rule, find all the rules that call this rule internally |
| [**infoLogged404sClientGet**](InfoApi.md#infoLogged404sClientGet) | **GET** /info/logged404s/{client} | Get report on logged 404 errors |
| [**infoResourceexistsreportPost**](InfoApi.md#infoResourceexistsreportPost) | **POST** /info/resourceexistsreport | Pass in an array of any size containing resource URL&#39;s (rules, templates, etc) to see if they exist and can   be accessed by this user. |
| [**infoRulecomplexityreportClientGet**](InfoApi.md#infoRulecomplexityreportClientGet) | **GET** /info/rulecomplexityreport/{client} | Report on the complexity of the various rules for a client |
| [**infoSnoozeGet**](InfoApi.md#infoSnoozeGet) | **GET** /info/snooze | Report on whether rules can be snoozed |
| [**infoSteptypestatisticsDelete**](InfoApi.md#infoSteptypestatisticsDelete) | **DELETE** /info/steptypestatistics | Clear the execution statistics histogram for all step types |
| [**infoSteptypestatisticsGet**](InfoApi.md#infoSteptypestatisticsGet) | **GET** /info/steptypestatistics | Find out the execution statistics histogram for each step type |
| [**infoSteptypeusagereportClientGet**](InfoApi.md#infoSteptypeusagereportClientGet) | **GET** /info/steptypeusagereport/{client} | Report on the steps being used by this client |
| [**infoStepusagereportClientStepnameGet**](InfoApi.md#infoStepusagereportClientStepnameGet) | **GET** /info/stepusagereport/{client}/{stepname} | Find out which rules are using a specific step type |
| [**infoTemplatecolumnreportClientGet**](InfoApi.md#infoTemplatecolumnreportClientGet) | **GET** /info/templatecolumnreport/{client} | Report on the names of the columns in the cache used by templates |
| [**infoTemplateinputreportClientGet**](InfoApi.md#infoTemplateinputreportClientGet) | **GET** /info/templateinputreport/{client} | List all templates that expect given input fields |
| [**infoTemplateusagereportClientTemplatenameGet**](InfoApi.md#infoTemplateusagereportClientTemplatenameGet) | **GET** /info/templateusagereport/{client}/{templatename} | Find a list of rules which use a specific template |
| [**infoTemplatevalidityreportClientGet**](InfoApi.md#infoTemplatevalidityreportClientGet) | **GET** /info/templatevalidityreport/{client} | Reports on validity of uploaded templates |
| [**infoTokenusereportGet**](InfoApi.md#infoTokenusereportGet) | **GET** /info/tokenusereport | Reports on token access and last used date. |
| [**infoWorkerthreadusageGet**](InfoApi.md#infoWorkerthreadusageGet) | **GET** /info/workerthreadusage | Worker thread usage |


<a id="infoAuditlogClientGet"></a>
# **infoAuditlogClientGet**
> ModelApiResponse infoAuditlogClientGet(client, from, to, target, format)

Get audit log report

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoAuditlogClientGet(client, from, to, target, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoAuditlogClientGet");
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
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoCachedataClientGet"></a>
# **infoCachedataClientGet**
> ModelApiResponse infoCachedataClientGet(client, from, to, target, rulename, cachedirection, format)

Get cache data report

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    String rulename = "rulename_example"; // String | Filter for specific rule name
    String cachedirection = "READ"; // String | Get only cache read or writes
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoCachedataClientGet(client, from, to, target, rulename, cachedirection, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoCachedataClientGet");
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
| **client** | **String**| Client name | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |
| **rulename** | **String**| Filter for specific rule name | [optional] |
| **cachedirection** | **String**| Get only cache read or writes | [optional] [enum: READ, WRITE] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoCacheunusedcolumnsClientGet"></a>
# **infoCacheunusedcolumnsClientGet**
> ModelApiResponse infoCacheunusedcolumnsClientGet(client, from, to, target, format)

Get a report on all the cache columns that are no longer used by any rules

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoCacheunusedcolumnsClientGet(client, from, to, target, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoCacheunusedcolumnsClientGet");
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
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoClientaccessreportClientGet"></a>
# **infoClientaccessreportClientGet**
> ModelApiResponse infoClientaccessreportClientGet(client, includeClientAll, includePermissionAll, format)

Report on the users able to access given client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Which client would you like the access information for? You must be able to access this client to   report on it.
    Boolean includeClientAll = true; // Boolean | Should users with access to all clients be included
    Boolean includePermissionAll = true; // Boolean | Should users with permission ALL be included
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoClientaccessreportClientGet(client, includeClientAll, includePermissionAll, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoClientaccessreportClientGet");
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
| **client** | **String**| Which client would you like the access information for? You must be able to access this client to   report on it. | [optional] |
| **includeClientAll** | **Boolean**| Should users with access to all clients be included | [optional] [default to true] |
| **includePermissionAll** | **Boolean**| Should users with permission ALL be included | [optional] [default to true] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoConsistencyreportGet"></a>
# **infoConsistencyreportGet**
> ModelApiResponse infoConsistencyreportGet(from, to, format)

Get the consistency report

Compares this nodes resources with other nodes to see if node has latest information

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoConsistencyreportGet(from, to, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoConsistencyreportGet");
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
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoConversationusagereportClientTimeseriesGet"></a>
# **infoConversationusagereportClientTimeseriesGet**
> ModelApiResponse infoConversationusagereportClientTimeseriesGet(timeseries, client, format)

Report on the conversation usage by a specific client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String timeseries = "min"; // String | Report on either the last 60 minutes, the last 48 hours or the last 60 days
    String client = "client_example"; // String | Which client would you like the conversation statistics for? You must be able to access this client   to report on it.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoConversationusagereportClientTimeseriesGet(timeseries, client, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoConversationusagereportClientTimeseriesGet");
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
| **timeseries** | **String**| Report on either the last 60 minutes, the last 48 hours or the last 60 days | [default to day] [enum: min, hour, day] |
| **client** | **String**| Which client would you like the conversation statistics for? You must be able to access this client   to report on it. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoFieldusageTargetClientRulenameGet"></a>
# **infoFieldusageTargetClientRulenameGet**
> ModelApiResponse infoFieldusageTargetClientRulenameGet(target, client, rulename, from, to, format, mergefields)

Report on how fields are created, read and written within a rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    Boolean mergefields = false; // Boolean | Should fields that have been renamed be merged together?
    try {
      ModelApiResponse result = apiInstance.infoFieldusageTargetClientRulenameGet(target, client, rulename, from, to, format, mergefields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoFieldusageTargetClientRulenameGet");
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
| **rulename** | **String**| Rule name | |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |
| **mergefields** | **Boolean**| Should fields that have been renamed be merged together? | [optional] [default to false] |

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

<a id="infoFlowTargetClientRulenameGet"></a>
# **infoFlowTargetClientRulenameGet**
> ModelApiResponse infoFlowTargetClientRulenameGet(target, client, rulename)

Get the JSON representation of the steps within a rule, suitable for displaying as a flowchart

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.infoFlowTargetClientRulenameGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoFlowTargetClientRulenameGet");
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
| **rulename** | **String**| Rule name | |

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

<a id="infoGlobalparamreportClientGet"></a>
# **infoGlobalparamreportClientGet**
> ModelApiResponse infoGlobalparamreportClientGet(client, from, to, parameterName, parameterValue, onlyGlobalParameters, format)

Get report on global parameters

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String parameterName = "parameterName_example"; // String | Get the report for a specific parameter
    String parameterValue = "parameterValue_example"; // String | Get the report for a specific parameter's value
    Boolean onlyGlobalParameters = true; // Boolean | Only include global parameters. When false will also list rules that would use global parameter if   one with given name was created
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoGlobalparamreportClientGet(client, from, to, parameterName, parameterValue, onlyGlobalParameters, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoGlobalparamreportClientGet");
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
| **client** | **String**| Client name | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **parameterName** | **String**| Get the report for a specific parameter | [optional] |
| **parameterValue** | **String**| Get the report for a specific parameter&#39;s value | [optional] |
| **onlyGlobalParameters** | **Boolean**| Only include global parameters. When false will also list rules that would use global parameter if   one with given name was created | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoInternalrulecallreportClientTargetRulenameGet"></a>
# **infoInternalrulecallreportClientTargetRulenameGet**
> ModelApiResponse infoInternalrulecallreportClientTargetRulenameGet(client, target, rulename, format)

For a given rule, find all the rules that call this rule internally

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Rule client
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String rulename = "rulename_example"; // String | Rule name
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoInternalrulecallreportClientTargetRulenameGet(client, target, rulename, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoInternalrulecallreportClientTargetRulenameGet");
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
| **client** | **String**| Rule client | |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **rulename** | **String**| Rule name | |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoLogged404sClientGet"></a>
# **infoLogged404sClientGet**
> ModelApiResponse infoLogged404sClientGet(client, from, to, limit, format)

Get report on logged 404 errors

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Integer limit = 56; // Integer | Limit the number of results returned. By default set to 100 when not provided.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoLogged404sClientGet(client, from, to, limit, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoLogged404sClientGet");
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
| **client** | **String**| Client name | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **limit** | **Integer**| Limit the number of results returned. By default set to 100 when not provided. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoResourceexistsreportPost"></a>
# **infoResourceexistsreportPost**
> ModelApiResponse infoResourceexistsreportPost(body)

Pass in an array of any size containing resource URL&#39;s (rules, templates, etc) to see if they exist and can   be accessed by this user.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String body = ["rule/target/client/rulename","template/client/templatename","queue/client/target/queuename","globalparameter/client/globalparametername","rulegroup/client/target/rulegroupname"]; // String | A json array of any number of resource urls prefixed by type. Supports rule, template, queue,   globalparameter and rulegroup
    try {
      ModelApiResponse result = apiInstance.infoResourceexistsreportPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoResourceexistsreportPost");
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
| **body** | **String**| A json array of any number of resource urls prefixed by type. Supports rule, template, queue,   globalparameter and rulegroup | |

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

<a id="infoRulecomplexityreportClientGet"></a>
# **infoRulecomplexityreportClientGet**
> ModelApiResponse infoRulecomplexityreportClientGet(client, format, target)

Report on the complexity of the various rules for a client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Limit the report to only the rules used by this client. You must be able to access this client to   report on it.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    try {
      ModelApiResponse result = apiInstance.infoRulecomplexityreportClientGet(client, format, target);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoRulecomplexityreportClientGet");
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
| **client** | **String**| Limit the report to only the rules used by this client. You must be able to access this client to   report on it. | |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |

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

<a id="infoSnoozeGet"></a>
# **infoSnoozeGet**
> ModelApiResponse infoSnoozeGet(format, target)

Report on whether rules can be snoozed

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    try {
      ModelApiResponse result = apiInstance.infoSnoozeGet(format, target);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoSnoozeGet");
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
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |

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

<a id="infoSteptypestatisticsDelete"></a>
# **infoSteptypestatisticsDelete**
> ModelApiResponse infoSteptypestatisticsDelete()

Clear the execution statistics histogram for all step types

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    try {
      ModelApiResponse result = apiInstance.infoSteptypestatisticsDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoSteptypestatisticsDelete");
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

<a id="infoSteptypestatisticsGet"></a>
# **infoSteptypestatisticsGet**
> ModelApiResponse infoSteptypestatisticsGet(format)

Find out the execution statistics histogram for each step type

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoSteptypestatisticsGet(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoSteptypestatisticsGet");
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
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoSteptypeusagereportClientGet"></a>
# **infoSteptypeusagereportClientGet**
> ModelApiResponse infoSteptypeusagereportClientGet(client, format, target)

Report on the steps being used by this client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Limit the report to only the steps used by this client. You must be able to access this client to   report on it.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    try {
      ModelApiResponse result = apiInstance.infoSteptypeusagereportClientGet(client, format, target);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoSteptypeusagereportClientGet");
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
| **client** | **String**| Limit the report to only the steps used by this client. You must be able to access this client to   report on it. | |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |

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

<a id="infoStepusagereportClientStepnameGet"></a>
# **infoStepusagereportClientStepnameGet**
> ModelApiResponse infoStepusagereportClientStepnameGet(stepname, client, target, from, to, format)

Find out which rules are using a specific step type

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String stepname = "stepname_example"; // String | type of step that must exist in the rules returned
    String client = "client_example"; // String | Filter the rules returned to only the ones in this client. Use * to match all clients visible to your   user
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoStepusagereportClientStepnameGet(stepname, client, target, from, to, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoStepusagereportClientStepnameGet");
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
| **stepname** | **String**| type of step that must exist in the rules returned | |
| **client** | **String**| Filter the rules returned to only the ones in this client. Use * to match all clients visible to your   user | [optional] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoTemplatecolumnreportClientGet"></a>
# **infoTemplatecolumnreportClientGet**
> ModelApiResponse infoTemplatecolumnreportClientGet(client, format)

Report on the names of the columns in the cache used by templates

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Limit the report to only the templates used by this client. You must be able to access this client to   report on it.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoTemplatecolumnreportClientGet(client, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoTemplatecolumnreportClientGet");
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
| **client** | **String**| Limit the report to only the templates used by this client. You must be able to access this client to   report on it. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoTemplateinputreportClientGet"></a>
# **infoTemplateinputreportClientGet**
> ModelApiResponse infoTemplateinputreportClientGet(client, from, to, inputFields, allversions, format)

List all templates that expect given input fields

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Limit the report to only the templates used by this client. You must be able to access this client to   report on it.
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    List<String> inputFields = Arrays.asList(); // List<String> | Name of input fields to search for
    Boolean allversions = true; // Boolean | Do we want to check all template versions or only latest?
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoTemplateinputreportClientGet(client, from, to, inputFields, allversions, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoTemplateinputreportClientGet");
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
| **client** | **String**| Limit the report to only the templates used by this client. You must be able to access this client to   report on it. | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **inputFields** | [**List&lt;String&gt;**](String.md)| Name of input fields to search for | [optional] |
| **allversions** | **Boolean**| Do we want to check all template versions or only latest? | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoTemplateusagereportClientTemplatenameGet"></a>
# **infoTemplateusagereportClientTemplatenameGet**
> ModelApiResponse infoTemplateusagereportClientTemplatenameGet(templatename, client, templateClient, templateVersion, from, to, target, format)

Find a list of rules which use a specific template

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String templatename = "templatename_example"; // String | The name of the template that is used by the rule
    String client = "client_example"; // String | Filter the rules returned to only this client. Use * to match all clients
    String templateClient = "templateClient_example"; // String | Filter to only templates with this client
    String templateVersion = "templateVersion_example"; // String | Filter to only templates with this version
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Filters on target
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoTemplateusagereportClientTemplatenameGet(templatename, client, templateClient, templateVersion, from, to, target, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoTemplateusagereportClientTemplatenameGet");
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
| **templatename** | **String**| The name of the template that is used by the rule | |
| **client** | **String**| Filter the rules returned to only this client. Use * to match all clients | [optional] |
| **templateClient** | **String**| Filter to only templates with this client | [optional] |
| **templateVersion** | **String**| Filter to only templates with this version | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **target** | [**TargetEnum**](.md)| Filters on target | [optional] [enum: dev, test, prod] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoTemplatevalidityreportClientGet"></a>
# **infoTemplatevalidityreportClientGet**
> ModelApiResponse infoTemplatevalidityreportClientGet(client, from, to, format)

Reports on validity of uploaded templates

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoTemplatevalidityreportClientGet(client, from, to, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoTemplatevalidityreportClientGet");
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
| **client** | **String**| Client name | [optional] |
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

<a id="infoTokenusereportGet"></a>
# **infoTokenusereportGet**
> ModelApiResponse infoTokenusereportGet(from, to, user, format, token)

Reports on token access and last used date.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String user = "user_example"; // String | Optional query parameter to specify the user
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    String token = "token_example"; // String | Optional token for which to obtain the last used report
    try {
      ModelApiResponse result = apiInstance.infoTokenusereportGet(from, to, user, format, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoTokenusereportGet");
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
| **user** | **String**| Optional query parameter to specify the user | [optional] |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |
| **token** | **String**| Optional token for which to obtain the last used report | [optional] |

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

<a id="infoWorkerthreadusageGet"></a>
# **infoWorkerthreadusageGet**
> ModelApiResponse infoWorkerthreadusageGet(from, to, format)

Worker thread usage

Worker threads execute steps within rules. This report shows what they are doing

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.InfoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InfoApi apiInstance = new InfoApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      ModelApiResponse result = apiInstance.infoWorkerthreadusageGet(from, to, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#infoWorkerthreadusageGet");
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
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

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

