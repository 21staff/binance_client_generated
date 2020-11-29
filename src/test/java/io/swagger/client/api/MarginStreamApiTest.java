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
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse20031;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarginStreamApi
 */
@Ignore
public class MarginStreamApiTest {

    private final MarginStreamApi api = new MarginStreamApi();

    /**
     * Close a ListenKey (USER_STREAM)
     *
     * Close out a user data stream. Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1UserDataStreamDeleteTest() throws ApiException {
        String listenKey = null;
        Object response = api.sapiV1UserDataStreamDelete(listenKey);

        // TODO: test validations
    }
    /**
     * Create a ListenKey (USER_STREAM)
     *
     * Start a new user data stream.  The stream will close after 60 minutes unless a keepalive is sent. If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes. Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1UserDataStreamPostTest() throws ApiException {
        InlineResponse20031 response = api.sapiV1UserDataStreamPost();

        // TODO: test validations
    }
    /**
     * Ping/Keep-alive a ListenKey (USER_STREAM)
     *
     * Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes. It&#x27;s recommended to send a ping about every 30 minutes. Weight: 1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sapiV1UserDataStreamPutTest() throws ApiException {
        String listenKey = null;
        Object response = api.sapiV1UserDataStreamPut(listenKey);

        // TODO: test validations
    }
}
