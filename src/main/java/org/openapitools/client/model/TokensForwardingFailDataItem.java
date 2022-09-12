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
public class TokensForwardingFailDataItem {
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

  public static final String SERIALIZED_NAME_TRIGGER_TRANSACTION_ID = "triggerTransactionId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TRANSACTION_ID)
  private String triggerTransactionId;

  /**
   * Represents the error code received for the failed token forwarding.
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    NOT_ENOUGH_CREDITS("NOT_ENOUGH_CREDITS"),
    
    FEE_ADDRESS_OUT_OF_FUNDS("FEE_ADDRESS_OUT_OF_FUNDS"),
    
    WRONG_ADDRESS_CREDENTIALS("WRONG_ADDRESS_CREDENTIALS");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public TokensForwardingFailDataItem() { 
  }

  public TokensForwardingFailDataItem blockchain(String blockchain) {
    
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


  public TokensForwardingFailDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TokensForwardingFailDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that provides the tokens.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mizRduUBKEbJ6uzYJUegPh78gEGgM3WjAr", required = true, value = "Represents the hash of the address that provides the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public TokensForwardingFailDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address to forward the tokens to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mnumE76iEKN47bUsdni85oped5D1fRwKWi", required = true, value = "Represents the hash of the address to forward the tokens to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public TokensForwardingFailDataItem triggerTransactionId(String triggerTransactionId) {
    
    this.triggerTransactionId = triggerTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that triggered the token forwarding.
   * @return triggerTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ba1a4e661d36457abc46ea0effef0105f639912119fc64df8fb866118ce7c0d8", required = true, value = "Defines the unique Transaction ID that triggered the token forwarding.")

  public String getTriggerTransactionId() {
    return triggerTransactionId;
  }


  public void setTriggerTransactionId(String triggerTransactionId) {
    this.triggerTransactionId = triggerTransactionId;
  }


  public TokensForwardingFailDataItem errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Represents the error code received for the failed token forwarding.
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FEE_ADDRESS_OUT_OF_FUNDS", required = true, value = "Represents the error code received for the failed token forwarding.")

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public TokensForwardingFailDataItem errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Represents the error message received for the failed token forwarding.
   * @return errorMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "You have insufficient credits.", required = true, value = "Represents the error message received for the failed token forwarding.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensForwardingFailDataItem tokensForwardingFailDataItem = (TokensForwardingFailDataItem) o;
    return Objects.equals(this.blockchain, tokensForwardingFailDataItem.blockchain) &&
        Objects.equals(this.network, tokensForwardingFailDataItem.network) &&
        Objects.equals(this.fromAddress, tokensForwardingFailDataItem.fromAddress) &&
        Objects.equals(this.toAddress, tokensForwardingFailDataItem.toAddress) &&
        Objects.equals(this.triggerTransactionId, tokensForwardingFailDataItem.triggerTransactionId) &&
        Objects.equals(this.errorCode, tokensForwardingFailDataItem.errorCode) &&
        Objects.equals(this.errorMessage, tokensForwardingFailDataItem.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, fromAddress, toAddress, triggerTransactionId, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensForwardingFailDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    triggerTransactionId: ").append(toIndentedString(triggerTransactionId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("triggerTransactionId");
    openapiFields.add("errorCode");
    openapiFields.add("errorMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockchain");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("fromAddress");
    openapiRequiredFields.add("toAddress");
    openapiRequiredFields.add("triggerTransactionId");
    openapiRequiredFields.add("errorCode");
    openapiRequiredFields.add("errorMessage");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TokensForwardingFailDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TokensForwardingFailDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokensForwardingFailDataItem is not found in the empty JSON string", TokensForwardingFailDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TokensForwardingFailDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokensForwardingFailDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokensForwardingFailDataItem.openapiRequiredFields) {
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
      if (jsonObj.get("triggerTransactionId") != null && !jsonObj.get("triggerTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `triggerTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("triggerTransactionId").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if (jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokensForwardingFailDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokensForwardingFailDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokensForwardingFailDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokensForwardingFailDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TokensForwardingFailDataItem>() {
           @Override
           public void write(JsonWriter out, TokensForwardingFailDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokensForwardingFailDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TokensForwardingFailDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokensForwardingFailDataItem
  * @throws IOException if the JSON string is invalid with respect to TokensForwardingFailDataItem
  */
  public static TokensForwardingFailDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokensForwardingFailDataItem.class);
  }

 /**
  * Convert an instance of TokensForwardingFailDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

