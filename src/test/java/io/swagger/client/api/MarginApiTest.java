/*
 * Binance SPOT Public API
 * The swagger file of Binance Public API  API documents:   - [https://github.com/binance-exchange/binance-official-api-docs](https://github.com/binance-exchange/binance-official-api-docs)   - [https://binance-docs.github.io/apidocs/spot/en](https://binance-docs.github.io/apidocs/spot/en)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse20010;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse20013;
import io.swagger.client.model.InlineResponse20014;
import io.swagger.client.model.InlineResponse20015;
import io.swagger.client.model.InlineResponse20016;
import io.swagger.client.model.InlineResponse20017;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.MarginOrder;
import io.swagger.client.model.MarginOrderDetail;
import io.swagger.client.model.MarginTrade;
import io.swagger.client.model.Transaction;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarginApi
 */
@Ignore
public class MarginApiTest {

    private final MarginApi api = new MarginApi();

    /**
     * Query Margin Account Details (USER_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginAccountGetTest() throws ApiException {
        Integer timestamp = null;
        String signature = null;
        Integer recvWindow = null;
        InlineResponse20017 response = api.sapiV1MarginAccountGet(timestamp, signature, recvWindow);

        // TODO: test validations
    }
    /**
     * Get All Margin Assets (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginAllAssetsGetTest() throws ApiException {
        List<InlineResponse20012> response = api.sapiV1MarginAllAssetsGet();

        // TODO: test validations
    }
    /**
     * Query Margin Account&#x27;s All Order (USER_DATA)
     *
     * - If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginAllOrdersGetTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer orderId = null;
        Integer startTime = null;
        Integer endTime = null;
        Integer limit = null;
        Integer recvWindow = null;
        List<MarginOrderDetail> response = api.sapiV1MarginAllOrdersGet(symbol, timestamp, signature, orderId, startTime, endTime, limit, recvWindow);

        // TODO: test validations
    }
    /**
     * Get All Margin Pairs (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginAllPairsGetTest() throws ApiException {
        List<InlineResponse20013> response = api.sapiV1MarginAllPairsGet();

        // TODO: test validations
    }
    /**
     * Query Margin Asset (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginAssetGetTest() throws ApiException {
        String asset = null;
        InlineResponse20010 response = api.sapiV1MarginAssetGet(asset);

        // TODO: test validations
    }
    /**
     * Get Force Liquidation Record (USER_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginForceLiquidationRecGetTest() throws ApiException {
        Integer timestamp = null;
        String signature = null;
        Integer startTime = null;
        Integer endTime = null;
        BigDecimal current = null;
        BigDecimal size = null;
        Integer recvWindow = null;
        Object response = api.sapiV1MarginForceLiquidationRecGet(timestamp, signature, startTime, endTime, current, size, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Interest History (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginInterestHistoryGetTest() throws ApiException {
        Integer timestamp = null;
        String signature = null;
        String asset = null;
        Integer startTime = null;
        Integer endTime = null;
        BigDecimal current = null;
        BigDecimal size = null;
        Integer recvWindow = null;
        InlineResponse20016 response = api.sapiV1MarginInterestHistoryGet(timestamp, signature, asset, startTime, endTime, current, size, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Load Record (USER_DATA)
     *
     * &#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. txId takes precedence.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginLoanGetTest() throws ApiException {
        String asset = null;
        Integer timestamp = null;
        String signature = null;
        Integer txId = null;
        Integer startTime = null;
        Integer endTime = null;
        BigDecimal current = null;
        BigDecimal size = null;
        Integer recvWindow = null;
        Object response = api.sapiV1MarginLoanGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow);

        // TODO: test validations
    }
    /**
     * Margin Account Borrow (MARGIN)
     *
     * Apply for a loan.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginLoanPostTest() throws ApiException {
        String asset = null;
        Float amount = null;
        Integer timestamp = null;
        String signature = null;
        Integer recvWindow = null;
        Transaction response = api.sapiV1MarginLoanPost(asset, amount, timestamp, signature, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Max Borrow (USER_DATA)
     *
     * Weight: 5
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginMaxBorrowableGetTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer recvWindow = null;
        Object response = api.sapiV1MarginMaxBorrowableGet(symbol, timestamp, signature, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Max Transfer-Out Amount (USER_DATA)
     *
     * Weight: 5
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginMaxTransferableGetTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer recvWindow = null;
        Object response = api.sapiV1MarginMaxTransferableGet(symbol, timestamp, signature, recvWindow);

        // TODO: test validations
    }
    /**
     * If fromId is set, it will get orders &gt;&#x3D; that fromId. Otherwise most recent orders are returned.
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginMyTradesGetTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer startTime = null;
        Integer endTime = null;
        Integer fromId = null;
        Integer limit = null;
        Integer recvWindow = null;
        List<MarginTrade> response = api.sapiV1MarginMyTradesGet(symbol, timestamp, signature, startTime, endTime, fromId, limit, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Margin Account&#x27;s Open Order (USER_DATA)
     *
     * - If the symbol is not sent, orders for all symbols will be returned in an array. - When all symbols are returned, the number of requests counted against the rate limiter is equal to the number of symbols currently trading on the exchange  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginOpenOrdersGetTest() throws ApiException {
        Integer timestamp = null;
        String signature = null;
        String symbol = null;
        Integer recvWindow = null;
        List<MarginOrderDetail> response = api.sapiV1MarginOpenOrdersGet(timestamp, signature, symbol, recvWindow);

        // TODO: test validations
    }
    /**
     * Margin Account Cancel Order (TRADE)
     *
     * Cancel an active order for margin account.  Either orderId or origClientOrderId must be sent.  Weight: 1 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginOrderDeleteTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer orderId = null;
        String origClientOrderId = null;
        String newClientOrderId = null;
        Integer recvWindow = null;
        MarginOrder response = api.sapiV1MarginOrderDelete(symbol, timestamp, signature, orderId, origClientOrderId, newClientOrderId, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Margin Account&#x27;s Order (MARKET_DATA)
     *
     * - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginOrderGetTest() throws ApiException {
        String symbol = null;
        Integer timestamp = null;
        String signature = null;
        Integer orderId = null;
        String origClientOrderId = null;
        Integer recvWindow = null;
        MarginOrderDetail response = api.sapiV1MarginOrderGet(symbol, timestamp, signature, orderId, origClientOrderId, recvWindow);

        // TODO: test validations
    }
    /**
     * Margin Account New Order (TRADE)
     *
     * Post a new order for margin account.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginOrderPostTest() throws ApiException {
        String symbol = null;
        String side = null;
        String type = null;
        Float quantity = null;
        Integer timestamp = null;
        String signature = null;
        Float price = null;
        Float stopPrice = null;
        String newClientOrderId = null;
        Float icebergQty = null;
        String newOrderRespType = null;
        String sideEffectType = null;
        String timeInForce = null;
        Integer recvWindow = null;
        InlineResponse20015 response = api.sapiV1MarginOrderPost(symbol, side, type, quantity, timestamp, signature, price, stopPrice, newClientOrderId, icebergQty, newOrderRespType, sideEffectType, timeInForce, recvWindow);

        // TODO: test validations
    }
    /**
     * Query Margin Pair (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginPairGetTest() throws ApiException {
        String symbol = null;
        InlineResponse20011 response = api.sapiV1MarginPairGet(symbol);

        // TODO: test validations
    }
    /**
     * Query Margin PriceIndex (MARKET_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginPriceIndexGetTest() throws ApiException {
        String symbol = null;
        InlineResponse20014 response = api.sapiV1MarginPriceIndexGet(symbol);

        // TODO: test validations
    }
    /**
     * Query Repay Record (USER_DATA)
     *
     * &#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. txId takes precedence. Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginRepayGetTest() throws ApiException {
        String asset = null;
        Integer timestamp = null;
        String signature = null;
        Integer txId = null;
        Integer startTime = null;
        Integer endTime = null;
        BigDecimal current = null;
        BigDecimal size = null;
        Integer recvWindow = null;
        InlineResponse2009 response = api.sapiV1MarginRepayGet(asset, timestamp, signature, txId, startTime, endTime, current, size, recvWindow);

        // TODO: test validations
    }
    /**
     * Margin Account Repay (MARGIN)
     *
     * Repay loan for margin account.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginRepayPostTest() throws ApiException {
        String asset = null;
        Float amount = null;
        Integer timestamp = null;
        String signature = null;
        Integer recvWindow = null;
        Transaction response = api.sapiV1MarginRepayPost(asset, amount, timestamp, signature, recvWindow);

        // TODO: test validations
    }
    /**
     * Get Transfer History (USER_DATA)
     *
     * Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginTransferGetTest() throws ApiException {
        Integer timestamp = null;
        String signature = null;
        String asset = null;
        String type = null;
        Integer startTime = null;
        Integer endTime = null;
        BigDecimal current = null;
        BigDecimal size = null;
        Integer recvWindow = null;
        Object response = api.sapiV1MarginTransferGet(timestamp, signature, asset, type, startTime, endTime, current, size, recvWindow);

        // TODO: test validations
    }
    /**
     * Margin Account Transfer (MARGIN)
     *
     * Execute transfer between spot account and margin account.  Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1MarginTransferPostTest() throws ApiException {
        String asset = null;
        Float amount = null;
        Integer timestamp = null;
        String signature = null;
        Integer type = null;
        Integer recvWindow = null;
        Transaction response = api.sapiV1MarginTransferPost(asset, amount, timestamp, signature, type, recvWindow);

        // TODO: test validations
    }
}
