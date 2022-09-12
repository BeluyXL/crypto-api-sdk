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

import io.cryptoapis.sdk.ApiCallback;
import io.cryptoapis.sdk.ApiClient;
import io.cryptoapis.sdk.ApiException;
import io.cryptoapis.sdk.ApiResponse;
import io.cryptoapis.sdk.Configuration;
import io.cryptoapis.sdk.Pair;
import io.cryptoapis.sdk.ProgressRequestBody;
import io.cryptoapis.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ConvertBitcoinCashAddress402Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress409Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress415Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress429Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress500Response;
import org.openapitools.client.model.GetExchangeRateByAssetSymbols400Response;
import org.openapitools.client.model.GetExchangeRateByAssetSymbols401Response;
import org.openapitools.client.model.GetExchangeRateByAssetSymbols403Response;
import org.openapitools.client.model.GetExchangeRateByAssetSymbols422Response;
import org.openapitools.client.model.GetExchangeRateByAssetSymbolsR;
import org.openapitools.client.model.GetExchangeRateByAssetsIDs400Response;
import org.openapitools.client.model.GetExchangeRateByAssetsIDs401Response;
import org.openapitools.client.model.GetExchangeRateByAssetsIDs403Response;
import org.openapitools.client.model.GetExchangeRateByAssetsIDs422Response;
import org.openapitools.client.model.GetExchangeRateByAssetsIDsR;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ExchangeRatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExchangeRatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExchangeRatesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getExchangeRateByAssetSymbols
     * @param fromAssetSymbol Defines the base asset symbol to get a rate for. (required)
     * @param toAssetSymbol Defines the relation asset symbol in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateByAssetSymbolsCall(String fromAssetSymbol, String toAssetSymbol, String context, Integer calculationTimestamp, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/market-data/exchange-rates/by-symbols/{fromAssetSymbol}/{toAssetSymbol}"
            .replaceAll("\\{" + "fromAssetSymbol" + "\\}", localVarApiClient.escapeString(fromAssetSymbol.toString()))
            .replaceAll("\\{" + "toAssetSymbol" + "\\}", localVarApiClient.escapeString(toAssetSymbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (context != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("context", context));
        }

        if (calculationTimestamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("calculationTimestamp", calculationTimestamp));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExchangeRateByAssetSymbolsValidateBeforeCall(String fromAssetSymbol, String toAssetSymbol, String context, Integer calculationTimestamp, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fromAssetSymbol' is set
        if (fromAssetSymbol == null) {
            throw new ApiException("Missing the required parameter 'fromAssetSymbol' when calling getExchangeRateByAssetSymbols(Async)");
        }
        
        // verify the required parameter 'toAssetSymbol' is set
        if (toAssetSymbol == null) {
            throw new ApiException("Missing the required parameter 'toAssetSymbol' when calling getExchangeRateByAssetSymbols(Async)");
        }
        

        okhttp3.Call localVarCall = getExchangeRateByAssetSymbolsCall(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp, _callback);
        return localVarCall;

    }

    /**
     * Get Exchange Rate By Asset Symbols
     * Through this endpoint customers can obtain exchange rates by asset symbols. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset symbol.
     * @param fromAssetSymbol Defines the base asset symbol to get a rate for. (required)
     * @param toAssetSymbol Defines the relation asset symbol in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @return GetExchangeRateByAssetSymbolsR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public GetExchangeRateByAssetSymbolsR getExchangeRateByAssetSymbols(String fromAssetSymbol, String toAssetSymbol, String context, Integer calculationTimestamp) throws ApiException {
        ApiResponse<GetExchangeRateByAssetSymbolsR> localVarResp = getExchangeRateByAssetSymbolsWithHttpInfo(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp);
        return localVarResp.getData();
    }

    /**
     * Get Exchange Rate By Asset Symbols
     * Through this endpoint customers can obtain exchange rates by asset symbols. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset symbol.
     * @param fromAssetSymbol Defines the base asset symbol to get a rate for. (required)
     * @param toAssetSymbol Defines the relation asset symbol in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @return ApiResponse&lt;GetExchangeRateByAssetSymbolsR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetExchangeRateByAssetSymbolsR> getExchangeRateByAssetSymbolsWithHttpInfo(String fromAssetSymbol, String toAssetSymbol, String context, Integer calculationTimestamp) throws ApiException {
        okhttp3.Call localVarCall = getExchangeRateByAssetSymbolsValidateBeforeCall(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp, null);
        Type localVarReturnType = new TypeToken<GetExchangeRateByAssetSymbolsR>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Exchange Rate By Asset Symbols (asynchronously)
     * Through this endpoint customers can obtain exchange rates by asset symbols. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset symbol.
     * @param fromAssetSymbol Defines the base asset symbol to get a rate for. (required)
     * @param toAssetSymbol Defines the relation asset symbol in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateByAssetSymbolsAsync(String fromAssetSymbol, String toAssetSymbol, String context, Integer calculationTimestamp, final ApiCallback<GetExchangeRateByAssetSymbolsR> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExchangeRateByAssetSymbolsValidateBeforeCall(fromAssetSymbol, toAssetSymbol, context, calculationTimestamp, _callback);
        Type localVarReturnType = new TypeToken<GetExchangeRateByAssetSymbolsR>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getExchangeRateByAssetsIDs
     * @param fromAssetId Defines the base asset Reference ID to get a rate for. (required)
     * @param toAssetId Defines the relation asset Reference ID in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successfull. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateByAssetsIDsCall(String fromAssetId, String toAssetId, String context, Integer calculationTimestamp, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/market-data/exchange-rates/by-asset-ids/{fromAssetId}/{toAssetId}"
            .replaceAll("\\{" + "fromAssetId" + "\\}", localVarApiClient.escapeString(fromAssetId.toString()))
            .replaceAll("\\{" + "toAssetId" + "\\}", localVarApiClient.escapeString(toAssetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (context != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("context", context));
        }

        if (calculationTimestamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("calculationTimestamp", calculationTimestamp));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getExchangeRateByAssetsIDsValidateBeforeCall(String fromAssetId, String toAssetId, String context, Integer calculationTimestamp, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fromAssetId' is set
        if (fromAssetId == null) {
            throw new ApiException("Missing the required parameter 'fromAssetId' when calling getExchangeRateByAssetsIDs(Async)");
        }
        
        // verify the required parameter 'toAssetId' is set
        if (toAssetId == null) {
            throw new ApiException("Missing the required parameter 'toAssetId' when calling getExchangeRateByAssetsIDs(Async)");
        }
        

        okhttp3.Call localVarCall = getExchangeRateByAssetsIDsCall(fromAssetId, toAssetId, context, calculationTimestamp, _callback);
        return localVarCall;

    }

    /**
     * Get Exchange Rate By Assets IDs
     * Through this endpoint customers can obtain exchange rates by asset IDs. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset Reference ID.
     * @param fromAssetId Defines the base asset Reference ID to get a rate for. (required)
     * @param toAssetId Defines the relation asset Reference ID in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @return GetExchangeRateByAssetsIDsR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successfull. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public GetExchangeRateByAssetsIDsR getExchangeRateByAssetsIDs(String fromAssetId, String toAssetId, String context, Integer calculationTimestamp) throws ApiException {
        ApiResponse<GetExchangeRateByAssetsIDsR> localVarResp = getExchangeRateByAssetsIDsWithHttpInfo(fromAssetId, toAssetId, context, calculationTimestamp);
        return localVarResp.getData();
    }

    /**
     * Get Exchange Rate By Assets IDs
     * Through this endpoint customers can obtain exchange rates by asset IDs. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset Reference ID.
     * @param fromAssetId Defines the base asset Reference ID to get a rate for. (required)
     * @param toAssetId Defines the relation asset Reference ID in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @return ApiResponse&lt;GetExchangeRateByAssetsIDsR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successfull. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetExchangeRateByAssetsIDsR> getExchangeRateByAssetsIDsWithHttpInfo(String fromAssetId, String toAssetId, String context, Integer calculationTimestamp) throws ApiException {
        okhttp3.Call localVarCall = getExchangeRateByAssetsIDsValidateBeforeCall(fromAssetId, toAssetId, context, calculationTimestamp, null);
        Type localVarReturnType = new TypeToken<GetExchangeRateByAssetsIDsR>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Exchange Rate By Assets IDs (asynchronously)
     * Through this endpoint customers can obtain exchange rates by asset IDs. The process represents the exchange rate value of a single unit of one asset versus another one. Data is provided per unique asset Reference ID.
     * @param fromAssetId Defines the base asset Reference ID to get a rate for. (required)
     * @param toAssetId Defines the relation asset Reference ID in which the base asset rate will be displayed. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param calculationTimestamp Defines the time of the market data used to calculate the exchange rate in UNIX Timestamp. Oldest possible timestamp is 30 days. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has been successfull. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> 422 </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getExchangeRateByAssetsIDsAsync(String fromAssetId, String toAssetId, String context, Integer calculationTimestamp, final ApiCallback<GetExchangeRateByAssetsIDsR> _callback) throws ApiException {

        okhttp3.Call localVarCall = getExchangeRateByAssetsIDsValidateBeforeCall(fromAssetId, toAssetId, context, calculationTimestamp, _callback);
        Type localVarReturnType = new TypeToken<GetExchangeRateByAssetsIDsR>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
