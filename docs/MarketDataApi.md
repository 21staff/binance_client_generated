# MarketDataApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV3AggTradesGet**](MarketDataApi.md#apiV3AggTradesGet) | **GET** /api/v3/aggTrades | Compressed/Aggregate Trades List
[**apiV3AvgPriceGet**](MarketDataApi.md#apiV3AvgPriceGet) | **GET** /api/v3/avgPrice | Current Average Price
[**apiV3DepthGet**](MarketDataApi.md#apiV3DepthGet) | **GET** /api/v3/depth | Order Book
[**apiV3ExchangeInfoGet**](MarketDataApi.md#apiV3ExchangeInfoGet) | **GET** /api/v3/exchangeInfo | Exchange Information
[**apiV3HistoricalTradesGet**](MarketDataApi.md#apiV3HistoricalTradesGet) | **GET** /api/v3/historicalTrades | Old Trade Lookup
[**apiV3KlinesGet**](MarketDataApi.md#apiV3KlinesGet) | **GET** /api/v3/klines | Kline/Candlestick Data
[**apiV3PingGet**](MarketDataApi.md#apiV3PingGet) | **GET** /api/v3/ping | Test Connectivity
[**apiV3Ticker24hrGet**](MarketDataApi.md#apiV3Ticker24hrGet) | **GET** /api/v3/ticker/24hr | 24hr Ticker Price Change Statistics
[**apiV3TickerBookTickerGet**](MarketDataApi.md#apiV3TickerBookTickerGet) | **GET** /api/v3/ticker/bookTicker | Symbol Order Book Ticker
[**apiV3TickerPriceGet**](MarketDataApi.md#apiV3TickerPriceGet) | **GET** /api/v3/ticker/price | Symbol Price Ticker
[**apiV3TimeGet**](MarketDataApi.md#apiV3TimeGet) | **GET** /api/v3/time | Check Server Time
[**apiV3TradesGet**](MarketDataApi.md#apiV3TradesGet) | **GET** /api/v3/trades | Recent Trades List

<a name="apiV3AggTradesGet"></a>
# **apiV3AggTradesGet**
> List&lt;AggTrade&gt; apiV3AggTradesGet(symbol, fromId, startTime, endTime, limit)

Compressed/Aggregate Trades List

Get compressed, aggregate trades. Trades that fill at the time, from the same order, with the same price will have the quantity aggregated.  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer fromId = 56; // Integer | Trade id to fetch from. Default gets most recent trades.
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer limit = 56; // Integer | Default 500; max 1000.
try {
    List<AggTrade> result = apiInstance.apiV3AggTradesGet(symbol, fromId, startTime, endTime, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3AggTradesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **fromId** | **Integer**| Trade id to fetch from. Default gets most recent trades. | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]

### Return type

[**List&lt;AggTrade&gt;**](AggTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3AvgPriceGet"></a>
# **apiV3AvgPriceGet**
> InlineResponse2003 apiV3AvgPriceGet(symbol)

Current Average Price

Current average price for a symbol.  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse2003 result = apiInstance.apiV3AvgPriceGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3AvgPriceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3DepthGet"></a>
# **apiV3DepthGet**
> InlineResponse2002 apiV3DepthGet(symbol, limit)

Order Book

 | Limit               | Weight  |  | -------------       |---------|  | 5, 10, 20, 50, 100  | 1       |  | 500                 | 5       |  | 1000                | 10      |  | 5000                | 50      | 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer limit = 100; // Integer | 
try {
    InlineResponse2002 result = apiInstance.apiV3DepthGet(symbol, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3DepthGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **limit** | **Integer**|  | [optional] [default to 100] [enum: 5, 10, 20, 50, 100, 500, 1000, 5000]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3ExchangeInfoGet"></a>
# **apiV3ExchangeInfoGet**
> InlineResponse2001 apiV3ExchangeInfoGet()

Exchange Information

Current exchange trading rules and symbol information  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
try {
    InlineResponse2001 result = apiInstance.apiV3ExchangeInfoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3ExchangeInfoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3HistoricalTradesGet"></a>
# **apiV3HistoricalTradesGet**
> List&lt;Trade&gt; apiV3HistoricalTradesGet(symbol, limit, fromId)

Old Trade Lookup

Get older market trades.  &#x60;X-MBX-APIKEY&#x60; required in header  Weight 5

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer limit = 56; // Integer | Default 500; max 1000.
Integer fromId = 56; // Integer | Trade id to fetch from. Default gets most recent trades.
try {
    List<Trade> result = apiInstance.apiV3HistoricalTradesGet(symbol, limit, fromId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3HistoricalTradesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **fromId** | **Integer**| Trade id to fetch from. Default gets most recent trades. | [optional]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3KlinesGet"></a>
# **apiV3KlinesGet**
> Object apiV3KlinesGet(symbol, interval, startTime, endTime, limit)

Kline/Candlestick Data

Kline/candlestick bars for a symbol.\\ Klines are uniquely identified by their open time.  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
String interval = "interval_example"; // String | kline intervals
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer limit = 56; // Integer | Default 500; max 1000.
try {
    Object result = apiInstance.apiV3KlinesGet(symbol, interval, startTime, endTime, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3KlinesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **interval** | **String**| kline intervals | [enum: 1m, 3m, 5m, 15m, 30m, 1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3PingGet"></a>
# **apiV3PingGet**
> apiV3PingGet()

Test Connectivity

Test connectivity to the Rest API.  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
try {
    apiInstance.apiV3PingGet();
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3PingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3Ticker24hrGet"></a>
# **apiV3Ticker24hrGet**
> InlineResponse2004 apiV3Ticker24hrGet(symbol)

24hr Ticker Price Change Statistics

24 hour rolling window price change statistics. Careful when accessing this with no symbol.  Weight:\\ &#x60;1&#x60; for a single symbol;\\ &#x60;40&#x60; when the symbol parameter is omitted

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse2004 result = apiInstance.apiV3Ticker24hrGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3Ticker24hrGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3TickerBookTickerGet"></a>
# **apiV3TickerBookTickerGet**
> InlineResponse2006 apiV3TickerBookTickerGet(symbol)

Symbol Order Book Ticker

Best price/qty on the order book for a symbol or symbols.  Weight:\\ 1 for a single symbol;\\ 40 when the symbol parameter is omitted

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse2006 result = apiInstance.apiV3TickerBookTickerGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3TickerBookTickerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3TickerPriceGet"></a>
# **apiV3TickerPriceGet**
> InlineResponse2005 apiV3TickerPriceGet(symbol)

Symbol Price Ticker

Latest price for a symbol or symbols.  Weight:\\ &#x60;1&#x60; for a single symbol;\\ &#x60;2&#x60; when the symbol parameter is omitted

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
try {
    InlineResponse2005 result = apiInstance.apiV3TickerPriceGet(symbol);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3TickerPriceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3TimeGet"></a>
# **apiV3TimeGet**
> InlineResponse200 apiV3TimeGet()

Check Server Time

Test connectivity to the Rest API and get the current server time.  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
try {
    InlineResponse200 result = apiInstance.apiV3TimeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3TimeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV3TradesGet"></a>
# **apiV3TradesGet**
> List&lt;Trade&gt; apiV3TradesGet(symbol, limit)

Recent Trades List

Get recent trades (up to last 500).  Weight 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MarketDataApi;


MarketDataApi apiInstance = new MarketDataApi();
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer limit = 500; // Integer | 
try {
    List<Trade> result = apiInstance.apiV3TradesGet(symbol, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketDataApi#apiV3TradesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| trading symbol, e.g. BNBUSDT |
 **limit** | **Integer**|  | [optional] [default to 500] [enum: ]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

