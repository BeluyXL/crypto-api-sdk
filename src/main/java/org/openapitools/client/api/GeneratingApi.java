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
import org.openapitools.client.model.ConvertBitcoinCashAddress422Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress429Response;
import org.openapitools.client.model.ConvertBitcoinCashAddress500Response;
import org.openapitools.client.model.GenerateDepositAddress400Response;
import org.openapitools.client.model.GenerateDepositAddress401Response;
import org.openapitools.client.model.GenerateDepositAddress403Response;
import org.openapitools.client.model.GenerateDepositAddressR;
import org.openapitools.client.model.GenerateDepositAddressRB;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionID404Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GeneratingApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeneratingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeneratingApi(ApiClient apiClient) {
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
     * Build call for generateDepositAddress
     * @param blockchain Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. (required)
     * @param network Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. (required)
     * @param walletId Represents the unique ID of the specific Wallet. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param generateDepositAddressRB  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The resource has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource has not been found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateDepositAddressCall(String blockchain, String network, String walletId, String context, GenerateDepositAddressRB generateDepositAddressRB, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = generateDepositAddressRB;

        // create path and map variables
        String localVarPath = "/wallet-as-a-service/wallets/{walletId}/{blockchain}/{network}/addresses"
            .replaceAll("\\{" + "blockchain" + "\\}", localVarApiClient.escapeString(blockchain.toString()))
            .replaceAll("\\{" + "network" + "\\}", localVarApiClient.escapeString(network.toString()))
            .replaceAll("\\{" + "walletId" + "\\}", localVarApiClient.escapeString(walletId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (context != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("context", context));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateDepositAddressValidateBeforeCall(String blockchain, String network, String walletId, String context, GenerateDepositAddressRB generateDepositAddressRB, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'blockchain' is set
        if (blockchain == null) {
            throw new ApiException("Missing the required parameter 'blockchain' when calling generateDepositAddress(Async)");
        }
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling generateDepositAddress(Async)");
        }
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new ApiException("Missing the required parameter 'walletId' when calling generateDepositAddress(Async)");
        }
        

        okhttp3.Call localVarCall = generateDepositAddressCall(blockchain, network, walletId, context, generateDepositAddressRB, _callback);
        return localVarCall;

    }

    /**
     * Generate Deposit Address
     * Through this endpoint customers can generate a new Receiving/Deposit Addresses into their Wallet.
     * @param blockchain Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. (required)
     * @param network Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. (required)
     * @param walletId Represents the unique ID of the specific Wallet. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param generateDepositAddressRB  (optional)
     * @return GenerateDepositAddressR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The resource has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource has not been found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public GenerateDepositAddressR generateDepositAddress(String blockchain, String network, String walletId, String context, GenerateDepositAddressRB generateDepositAddressRB) throws ApiException {
        ApiResponse<GenerateDepositAddressR> localVarResp = generateDepositAddressWithHttpInfo(blockchain, network, walletId, context, generateDepositAddressRB);
        return localVarResp.getData();
    }

    /**
     * Generate Deposit Address
     * Through this endpoint customers can generate a new Receiving/Deposit Addresses into their Wallet.
     * @param blockchain Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. (required)
     * @param network Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. (required)
     * @param walletId Represents the unique ID of the specific Wallet. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param generateDepositAddressRB  (optional)
     * @return ApiResponse&lt;GenerateDepositAddressR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The resource has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource has not been found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GenerateDepositAddressR> generateDepositAddressWithHttpInfo(String blockchain, String network, String walletId, String context, GenerateDepositAddressRB generateDepositAddressRB) throws ApiException {
        okhttp3.Call localVarCall = generateDepositAddressValidateBeforeCall(blockchain, network, walletId, context, generateDepositAddressRB, null);
        Type localVarReturnType = new TypeToken<GenerateDepositAddressR>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Generate Deposit Address (asynchronously)
     * Through this endpoint customers can generate a new Receiving/Deposit Addresses into their Wallet.
     * @param blockchain Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. (required)
     * @param network Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. (required)
     * @param walletId Represents the unique ID of the specific Wallet. (required)
     * @param context In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. (optional)
     * @param generateDepositAddressRB  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The resource has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> 400 </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource has not been found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The data provided seems to be invalid. </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Your request body for POST requests must have a structure of { data: { item: [...properties] } } </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call generateDepositAddressAsync(String blockchain, String network, String walletId, String context, GenerateDepositAddressRB generateDepositAddressRB, final ApiCallback<GenerateDepositAddressR> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateDepositAddressValidateBeforeCall(blockchain, network, walletId, context, generateDepositAddressRB, _callback);
        Type localVarReturnType = new TypeToken<GenerateDepositAddressR>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
