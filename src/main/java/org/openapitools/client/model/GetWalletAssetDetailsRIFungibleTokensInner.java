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
 * GetWalletAssetDetailsRIFungibleTokensInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetWalletAssetDetailsRIFungibleTokensInner {
  public static final String SERIALIZED_NAME_CONFIRMED_AMOUNT = "confirmedAmount";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_AMOUNT)
  private String confirmedAmount;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetWalletAssetDetailsRIFungibleTokensInner() { 
  }

  public GetWalletAssetDetailsRIFungibleTokensInner confirmedAmount(String confirmedAmount) {
    
    this.confirmedAmount = confirmedAmount;
    return this;
  }

   /**
   * Defines the amount of the fungible tokens.
   * @return confirmedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.254", required = true, value = "Defines the amount of the fungible tokens.")

  public String getConfirmedAmount() {
    return confirmedAmount;
  }


  public void setConfirmedAmount(String confirmedAmount) {
    this.confirmedAmount = confirmedAmount;
  }


  public GetWalletAssetDetailsRIFungibleTokensInner identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xdac17f958d2ee523a2206206994597c13d831ec7", required = true, value = "Defines the specific token identifier. For Bitcoin-based transactions it should be the propertyId and for Ethereum-based transactions - the contract.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public GetWalletAssetDetailsRIFungibleTokensInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the symbol of the fungible tokens.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "Defines the symbol of the fungible tokens.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public GetWalletAssetDetailsRIFungibleTokensInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the specific token type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ERC-20", required = true, value = "Defines the specific token type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWalletAssetDetailsRIFungibleTokensInner getWalletAssetDetailsRIFungibleTokensInner = (GetWalletAssetDetailsRIFungibleTokensInner) o;
    return Objects.equals(this.confirmedAmount, getWalletAssetDetailsRIFungibleTokensInner.confirmedAmount) &&
        Objects.equals(this.identifier, getWalletAssetDetailsRIFungibleTokensInner.identifier) &&
        Objects.equals(this.symbol, getWalletAssetDetailsRIFungibleTokensInner.symbol) &&
        Objects.equals(this.type, getWalletAssetDetailsRIFungibleTokensInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmedAmount, identifier, symbol, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletAssetDetailsRIFungibleTokensInner {\n");
    sb.append("    confirmedAmount: ").append(toIndentedString(confirmedAmount)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("confirmedAmount");
    openapiFields.add("identifier");
    openapiFields.add("symbol");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("confirmedAmount");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWalletAssetDetailsRIFungibleTokensInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWalletAssetDetailsRIFungibleTokensInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWalletAssetDetailsRIFungibleTokensInner is not found in the empty JSON string", GetWalletAssetDetailsRIFungibleTokensInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWalletAssetDetailsRIFungibleTokensInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWalletAssetDetailsRIFungibleTokensInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWalletAssetDetailsRIFungibleTokensInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("confirmedAmount") != null && !jsonObj.get("confirmedAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmedAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmedAmount").toString()));
      }
      if (jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if (jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWalletAssetDetailsRIFungibleTokensInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWalletAssetDetailsRIFungibleTokensInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWalletAssetDetailsRIFungibleTokensInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWalletAssetDetailsRIFungibleTokensInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWalletAssetDetailsRIFungibleTokensInner>() {
           @Override
           public void write(JsonWriter out, GetWalletAssetDetailsRIFungibleTokensInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWalletAssetDetailsRIFungibleTokensInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWalletAssetDetailsRIFungibleTokensInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWalletAssetDetailsRIFungibleTokensInner
  * @throws IOException if the JSON string is invalid with respect to GetWalletAssetDetailsRIFungibleTokensInner
  */
  public static GetWalletAssetDetailsRIFungibleTokensInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWalletAssetDetailsRIFungibleTokensInner.class);
  }

 /**
  * Convert an instance of GetWalletAssetDetailsRIFungibleTokensInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

