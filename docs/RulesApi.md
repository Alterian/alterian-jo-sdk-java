# RulesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadRuleTargetClientRulenameGet**](RulesApi.md#downloadRuleTargetClientRulenameGet) | **GET** /download/rule/{target}/{client}/{rulename} | Download the rule file (KTR) for a running rule |
| [**ruleGet**](RulesApi.md#ruleGet) | **GET** /rule | Get information about all published rules on the server |
| [**ruleTargetClientDelete**](RulesApi.md#ruleTargetClientDelete) | **DELETE** /rule/{target}/{client} | Unpublish all rules that this client has published to the given target. |
| [**ruleTargetClientDesignerPut**](RulesApi.md#ruleTargetClientDesignerPut) | **PUT** /rule/{target}/{client}/designer | Validate a new Rule Designer JSON |
| [**ruleTargetClientGet**](RulesApi.md#ruleTargetClientGet) | **GET** /rule/{target}/{client} | Get information about all rules published by this client to the given target. |
| [**ruleTargetClientRulenameAutoloaderGet**](RulesApi.md#ruleTargetClientRulenameAutoloaderGet) | **GET** /rule/{target}/{client}/{rulename}/autoloader | Get the autoloader JSON for a specific rule. This is normally used by the Rule plugin within Spoon |
| [**ruleTargetClientRulenameAutoloaderPost**](RulesApi.md#ruleTargetClientRulenameAutoloaderPost) | **POST** /rule/{target}/{client}/{rulename}/autoloader | Save the JSON for an autoloader rule |
| [**ruleTargetClientRulenameCopytoPost**](RulesApi.md#ruleTargetClientRulenameCopytoPost) | **POST** /rule/{target}/{client}/{rulename}/copyto | Copy this rule to the given target. |
| [**ruleTargetClientRulenameDatagridDataGridNameGet**](RulesApi.md#ruleTargetClientRulenameDatagridDataGridNameGet) | **GET** /rule/{target}/{client}/{rulename}/datagrid/{dataGridName} | Get information about the data grid for a specific, published rule. |
| [**ruleTargetClientRulenameDatagridDataGridNamePost**](RulesApi.md#ruleTargetClientRulenameDatagridDataGridNamePost) | **POST** /rule/{target}/{client}/{rulename}/datagrid/{dataGridName} | Enter new data for an exisiting data grid and update |
| [**ruleTargetClientRulenameDatagridDataGridNameRowsPost**](RulesApi.md#ruleTargetClientRulenameDatagridDataGridNameRowsPost) | **POST** /rule/{target}/{client}/{rulename}/datagrid/{dataGridName}/rows | Add new data grid rows to a rule&#39;s Data Grid |
| [**ruleTargetClientRulenameDelete**](RulesApi.md#ruleTargetClientRulenameDelete) | **DELETE** /rule/{target}/{client}/{rulename} | Unpublish a specific rule. |
| [**ruleTargetClientRulenameDesignerGet**](RulesApi.md#ruleTargetClientRulenameDesignerGet) | **GET** /rule/{target}/{client}/{rulename}/designer | Get the rule designer JSON for a specific rule. This is normally used by the Rule designer user interface |
| [**ruleTargetClientRulenameDesignerPost**](RulesApi.md#ruleTargetClientRulenameDesignerPost) | **POST** /rule/{target}/{client}/{rulename}/designer | Save or validate the rule designer JSON for a rule |
| [**ruleTargetClientRulenameDesignerPut**](RulesApi.md#ruleTargetClientRulenameDesignerPut) | **PUT** /rule/{target}/{client}/{rulename}/designer | Add a new rule via the rule designer JSON. |
| [**ruleTargetClientRulenameGet**](RulesApi.md#ruleTargetClientRulenameGet) | **GET** /rule/{target}/{client}/{rulename} | Get information about one specific, published rule. |
| [**ruleTargetClientRulenameParameterPost**](RulesApi.md#ruleTargetClientRulenameParameterPost) | **POST** /rule/{target}/{client}/{rulename}/parameter | update the default values for parameters. |
| [**ruleTargetClientRulenamePauseDelete**](RulesApi.md#ruleTargetClientRulenamePauseDelete) | **DELETE** /rule/{target}/{client}/{rulename}/pause | Pause this rule |
| [**ruleTargetClientRulenamePost**](RulesApi.md#ruleTargetClientRulenamePost) | **POST** /rule/{target}/{client}/{rulename} | Start or restart one specific, published rule. |
| [**ruleTargetClientRulenamePriorityWeightingPost**](RulesApi.md#ruleTargetClientRulenamePriorityWeightingPost) | **POST** /rule/{target}/{client}/{rulename}/priorityWeighting | Update the rule&#39;s priority weighting |
| [**ruleTargetClientRulenameResetDelete**](RulesApi.md#ruleTargetClientRulenameResetDelete) | **DELETE** /rule/{target}/{client}/{rulename}/reset | Perform extended actions to rules |
| [**ruleTargetClientRulenameSampleDataGet**](RulesApi.md#ruleTargetClientRulenameSampleDataGet) | **GET** /rule/{target}/{client}/{rulename}/sampleData | Get JSON Schema representation of the data expected by the rule |
| [**ruleTargetClientRulenameSnoozePost**](RulesApi.md#ruleTargetClientRulenameSnoozePost) | **POST** /rule/{target}/{client}/{rulename}/snooze | Make this rule start snoozing |
| [**ruleTargetClientRulenameTestDataDelete**](RulesApi.md#ruleTargetClientRulenameTestDataDelete) | **DELETE** /rule/{target}/{client}/{rulename}/testData | Delete all test data |
| [**ruleTargetClientRulenameTestDataGet**](RulesApi.md#ruleTargetClientRulenameTestDataGet) | **GET** /rule/{target}/{client}/{rulename}/testData | Get the rule&#39;s test data and headers information |
| [**ruleTargetClientRulenameTestDataPost**](RulesApi.md#ruleTargetClientRulenameTestDataPost) | **POST** /rule/{target}/{client}/{rulename}/testData | Add test data to rule |
| [**ruleTargetGet**](RulesApi.md#ruleTargetGet) | **GET** /rule/{target} | Get information about all rules published by all clients to the given target |


<a id="downloadRuleTargetClientRulenameGet"></a>
# **downloadRuleTargetClientRulenameGet**
> File downloadRuleTargetClientRulenameGet(target, client, rulename)

Download the rule file (KTR) for a running rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      File result = apiInstance.downloadRuleTargetClientRulenameGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#downloadRuleTargetClientRulenameGet");
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

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A uuencoded octet stream containing the rule ktr file |  -  |

<a id="ruleGet"></a>
# **ruleGet**
> RuleList ruleGet(from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients)

Get information about all published rules on the server

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String sortProperty = "sortProperty_example"; // String | List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue.
    String sortDescending = "sortDescending_example"; // String | List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty
    String createdRuleUrl = "createdRuleUrl_example"; // String | The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name
    HealthScoreTimeFrame healthScore = HealthScoreTimeFrame.fromValue("hour"); // HealthScoreTimeFrame | Time Frame for calculating the health score of a rule. Allowed values are hour, day, min
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    String parameterName = "parameterName_example"; // String | Get the report for a specific parameter
    String parameterValue = "parameterValue_example"; // String | Get a list of rules which have a specific parameter value
    String templateFilter = "templateFilter_example"; // String | Filter to return only rules using specified template
    Boolean includePublic = true; // Boolean | Flag to indicate whether rules from the public client should be included in the results, please use   iClients=public instead
    Boolean checkTemplateLatestVersion = true; // Boolean | Should a check to verify rule has the latest templates version be performed?
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      RuleList result = apiInstance.ruleGet(from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleGet");
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
| **createdRuleUrl** | **String**| The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name | [optional] |
| **healthScore** | [**HealthScoreTimeFrame**](.md)| Time Frame for calculating the health score of a rule. Allowed values are hour, day, min | [optional] [enum: hour, day, min] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **parameterName** | **String**| Get the report for a specific parameter | [optional] |
| **parameterValue** | **String**| Get a list of rules which have a specific parameter value | [optional] |
| **templateFilter** | **String**| Filter to return only rules using specified template | [optional] |
| **includePublic** | **Boolean**| Flag to indicate whether rules from the public client should be included in the results, please use   iClients&#x3D;public instead | [optional] |
| **checkTemplateLatestVersion** | **Boolean**| Should a check to verify rule has the latest templates version be performed? | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientDelete"></a>
# **ruleTargetClientDelete**
> RuleList ruleTargetClientDelete(target, client)

Unpublish all rules that this client has published to the given target.



### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    try {
      RuleList result = apiInstance.ruleTargetClientDelete(target, client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientDelete");
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

### Return type

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientDesignerPut"></a>
# **ruleTargetClientDesignerPut**
> RuleDesignerResponse ruleTargetClientDesignerPut(target, client, ruleData)

Validate a new Rule Designer JSON

This will validate a new Rule Designer JSON and return validations if problems detected without saving the rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    RuleData ruleData = new RuleData(); // RuleData | Specify the rule designer JSON for the updated rule. Ensure wrapped in {}
    try {
      RuleDesignerResponse result = apiInstance.ruleTargetClientDesignerPut(target, client, ruleData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientDesignerPut");
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
| **ruleData** | [**RuleData**](RuleData.md)| Specify the rule designer JSON for the updated rule. Ensure wrapped in {} | [optional] |

### Return type

[**RuleDesignerResponse**](RuleDesignerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientGet"></a>
# **ruleTargetClientGet**
> RuleList ruleTargetClientGet(target, client, from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients)

Get information about all rules published by this client to the given target.

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String sortProperty = "sortProperty_example"; // String | List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue.
    String sortDescending = "sortDescending_example"; // String | List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty
    String createdRuleUrl = "createdRuleUrl_example"; // String | The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name
    HealthScoreTimeFrame healthScore = HealthScoreTimeFrame.fromValue("hour"); // HealthScoreTimeFrame | Time Frame for calculating the health score of a rule. Allowed values are hour, day, min
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    String parameterName = "parameterName_example"; // String | Get the report for a specific parameter
    String parameterValue = "parameterValue_example"; // String | Get a list of rules which have a specific parameter value
    String templateFilter = "templateFilter_example"; // String | Filter to return only rules using specified template
    Boolean includePublic = true; // Boolean | Flag to indicate whether rules from the public client should be included in the results, please use   iClients=public instead
    Boolean checkTemplateLatestVersion = true; // Boolean | Should a check to verify rule has the latest templates version be performed?
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      RuleList result = apiInstance.ruleTargetClientGet(target, client, from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientGet");
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
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **sortProperty** | **String**| List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue. | [optional] |
| **sortDescending** | **String**| List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty | [optional] |
| **createdRuleUrl** | **String**| The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name | [optional] |
| **healthScore** | [**HealthScoreTimeFrame**](.md)| Time Frame for calculating the health score of a rule. Allowed values are hour, day, min | [optional] [enum: hour, day, min] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **parameterName** | **String**| Get the report for a specific parameter | [optional] |
| **parameterValue** | **String**| Get a list of rules which have a specific parameter value | [optional] |
| **templateFilter** | **String**| Filter to return only rules using specified template | [optional] |
| **includePublic** | **Boolean**| Flag to indicate whether rules from the public client should be included in the results, please use   iClients&#x3D;public instead | [optional] |
| **checkTemplateLatestVersion** | **Boolean**| Should a check to verify rule has the latest templates version be performed? | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameAutoloaderGet"></a>
# **ruleTargetClientRulenameAutoloaderGet**
> RuleList ruleTargetClientRulenameAutoloaderGet(target, client, rulename)

Get the autoloader JSON for a specific rule. This is normally used by the Rule plugin within Spoon

This will be parsed by the Spoon plugin so that a rule created as an autoloader can be edited

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      RuleList result = apiInstance.ruleTargetClientRulenameAutoloaderGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameAutoloaderGet");
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

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameAutoloaderPost"></a>
# **ruleTargetClientRulenameAutoloaderPost**
> RuleAndStateResponse ruleTargetClientRulenameAutoloaderPost(target, client, rulename, body)

Save the JSON for an autoloader rule

This will automatically change the structure and the values within the rule so that it can load the data   required. Tis is normally called by the Rule plugin from within Spoon. Only rules that were created as an autoloader can   be altered.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Object body = null; // Object | Specify the autoloader JSON for the updated rule. Ensure wrapped in {}
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenameAutoloaderPost(target, client, rulename, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameAutoloaderPost");
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
| **body** | **Object**| Specify the autoloader JSON for the updated rule. Ensure wrapped in {} | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameCopytoPost"></a>
# **ruleTargetClientRulenameCopytoPost**
> RuleAndStateResponse ruleTargetClientRulenameCopytoPost(target, client, rulename, destinationtarget, destinationTarget)

Copy this rule to the given target.

A copy of this rule will be started in the given target.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    TargetEnum destinationtarget = TargetEnum.fromValue("dev"); // TargetEnum | The target to copy the rule to - must be different from the current target.  Can optionally be   provided in the requestBody as JSON instead if preferred
    DestinationTarget destinationTarget = new DestinationTarget(); // DestinationTarget | Where the copy will run.
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenameCopytoPost(target, client, rulename, destinationtarget, destinationTarget);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameCopytoPost");
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
| **destinationtarget** | [**TargetEnum**](.md)| The target to copy the rule to - must be different from the current target.  Can optionally be   provided in the requestBody as JSON instead if preferred | [optional] [enum: dev, test, prod] |
| **destinationTarget** | [**DestinationTarget**](DestinationTarget.md)| Where the copy will run. | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDatagridDataGridNameGet"></a>
# **ruleTargetClientRulenameDatagridDataGridNameGet**
> DataGridApiResponse ruleTargetClientRulenameDatagridDataGridNameGet(target, client, rulename, dataGridName, format)

Get information about the data grid for a specific, published rule.

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    String dataGridName = "dataGridName_example"; // String | Name of the Data Grid that will be updated
    CsvEnum format = CsvEnum.fromValue("csv"); // CsvEnum | If you want CSV, enter csv here
    try {
      DataGridApiResponse result = apiInstance.ruleTargetClientRulenameDatagridDataGridNameGet(target, client, rulename, dataGridName, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDatagridDataGridNameGet");
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
| **dataGridName** | **String**| Name of the Data Grid that will be updated | |
| **format** | [**CsvEnum**](.md)| If you want CSV, enter csv here | [optional] [enum: csv] |

### Return type

[**DataGridApiResponse**](DataGridApiResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDatagridDataGridNamePost"></a>
# **ruleTargetClientRulenameDatagridDataGridNamePost**
> RuleAndStateResponse ruleTargetClientRulenameDatagridDataGridNamePost(target, client, rulename, dataGridName, dataGridDetails)

Enter new data for an exisiting data grid and update

If a rule already has an associated data grid, here it is possible to enter new data and change the grid   contents.  Note, you cannot add or remove columns but you can change their format.  Do a get on the data grid to get the   existing structure.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    String dataGridName = "dataGridName_example"; // String | Name of the Data Grid that will be updated
    List<DataGridDetails> dataGridDetails = Arrays.asList(); // List<DataGridDetails> | Specify the data for the updated data grid. Ensure wrapped in {}
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenameDatagridDataGridNamePost(target, client, rulename, dataGridName, dataGridDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDatagridDataGridNamePost");
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
| **dataGridName** | **String**| Name of the Data Grid that will be updated | |
| **dataGridDetails** | [**List&lt;DataGridDetails&gt;**](DataGridDetails.md)| Specify the data for the updated data grid. Ensure wrapped in {} | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDatagridDataGridNameRowsPost"></a>
# **ruleTargetClientRulenameDatagridDataGridNameRowsPost**
> RuleAndStateResponse ruleTargetClientRulenameDatagridDataGridNameRowsPost(target, client, rulename, dataGridName, dataGridRow)

Add new data grid rows to a rule&#39;s Data Grid

This is to append new data only. Existing data remains unchanged

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    String dataGridName = "dataGridName_example"; // String | Name of the Data Grid that will be updated
    DataGridRow dataGridRow = new DataGridRow(); // DataGridRow | Data grid rows
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenameDatagridDataGridNameRowsPost(target, client, rulename, dataGridName, dataGridRow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDatagridDataGridNameRowsPost");
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
| **dataGridName** | **String**| Name of the Data Grid that will be updated | |
| **dataGridRow** | [**DataGridRow**](DataGridRow.md)| Data grid rows | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDelete"></a>
# **ruleTargetClientRulenameDelete**
> RuleList ruleTargetClientRulenameDelete(target, client, rulename)

Unpublish a specific rule.



### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      RuleList result = apiInstance.ruleTargetClientRulenameDelete(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDelete");
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

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDesignerGet"></a>
# **ruleTargetClientRulenameDesignerGet**
> RuleList ruleTargetClientRulenameDesignerGet(target, client, rulename)

Get the rule designer JSON for a specific rule. This is normally used by the Rule designer user interface

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      RuleList result = apiInstance.ruleTargetClientRulenameDesignerGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDesignerGet");
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

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDesignerPost"></a>
# **ruleTargetClientRulenameDesignerPost**
> RuleDesignerResponse ruleTargetClientRulenameDesignerPost(target, client, rulename, validate, ruleData)

Save or validate the rule designer JSON for a rule

This will change the structure and the values within the rule, as defined by the rule designer. If the   new rule structure is not valid and the rule is running then this call will fail unless you are only validating the rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Boolean validate = true; // Boolean | Set to 'True' to only validate the JSON (and not save it)
    RuleData ruleData = new RuleData(); // RuleData | Specify the rule designer JSON for the updated rule. Ensure wrapped in {}
    try {
      RuleDesignerResponse result = apiInstance.ruleTargetClientRulenameDesignerPost(target, client, rulename, validate, ruleData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDesignerPost");
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
| **validate** | **Boolean**| Set to &#39;True&#39; to only validate the JSON (and not save it) | [optional] |
| **ruleData** | [**RuleData**](RuleData.md)| Specify the rule designer JSON for the updated rule. Ensure wrapped in {} | [optional] |

### Return type

[**RuleDesignerResponse**](RuleDesignerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameDesignerPut"></a>
# **ruleTargetClientRulenameDesignerPut**
> ModelApiResponse ruleTargetClientRulenameDesignerPut(target, client, rulename, validate, download, body)

Add a new rule via the rule designer JSON.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Boolean validate = true; // Boolean | Set to 'True' to only validate the JSON (and not save it)
    Boolean download = true; // Boolean | Download the posted rule designer JSON as a .ktr file
    String body = "body_example"; // String | Specify the rule designer JSON for the updated rule. Ensure wrapped in {}
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenameDesignerPut(target, client, rulename, validate, download, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameDesignerPut");
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
| **validate** | **Boolean**| Set to &#39;True&#39; to only validate the JSON (and not save it) | [optional] |
| **download** | **Boolean**| Download the posted rule designer JSON as a .ktr file | [optional] |
| **body** | **String**| Specify the rule designer JSON for the updated rule. Ensure wrapped in {} | [optional] |

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

<a id="ruleTargetClientRulenameGet"></a>
# **ruleTargetClientRulenameGet**
> RuleList ruleTargetClientRulenameGet(target, client, rulename, healthScore, includeStatistics, checkTemplateLatestVersion)

Get information about one specific, published rule.

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    HealthScoreTimeFrame healthScore = HealthScoreTimeFrame.fromValue("hour"); // HealthScoreTimeFrame | Time Frame for calculating the health score of a rule. Allowed values are hour, day, min
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    Boolean checkTemplateLatestVersion = true; // Boolean | Should a check to verify rule has the latest templates version be performed?
    try {
      RuleList result = apiInstance.ruleTargetClientRulenameGet(target, client, rulename, healthScore, includeStatistics, checkTemplateLatestVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameGet");
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
| **healthScore** | [**HealthScoreTimeFrame**](.md)| Time Frame for calculating the health score of a rule. Allowed values are hour, day, min | [optional] [enum: hour, day, min] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |
| **checkTemplateLatestVersion** | **Boolean**| Should a check to verify rule has the latest templates version be performed? | [optional] |

### Return type

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameParameterPost"></a>
# **ruleTargetClientRulenameParameterPost**
> RuleAndStateResponse ruleTargetClientRulenameParameterPost(target, client, rulename, body)

update the default values for parameters.

this will update the rule with new default parameters.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Object body = {"parameterName":"parameterValue"}; // Object | key value pairs of param name and value. Ensure wrapped in {}
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenameParameterPost(target, client, rulename, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameParameterPost");
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
| **body** | **Object**| key value pairs of param name and value. Ensure wrapped in {} | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenamePauseDelete"></a>
# **ruleTargetClientRulenamePauseDelete**
> ModelApiResponse ruleTargetClientRulenamePauseDelete(target, client, rulename)

Pause this rule

Cause this rule to go to &#39;waiting&#39; state.  A rule that is paused will return an error code if it receives   traffic (i.e. is invoked). Restart the rule to allow it to serve traffic again

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenamePauseDelete(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenamePauseDelete");
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

<a id="ruleTargetClientRulenamePost"></a>
# **ruleTargetClientRulenamePost**
> ModelApiResponse ruleTargetClientRulenamePost(target, client, rulename)

Start or restart one specific, published rule.

Cause this rule to be re-read from disk and restarted. If this rule was previously paused then it will be unpaused. If it was previously snoozed then it will be unsnoozed

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenamePost(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenamePost");
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

<a id="ruleTargetClientRulenamePriorityWeightingPost"></a>
# **ruleTargetClientRulenamePriorityWeightingPost**
> RuleAndStateResponse ruleTargetClientRulenamePriorityWeightingPost(target, client, rulename, body)

Update the rule&#39;s priority weighting

This will set a new value for a rule&#39;s priority weighting

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    Object body = null; // Object | key value pairs of param name and value. Ensure wrapped in {}
    try {
      RuleAndStateResponse result = apiInstance.ruleTargetClientRulenamePriorityWeightingPost(target, client, rulename, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenamePriorityWeightingPost");
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
| **body** | **Object**| key value pairs of param name and value. Ensure wrapped in {} | [optional] |

### Return type

[**RuleAndStateResponse**](RuleAndStateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, example

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameResetDelete"></a>
# **ruleTargetClientRulenameResetDelete**
> ModelApiResponse ruleTargetClientRulenameResetDelete(target, client, rulename)

Perform extended actions to rules



### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenameResetDelete(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameResetDelete");
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

<a id="ruleTargetClientRulenameSampleDataGet"></a>
# **ruleTargetClientRulenameSampleDataGet**
> ApiJSONArrayResponse ruleTargetClientRulenameSampleDataGet(target, client, rulename)

Get JSON Schema representation of the data expected by the rule

Generates a JSON Schema object, following json-schema.org specification

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ApiJSONArrayResponse result = apiInstance.ruleTargetClientRulenameSampleDataGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameSampleDataGet");
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

[**ApiJSONArrayResponse**](ApiJSONArrayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameSnoozePost"></a>
# **ruleTargetClientRulenameSnoozePost**
> ModelApiResponse ruleTargetClientRulenameSnoozePost(target, client, rulename)

Make this rule start snoozing

Snoozed rules are paused, and use no resources. They automatically start when invoked; there will be a short delay while the rule starts

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenameSnoozePost(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameSnoozePost");
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

<a id="ruleTargetClientRulenameTestDataDelete"></a>
# **ruleTargetClientRulenameTestDataDelete**
> ModelApiResponse ruleTargetClientRulenameTestDataDelete(target, client, rulename)

Delete all test data

Deletes all of user defined test data for this rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenameTestDataDelete(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameTestDataDelete");
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

<a id="ruleTargetClientRulenameTestDataGet"></a>
# **ruleTargetClientRulenameTestDataGet**
> TestDataResponse ruleTargetClientRulenameTestDataGet(target, client, rulename)

Get the rule&#39;s test data and headers information

Returns the test data and header information as specified in the rule&#39;s Realtime Input step

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    try {
      TestDataResponse result = apiInstance.ruleTargetClientRulenameTestDataGet(target, client, rulename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameTestDataGet");
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

[**TestDataResponse**](TestDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ruleTargetClientRulenameTestDataPost"></a>
# **ruleTargetClientRulenameTestDataPost**
> ModelApiResponse ruleTargetClientRulenameTestDataPost(target, client, rulename, testData)

Add test data to rule

User defined test data rows will be stored for this rule

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String client = "client_example"; // String | Client name
    String rulename = "rulename_example"; // String | Rule name
    List<TestData> testData = Arrays.asList(); // List<TestData> | 
    try {
      ModelApiResponse result = apiInstance.ruleTargetClientRulenameTestDataPost(target, client, rulename, testData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetClientRulenameTestDataPost");
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
| **testData** | [**List&lt;TestData&gt;**](TestData.md)|  | [optional] |

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

<a id="ruleTargetGet"></a>
# **ruleTargetGet**
> RuleList ruleTargetGet(target, from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients)

Get information about all rules published by all clients to the given target

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.RulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RulesApi apiInstance = new RulesApi(defaultClient);
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    String sortProperty = "sortProperty_example"; // String | List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue.
    String sortDescending = "sortDescending_example"; // String | List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty
    String createdRuleUrl = "createdRuleUrl_example"; // String | The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name
    HealthScoreTimeFrame healthScore = HealthScoreTimeFrame.fromValue("hour"); // HealthScoreTimeFrame | Time Frame for calculating the health score of a rule. Allowed values are hour, day, min
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    String searchText = "searchText_example"; // String | Filter results to those which contain this text
    String parameterName = "parameterName_example"; // String | Get the report for a specific parameter
    String parameterValue = "parameterValue_example"; // String | Get a list of rules which have a specific parameter value
    String templateFilter = "templateFilter_example"; // String | Filter to return only rules using specified template
    Boolean includePublic = true; // Boolean | Flag to indicate whether rules from the public client should be included in the results, please use   iClients=public instead
    Boolean checkTemplateLatestVersion = true; // Boolean | Should a check to verify rule has the latest templates version be performed?
    List<String> iClients = Arrays.asList(); // List<String> | Only include these client(s)
    try {
      RuleList result = apiInstance.ruleTargetGet(target, from, to, sortProperty, sortDescending, createdRuleUrl, healthScore, includeStatistics, searchText, parameterName, parameterValue, templateFilter, includePublic, checkTemplateLatestVersion, iClients);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesApi#ruleTargetGet");
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
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **sortProperty** | **String**| List of comma-separated values, by which the returned rules will be sorted by. The possible values   are: name, client, description, businessGoal, dataType, isConfidential, isVisible, isEditable, isForcedValue. | [optional] |
| **sortDescending** | **String**| List of comma-separated true/false values indicating either ascending (false) or descending (true)   order of each sortProperty | [optional] |
| **createdRuleUrl** | **String**| The url the rule was published to. Only rule with this url will be returned. In the format of:   target/client/rule_name | [optional] |
| **healthScore** | [**HealthScoreTimeFrame**](.md)| Time Frame for calculating the health score of a rule. Allowed values are hour, day, min | [optional] [enum: hour, day, min] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |
| **searchText** | **String**| Filter results to those which contain this text | [optional] |
| **parameterName** | **String**| Get the report for a specific parameter | [optional] |
| **parameterValue** | **String**| Get a list of rules which have a specific parameter value | [optional] |
| **templateFilter** | **String**| Filter to return only rules using specified template | [optional] |
| **includePublic** | **Boolean**| Flag to indicate whether rules from the public client should be included in the results, please use   iClients&#x3D;public instead | [optional] |
| **checkTemplateLatestVersion** | **Boolean**| Should a check to verify rule has the latest templates version be performed? | [optional] |
| **iClients** | [**List&lt;String&gt;**](String.md)| Only include these client(s) | [optional] |

### Return type

[**RuleList**](RuleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

