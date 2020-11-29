# MarginStreamApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sapiV1UserDataStreamDelete**](MarginStreamApi.md#sapiV1UserDataStreamDelete) | **DELETE** /sapi/v1/userDataStream | Close a ListenKey (USER_STREAM)
[**sapiV1UserDataStreamPost**](MarginStreamApi.md#sapiV1UserDataStreamPost) | **POST** /sapi/v1/userDataStream | Create a ListenKey (USER_STREAM)
[**sapiV1UserDataStreamPut**](MarginStreamApi.md#sapiV1UserDataStreamPut) | **PUT** /sapi/v1/userDataStream | Ping/Keep-alive a ListenKey (USER_STREAM)

<a name="sapiV1UserDataStreamDelete"></a>
# **sapiV1UserDataStreamDelete**
> Object sapiV1UserDataStreamDelete(listenKey)

Close a ListenKey (USER_STREAM)

Close out a user data stream. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginStreamApi;


MarginStreamApi apiInstance = new MarginStreamApi();
String listenKey = "listenKey_example"; // String | User websocket listen key
try {
    Object result = apiInstance.sapiV1UserDataStreamDelete(listenKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginStreamApi#sapiV1UserDataStreamDelete");
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

<a name="sapiV1UserDataStreamPost"></a>
# **sapiV1UserDataStreamPost**
> InlineResponse20031 sapiV1UserDataStreamPost()

Create a ListenKey (USER_STREAM)

Start a new user data stream.  The stream will close after 60 minutes unless a keepalive is sent. If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginStreamApi;


MarginStreamApi apiInstance = new MarginStreamApi();
try {
    InlineResponse20031 result = apiInstance.sapiV1UserDataStreamPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginStreamApi#sapiV1UserDataStreamPost");
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

<a name="sapiV1UserDataStreamPut"></a>
# **sapiV1UserDataStreamPut**
> Object sapiV1UserDataStreamPut(listenKey)

Ping/Keep-alive a ListenKey (USER_STREAM)

Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes. It&#x27;s recommended to send a ping about every 30 minutes. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginStreamApi;


MarginStreamApi apiInstance = new MarginStreamApi();
String listenKey = "listenKey_example"; // String | User websocket listen key
try {
    Object result = apiInstance.sapiV1UserDataStreamPut(listenKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginStreamApi#sapiV1UserDataStreamPut");
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

