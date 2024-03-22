# AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authPermissionGet**](AuthApi.md#authPermissionGet) | **GET** /auth/permission | Get a list of all permissions |
| [**authRoleGet**](AuthApi.md#authRoleGet) | **GET** /auth/role | Get a list of roles |
| [**authRoleNameClientClientNameDelete**](AuthApi.md#authRoleNameClientClientNameDelete) | **DELETE** /auth/role/{name}/client/{clientName} | Remove client from a role |
| [**authRoleNameClientClientNamePost**](AuthApi.md#authRoleNameClientClientNamePost) | **POST** /auth/role/{name}/client/{clientName} | Add client to a role |
| [**authRoleNameClientGet**](AuthApi.md#authRoleNameClientGet) | **GET** /auth/role/{name}/client | Get the list of clients for a role |
| [**authRoleNameDelete**](AuthApi.md#authRoleNameDelete) | **DELETE** /auth/role/{name} | Remove a role |
| [**authRoleNameGet**](AuthApi.md#authRoleNameGet) | **GET** /auth/role/{name} | Get information about a specific role |
| [**authRoleNamePermissionDelete**](AuthApi.md#authRoleNamePermissionDelete) | **DELETE** /auth/role/{name}/{permission} | Remove permission from a role |
| [**authRoleNamePermissionGet**](AuthApi.md#authRoleNamePermissionGet) | **GET** /auth/role/{name}/permission | Get the list of permissions granted by a specific role |
| [**authRoleNamePermissionPost**](AuthApi.md#authRoleNamePermissionPost) | **POST** /auth/role/{name}/{permission} | Add permission to a role |
| [**authRolePost**](AuthApi.md#authRolePost) | **POST** /auth/role | Create a new role |
| [**authSiteGet**](AuthApi.md#authSiteGet) | **GET** /auth/site | Get a list of sites |
| [**authSiteIdDelete**](AuthApi.md#authSiteIdDelete) | **DELETE** /auth/site/{id} | Remove a site |
| [**authSiteIdGet**](AuthApi.md#authSiteIdGet) | **GET** /auth/site/{id} | Get information about specified site |
| [**authSiteIdUserGet**](AuthApi.md#authSiteIdUserGet) | **GET** /auth/site/{id}/user | Get the list of site users |
| [**authSiteIdUserNameDelete**](AuthApi.md#authSiteIdUserNameDelete) | **DELETE** /auth/site/{id}/user/{name} | Remove user from a site |
| [**authSiteIdUserNamePost**](AuthApi.md#authSiteIdUserNamePost) | **POST** /auth/site/{id}/user/{name} | Add user to a site |
| [**authSitePost**](AuthApi.md#authSitePost) | **POST** /auth/site | Create a new site |
| [**authUserGet**](AuthApi.md#authUserGet) | **GET** /auth/user | Get a list of users |
| [**authUserNameClientClientNameDelete**](AuthApi.md#authUserNameClientClientNameDelete) | **DELETE** /auth/user/{name}/client/{clientName} | Remove client access from user |
| [**authUserNameClientClientNamePost**](AuthApi.md#authUserNameClientClientNamePost) | **POST** /auth/user/{name}/client/{clientName} | Add client access to user |
| [**authUserNameClientGet**](AuthApi.md#authUserNameClientGet) | **GET** /auth/user/{name}/client | Get the list of clients to which a user has been granted access |
| [**authUserNameDelete**](AuthApi.md#authUserNameDelete) | **DELETE** /auth/user/{name} | Remove a user |
| [**authUserNameGet**](AuthApi.md#authUserNameGet) | **GET** /auth/user/{name} | Get information about specified user |
| [**authUserNamePermissionGet**](AuthApi.md#authUserNamePermissionGet) | **GET** /auth/user/{name}/permission | Get the list of user permission |
| [**authUserNamePermissionPermissionDelete**](AuthApi.md#authUserNamePermissionPermissionDelete) | **DELETE** /auth/user/{name}/permission/{permission} | Remove permission from a user |
| [**authUserNamePermissionPermissionPost**](AuthApi.md#authUserNamePermissionPermissionPost) | **POST** /auth/user/{name}/permission/{permission} | Add permission to a user |
| [**authUserNameRoleGet**](AuthApi.md#authUserNameRoleGet) | **GET** /auth/user/{name}/role | Get the list of the roles which have been assigned to a user |
| [**authUserNameRoleRoleNameDelete**](AuthApi.md#authUserNameRoleRoleNameDelete) | **DELETE** /auth/user/{name}/role/{roleName} | Remove role from a user |
| [**authUserNameRoleRoleNamePost**](AuthApi.md#authUserNameRoleRoleNamePost) | **POST** /auth/user/{name}/role/{roleName} | Assign role to user |
| [**authUserNameTokenTokenNameDelete**](AuthApi.md#authUserNameTokenTokenNameDelete) | **DELETE** /auth/user/{name}/token/{tokenName} | Remove static access token from user |
| [**authUserNameTokenTokenNamePost**](AuthApi.md#authUserNameTokenTokenNamePost) | **POST** /auth/user/{name}/token/{tokenName} | Add static access token to user |
| [**authUserPost**](AuthApi.md#authUserPost) | **POST** /auth/user | Create a new user |


<a id="authPermissionGet"></a>
# **authPermissionGet**
> PermissionList authPermissionGet(from, to)

Get a list of all permissions

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      PermissionList result = apiInstance.authPermissionGet(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authPermissionGet");
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

[**PermissionList**](PermissionList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Permissions that the system knows about |  -  |

<a id="authRoleGet"></a>
# **authRoleGet**
> RoleList authRoleGet(from, to)

Get a list of roles

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      RoleList result = apiInstance.authRoleGet(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleGet");
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

[**RoleList**](RoleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Roles that the system knows about |  -  |

<a id="authRoleNameClientClientNameDelete"></a>
# **authRoleNameClientClientNameDelete**
> ModelApiResponse authRoleNameClientClientNameDelete(name, clientName)

Remove client from a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role Name
    String clientName = "clientName_example"; // String | Client that will have this role removed from it
    try {
      ModelApiResponse result = apiInstance.authRoleNameClientClientNameDelete(name, clientName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNameClientClientNameDelete");
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
| **name** | **String**| Role Name | |
| **clientName** | **String**| Client that will have this role removed from it | |

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

<a id="authRoleNameClientClientNamePost"></a>
# **authRoleNameClientClientNamePost**
> ModelApiResponse authRoleNameClientClientNamePost(name, clientName)

Add client to a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role Name
    String clientName = "clientName_example"; // String | Client to add
    try {
      ModelApiResponse result = apiInstance.authRoleNameClientClientNamePost(name, clientName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNameClientClientNamePost");
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
| **name** | **String**| Role Name | |
| **clientName** | **String**| Client to add | |

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

<a id="authRoleNameClientGet"></a>
# **authRoleNameClientGet**
> RefList authRoleNameClientGet(name)

Get the list of clients for a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role Name
    try {
      RefList result = apiInstance.authRoleNameClientGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNameClientGet");
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
| **name** | **String**| Role Name | |

### Return type

[**RefList**](RefList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authRoleNameDelete"></a>
# **authRoleNameDelete**
> ModelApiResponse authRoleNameDelete(name)

Remove a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Name of role to delete
    try {
      ModelApiResponse result = apiInstance.authRoleNameDelete(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNameDelete");
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
| **name** | **String**| Name of role to delete | |

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

<a id="authRoleNameGet"></a>
# **authRoleNameGet**
> RoleList authRoleNameGet(name)

Get information about a specific role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | The role to retrieve
    try {
      RoleList result = apiInstance.authRoleNameGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNameGet");
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
| **name** | **String**| The role to retrieve | |

### Return type

[**RoleList**](RoleList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authRoleNamePermissionDelete"></a>
# **authRoleNamePermissionDelete**
> ModelApiResponse authRoleNamePermissionDelete(name, permission)

Remove permission from a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role to alter
    String permission = "permission_example"; // String | Permission to remove from role
    try {
      ModelApiResponse result = apiInstance.authRoleNamePermissionDelete(name, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNamePermissionDelete");
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
| **name** | **String**| Role to alter | |
| **permission** | **String**| Permission to remove from role | |

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

<a id="authRoleNamePermissionGet"></a>
# **authRoleNamePermissionGet**
> PermissionList authRoleNamePermissionGet(name)

Get the list of permissions granted by a specific role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role Name
    try {
      PermissionList result = apiInstance.authRoleNamePermissionGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNamePermissionGet");
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
| **name** | **String**| Role Name | |

### Return type

[**PermissionList**](PermissionList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authRoleNamePermissionPost"></a>
# **authRoleNamePermissionPost**
> ModelApiResponse authRoleNamePermissionPost(name, permission)

Add permission to a role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | Role to alter
    String permission = "permission_example"; // String | Permission to add
    try {
      ModelApiResponse result = apiInstance.authRoleNamePermissionPost(name, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRoleNamePermissionPost");
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
| **name** | **String**| Role to alter | |
| **permission** | **String**| Permission to add | |

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

<a id="authRolePost"></a>
# **authRolePost**
> ModelApiResponse authRolePost(role)

Create a new role

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Role role = new Role(); // Role | 
    try {
      ModelApiResponse result = apiInstance.authRolePost(role);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authRolePost");
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
| **role** | [**Role**](Role.md)|  | |

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

<a id="authSiteGet"></a>
# **authSiteGet**
> SiteList authSiteGet(from, to)

Get a list of sites

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    try {
      SiteList result = apiInstance.authSiteGet(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteGet");
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

[**SiteList**](SiteList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authSiteIdDelete"></a>
# **authSiteIdDelete**
> ModelApiResponse authSiteIdDelete(id)

Remove a site

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String id = "id_example"; // String | Site identifer
    try {
      ModelApiResponse result = apiInstance.authSiteIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteIdDelete");
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
| **id** | **String**| Site identifer | |

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

<a id="authSiteIdGet"></a>
# **authSiteIdGet**
> SiteList authSiteIdGet(id)

Get information about specified site

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String id = "id_example"; // String | The site to retrieve
    try {
      SiteList result = apiInstance.authSiteIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteIdGet");
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
| **id** | **String**| The site to retrieve | |

### Return type

[**SiteList**](SiteList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authSiteIdUserGet"></a>
# **authSiteIdUserGet**
> RefList authSiteIdUserGet(id)

Get the list of site users

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String id = "id_example"; // String | Site identifier
    try {
      RefList result = apiInstance.authSiteIdUserGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteIdUserGet");
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
| **id** | **String**| Site identifier | |

### Return type

[**RefList**](RefList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authSiteIdUserNameDelete"></a>
# **authSiteIdUserNameDelete**
> ModelApiResponse authSiteIdUserNameDelete(id, name)

Remove user from a site

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String id = "id_example"; // String | Site identifier
    String name = "name_example"; // String | User to remove from site
    try {
      ModelApiResponse result = apiInstance.authSiteIdUserNameDelete(id, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteIdUserNameDelete");
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
| **id** | **String**| Site identifier | |
| **name** | **String**| User to remove from site | |

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

<a id="authSiteIdUserNamePost"></a>
# **authSiteIdUserNamePost**
> ModelApiResponse authSiteIdUserNamePost(id, name)

Add user to a site

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String id = "id_example"; // String | Site identifier
    String name = "name_example"; // String | User Name
    try {
      ModelApiResponse result = apiInstance.authSiteIdUserNamePost(id, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSiteIdUserNamePost");
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
| **id** | **String**| Site identifier | |
| **name** | **String**| User Name | |

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

<a id="authSitePost"></a>
# **authSitePost**
> ModelApiResponse authSitePost(body)

Create a new site

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String body = {"extendedInfo":"a site","siteId":"abcde-12345"}; // String | A block of JSON describing the resource to create
    try {
      ModelApiResponse result = apiInstance.authSitePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authSitePost");
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
| **body** | **String**| A block of JSON describing the resource to create | |

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

<a id="authUserGet"></a>
# **authUserGet**
> UserList authUserGet(from, to, getAllDetails)

Get a list of users

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    Integer from = 56; // Integer | The zero-based index of the first item to return.
    Integer to = 56; // Integer | The zero-based index of the last item to return.
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of user tokens. (default) false will return only token names
    try {
      UserList result = apiInstance.authUserGet(from, to, getAllDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserGet");
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
| **getAllDetails** | **Boolean**| Do we want to retrieve details of user tokens. (default) false will return only token names | [optional] |

### Return type

[**UserList**](UserList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authUserNameClientClientNameDelete"></a>
# **authUserNameClientClientNameDelete**
> ModelApiResponse authUserNameClientClientNameDelete(name, clientName)

Remove client access from user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    String clientName = "clientName_example"; // String | Client to remove from user
    try {
      ModelApiResponse result = apiInstance.authUserNameClientClientNameDelete(name, clientName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameClientClientNameDelete");
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
| **name** | **String**| user Name | |
| **clientName** | **String**| Client to remove from user | |

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

<a id="authUserNameClientClientNamePost"></a>
# **authUserNameClientClientNamePost**
> ModelApiResponse authUserNameClientClientNamePost(name, clientName)

Add client access to user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | User Name
    String clientName = "clientName_example"; // String | Client name
    try {
      ModelApiResponse result = apiInstance.authUserNameClientClientNamePost(name, clientName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameClientClientNamePost");
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
| **name** | **String**| User Name | |
| **clientName** | **String**| Client name | |

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

<a id="authUserNameClientGet"></a>
# **authUserNameClientGet**
> RefList authUserNameClientGet(name)

Get the list of clients to which a user has been granted access

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    try {
      RefList result = apiInstance.authUserNameClientGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameClientGet");
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
| **name** | **String**| user Name | |

### Return type

[**RefList**](RefList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authUserNameDelete"></a>
# **authUserNameDelete**
> ModelApiResponse authUserNameDelete(name)

Remove a user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    try {
      ModelApiResponse result = apiInstance.authUserNameDelete(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameDelete");
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
| **name** | **String**| user Name | |

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

<a id="authUserNameGet"></a>
# **authUserNameGet**
> UserList authUserNameGet(name, getAllDetails)

Get information about specified user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | The user to retrieve
    Boolean getAllDetails = true; // Boolean | Do we want to retrieve details of user tokens. (default) false will return only token names
    try {
      UserList result = apiInstance.authUserNameGet(name, getAllDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameGet");
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
| **name** | **String**| The user to retrieve | |
| **getAllDetails** | **Boolean**| Do we want to retrieve details of user tokens. (default) false will return only token names | [optional] |

### Return type

[**UserList**](UserList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authUserNamePermissionGet"></a>
# **authUserNamePermissionGet**
> PermissionList authUserNamePermissionGet(name)

Get the list of user permission

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    try {
      PermissionList result = apiInstance.authUserNamePermissionGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNamePermissionGet");
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
| **name** | **String**| user Name | |

### Return type

[**PermissionList**](PermissionList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authUserNamePermissionPermissionDelete"></a>
# **authUserNamePermissionPermissionDelete**
> ModelApiResponse authUserNamePermissionPermissionDelete(name, permission)

Remove permission from a user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    String permission = "permission_example"; // String | Permission to remove from user
    try {
      ModelApiResponse result = apiInstance.authUserNamePermissionPermissionDelete(name, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNamePermissionPermissionDelete");
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
| **name** | **String**| user Name | |
| **permission** | **String**| Permission to remove from user | |

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

<a id="authUserNamePermissionPermissionPost"></a>
# **authUserNamePermissionPermissionPost**
> ModelApiResponse authUserNamePermissionPermissionPost(name, permission)

Add permission to a user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | User Name
    String permission = "permission_example"; // String | Permission to add to user
    try {
      ModelApiResponse result = apiInstance.authUserNamePermissionPermissionPost(name, permission);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNamePermissionPermissionPost");
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
| **name** | **String**| User Name | |
| **permission** | **String**| Permission to add to user | |

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

<a id="authUserNameRoleGet"></a>
# **authUserNameRoleGet**
> RefList authUserNameRoleGet(name)

Get the list of the roles which have been assigned to a user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    try {
      RefList result = apiInstance.authUserNameRoleGet(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameRoleGet");
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
| **name** | **String**| user Name | |

### Return type

[**RefList**](RefList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authUserNameRoleRoleNameDelete"></a>
# **authUserNameRoleRoleNameDelete**
> ModelApiResponse authUserNameRoleRoleNameDelete(name, roleName)

Remove role from a user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    String roleName = "roleName_example"; // String | Role to remove from user
    try {
      ModelApiResponse result = apiInstance.authUserNameRoleRoleNameDelete(name, roleName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameRoleRoleNameDelete");
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
| **name** | **String**| user Name | |
| **roleName** | **String**| Role to remove from user | |

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

<a id="authUserNameRoleRoleNamePost"></a>
# **authUserNameRoleRoleNamePost**
> ModelApiResponse authUserNameRoleRoleNamePost(name, roleName)

Assign role to user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    String roleName = "roleName_example"; // String | Role to add
    try {
      ModelApiResponse result = apiInstance.authUserNameRoleRoleNamePost(name, roleName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameRoleRoleNamePost");
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
| **name** | **String**| user Name | |
| **roleName** | **String**| Role to add | |

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

<a id="authUserNameTokenTokenNameDelete"></a>
# **authUserNameTokenTokenNameDelete**
> ModelApiResponse authUserNameTokenTokenNameDelete(name, tokenName)

Remove static access token from user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | user Name
    String tokenName = "tokenName_example"; // String | Descriptive name for the token
    try {
      ModelApiResponse result = apiInstance.authUserNameTokenTokenNameDelete(name, tokenName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameTokenTokenNameDelete");
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
| **name** | **String**| user Name | |
| **tokenName** | **String**| Descriptive name for the token | |

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

<a id="authUserNameTokenTokenNamePost"></a>
# **authUserNameTokenTokenNamePost**
> ModelApiResponse authUserNameTokenTokenNamePost(name, tokenName)

Add static access token to user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String name = "name_example"; // String | User Name
    String tokenName = "tokenName_example"; // String | Descriptive name for the token
    try {
      ModelApiResponse result = apiInstance.authUserNameTokenTokenNamePost(name, tokenName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserNameTokenTokenNamePost");
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
| **name** | **String**| User Name | |
| **tokenName** | **String**| Descriptive name for the token | |

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

<a id="authUserPost"></a>
# **authUserPost**
> ModelApiResponse authUserPost(body)

Create a new user

### Example
```java
// Import classes:
import com.alterian.jo.ApiClient;
import com.alterian.jo.ApiException;
import com.alterian.jo.Configuration;
import com.alterian.jo.auth.*;
import com.alterian.jo.models.*;
import com.alterian.jo.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String body = {"name":"name"}; // String | A block of JSON describing the resource to create
    try {
      ModelApiResponse result = apiInstance.authUserPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#authUserPost");
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
| **body** | **String**| A block of JSON describing the resource to create | |

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

