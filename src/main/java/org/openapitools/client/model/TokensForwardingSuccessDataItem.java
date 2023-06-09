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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.TokensForwardingSuccessToken;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cryptoapis.sdk.JSON;

/**
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class TokensForwardingSuccessDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_SPENT_FEES_AMOUNT = "spentFeesAmount";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_AMOUNT)
  private String spentFeesAmount;

  public static final String SERIALIZED_NAME_SPENT_FEES_UNIT = "spentFeesUnit";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_UNIT)
  private String spentFeesUnit;

  public static final String SERIALIZED_NAME_TRIGGER_TRANSACTION_ID = "triggerTransactionId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TRANSACTION_ID)
  private String triggerTransactionId;

  public static final String SERIALIZED_NAME_FORWARDING_TRANSACTION_ID = "forwardingTransactionId";
  @SerializedName(SERIALIZED_NAME_FORWARDING_TRANSACTION_ID)
  private String forwardingTransactionId;

  /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
  public enum TokenTypeEnum {
    ERC_20("ERC-20"),
    
    ERC_721("ERC-721"),
    
    OMNI("OMNI");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private TokenTypeEnum tokenType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private TokensForwardingSuccessToken token;

  public TokensForwardingSuccessDataItem() { 
  }

  public TokensForwardingSuccessDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TokensForwardingSuccessDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TokensForwardingSuccessDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that provides the tokens.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mySJoZ6wsjrKXZQRWpGoeBW5KkdKGL79Xz", required = true, value = "Represents the hash of the address that provides the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public TokensForwardingSuccessDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address to forward the tokens to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mmd963W1fECjLyaDCHcioSCZYHkRwjkGST", required = true, value = "Represents the hash of the address to forward the tokens to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public TokensForwardingSuccessDataItem spentFeesAmount(String spentFeesAmount) {
    
    this.spentFeesAmount = spentFeesAmount;
    return this;
  }

   /**
   * Represents the amount of the fee spent for the tokens to be forwarded.
   * @return spentFeesAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00013601", required = true, value = "Represents the amount of the fee spent for the tokens to be forwarded.")

  public String getSpentFeesAmount() {
    return spentFeesAmount;
  }


  public void setSpentFeesAmount(String spentFeesAmount) {
    this.spentFeesAmount = spentFeesAmount;
  }


  public TokensForwardingSuccessDataItem spentFeesUnit(String spentFeesUnit) {
    
    this.spentFeesUnit = spentFeesUnit;
    return this;
  }

   /**
   * Represents the unit of the fee spent for the tokens to be forwarded, e.g. BTC.
   * @return spentFeesUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Represents the unit of the fee spent for the tokens to be forwarded, e.g. BTC.")

  public String getSpentFeesUnit() {
    return spentFeesUnit;
  }


  public void setSpentFeesUnit(String spentFeesUnit) {
    this.spentFeesUnit = spentFeesUnit;
  }


  public TokensForwardingSuccessDataItem triggerTransactionId(String triggerTransactionId) {
    
    this.triggerTransactionId = triggerTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that triggered the token forwarding.
   * @return triggerTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6ed1f1c8f2887a78ee8c45a975d928ca63eafc7b63def56324606ddd3cc9854f", required = true, value = "Defines the unique Transaction ID that triggered the token forwarding.")

  public String getTriggerTransactionId() {
    return triggerTransactionId;
  }


  public void setTriggerTransactionId(String triggerTransactionId) {
    this.triggerTransactionId = triggerTransactionId;
  }


  public TokensForwardingSuccessDataItem forwardingTransactionId(String forwardingTransactionId) {
    
    this.forwardingTransactionId = forwardingTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that forwarded the tokens.
   * @return forwardingTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b15ab5bbaf5107d551ae1b50181f4c55959205c4ff843e3c10d86d00e690fc72", required = true, value = "Defines the unique Transaction ID that forwarded the tokens.")

  public String getForwardingTransactionId() {
    return forwardingTransactionId;
  }


  public void setForwardingTransactionId(String forwardingTransactionId) {
    this.forwardingTransactionId = forwardingTransactionId;
  }


  public TokensForwardingSuccessDataItem tokenType(TokenTypeEnum tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OMNI", required = true, value = "Defines the type of token sent with the transaction, e.g. ERC 20.")

  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  public TokensForwardingSuccessDataItem token(TokensForwardingSuccessToken token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TokensForwardingSuccessToken getToken() {
    return token;
  }


  public void setToken(TokensForwardingSuccessToken token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensForwardingSuccessDataItem tokensForwardingSuccessDataItem = (TokensForwardingSuccessDataItem) o;
    return Objects.equals(this.blockchain, tokensForwardingSuccessDataItem.blockchain) &&
        Objects.equals(this.network, tokensForwardingSuccessDataItem.network) &&
        Objects.equals(this.fromAddress, tokensForwardingSuccessDataItem.fromAddress) &&
        Objects.equals(this.toAddress, tokensForwardingSuccessDataItem.toAddress) &&
        Objects.equals(this.spentFeesAmount, tokensForwardingSuccessDataItem.spentFeesAmount) &&
        Objects.equals(this.spentFeesUnit, tokensForwardingSuccessDataItem.spentFeesUnit) &&
        Objects.equals(this.triggerTransactionId, tokensForwardingSuccessDataItem.triggerTransactionId) &&
        Objects.equals(this.forwardingTransactionId, tokensForwardingSuccessDataItem.forwardingTransactionId) &&
        Objects.equals(this.tokenType, tokensForwardingSuccessDataItem.tokenType) &&
        Objects.equals(this.token, tokensForwardingSuccessDataItem.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, fromAddress, toAddress, spentFeesAmount, spentFeesUnit, triggerTransactionId, forwardingTransactionId, tokenType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensForwardingSuccessDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    spentFeesAmount: ").append(toIndentedString(spentFeesAmount)).append("\n");
    sb.append("    spentFeesUnit: ").append(toIndentedString(spentFeesUnit)).append("\n");
    sb.append("    triggerTransactionId: ").append(toIndentedString(triggerTransactionId)).append("\n");
    sb.append("    forwardingTransactionId: ").append(toIndentedString(forwardingTransactionId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("blockchain");
    openapiFields.add("network");
    openapiFields.add("fromAddress");
    openapiFields.add("toAddress");
    openapiFields.add("spentFeesAmount");
    openapiFields.add("spentFeesUnit");
    openapiFields.add("triggerTransactionId");
    openapiFields.add("forwardingTransactionId");
    openapiFields.add("tokenType");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockchain");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("fromAddress");
    openapiRequiredFields.add("toAddress");
    openapiRequiredFields.add("spentFeesAmount");
    openapiRequiredFields.add("spentFeesUnit");
    openapiRequiredFields.add("triggerTransactionId");
    openapiRequiredFields.add("forwardingTransactionId");
    openapiRequiredFields.add("tokenType");
    openapiRequiredFields.add("token");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokensForwardingSuccessDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TokensForwardingSuccessDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokensForwardingSuccessDataItem is not found in the empty JSON string", TokensForwardingSuccessDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokensForwardingSuccessDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokensForwardingSuccessDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokensForwardingSuccessDataItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("blockchain") != null && !jsonObj.get("blockchain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockchain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockchain").toString()));
      }
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if (jsonObj.get("fromAddress") != null && !jsonObj.get("fromAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromAddress").toString()));
      }
      if (jsonObj.get("toAddress") != null && !jsonObj.get("toAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toAddress").toString()));
      }
      if (jsonObj.get("spentFeesAmount") != null && !jsonObj.get("spentFeesAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spentFeesAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spentFeesAmount").toString()));
      }
      if (jsonObj.get("spentFeesUnit") != null && !jsonObj.get("spentFeesUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spentFeesUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spentFeesUnit").toString()));
      }
      if (jsonObj.get("triggerTransactionId") != null && !jsonObj.get("triggerTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `triggerTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("triggerTransactionId").toString()));
      }
      if (jsonObj.get("forwardingTransactionId") != null && !jsonObj.get("forwardingTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forwardingTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forwardingTransactionId").toString()));
      }
      if (jsonObj.get("tokenType") != null && !jsonObj.get("tokenType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenType").toString()));
      }
      // validate the optional field `token`
      if (jsonObj.getAsJsonObject("token") != null) {
        TokensForwardingSuccessToken.validateJsonObject(jsonObj.getAsJsonObject("token"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokensForwardingSuccessDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokensForwardingSuccessDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokensForwardingSuccessDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokensForwardingSuccessDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TokensForwardingSuccessDataItem>() {
           @Override
           public void write(JsonWriter out, TokensForwardingSuccessDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokensForwardingSuccessDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokensForwardingSuccessDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokensForwardingSuccessDataItem
  * @throws IOException if the JSON string is invalid with respect to TokensForwardingSuccessDataItem
  */
  public static TokensForwardingSuccessDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokensForwardingSuccessDataItem.class);
  }

 /**
  * Convert an instance of TokensForwardingSuccessDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

