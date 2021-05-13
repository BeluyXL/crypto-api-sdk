/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: developers@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import io.cryptoapis.sdk.ApiException;
import org.openapitools.client.model.CouldNotCalculateRateForPair;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.GetExchangeRateByAssetSymbolsR;
import org.openapitools.client.model.GetExchangeRateByAssetsIDsR;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.RequestLimitReached;
import org.openapitools.client.model.UnexpectedServerError;
import org.openapitools.client.model.UnsupportedMediaType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeRatesApi
 */
@Ignore
public class ExchangeRatesApiTest {

    private final ExchangeRatesApi api = new ExchangeRatesApi();

    
    /**
     * Get Exchange Rate By Asset Symbols
     *
     * Through this endpoint customers can obtain exchange rates by asset symbols. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExchangeRateByAssetSymbolsTest() throws ApiException {
        String fromAssetSymbol = null;
        String toAssetSymbol = null;
        String context = null;
        GetExchangeRateByAssetSymbolsR response = api.getExchangeRateByAssetSymbols(fromAssetSymbol, toAssetSymbol, context);

        // TODO: test validations
    }
    
    /**
     * Get Exchange Rate By Assets IDs
     *
     * Through this endpoint customers can obtain exchange rates by asset IDs. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset Reference ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExchangeRateByAssetsIDsTest() throws ApiException {
        String fromAssetId = null;
        String toAssetId = null;
        String context = null;
        GetExchangeRateByAssetsIDsR response = api.getExchangeRateByAssetsIDs(fromAssetId, toAssetId, context);

        // TODO: test validations
    }
    
}
