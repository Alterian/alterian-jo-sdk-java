# TestdataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadTestdataTargetClientRulenameGet**](TestdataApi.md#downloadTestdataTargetClientRulenameGet) | **GET** /download/testdata/{target}/{client}/{rulename} | Download user defined test data for a specific rule as JSON |
| [**testdataGet**](TestdataApi.md#testdataGet) | **GET** /testdata | List all user defined test data across all rules. |


<a id="downloadTestdataTargetClientRulenameGet"></a>
# **downloadTestdataTargetClientRulenameGet**
> downloadTestdataTargetClientRulenameGet(target, client, rulename)

Download user defined test data for a specific rule as JSON

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TestdataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TestdataApi apiInstance = new TestdataApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      apiInstance.downloadTestdataTargetClientRulenameGet(target, client, rulename);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestdataApi#downloadTestdataTargetClientRulenameGet");
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

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A uuencoded octet stream containing the .json file |  -  |

<a id="testdataGet"></a>
# **testdataGet**
> testdataGet(from, to)

List all user defined test data across all rules.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.TestdataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    TestdataApi apiInstance = new TestdataApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      apiInstance.testdataGet(from, to);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestdataApi#testdataGet");
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

