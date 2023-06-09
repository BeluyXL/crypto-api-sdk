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
 * ERC-721
 */
@ApiModel(description = "ERC-721")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ConfirmedTokensTransactionForCertainAmountOrHigherErc721 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public ConfirmedTokensTransactionForCertainAmountOrHigherErc721() { 
  }

  public ConfirmedTokensTransactionForCertainAmountOrHigherErc721 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the token.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Wonky Stonks", required = true, value = "Specifies the name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConfirmedTokensTransactionForCertainAmountOrHigherErc721 symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WSTK", required = true, value = "Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ConfirmedTokensTransactionForCertainAmountOrHigherErc721 tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Specifies the ID of the token.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5027", required = true, value = "Specifies the ID of the token.")

  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public ConfirmedTokensTransactionForCertainAmountOrHigherErc721 contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Specifies the address of the contract.
   * @return contractAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x518ba36f1ca6dfe3bb1b098b8dd0444030e79d9f", required = true, value = "Specifies the address of the contract.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmedTokensTransactionForCertainAmountOrHigherErc721 confirmedTokensTransactionForCertainAmountOrHigherErc721 = (ConfirmedTokensTransactionForCertainAmountOrHigherErc721) o;
    return Objects.equals(this.name, confirmedTokensTransactionForCertainAmountOrHigherErc721.name) &&
        Objects.equals(this.symbol, confirmedTokensTransactionForCertainAmountOrHigherErc721.symbol) &&
        Objects.equals(this.tokenId, confirmedTokensTransactionForCertainAmountOrHigherErc721.tokenId) &&
        Objects.equals(this.contractAddress, confirmedTokensTransactionForCertainAmountOrHigherErc721.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, tokenId, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmedTokensTransactionForCertainAmountOrHigherErc721 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("symbol");
    openapiFields.add("tokenId");
    openapiFields.add("contractAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("tokenId");
    openapiRequiredFields.add("contractAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfirmedTokensTransactionForCertainAmountOrHigherErc721
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfirmedTokensTransactionForCertainAmountOrHigherErc721.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfirmedTokensTransactionForCertainAmountOrHigherErc721 is not found in the empty JSON string", ConfirmedTokensTransactionForCertainAmountOrHigherErc721.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfirmedTokensTransactionForCertainAmountOrHigherErc721.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfirmedTokensTransactionForCertainAmountOrHigherErc721` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfirmedTokensTransactionForCertainAmountOrHigherErc721.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if (jsonObj.get("tokenId") != null && !jsonObj.get("tokenId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenId").toString()));
      }
      if (jsonObj.get("contractAddress") != null && !jsonObj.get("contractAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfirmedTokensTransactionForCertainAmountOrHigherErc721.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfirmedTokensTransactionForCertainAmountOrHigherErc721' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfirmedTokensTransactionForCertainAmountOrHigherErc721> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfirmedTokensTransactionForCertainAmountOrHigherErc721.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfirmedTokensTransactionForCertainAmountOrHigherErc721>() {
           @Override
           public void write(JsonWriter out, ConfirmedTokensTransactionForCertainAmountOrHigherErc721 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfirmedTokensTransactionForCertainAmountOrHigherErc721 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfirmedTokensTransactionForCertainAmountOrHigherErc721 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfirmedTokensTransactionForCertainAmountOrHigherErc721
  * @throws IOException if the JSON string is invalid with respect to ConfirmedTokensTransactionForCertainAmountOrHigherErc721
  */
  public static ConfirmedTokensTransactionForCertainAmountOrHigherErc721 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfirmedTokensTransactionForCertainAmountOrHigherErc721.class);
  }

 /**
  * Convert an instance of ConfirmedTokensTransactionForCertainAmountOrHigherErc721 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

