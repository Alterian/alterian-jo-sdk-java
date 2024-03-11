# QueueApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queueClientDelete**](QueueApi.md#queueClientDelete) | **DELETE** /queue/{client}/ | Delete all queues that this client owns. |
| [**queueClientGet**](QueueApi.md#queueClientGet) | **GET** /queue/{client}/ | Get all of the queues for a specific client, across all targets. |
| [**queueClientTargetDelete**](QueueApi.md#queueClientTargetDelete) | **DELETE** /queue/{client}/{target}/ | Delete all of the queues within a specific target for the given client |
| [**queueClientTargetGet**](QueueApi.md#queueClientTargetGet) | **GET** /queue/{client}/{target}/ | Get details about all of the queues within a specific target for this client. |
| [**queueClientTargetQueueNameAckPost**](QueueApi.md#queueClientTargetQueueNameAckPost) | **POST** /queue/{client}/{target}/{queueName}/ack | Remove a set of messages from a given queue. |
| [**queueClientTargetQueueNameDelete**](QueueApi.md#queueClientTargetQueueNameDelete) | **DELETE** /queue/{client}/{target}/{queueName} | Delete a specific named queue |
| [**queueClientTargetQueueNameGet**](QueueApi.md#queueClientTargetQueueNameGet) | **GET** /queue/{client}/{target}/{queueName} | Gets information about a specific named queue. |
| [**queueClientTargetQueueNameMessagesGet**](QueueApi.md#queueClientTargetQueueNameMessagesGet) | **GET** /queue/{client}/{target}/{queueName}/messages | Gets one or more messages from the queue |
| [**queueClientTargetQueueNameMessagesPost**](QueueApi.md#queueClientTargetQueueNameMessagesPost) | **POST** /queue/{client}/{target}/{queueName}/messages | Add a message to the named queue |
| [**queueClientTargetQueueNamePost**](QueueApi.md#queueClientTargetQueueNamePost) | **POST** /queue/{client}/{target}/{queueName} | Create a new queue, passing a block of JSON that is associated with the queue |
| [**queueClientTargetQueueNamePurgePost**](QueueApi.md#queueClientTargetQueueNamePurgePost) | **POST** /queue/{client}/{target}/{queueName}/purge | Remove all messages from the named queue |
| [**queueClientTargetQueueNamePut**](QueueApi.md#queueClientTargetQueueNamePut) | **PUT** /queue/{client}/{target}/{queueName} | Edit an existing queue |
| [**queueGet**](QueueApi.md#queueGet) | **GET** /queue | Get information about all queues on the server. |


<a id="queueClientDelete"></a>
# **queueClientDelete**
> ModelApiResponse queueClientDelete(client)

Delete all queues that this client owns.

Delete all queues that this client owns, across all targets.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    try {
      ModelApiResponse result = apiInstance.queueClientDelete(client);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientDelete");
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

<a id="queueClientGet"></a>
# **queueClientGet**
> ModelApiResponse queueClientGet(client, from, to, includeStatistics)

Get all of the queues for a specific client, across all targets.

Find the full details of all queues that this client owns, across all targets

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    try {
      ModelApiResponse result = apiInstance.queueClientGet(client, from, to, includeStatistics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientGet");
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
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |

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

<a id="queueClientTargetDelete"></a>
# **queueClientTargetDelete**
> ModelApiResponse queueClientTargetDelete(client, target)

Delete all of the queues within a specific target for the given client

Delete all of the queues within a specific target for the given client

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    try {
      ModelApiResponse result = apiInstance.queueClientTargetDelete(client, target);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetDelete");
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

<a id="queueClientTargetGet"></a>
# **queueClientTargetGet**
> ModelApiResponse queueClientTargetGet(client, target, from, to, includeStatistics)

Get details about all of the queues within a specific target for this client.

Get details about all of the queues within a specific target for this client.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    try {
      ModelApiResponse result = apiInstance.queueClientTargetGet(client, target, from, to, includeStatistics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetGet");
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
| **from** | **Integer**| The zero-based index of the first item to return. | [optional] |
| **to** | **Integer**| The zero-based index of the last item to return. | [optional] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |

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

<a id="queueClientTargetQueueNameAckPost"></a>
# **queueClientTargetQueueNameAckPost**
> ModelApiResponse queueClientTargetQueueNameAckPost(client, target, queueName, ackMessage)

Remove a set of messages from a given queue.

If the message was read with &#39;deleteAfterRead&#x3D;false&#39; then you must call this API to remove the message   from the queue after your code has successfully processed it

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | The client name for the queue
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | The target in which the queue is located
    String queueName = ""; // String | The name of queue which contains the message you want to acknowledge
    List<AckMessage> ackMessage = Arrays.asList(); // List<AckMessage> | 
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNameAckPost(client, target, queueName, ackMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNameAckPost");
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
| **client** | **String**| The client name for the queue | |
| **target** | [**TargetEnum**](.md)| The target in which the queue is located | [enum: dev, test, prod] |
| **queueName** | **String**| The name of queue which contains the message you want to acknowledge | [default to ] |
| **ackMessage** | [**List&lt;AckMessage&gt;**](AckMessage.md)|  | [optional] |

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

<a id="queueClientTargetQueueNameDelete"></a>
# **queueClientTargetQueueNameDelete**
> ModelApiResponse queueClientTargetQueueNameDelete(client, target, queueName)

Delete a specific named queue

Delete a queue and all the messages within it

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String queueName = "queueName_example"; // String | The name of the queue that should be deleted.
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNameDelete(client, target, queueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNameDelete");
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
| **queueName** | **String**| The name of the queue that should be deleted. | |

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

<a id="queueClientTargetQueueNameGet"></a>
# **queueClientTargetQueueNameGet**
> ModelApiResponse queueClientTargetQueueNameGet(client, target, queueName, includeStatistics)

Gets information about a specific named queue.

Information returned is filtered by user permissions.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is where rule is published.
    String queueName = ""; // String | The name of queue that you want to get the information for.
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNameGet(client, target, queueName, includeStatistics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNameGet");
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
| **queueName** | **String**| The name of queue that you want to get the information for. | [default to ] |
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |

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

<a id="queueClientTargetQueueNameMessagesGet"></a>
# **queueClientTargetQueueNameMessagesGet**
> ModelApiResponse queueClientTargetQueueNameMessagesGet(client, target, queueName, numberOfMessages, maxWaitTimeInSeconds, deleteAfterRead, lock)

Gets one or more messages from the queue

Return a JSON array containing zero or more messages

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - the target of where the queue is stored.
    String queueName = "queueName_example"; // String | The name of the queue to read messages from
    Integer numberOfMessages = 56; // Integer | The number of messages to read in this request. Default 1. If messages are bundled together then more   messages may be returned than requested. If deleteAfterRead is false then the maximum is 10, and you must call `POST   /queue/{client}/{target}/{queueName}/ack` on the current messages before any more will be available to read
    Integer maxWaitTimeInSeconds = 56; // Integer | If the queue currently contains fewer than the numberOfMessages requested, how long (in seconds)   should we wait for new messages to arrive? Default 0
    Boolean deleteAfterRead = true; // Boolean | Should the messages being read be automatically removed from the queue? Default true. If this is   false then the `POST /queue/{client}/{target}/{queueName}/ack` API must be called with the message details once the   data has been processed
    String lock = "lock_example"; // String | If the queue is locked, you must provide the key in this parameter
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNameMessagesGet(client, target, queueName, numberOfMessages, maxWaitTimeInSeconds, deleteAfterRead, lock);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNameMessagesGet");
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
| **target** | [**TargetEnum**](.md)| Target - the target of where the queue is stored. | [enum: dev, test, prod] |
| **queueName** | **String**| The name of the queue to read messages from | |
| **numberOfMessages** | **Integer**| The number of messages to read in this request. Default 1. If messages are bundled together then more   messages may be returned than requested. If deleteAfterRead is false then the maximum is 10, and you must call &#x60;POST   /queue/{client}/{target}/{queueName}/ack&#x60; on the current messages before any more will be available to read | [optional] |
| **maxWaitTimeInSeconds** | **Integer**| If the queue currently contains fewer than the numberOfMessages requested, how long (in seconds)   should we wait for new messages to arrive? Default 0 | [optional] |
| **deleteAfterRead** | **Boolean**| Should the messages being read be automatically removed from the queue? Default true. If this is   false then the &#x60;POST /queue/{client}/{target}/{queueName}/ack&#x60; API must be called with the message details once the   data has been processed | [optional] |
| **lock** | **String**| If the queue is locked, you must provide the key in this parameter | [optional] |

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

<a id="queueClientTargetQueueNameMessagesPost"></a>
# **queueClientTargetQueueNameMessagesPost**
> ModelApiResponse queueClientTargetQueueNameMessagesPost(client, target, queueName, body)

Add a message to the named queue

Used for posting messages to a queue. The data passed in the message is not validated in any way

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - the target of where the queue is stored.
    String queueName = "queueName_example"; // String | The name of the queue that the message will be posted to..
    String body = "body_example"; // String | The message that should be posted on to the queue.
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNameMessagesPost(client, target, queueName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNameMessagesPost");
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
| **target** | [**TargetEnum**](.md)| Target - the target of where the queue is stored. | [enum: dev, test, prod] |
| **queueName** | **String**| The name of the queue that the message will be posted to.. | |
| **body** | **String**| The message that should be posted on to the queue. | |

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

<a id="queueClientTargetQueueNamePost"></a>
# **queueClientTargetQueueNamePost**
> ModelApiResponse queueClientTargetQueueNamePost(client, target, queueName, body)

Create a new queue, passing a block of JSON that is associated with the queue

Used for creating a new queue.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | The name of the client.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is what the queue will be tagged with.
    String queueName = "queueName_example"; // String | The name of the queue that should be created.
    String body = {"fifo":true,"schema":[{"dataType":"integer","name":"custid"}]}; // String | A block of JSON that contains information about the contents of the messages in the queue
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNamePost(client, target, queueName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNamePost");
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
| **client** | **String**| The name of the client. | |
| **target** | [**TargetEnum**](.md)| Target - is what the queue will be tagged with. | [enum: dev, test, prod] |
| **queueName** | **String**| The name of the queue that should be created. | |
| **body** | **String**| A block of JSON that contains information about the contents of the messages in the queue | |

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

<a id="queueClientTargetQueueNamePurgePost"></a>
# **queueClientTargetQueueNamePurgePost**
> ModelApiResponse queueClientTargetQueueNamePurgePost(client, target, queueName)

Remove all messages from the named queue

Used to clear messages from a queue.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | Client name
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - the target of where the queue is stored.
    String queueName = "queueName_example"; // String | The name of the queue that the message will be posted to..
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNamePurgePost(client, target, queueName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNamePurgePost");
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
| **target** | [**TargetEnum**](.md)| Target - the target of where the queue is stored. | [enum: dev, test, prod] |
| **queueName** | **String**| The name of the queue that the message will be posted to.. | |

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

<a id="queueClientTargetQueueNamePut"></a>
# **queueClientTargetQueueNamePut**
> ModelApiResponse queueClientTargetQueueNamePut(client, target, queueName, body)

Edit an existing queue

Edit the block of JSON that is associated with the queue. This is only permitted if the queue is empty   (has zero messages)

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    String client = "client_example"; // String | The name of the client.
    TargetEnum target = TargetEnum.fromValue("dev"); // TargetEnum | Target - is what the queue will be tagged with.
    String queueName = "queueName_example"; // String | The name of the queue that should be created.
    String body = {"fifo":true,"schema":[{"dataType":"integer","name":"custid"}]}; // String | A block of JSON that contains information about the contents of the messages in the queue
    try {
      ModelApiResponse result = apiInstance.queueClientTargetQueueNamePut(client, target, queueName, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueClientTargetQueueNamePut");
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
| **client** | **String**| The name of the client. | |
| **target** | [**TargetEnum**](.md)| Target - is what the queue will be tagged with. | [enum: dev, test, prod] |
| **queueName** | **String**| The name of the queue that should be created. | |
| **body** | **String**| A block of JSON that contains information about the contents of the messages in the queue | |

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

<a id="queueGet"></a>
# **queueGet**
> ModelApiResponse queueGet(from, to, includeStatistics)

Get information about all queues on the server.

Get information about all queues that this user can access.

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.QueueApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    QueueApi apiInstance = new QueueApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean includeStatistics = true; // Boolean | Should the results include the execution statistics for each rule? Default true
    try {
      ModelApiResponse result = apiInstance.queueGet(from, to, includeStatistics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QueueApi#queueGet");
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
| **includeStatistics** | **Boolean**| Should the results include the execution statistics for each rule? Default true | [optional] |

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

