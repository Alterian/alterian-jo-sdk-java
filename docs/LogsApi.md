# LogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**logsTypeTargetClientGet**](LogsApi.md#logsTypeTargetClientGet) | **GET** /logs/{type}/{target}/{client} | Search across logs for this client and target |
| [**logsTypeTargetClientRulenameGet**](LogsApi.md#logsTypeTargetClientRulenameGet) | **GET** /logs/{type}/{target}/{client}/{rulename} | Get logs that have been recorded for this rule |


<a id="logsTypeTargetClientGet"></a>
# **logsTypeTargetClientGet**
> LogsApiResponse logsTypeTargetClientGet(type, target, client, searchPhrase, sequenceNumber, templateUrl, limit, source, csv, startdate, enddate)

Search across logs for this client and target

Provide a search string to search for

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LogsApi apiInstance = new LogsApi(defaultClient);
    LogType type = LogType.fromValue("writetolog"); // LogType | What kind of logging do you want to see?
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String searchPhrase = "searchPhrase_example"; // String | The phrase to search for in the logs
    String sequenceNumber = "sequenceNumber_example"; // String | Sequence Number to identify rule invoke logs
    String templateUrl = "templateUrl_example"; // String | Template url, if you want to filter your request by template url
    Integer limit = 56; // Integer | The maximum number of items to return.
    LogSource source = LogSource.fromValue("elasticsearch"); // LogSource | Pick the source of the logs. Currently only elastic search is supported
    Boolean csv = true; // Boolean | if true then returns csv file
    OffsetDateTime startdate = OffsetDateTime.now(); // OffsetDateTime | If you want to filter your request by date range, this is the starting date for the time period,   please provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC.
    OffsetDateTime enddate = OffsetDateTime.now(); // OffsetDateTime | If you want to filter your request by date range, this is the ending date for the time period, please   provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC.
    try {
      LogsApiResponse result = apiInstance.logsTypeTargetClientGet(type, target, client, searchPhrase, sequenceNumber, templateUrl, limit, source, csv, startdate, enddate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#logsTypeTargetClientGet");
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
| **type** | [**LogType**](.md)| What kind of logging do you want to see? | [enum: writetolog, system, writetologandsystem] |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **client** | **String**| Client name | |
| **searchPhrase** | **String**| The phrase to search for in the logs | |
| **sequenceNumber** | **String**| Sequence Number to identify rule invoke logs | [optional] |
| **templateUrl** | **String**| Template url, if you want to filter your request by template url | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |
| **source** | [**LogSource**](.md)| Pick the source of the logs. Currently only elastic search is supported | [optional] [enum: elasticsearch] |
| **csv** | **Boolean**| if true then returns csv file | [optional] |
| **startdate** | **OffsetDateTime**| If you want to filter your request by date range, this is the starting date for the time period,   please provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC. | [optional] |
| **enddate** | **OffsetDateTime**| If you want to filter your request by date range, this is the ending date for the time period, please   provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC. | [optional] |

### Return type

[**LogsApiResponse**](LogsApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="logsTypeTargetClientRulenameGet"></a>
# **logsTypeTargetClientRulenameGet**
> LogsApiResponse logsTypeTargetClientRulenameGet(type, target, client, rulename, searchPhrase, searchQuery, sequenceNumber, tileName, tileId, templateUrl, limit, source, csv, startdate, enddate)

Get logs that have been recorded for this rule

If you haven&#39;t invoked the rule since you started logging then the writetolog list will always be empty.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.LogsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    LogsApi apiInstance = new LogsApi(defaultClient);
    LogTypeOrTimeseries type = LogTypeOrTimeseries.fromValue("writetolog"); // LogTypeOrTimeseries | What kind of logging do you want to see?
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    String searchPhrase = "searchPhrase_example"; // String | The phrase to search for in the logs
    String searchQuery = "searchQuery_example"; // String | Lucene query string to apply
    String sequenceNumber = "sequenceNumber_example"; // String | Sequence Number to identify rule invoke logs
    String tileName = "tileName_example"; // String | The name of the tile, if you want to filter your request by tile name
    String tileId = "tileId_example"; // String | The id of the tile, if you want to filter your request by tile id
    String templateUrl = "templateUrl_example"; // String | Template url, if you want to filter your request by template url
    Integer limit = 56; // Integer | The maximum number of items to return.
    LogSource source = LogSource.fromValue("elasticsearch"); // LogSource | Pick the source of the logs. Currently only elastic search is supported
    Boolean csv = true; // Boolean | if true then returns csv file
    OffsetDateTime startdate = OffsetDateTime.now(); // OffsetDateTime | If you want to filter your request by date range, this is the starting date for the time period,   please provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC.
    OffsetDateTime enddate = OffsetDateTime.now(); // OffsetDateTime | If you want to filter your request by date range, this is the ending date for the time period, please   provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC.
    try {
      LogsApiResponse result = apiInstance.logsTypeTargetClientRulenameGet(type, target, client, rulename, searchPhrase, searchQuery, sequenceNumber, tileName, tileId, templateUrl, limit, source, csv, startdate, enddate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#logsTypeTargetClientRulenameGet");
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
| **type** | [**LogTypeOrTimeseries**](.md)| What kind of logging do you want to see? | [enum: writetolog, system, writetologandsystem, timeseriesmin, timeserieshour, timeseriesday, timeseriesmonth] |
| **target** | [**TargetEnum**](.md)| Target - is where rule is published. | [enum: dev, test, prod] |
| **client** | **String**| Client name | |
| **rulename** | **String**| Rule name | |
| **searchPhrase** | **String**| The phrase to search for in the logs | [optional] |
| **searchQuery** | **String**| Lucene query string to apply | [optional] |
| **sequenceNumber** | **String**| Sequence Number to identify rule invoke logs | [optional] |
| **tileName** | **String**| The name of the tile, if you want to filter your request by tile name | [optional] |
| **tileId** | **String**| The id of the tile, if you want to filter your request by tile id | [optional] |
| **templateUrl** | **String**| Template url, if you want to filter your request by template url | [optional] |
| **limit** | **Integer**| The maximum number of items to return. | [optional] |
| **source** | [**LogSource**](.md)| Pick the source of the logs. Currently only elastic search is supported | [optional] [enum: elasticsearch] |
| **csv** | **Boolean**| if true then returns csv file | [optional] |
| **startdate** | **OffsetDateTime**| If you want to filter your request by date range, this is the starting date for the time period,   please provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC. | [optional] |
| **enddate** | **OffsetDateTime**| If you want to filter your request by date range, this is the ending date for the time period, please   provide in ISO-8601 (YYYY-MM-DDThh:mm:ssZ)  All times are UTC. | [optional] |

### Return type

[**LogsApiResponse**](LogsApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

