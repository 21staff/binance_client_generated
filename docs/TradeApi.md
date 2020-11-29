# TradeApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3AccountGet**](TradeApi.md#apiV3AccountGet) | **GET** /api/v3/account | Account Information (USER_DATA)
[**apiV3AllOrderListGet**](TradeApi.md#apiV3AllOrderListGet) | **GET** /api/v3/allOrderList | Query all OCO (USER_DATA)
[**apiV3AllOrdersGet**](TradeApi.md#apiV3AllOrdersGet) | **GET** /api/v3/allOrders | All Orders (USER_DATA)
[**apiV3MyTradesGet**](TradeApi.md#apiV3MyTradesGet) | **GET** /api/v3/myTrades | Account Trade List (USER_DATA)
[**apiV3OpenOrderListGet**](TradeApi.md#apiV3OpenOrderListGet) | **GET** /api/v3/openOrderList | Query Open OCO (USER_DATA)
[**apiV3OpenOrdersDelete**](TradeApi.md#apiV3OpenOrdersDelete) | **DELETE** /api/v3/openOrders | Cancel all Open Orders on a Symbol (TRADE)
[**apiV3OpenOrdersGet**](TradeApi.md#apiV3OpenOrdersGet) | **GET** /api/v3/openOrders | Current Open Orders (USER_DATA)
[**apiV3OrderDelete**](TradeApi.md#apiV3OrderDelete) | **DELETE** /api/v3/order | Cancel Order (TRADE)
[**apiV3OrderGet**](TradeApi.md#apiV3OrderGet) | **GET** /api/v3/order | Query Order (USER_DATA)
[**apiV3OrderListDelete**](TradeApi.md#apiV3OrderListDelete) | **DELETE** /api/v3/orderList | Cancel OCO (TRADE)
[**apiV3OrderListGet**](TradeApi.md#apiV3OrderListGet) | **GET** /api/v3/orderList | Query OCO (USER_DATA)
[**apiV3OrderOcoPost**](TradeApi.md#apiV3OrderOcoPost) | **POST** /api/v3/order/oco | New OCO (TRADE)
[**apiV3OrderPost**](TradeApi.md#apiV3OrderPost) | **POST** /api/v3/order | New Order (TRADE)
[**apiV3OrderTestPost**](TradeApi.md#apiV3OrderTestPost) | **POST** /api/v3/order/test | Test New Order (TRADE)

<a name="apiV3AccountGet"></a>
# **apiV3AccountGet**
> Account apiV3AccountGet(timestamp, signature, recvWindow)

Account Information (USER_DATA)

Get current account information.  Weight: 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Account result = apiInstance.apiV3AccountGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3AccountGet");
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

[**Account**](Account.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AllOrderListGet"></a>
# **apiV3AllOrderListGet**
> List&lt;OCOOrder&gt; apiV3AllOrderListGet(timestamp, signature, fromId, startTime, endTime, limit, recvWindow)

Query all OCO (USER_DATA)

Retrieves all OCO based on provided optional parameters  Weight: 10

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer fromId = 56; // Integer | Trade id to fetch from. Default gets most recent trades.
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<OCOOrder> result = apiInstance.apiV3AllOrderListGet(timestamp, signature, fromId, startTime, endTime, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3AllOrderListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **fromId** | **Integer**| Trade id to fetch from. Default gets most recent trades. | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;OCOOrder&gt;**](OCOOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AllOrdersGet"></a>
# **apiV3AllOrdersGet**
> List&lt;OrderDetails&gt; apiV3AllOrdersGet(symbol, timestamp, signature, orderId, startTime, endTime, limit, recvWindow)

All Orders (USER_DATA)

Get all account orders; active, canceled, or filled..  - If orderId is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. - For some historical orders cummulativeQuoteQty will be &lt; 0, meaning the data is not available at this time.  Weight: 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<OrderDetails> result = apiInstance.apiV3AllOrdersGet(symbol, timestamp, signature, orderId, startTime, endTime, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3AllOrdersGet");
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

[**List&lt;OrderDetails&gt;**](OrderDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3MyTradesGet"></a>
# **apiV3MyTradesGet**
> MyTrade apiV3MyTradesGet(symbol, timestamp, signature, startTime, endTime, fromId, limit, recvWindow)

Account Trade List (USER_DATA)

Get trades for a specific account and symbol.  If fromId is set, it will get id &gt;&#x3D; that fromId. Otherwise most recent orders are returned.  Weight: 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer fromId = 56; // Integer | Trade id to fetch from. Default gets most recent trades.
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    MyTrade result = apiInstance.apiV3MyTradesGet(symbol, timestamp, signature, startTime, endTime, fromId, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3MyTradesGet");
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

[**MyTrade**](MyTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OpenOrderListGet"></a>
# **apiV3OpenOrderListGet**
> List&lt;OCOOrder&gt; apiV3OpenOrderListGet(timestamp, signature, recvWindow)

Query Open OCO (USER_DATA)

Weight: 2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<OCOOrder> result = apiInstance.apiV3OpenOrderListGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OpenOrderListGet");
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

[**List&lt;OCOOrder&gt;**](OCOOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OpenOrdersDelete"></a>
# **apiV3OpenOrdersDelete**
> List&lt;Order&gt; apiV3OpenOrdersDelete(symbol, timestamp, signature, recvWindow)

Cancel all Open Orders on a Symbol (TRADE)

Cancels all active orders on a symbol.\\ This includes OCO orders.  Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<Order> result = apiInstance.apiV3OpenOrdersDelete(symbol, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OpenOrdersDelete");
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

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OpenOrdersGet"></a>
# **apiV3OpenOrdersGet**
> List&lt;OrderDetails&gt; apiV3OpenOrdersGet(timestamp, signature, symbol, recvWindow)

Current Open Orders (USER_DATA)

Get all open orders on a symbol. Careful when accessing this with no symbol.\\  Weight:\\ &#x60;1&#x60; for a single symbol;\\ &#x60;40&#x60; when the symbol parameter is omitted

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<OrderDetails> result = apiInstance.apiV3OpenOrdersGet(timestamp, signature, symbol, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OpenOrdersGet");
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

[**List&lt;OrderDetails&gt;**](OrderDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderDelete"></a>
# **apiV3OrderDelete**
> Order apiV3OrderDelete(symbol, timestamp, signature, orderId, origClientOrderId, newClientOrderId, recvWindow)

Cancel Order (TRADE)

Cancel an active order.  Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
String origClientOrderId = "origClientOrderId_example"; // String | order id from client
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Order result = apiInstance.apiV3OrderDelete(symbol, timestamp, signature, orderId, origClientOrderId, newClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderDelete");
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

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderGet"></a>
# **apiV3OrderGet**
> OrderDetails apiV3OrderGet(symbol, timestamp, signature, orderId, origClientOrderId, recvWindow)

Query Order (USER_DATA)

Check an order&#x27;s status.  - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderId = 56; // Integer | order id
String origClientOrderId = "origClientOrderId_example"; // String | order id from client
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    OrderDetails result = apiInstance.apiV3OrderGet(symbol, timestamp, signature, orderId, origClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderGet");
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

[**OrderDetails**](OrderDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderListDelete"></a>
# **apiV3OrderListDelete**
> Object apiV3OrderListDelete(symbol, timestamp, signature, orderListId, listClientOrderId, newClientOrderId, recvWindow)

Cancel OCO (TRADE)

Cancel an entire Order List  Canceling an individual leg will cancel the entire OCO  Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderListId = 56; // Integer | order list id
String listClientOrderId = "listClientOrderId_example"; // String | A unique Id for the entire orderList
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    Object result = apiInstance.apiV3OrderListDelete(symbol, timestamp, signature, orderListId, listClientOrderId, newClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderListDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **orderListId** | **Integer**| order list id | [optional]
 **listClientOrderId** | **String**| A unique Id for the entire orderList | [optional]
 **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderListGet"></a>
# **apiV3OrderListGet**
> OCOOrder apiV3OrderListGet(timestamp, signature, orderListId, origClientOrderId, recvWindow)

Query OCO (USER_DATA)

Retrieves a specific OCO based on provided optional parameters  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer orderListId = 56; // Integer | order list id
String origClientOrderId = "origClientOrderId_example"; // String | order id from client
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    OCOOrder result = apiInstance.apiV3OrderListGet(timestamp, signature, orderListId, origClientOrderId, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **orderListId** | **Integer**| order list id | [optional]
 **origClientOrderId** | **String**| order id from client | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**OCOOrder**](OCOOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderOcoPost"></a>
# **apiV3OrderOcoPost**
> InlineResponse2008 apiV3OrderOcoPost(symbol, side, quantity, price, stopPrice, timestamp, signature, listClientOrderId, limitClientOrderId, limitIcebergQty, stopClientOrderId, stopLimitPrice, stopIcebergQty, stopLimitTimeInForce, newOrderRespType, recvWindow)

New OCO (TRADE)

Send in a new OCO  - Price Restrictions:   - SELL: Limit Price &gt; Last Price &gt; Stop Price   - BUY: Limit Price &lt; Last Price &lt; Stop Price - Quantity Restrictions:     - Both legs must have the same quantity     - ICEBERG quantities however do not have to be the same  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TradeApi;


TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
String side = "side_example"; // String | SELL or BUY
Float quantity = 3.4F; // Float | order quantity
Float price = 3.4F; // Float | 
Float stopPrice = 3.4F; // Float | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String listClientOrderId = "listClientOrderId_example"; // String | A unique Id for the entire orderList
Float limitClientOrderId = 3.4F; // Float | A unique Id for the limit order
Float limitIcebergQty = 3.4F; // Float | 
String stopClientOrderId = "stopClientOrderId_example"; // String | 
Float stopLimitPrice = 3.4F; // Float | 
Float stopIcebergQty = 3.4F; // Float | 
String stopLimitTimeInForce = "stopLimitTimeInForce_example"; // String | 
String newOrderRespType = "newOrderRespType_example"; // String | Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse2008 result = apiInstance.apiV3OrderOcoPost(symbol, side, quantity, price, stopPrice, timestamp, signature, listClientOrderId, limitClientOrderId, limitIcebergQty, stopClientOrderId, stopLimitPrice, stopIcebergQty, stopLimitTimeInForce, newOrderRespType, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderOcoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **side** | **String**| SELL or BUY | [enum: SELL, BUY]
 **quantity** | **Float**| order quantity |
 **price** | **Float**|  |
 **stopPrice** | **Float**|  |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **listClientOrderId** | **String**| A unique Id for the entire orderList | [optional]
 **limitClientOrderId** | **Float**| A unique Id for the limit order | [optional]
 **limitIcebergQty** | **Float**|  | [optional]
 **stopClientOrderId** | **String**|  | [optional]
 **stopLimitPrice** | **Float**|  | [optional]
 **stopIcebergQty** | **Float**|  | [optional]
 **stopLimitTimeInForce** | **String**|  | [optional] [enum: GTC, FOK, IOC]
 **newOrderRespType** | **String**| Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK. | [optional] [enum: ACK, RESULT, FULL]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderPost"></a>
# **apiV3OrderPost**
> InlineResponse2007 apiV3OrderPost(symbol, side, type, timestamp, signature, timeInForce, quantity, quoteOrderQty, price, newClientOrderId, stopPrice, icebergQty, newOrderRespType, recvWindow)

New Order (TRADE)

Send in a new order.   - &#x60;LIMIT_MAKER&#x60; are &#x60;LIMIT&#x60; orders that will be rejected if they would immediately match and trade as a taker. - &#x60;STOP_LOSS&#x60; and &#x60;TAKE_PROFIT&#x60; will execute a &#x60;MARKET&#x60; order when the &#x60;stopPrice&#x60; is reached. - Any &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; type order can be made an iceberg order by sending an &#x60;icebergQty&#x60;. - Any order with an &#x60;icebergQty&#x60; MUST have &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. - &#x60;MARKET&#x60; orders using &#x60;quantity&#x60; specifies how much a user wants to buy or sell based on the market price. - &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; specifies the amount the user wants to spend (when buying) or receive (when selling) of the quote asset; the correct quantity will be determined based on the market liquidity and &#x60;quoteOrderQty&#x60;. - &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; will not break &#x60;LOT_SIZE&#x60; filter rules; the order will execute a quantity that will have the notional value as close as possible to &#x60;quoteOrderQty&#x60;. - same &#x60;newClientOrderId&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected.  Trigger order price rules against market price for both &#x60;MARKET&#x60; and &#x60;LIMIT&#x60; versions:  - Price above market price: STOP_LOSS BUY, TAKE_PROFIT SELL - Price below market price: STOP_LOSS SELL, TAKE_PROFIT BUY   Weight: 1 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
String side = "side_example"; // String | SELL or BUY
String type = "type_example"; // String | the order type
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String timeInForce = "timeInForce_example"; // String | order time in force
Float quantity = 3.4F; // Float | order quantity
Float quoteOrderQty = 3.4F; // Float | quote quantity
Float price = 3.4F; // Float | order price
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Float stopPrice = 3.4F; // Float | Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
Float icebergQty = 3.4F; // Float | Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order.
String newOrderRespType = "newOrderRespType_example"; // String | Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse2007 result = apiInstance.apiV3OrderPost(symbol, side, type, timestamp, signature, timeInForce, quantity, quoteOrderQty, price, newClientOrderId, stopPrice, icebergQty, newOrderRespType, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **side** | **String**| SELL or BUY | [enum: SELL, BUY]
 **type** | **String**| the order type | [enum: LIMIT, MARKET, STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, TAKE_PROFIT_LIMIT, LIMIT_MAKER]
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **timeInForce** | **String**| order time in force | [optional] [enum: GTC, IOC, FOK]
 **quantity** | **Float**| order quantity | [optional]
 **quoteOrderQty** | **Float**| quote quantity | [optional]
 **price** | **Float**| order price | [optional]
 **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional]
 **stopPrice** | **Float**| Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. | [optional]
 **icebergQty** | **Float**| Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. | [optional]
 **newOrderRespType** | **String**| Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK. | [optional] [enum: ACK, RESULT, FULL]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3OrderTestPost"></a>
# **apiV3OrderTestPost**
> apiV3OrderTestPost(symbol, side, type, timestamp, signature, timeInForce, quantity, quoteOrderQty, price, newClientOrderId, stopPrice, icebergQty, newOrderRespType, recvWindow)

Test New Order (TRADE)

Test new order creation and signature/recvWindow long.  Creates and validates a new order but does not send it into the matching engine.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

TradeApi apiInstance = new TradeApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
String side = "side_example"; // String | SELL or BUY
String type = "type_example"; // String | the order type
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String timeInForce = "timeInForce_example"; // String | order time in force
Float quantity = 3.4F; // Float | order quantity
Float quoteOrderQty = 3.4F; // Float | quote quantity
Float price = 3.4F; // Float | order price
String newClientOrderId = "newClientOrderId_example"; // String | Used to uniquely identify this cancel. Automatically generated by default
Float stopPrice = 3.4F; // Float | Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
Float icebergQty = 3.4F; // Float | Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order.
String newOrderRespType = "newOrderRespType_example"; // String | Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    apiInstance.apiV3OrderTestPost(symbol, side, type, timestamp, signature, timeInForce, quantity, quoteOrderQty, price, newClientOrderId, stopPrice, icebergQty, newOrderRespType, recvWindow);
} catch (ApiException e) {
    System.err.println("Exception when calling TradeApi#apiV3OrderTestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **side** | **String**| SELL or BUY | [enum: SELL, BUY]
 **type** | **String**| the order type | [enum: LIMIT, MARKET, STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, TAKE_PROFIT_LIMIT, LIMIT_MAKER]
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **timeInForce** | **String**| order time in force | [optional] [enum: GTC, IOC, FOK]
 **quantity** | **Float**| order quantity | [optional]
 **quoteOrderQty** | **Float**| quote quantity | [optional]
 **price** | **Float**| order price | [optional]
 **newClientOrderId** | **String**| Used to uniquely identify this cancel. Automatically generated by default | [optional]
 **stopPrice** | **Float**| Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. | [optional]
 **icebergQty** | **Float**| Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. | [optional]
 **newOrderRespType** | **String**| Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK. | [optional] [enum: ACK, RESULT, FULL]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

