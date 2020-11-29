# WalletApi

All URIs are relative to *https://virtserver.swaggerhub.com/21staff/Binance/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sapiV1AccountDisableFastWithdrawSwitchPost**](WalletApi.md#sapiV1AccountDisableFastWithdrawSwitchPost) | **POST** /sapi/v1/account/disableFastWithdrawSwitch | Disable Fast Withdraw Switch (USER_DATA)
[**sapiV1AccountEnableFastWithdrawSwitchPost**](WalletApi.md#sapiV1AccountEnableFastWithdrawSwitchPost) | **POST** /sapi/v1/account/enableFastWithdrawSwitch | Enable Fast Withdraw Switch (USER_DATA)
[**sapiV1AccountSnapshotGet**](WalletApi.md#sapiV1AccountSnapshotGet) | **GET** /sapi/v1/accountSnapshot | Daily Account Snapshot (USER_DATA)
[**sapiV1AssetAssetDividendGet**](WalletApi.md#sapiV1AssetAssetDividendGet) | **GET** /sapi/v1/asset/assetDividend | Dust Transfer
[**sapiV1AssetDustPost**](WalletApi.md#sapiV1AssetDustPost) | **POST** /sapi/v1/asset/dust | Dust Transfer
[**sapiV1CapitalConfigGetallGet**](WalletApi.md#sapiV1CapitalConfigGetallGet) | **GET** /sapi/v1/capital/config/getall | All Coins&#x27; Information (USER_DATA)
[**sapiV1CapitalDepositAddressGet**](WalletApi.md#sapiV1CapitalDepositAddressGet) | **GET** /sapi/v1/capital/deposit/address | Withdraw History (supporting network) (USER_DATA)
[**sapiV1CapitalDepositHisrecGet**](WalletApi.md#sapiV1CapitalDepositHisrecGet) | **GET** /sapi/v1/capital/deposit/hisrec | Deposit History（supporting network） (USER_DATA)
[**sapiV1CapitalWithdrawApplyPost**](WalletApi.md#sapiV1CapitalWithdrawApplyPost) | **POST** /sapi/v1/capital/withdraw/apply | Withdraw
[**sapiV1CapitalWithdrawHistoryGet**](WalletApi.md#sapiV1CapitalWithdrawHistoryGet) | **GET** /sapi/v1/capital/withdraw/history | Withdraw History (supporting network) (USER_DATA)
[**wapiV3AccountStatusHtmlGet**](WalletApi.md#wapiV3AccountStatusHtmlGet) | **GET** /wapi/v3/accountStatus.html | Account Status (USER_DATA)
[**wapiV3ApiTradingStatusHtmlGet**](WalletApi.md#wapiV3ApiTradingStatusHtmlGet) | **GET** /wapi/v3/apiTradingStatus.html | Account API Trading Status (USER_DATA)
[**wapiV3AssetDetailHtmlGet**](WalletApi.md#wapiV3AssetDetailHtmlGet) | **GET** /wapi/v3/assetDetail.html | Asset Detail (USER_DATA)
[**wapiV3SystemStatusHtmlGet**](WalletApi.md#wapiV3SystemStatusHtmlGet) | **GET** /wapi/v3/systemStatus.html | System Status (System)
[**wapiV3TradeFeeHtmlGet**](WalletApi.md#wapiV3TradeFeeHtmlGet) | **GET** /wapi/v3/tradeFee.html | Trade Fee (USER_DATA)
[**wapiV3UserAssetDribbletLogHtmlGet**](WalletApi.md#wapiV3UserAssetDribbletLogHtmlGet) | **GET** /wapi/v3/userAssetDribbletLog.html | DustLog (USER_DATA)

<a name="sapiV1AccountDisableFastWithdrawSwitchPost"></a>
# **sapiV1AccountDisableFastWithdrawSwitchPost**
> sapiV1AccountDisableFastWithdrawSwitchPost(timestamp, signature, recvWindow)

Disable Fast Withdraw Switch (USER_DATA)

This request will disable fastwithdraw switch under your account. You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    apiInstance.sapiV1AccountDisableFastWithdrawSwitchPost(timestamp, signature, recvWindow);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1AccountDisableFastWithdrawSwitchPost");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1AccountEnableFastWithdrawSwitchPost"></a>
# **sapiV1AccountEnableFastWithdrawSwitchPost**
> sapiV1AccountEnableFastWithdrawSwitchPost(timestamp, signature, recvWindow)

Enable Fast Withdraw Switch (USER_DATA)

 - This request will enable fastwithdraw switch under your account. You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint. - When Fast Withdraw Switch is on, transferring funds to a Binance account will be done instantly. There is no on-chain transaction, no transaction ID and no withdrawal fee.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    apiInstance.sapiV1AccountEnableFastWithdrawSwitchPost(timestamp, signature, recvWindow);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1AccountEnableFastWithdrawSwitchPost");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1AccountSnapshotGet"></a>
# **sapiV1AccountSnapshotGet**
> InlineResponse20019 sapiV1AccountSnapshotGet(type, limit, timestamp, signature, startTime, endTime, recvWindow)

Daily Account Snapshot (USER_DATA)

 Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String type = "type_example"; // String | 
Integer limit = 5; // Integer | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20019 result = apiInstance.sapiV1AccountSnapshotGet(type, limit, timestamp, signature, startTime, endTime, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1AccountSnapshotGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [enum: SPOT, MARGIN, FUTURES]
 **limit** | **Integer**|  | [default to 5] [enum: ]
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1AssetAssetDividendGet"></a>
# **sapiV1AssetAssetDividendGet**
> InlineResponse20028 sapiV1AssetAssetDividendGet(limit, timestamp, signature, asset, startTime, endTime, recvWindow)

Dust Transfer

Query asset Dividend Record   Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String limit = "20"; // String | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String asset = "asset_example"; // String | The asset being transferred, e.g., BTC
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20028 result = apiInstance.sapiV1AssetAssetDividendGet(limit, timestamp, signature, asset, startTime, endTime, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1AssetAssetDividendGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**|  | [default to 20]
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **asset** | **String**| The asset being transferred, e.g., BTC | [optional]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1AssetDustPost"></a>
# **sapiV1AssetDustPost**
> InlineResponse20027 sapiV1AssetDustPost(asset, timestamp, signature, recvWindow)

Dust Transfer

Convert dust assets to BNB.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String asset = "asset_example"; // String | The asset being converted. For example, asset=BTC&asset=USDT
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20027 result = apiInstance.sapiV1AssetDustPost(asset, timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1AssetDustPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asset** | **String**| The asset being converted. For example, asset&#x3D;BTC&amp;asset&#x3D;USDT |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1CapitalConfigGetallGet"></a>
# **sapiV1CapitalConfigGetallGet**
> InlineResponse20018 sapiV1CapitalConfigGetallGet(timestamp, signature, recvWindow)

All Coins&#x27; Information (USER_DATA)

Get information of coins (available for deposit and withdraw) for user.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20018 result = apiInstance.sapiV1CapitalConfigGetallGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1CapitalConfigGetallGet");
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

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1CapitalDepositAddressGet"></a>
# **sapiV1CapitalDepositAddressGet**
> InlineResponse20023 sapiV1CapitalDepositAddressGet(coin, timestamp, signature, network, recvWindow)

Withdraw History (supporting network) (USER_DATA)

Fetch withdraw history.  - network may not be in the response for old withdraw. - Please notice the default startTime and endTime to make sure that time interval is within 0-90 days. - If both startTime and endTime are sent, time between startTime and endTime must be less than 90 days  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String coin = "coin_example"; // String | coin name
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String network = "network_example"; // String | 
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20023 result = apiInstance.sapiV1CapitalDepositAddressGet(coin, timestamp, signature, network, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1CapitalDepositAddressGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **String**| coin name |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **network** | **String**|  | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1CapitalDepositHisrecGet"></a>
# **sapiV1CapitalDepositHisrecGet**
> List&lt;InlineResponse20021&gt; sapiV1CapitalDepositHisrecGet(timestamp, signature, coin, status, startTime, endTime, offset, limit, recvWindow)

Deposit History（supporting network） (USER_DATA)

Fetch deposit history.  - Please notice the default startTime and endTime to make sure that time interval is within 0-90 days. - If both startTime and endTime are sent, time between startTime and endTime must be less than 90 days.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String coin = "coin_example"; // String | 
Integer status = 56; // Integer | 0 -> pending\\ 6 -> credited but cannot withdraw\\ 1 -> success
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<InlineResponse20021> result = apiInstance.sapiV1CapitalDepositHisrecGet(timestamp, signature, coin, status, startTime, endTime, offset, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1CapitalDepositHisrecGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **coin** | **String**|  | [optional]
 **status** | **Integer**| 0 -&gt; pending\\ 6 -&gt; credited but cannot withdraw\\ 1 -&gt; success | [optional] [enum: 0, 6, 1]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;InlineResponse20021&gt;**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1CapitalWithdrawApplyPost"></a>
# **sapiV1CapitalWithdrawApplyPost**
> InlineResponse20020 sapiV1CapitalWithdrawApplyPost(coin, address, amount, timestamp, signature, withdrawOrderId, network, addressTag, transactionFeeFlag, name, recvWindow)

Withdraw

Submit a withdraw request.  - If network not send, return with default network of the coin. - You can get network and isDefault in networkList of a coin in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String coin = "coin_example"; // String | coin name
String address = "address_example"; // String | 
Float amount = 3.4F; // Float | 
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String withdrawOrderId = "withdrawOrderId_example"; // String | client id for withdraw
String network = "network_example"; // String | getting value from `GET /sapi/v1/capital/config/getall`
String addressTag = "addressTag_example"; // String | Secondary address identifier for coins like XRP,XMR etc.
Boolean transactionFeeFlag = false; // Boolean | When making internal transfer - `true` ->  returning the fee to the destination account;  - `false` -> returning the fee back to the departure account. 
String name = "name_example"; // String | 
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20020 result = apiInstance.sapiV1CapitalWithdrawApplyPost(coin, address, amount, timestamp, signature, withdrawOrderId, network, addressTag, transactionFeeFlag, name, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1CapitalWithdrawApplyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coin** | **String**| coin name |
 **address** | **String**|  |
 **amount** | **Float**|  |
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **withdrawOrderId** | **String**| client id for withdraw | [optional]
 **network** | **String**| getting value from &#x60;GET /sapi/v1/capital/config/getall&#x60; | [optional]
 **addressTag** | **String**| Secondary address identifier for coins like XRP,XMR etc. | [optional]
 **transactionFeeFlag** | **Boolean**| When making internal transfer - &#x60;true&#x60; -&gt;  returning the fee to the destination account;  - &#x60;false&#x60; -&gt; returning the fee back to the departure account.  | [optional] [default to false]
 **name** | **String**|  | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sapiV1CapitalWithdrawHistoryGet"></a>
# **sapiV1CapitalWithdrawHistoryGet**
> List&lt;InlineResponse20022&gt; sapiV1CapitalWithdrawHistoryGet(timestamp, signature, coin, status, startTime, endTime, offset, limit, recvWindow)

Withdraw History (supporting network) (USER_DATA)

Fetch withdraw history.  - network may not be in the response for old withdraw. - Please notice the default startTime and endTime to make sure that time interval is within 0-90 days. - If both startTime and endTime are sent, time between startTime and endTime must be less than 90 days  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String coin = "coin_example"; // String | 
Integer status = 56; // Integer | 0:Email Sent 1:Cancelled 2:Awaiting Approval  3:Rejected  4:Processing  5:Failure  6:Completed
Integer startTime = 56; // Integer | Timestamp in ms
Integer endTime = 56; // Integer | Timestamp in ms
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | Default 500; max 1000.
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    List<InlineResponse20022> result = apiInstance.sapiV1CapitalWithdrawHistoryGet(timestamp, signature, coin, status, startTime, endTime, offset, limit, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#sapiV1CapitalWithdrawHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **Integer**| UTC timestamp |
 **signature** | **String**| signature |
 **coin** | **String**|  | [optional]
 **status** | **Integer**| 0:Email Sent 1:Cancelled 2:Awaiting Approval  3:Rejected  4:Processing  5:Failure  6:Completed | [optional] [enum: 0, 1, 2, 3, 4, 5, 6]
 **startTime** | **Integer**| Timestamp in ms | [optional]
 **endTime** | **Integer**| Timestamp in ms | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**| Default 500; max 1000. | [optional]
 **recvWindow** | **Integer**| The value cannot be greater than 60000 | [optional]

### Return type

[**List&lt;InlineResponse20022&gt;**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3AccountStatusHtmlGet"></a>
# **wapiV3AccountStatusHtmlGet**
> InlineResponse20024 wapiV3AccountStatusHtmlGet(timestamp, signature, recvWindow)

Account Status (USER_DATA)

Fetch account status detail.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20024 result = apiInstance.wapiV3AccountStatusHtmlGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3AccountStatusHtmlGet");
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

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3ApiTradingStatusHtmlGet"></a>
# **wapiV3ApiTradingStatusHtmlGet**
> InlineResponse20025 wapiV3ApiTradingStatusHtmlGet(timestamp, signature, recvWindow)

Account API Trading Status (USER_DATA)

Fetch account api trading status detail.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20025 result = apiInstance.wapiV3ApiTradingStatusHtmlGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3ApiTradingStatusHtmlGet");
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

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3AssetDetailHtmlGet"></a>
# **wapiV3AssetDetailHtmlGet**
> InlineResponse20029 wapiV3AssetDetailHtmlGet(timestamp, signature, recvWindow)

Asset Detail (USER_DATA)

Fetch details of assets supported on Binance.  Please get network and other deposit or withdraw details from &#x60;GET /sapi/v1/capital/config/getall&#x60;.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20029 result = apiInstance.wapiV3AssetDetailHtmlGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3AssetDetailHtmlGet");
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

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3SystemStatusHtmlGet"></a>
# **wapiV3SystemStatusHtmlGet**
> Object wapiV3SystemStatusHtmlGet()

System Status (System)

Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
try {
    Object result = apiInstance.wapiV3SystemStatusHtmlGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3SystemStatusHtmlGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3TradeFeeHtmlGet"></a>
# **wapiV3TradeFeeHtmlGet**
> InlineResponse20030 wapiV3TradeFeeHtmlGet(timestamp, signature, symbol, recvWindow)

Trade Fee (USER_DATA)

Fetch trade fee, values in percentage.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
String symbol = "symbol_example"; // String | trading symbol, e.g. BNBUSDT
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20030 result = apiInstance.wapiV3TradeFeeHtmlGet(timestamp, signature, symbol, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3TradeFeeHtmlGet");
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

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wapiV3UserAssetDribbletLogHtmlGet"></a>
# **wapiV3UserAssetDribbletLogHtmlGet**
> InlineResponse20026 wapiV3UserAssetDribbletLogHtmlGet(timestamp, signature, recvWindow)

DustLog (USER_DATA)

Fetch small amounts of assets exchanged BNB records.  Weight: 1

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
Integer timestamp = 56; // Integer | UTC timestamp
String signature = "signature_example"; // String | signature
Integer recvWindow = 56; // Integer | The value cannot be greater than 60000
try {
    InlineResponse20026 result = apiInstance.wapiV3UserAssetDribbletLogHtmlGet(timestamp, signature, recvWindow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#wapiV3UserAssetDribbletLogHtmlGet");
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

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

