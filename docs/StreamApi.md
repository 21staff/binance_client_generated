# StreamApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3UserDataStreamDelete**](StreamApi.md#apiV3UserDataStreamDelete) | **DELETE** /api/v3/userDataStream | Close a ListenKey (USER_STREAM)
[**apiV3UserDataStreamPost**](StreamApi.md#apiV3UserDataStreamPost) | **POST** /api/v3/userDataStream | Create a ListenKey (USER_STREAM)
[**apiV3UserDataStreamPut**](StreamApi.md#apiV3UserDataStreamPut) | **PUT** /api/v3/userDataStream | Ping/Keep-alive a ListenKey (USER_STREAM)

<a name="apiV3UserDataStreamDelete"></a>
# **apiV3UserDataStreamDelete**
> Object apiV3UserDataStreamDelete(listenKey)

Close a ListenKey (USER_STREAM)

Close out a user data stream. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamApi;


StreamApi apiInstance = new StreamApi();
String listenKey = "listenKey_example"; // String | User websocket listen key
try {
    Object result = apiInstance.apiV3UserDataStreamDelete(listenKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamApi#apiV3UserDataStreamDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listenKey** | **String**| User websocket listen key | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3UserDataStreamPost"></a>
# **apiV3UserDataStreamPost**
> InlineResponse20031 apiV3UserDataStreamPost()

Create a ListenKey (USER_STREAM)

Start a new user data stream.  The stream will close after 60 minutes unless a keepalive is sent. If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamApi;


StreamApi apiInstance = new StreamApi();
try {
    InlineResponse20031 result = apiInstance.apiV3UserDataStreamPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamApi#apiV3UserDataStreamPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3UserDataStreamPut"></a>
# **apiV3UserDataStreamPut**
> Object apiV3UserDataStreamPut(listenKey)

Ping/Keep-alive a ListenKey (USER_STREAM)

Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes. It&#x27;s recommended to send a ping about every 30 minutes. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StreamApi;


StreamApi apiInstance = new StreamApi();
String listenKey = "listenKey_example"; // String | User websocket listen key
try {
    Object result = apiInstance.apiV3UserDataStreamPut(listenKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamApi#apiV3UserDataStreamPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listenKey** | **String**| User websocket listen key | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

