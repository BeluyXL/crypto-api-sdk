/*
 * CryptoAPIs
 * Crypto APIs is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2021-03-20
 * Contact: developers@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import io.cryptoapis.sdk.ApiException;
import org.openapitools.client.model.ConvertBitcoinCashAddress402Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress409Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress415Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress422Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress429Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress500Response;
import org.openapitools.client.model.GetAddressDetailsFromCallback400Response;
import org.openapitools.client.model.GetAddressDetailsFromCallback401Response;
import org.openapitools.client.model.GetAddressDetailsFromCallback403Response;
import org.openapitools.client.model.GetAddressDetailsFromCallback404Response;
import org.openapitools.client.model.GetAddressDetailsFromCallbackR;
import org.openapitools.client.model.GetBlockDetailsByBlockHashFromCallback400Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHashFromCallback401Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHashFromCallback403Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHashFromCallbackR;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightFromCallback400Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightFromCallback401Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightFromCallback403Response;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightFromCallbackR;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallback400Response;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallback401Response;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallback403Response;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallbackR;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionID404Response;
import org.openapitools.client.model.ListTransactionsByBlockHeight404Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CallbackDataApi
 */
@Disabled
public class CallbackDataApiTest {

    private final CallbackDataApi api = new CallbackDataApi();

    /**
     * Get Address Details From Callback
     *
     * This endpoint creates a shortcut to obtain information from Blockchain data by going through Blockchain Events and a specific Event Subscription. It provides data for a specific address from the Event it takes part in only if the address already exists in the blockchain events subscriptions. It applies only for Events related to that customer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAddressDetailsFromCallbackTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String address = null;
        String context = null;
        GetAddressDetailsFromCallbackR response = api.getAddressDetailsFromCallback(blockchain, network, address, context);
        // TODO: test validations
    }

    /**
     * Get Block Details By Block Hash From Callback
     *
     * This endpoint creates a shortcut to obtain information from Blockchain data by going through Blockchain Events and a specific Event Subscription. It provides data for a specific block by providing the &#x60;blockHash&#x60; attribute from the Event it takes part in and after making check that the customer in question does have a subscription for this block. It applies only for Events related to that user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBlockDetailsByBlockHashFromCallbackTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String blockHash = null;
        String context = null;
        GetBlockDetailsByBlockHashFromCallbackR response = api.getBlockDetailsByBlockHashFromCallback(blockchain, network, blockHash, context);
        // TODO: test validations
    }

    /**
     * Get Block Details By Block Height From Callback
     *
     * This endpoint creates a shortcut to obtain information from Blockchain data by going through Blockchain Events and a specific Event Subscription. It provides data for the specific Block by providing the &#x60;blockHeight&#x60; attribute from the Event it takes part in. It applies only for Events related to that user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBlockDetailsByBlockHeightFromCallbackTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String blockHeight = null;
        String context = null;
        GetBlockDetailsByBlockHeightFromCallbackR response = api.getBlockDetailsByBlockHeightFromCallback(blockchain, network, blockHeight, context);
        // TODO: test validations
    }

    /**
     * Get Transaction Details By Transaction ID From Callback
     *
     * This endpoint creates a shortcut to obtain information from Blockchain data by going through Blockchain Events and a specific Event Subscription. It provides data for a specific transaction from the Event it takes part in by providing the &#x60;transactionId&#x60; attribute. It applies only for Events related to that user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionDetailsByTransactionIDFromCallbackTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String transactionId = null;
        String context = null;
        GetTransactionDetailsByTransactionIDFromCallbackR response = api.getTransactionDetailsByTransactionIDFromCallback(blockchain, network, transactionId, context);
        // TODO: test validations
    }

}
