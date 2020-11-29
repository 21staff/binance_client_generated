# MarginApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sapiV1MarginAccountGet**](MarginApi.md#sapiV1MarginAccountGet) | **GET** /sapi/v1/margin/account | Query Margin Account Details (USER_DATA)
[**sapiV1MarginAllAssetsGet**](MarginApi.md#sapiV1MarginAllAssetsGet) | **GET** /sapi/v1/margin/allAssets | Get All Margin Assets (MARKET_DATA)
[**sapiV1MarginAllOrdersGet**](MarginApi.md#sapiV1MarginAllOrdersGet) | **GET** /sapi/v1/margin/allOrders | Query Margin Account&#x27;s All Order (USER_DATA)
[**sapiV1MarginAllPairsGet**](MarginApi.md#sapiV1MarginAllPairsGet) | **GET** /sapi/v1/margin/allPairs | Get All Margin Pairs (MARKET_DATA)
[**sapiV1MarginAssetGet**](MarginApi.md#sapiV1MarginAssetGet) | **GET** /sapi/v1/margin/asset | Query Margin Asset (MARKET_DATA)
[**sapiV1MarginForceLiquidationRecGet**](MarginApi.md#sapiV1MarginForceLiquidationRecGet) | **GET** /sapi/v1/margin/forceLiquidationRec | Get Force Liquidation Record (USER_DATA)
[**sapiV1MarginInterestHistoryGet**](MarginApi.md#sapiV1MarginInterestHistoryGet) | **GET** /sapi/v1/margin/interestHistory | Query Interest History (MARKET_DATA)
[**sapiV1MarginLoanGet**](MarginApi.md#sapiV1MarginLoanGet) | **GET** /sapi/v1/margin/loan | Query Load Record (USER_DATA)
[**sapiV1MarginLoanPost**](MarginApi.md#sapiV1MarginLoanPost) | **POST** /sapi/v1/margin/loan | Margin Account Borrow (MARGIN)
[**sapiV1MarginMaxBorrowableGet**](MarginApi.md#sapiV1MarginMaxBorrowableGet) | **GET** /sapi/v1/margin/maxBorrowable | Query Max Borrow (USER_DATA)
[**sapiV1MarginMaxTransferableGet**](MarginApi.md#sapiV1MarginMaxTransferableGet) | **GET** /sapi/v1/margin/maxTransferable | Query Max Transfer-Out Amount (USER_DATA)
[**sapiV1MarginMyTradesGet**](MarginApi.md#sapiV1MarginMyTradesGet) | **GET** /sapi/v1/margin/myTrades | If fromId is set, it will get orders &gt;&#x3D; that fromId. Otherwise most recent orders are returned.
[**sapiV1MarginOpenOrdersGet**](MarginApi.md#sapiV1MarginOpenOrdersGet) | **GET** /sapi/v1/margin/openOrders | Query Margin Account&#x27;s Open Order (USER_DATA)
[**sapiV1MarginOrderDelete**](MarginApi.md#sapiV1MarginOrderDelete) | **DELETE** /sapi/v1/margin/order | Margin Account Cancel Order (TRADE)
[**sapiV1MarginOrderGet**](MarginApi.md#sapiV1MarginOrderGet) | **GET** /sapi/v1/margin/order | Query Margin Account&#x27;s Order (MARKET_DATA)
[**sapiV1MarginOrderPost**](MarginApi.md#sapiV1MarginOrderPost) | **POST** /sapi/v1/margin/order | Margin Account New Order (TRADE)
[**sapiV1MarginPairGet**](MarginApi.md#sapiV1MarginPairGet) | **GET** /sapi/v1/margin/pair | Query Margin Pair (MARKET_DATA)
[**sapiV1MarginPriceIndexGet**](MarginApi.md#sapiV1MarginPriceIndexGet) | **GET** /sapi/v1/margin/priceIndex | Query Margin PriceIndex (MARKET_DATA)
[**sapiV1MarginRepayGet**](MarginApi.md#sapiV1MarginRepayGet) | **GET** /sapi/v1/margin/repay | Query Repay Record (USER_DATA)
[**sapiV1MarginRepayPost**](MarginApi.md#sapiV1MarginRepayPost) | **POST** /sapi/v1/margin/repay | Margin Account Repay (MARGIN)
[**sapiV1MarginTransferGet**](MarginApi.md#sapiV1MarginTransferGet) | **GET** /sapi/v1/margin/transfer | Get Transfer History (USER_DATA)
[**sapiV1MarginTransferPost**](MarginApi.md#sapiV1MarginTransferPost) | **POST** /sapi/v1/margin/transfer | Margin Account Transfer (MARGIN)

<a name="sapiV1MarginAccountGet"></a>
# **sapiV1MarginAccountGet**
> InlineResponse20017 sapiV1MarginAccountGet(timestamp, signature, recvWindow)

Query Margin Account Details (USER_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20017 result = apiInstance.sapiV1MarginAccountGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginAccountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginAllAssetsGet"></a>
# **sapiV1MarginAllAssetsGet**
> List&lt;InlineResponse20012&gt; sapiV1MarginAllAssetsGet()

Get All Margin Assets (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MarginApi apiInstance = new MarginApi();
try {
    List<InlineResponse20012> result = apiInstance.sapiV1MarginAllAssetsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginAllAssetsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginAllOrdersGet"></a>
# **sapiV1MarginAllOrdersGet**
> List&lt;MarginOrderDetail&gt; sapiV1MarginAllOrdersGet(symbol, timestamp, signature, orderId, startTime, endTime, limit, recvWindow)

Query Margin Account&#x27;s All Order (USER_DATA)

- If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<MarginOrderDetail> result = apiInstance.sapiV1MarginAllOrdersGet(symbol, timestamp, signature, orderId, startTime, endTime, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginAllOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **orderId** | **Integer**| order id | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;MarginOrderDetail&gt;**](MarginOrderDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginAllPairsGet"></a>
# **sapiV1MarginAllPairsGet**
> List&lt;InlineResponse20013&gt; sapiV1MarginAllPairsGet()

Get All Margin Pairs (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MarginApi apiInstance = new MarginApi();
try {
    List<InlineResponse20013> result = apiInstance.sapiV1MarginAllPairsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginAllPairsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20013&gt;**](InlineResponse20013.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginAssetGet"></a>
# **sapiV1MarginAssetGet**
> InlineResponse20010 sapiV1MarginAssetGet(asset)

Query Margin Asset (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
try {
    InlineResponse20010 result = apiInstance.sapiV1MarginAssetGet(asset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginAssetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginForceLiquidationRecGet"></a>
# **sapiV1MarginForceLiquidationRecGet**
> Object sapiV1MarginForceLiquidationRecGet(timestamp, signature, startTime, endTime, current, size, recvWindow)

Get Force Liquidation Record (USER_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
BigDecimal current = new BigDecimal(); // BigDecimal | Currently querying page. Start from 1. Default:1
BigDecimal size = new BigDecimal(); // BigDecimal | Default:10 Max:100
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.sapiV1MarginForceLiquidationRecGet(timestamp, signature, startTime, endTime, current, size, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginForceLiquidationRecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **current** | **BigDecimal**| Currently querying page. Start from 1. Default:1 | [optional]
 **size** | **BigDecimal**| Default:10 Max:100 | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginInterestHistoryGet"></a>
# **sapiV1MarginInterestHistoryGet**
> InlineResponse20016 sapiV1MarginInterestHistoryGet(timestamp, signature, asset, startTime, endTime, current, size, recvWindow)

Query Interest History (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
BigDecimal current = new BigDecimal(); // BigDecimal | Currently querying page. Start from 1. Default:1
BigDecimal size = new BigDecimal(); // BigDecimal | Default:10 Max:100
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20016 result = apiInstance.sapiV1MarginInterestHistoryGet(timestamp, signature, asset, startTime, endTime, current, size, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginInterestHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **asset** | **String**| The asset being transferred, e.g., BTC | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **current** | **BigDecimal**| Currently querying page. Start from 1. Default:1 | [optional]
 **size** | **BigDecimal**| Default:10 Max:100 | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginLoanGet"></a>
# **sapiV1MarginLoanGet**
> Object sapiV1MarginLoanGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow)

Query Load Record (USER_DATA)

&#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. txId takes precedence.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer txId = 56; // Integer | the tranId in  `POST /sapi/v1/margin/loan`
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
BigDecimal current = new BigDecimal(); // BigDecimal | Currently querying page. Start from 1. Default:1
BigDecimal size = new BigDecimal(); // BigDecimal | Default:10 Max:100
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.sapiV1MarginLoanGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginLoanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **txId** | **Integer**| the tranId in  &#x60;POST /sapi/v1/margin/loan&#x60; | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **current** | **BigDecimal**| Currently querying page. Start from 1. Default:1 | [optional]
 **size** | **BigDecimal**| Default:10 Max:100 | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginLoanPost"></a>
# **sapiV1MarginLoanPost**
> Transaction sapiV1MarginLoanPost(asset, amount, timestamp, signature, recvWindow)

Margin Account Borrow (MARGIN)

Apply for a loan.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Float amount = 3.4F; // Float | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Transaction result = apiInstance.sapiV1MarginLoanPost(asset, amount, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginLoanPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |
 **amount** | **Float**|  |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginMaxBorrowableGet"></a>
# **sapiV1MarginMaxBorrowableGet**
> Object sapiV1MarginMaxBorrowableGet(symbol, timestamp, signature, recvWindow)

Query Max Borrow (USER_DATA)

Weight: 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.sapiV1MarginMaxBorrowableGet(symbol, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginMaxBorrowableGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginMaxTransferableGet"></a>
# **sapiV1MarginMaxTransferableGet**
> Object sapiV1MarginMaxTransferableGet(symbol, timestamp, signature, recvWindow)

Query Max Transfer-Out Amount (USER_DATA)

Weight: 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.sapiV1MarginMaxTransferableGet(symbol, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginMaxTransferableGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginMyTradesGet"></a>
# **sapiV1MarginMyTradesGet**
> List&lt;MarginTrade&gt; sapiV1MarginMyTradesGet(symbol, timestamp, signature, startTime, endTime, fromId, limit, recvWindow)

If fromId is set, it will get orders &gt;&#x3D; that fromId. Otherwise most recent orders are returned.

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer fromId = 56; // Integer | Trade id to fetch from. Default gets most recent trades.
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<MarginTrade> result = apiInstance.sapiV1MarginMyTradesGet(symbol, timestamp, signature, startTime, endTime, fromId, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginMyTradesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **fromId** | **Integer**| Trade id to fetch from. Default gets most recent trades. | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;MarginTrade&gt;**](MarginTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginOpenOrdersGet"></a>
# **sapiV1MarginOpenOrdersGet**
> List&lt;MarginOrderDetail&gt; sapiV1MarginOpenOrdersGet(timestamp, signature, symbol, recvWindow)

Query Margin Account&#x27;s Open Order (USER_DATA)

- If the symbol is not sent, orders for all symbols will be returned in an array. - When all symbols are returned, the number of requests counted against the rate limiter is equal to the number of symbols currently trading on the exchange  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<MarginOrderDetail> result = apiInstance.sapiV1MarginOpenOrdersGet(timestamp, signature, symbol, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginOpenOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **symbol** | **String**| trading symbol, e.g. BNBUSDT | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;MarginOrderDetail&gt;**](MarginOrderDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginOrderDelete"></a>
# **sapiV1MarginOrderDelete**
> MarginOrder sapiV1MarginOrderDelete(symbol, timestamp, signature, orderId, origClientOrderId, newClientOrderId, recvWindow)

Margin Account Cancel Order (TRADE)

Cancel an active order for margin account.  Either orderId or origClientOrderId must be sent.  Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
String origClientOrderId = "origClientOrderId_example"; // String | order id from client
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    MarginOrder result = apiInstance.sapiV1MarginOrderDelete(symbol, timestamp, signature, orderId, origClientOrderId, newClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginOrderDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **orderId** | **Integer**| order id | [optional]
 **origClientOrderId** | **String**| order id from client | [optional]
 **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**MarginOrder**](MarginOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginOrderGet"></a>
# **sapiV1MarginOrderGet**
> MarginOrderDetail sapiV1MarginOrderGet(symbol, timestamp, signature, orderId, origClientOrderId, recvWindow)

Query Margin Account&#x27;s Order (MARKET_DATA)

- Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
String origClientOrderId = "origClientOrderId_example"; // String | order id from client
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    MarginOrderDetail result = apiInstance.sapiV1MarginOrderGet(symbol, timestamp, signature, orderId, origClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginOrderGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **orderId** | **Integer**| order id | [optional]
 **origClientOrderId** | **String**| order id from client | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**MarginOrderDetail**](MarginOrderDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginOrderPost"></a>
# **sapiV1MarginOrderPost**
> InlineResponse20015 sapiV1MarginOrderPost(symbol, side, type, quantity, timestamp, signature, price, stopPrice, newClientOrderId, icebergQty, newOrderRespType, sideEffectType, timeInForce, recvWindow)

Margin Account New Order (TRADE)

Post a new order for margin account.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
String side = "side_example"; // String | SELL or BUY
String type = "type_example"; // String | the order type
Float quantity = 3.4F; // Float | order quantity
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Float price = 3.4F; // Float | order price
Float stopPrice = 3.4F; // Float | Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Float icebergQty = 3.4F; // Float | Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order.
String newOrderRespType = "newOrderRespType_example"; // String | Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK.
String sideEffectType = "sideEffectType_example"; // String | default NO_SIDE_EFFECT
String timeInForce = "timeInForce_example"; // String | order time in force
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20015 result = apiInstance.sapiV1MarginOrderPost(symbol, side, type, quantity, timestamp, signature, price, stopPrice, newClientOrderId, icebergQty, newOrderRespType, sideEffectType, timeInForce, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginOrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **side** | **String**| SELL or BUY | [enum: SELL, BUY]
 **type** | **String**| the order type | [enum: LIMIT, MARKET, STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, TAKE_PROFIT_LIMIT, LIMIT_MAKER]
 **quantity** | **Float**| order quantity |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **price** | **Float**| order price | [optional]
 **stopPrice** | **Float**| Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. | [optional]
 **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional]
 **icebergQty** | **Float**| Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. | [optional]
 **newOrderRespType** | **String**| Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK. | [optional] [enum: ACK, RESULT, FULL]
 **sideEffectType** | **String**| default NO_SIDE_EFFECT | [optional] [enum: NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY]
 **timeInForce** | **String**| order time in force | [optional] [enum: GTC, IOC, FOK]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginPairGet"></a>
# **sapiV1MarginPairGet**
> InlineResponse20011 sapiV1MarginPairGet(symbol)

Query Margin Pair (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse20011 result = apiInstance.sapiV1MarginPairGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginPairGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginPriceIndexGet"></a>
# **sapiV1MarginPriceIndexGet**
> InlineResponse20014 sapiV1MarginPriceIndexGet(symbol)

Query Margin PriceIndex (MARKET_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarginApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MarginApi apiInstance = new MarginApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse20014 result = apiInstance.sapiV1MarginPriceIndexGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginPriceIndexGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginRepayGet"></a>
# **sapiV1MarginRepayGet**
> InlineResponse2009 sapiV1MarginRepayGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow)

Query Repay Record (USER_DATA)

&#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. txId takes precedence. Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer txId = 56; // Integer | the tranId in  `POST /sapi/v1/margin/repay`
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
BigDecimal current = new BigDecimal(); // BigDecimal | Currently querying page. Start from 1. Default:1
BigDecimal size = new BigDecimal(); // BigDecimal | Default:10 Max:100
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse2009 result = apiInstance.sapiV1MarginRepayGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginRepayGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **txId** | **Integer**| the tranId in  &#x60;POST /sapi/v1/margin/repay&#x60; | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **current** | **BigDecimal**| Currently querying page. Start from 1. Default:1 | [optional]
 **size** | **BigDecimal**| Default:10 Max:100 | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginRepayPost"></a>
# **sapiV1MarginRepayPost**
> Transaction sapiV1MarginRepayPost(asset, amount, timestamp, signature, recvWindow)

Margin Account Repay (MARGIN)

Repay loan for margin account.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Float amount = 3.4F; // Float | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Transaction result = apiInstance.sapiV1MarginRepayPost(asset, amount, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginRepayPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |
 **amount** | **Float**|  |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginTransferGet"></a>
# **sapiV1MarginTransferGet**
> Object sapiV1MarginTransferGet(timestamp, signature, asset, type, startTime, endTime, current, size, recvWindow)

Get Transfer History (USER_DATA)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
String type = "type_example"; // String | Tranfer Type
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
BigDecimal current = new BigDecimal(); // BigDecimal | Currently querying page. Start from 1. Default:1
BigDecimal size = new BigDecimal(); // BigDecimal | Default:10 Max:100
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.sapiV1MarginTransferGet(timestamp, signature, asset, type, startTime, endTime, current, size, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginTransferGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **asset** | **String**| The asset being transferred, e.g., BTC | [optional]
 **type** | **String**| Tranfer Type | [optional] [enum: ROLL_IN, ROLL_OUT]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **current** | **BigDecimal**| Currently querying page. Start from 1. Default:1 | [optional]
 **size** | **BigDecimal**| Default:10 Max:100 | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1MarginTransferPost"></a>
# **sapiV1MarginTransferPost**
> Transaction sapiV1MarginTransferPost(asset, amount, timestamp, signature, type, recvWindow)

Margin Account Transfer (MARGIN)

Execute transfer between spot account and margin account.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarginApi;


MarginApi apiInstance = new MarginApi();
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Float amount = 3.4F; // Float | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer type = 56; // Integer | 1 -> transfer from main account to margin account \\ 2 -> transfer from margin account to main account  
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Transaction result = apiInstance.sapiV1MarginTransferPost(asset, amount, timestamp, signature, type, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarginApi#sapiV1MarginTransferPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being transferred, e.g., BTC |
 **amount** | **Float**|  |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **type** | **Integer**| 1 -&gt; transfer from main account to margin account \\ 2 -&gt; transfer from margin account to main account   | [optional] [enum: 1, 2]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

