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
import org.openapitools.client.model.GetLatestMinedXRPRippleBlockRITotalCoins;
import org.openapitools.client.model.GetLatestMinedXRPRippleBlockRITotalFees;

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
 * GetLatestMinedXRPRippleBlockRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetLatestMinedXRPRippleBlockRI {
  public static final String SERIALIZED_NAME_BLOCK_HASH = "blockHash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_BLOCK_HEIGHT = "blockHeight";
  @SerializedName(SERIALIZED_NAME_BLOCK_HEIGHT)
  private Integer blockHeight;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public static final String SERIALIZED_NAME_TOTAL_COINS = "totalCoins";
  @SerializedName(SERIALIZED_NAME_TOTAL_COINS)
  private GetLatestMinedXRPRippleBlockRITotalCoins totalCoins;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private GetLatestMinedXRPRippleBlockRITotalFees totalFees;

  public GetLatestMinedXRPRippleBlockRI() { 
  }

  public GetLatestMinedXRPRippleBlockRI blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return blockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f9b304b7933ef298142fdd58ad2dec414a5267dcbbd8a4fe9fc2c0a5f9dde050", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public GetLatestMinedXRPRippleBlockRI blockHeight(Integer blockHeight) {
    
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return blockHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15975748", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getBlockHeight() {
    return blockHeight;
  }


  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }


  public GetLatestMinedXRPRippleBlockRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "de9f9e5b68a1322a16f0d1217cf31765e9101764e6e2f3c7aa058b8c641da37a", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public GetLatestMinedXRPRippleBlockRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1616430182", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetLatestMinedXRPRippleBlockRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  public GetLatestMinedXRPRippleBlockRI totalCoins(GetLatestMinedXRPRippleBlockRITotalCoins totalCoins) {
    
    this.totalCoins = totalCoins;
    return this;
  }

   /**
   * Get totalCoins
   * @return totalCoins
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetLatestMinedXRPRippleBlockRITotalCoins getTotalCoins() {
    return totalCoins;
  }


  public void setTotalCoins(GetLatestMinedXRPRippleBlockRITotalCoins totalCoins) {
    this.totalCoins = totalCoins;
  }


  public GetLatestMinedXRPRippleBlockRI totalFees(GetLatestMinedXRPRippleBlockRITotalFees totalFees) {
    
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Get totalFees
   * @return totalFees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetLatestMinedXRPRippleBlockRITotalFees getTotalFees() {
    return totalFees;
  }


  public void setTotalFees(GetLatestMinedXRPRippleBlockRITotalFees totalFees) {
    this.totalFees = totalFees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLatestMinedXRPRippleBlockRI getLatestMinedXRPRippleBlockRI = (GetLatestMinedXRPRippleBlockRI) o;
    return Objects.equals(this.blockHash, getLatestMinedXRPRippleBlockRI.blockHash) &&
        Objects.equals(this.blockHeight, getLatestMinedXRPRippleBlockRI.blockHeight) &&
        Objects.equals(this.previousBlockHash, getLatestMinedXRPRippleBlockRI.previousBlockHash) &&
        Objects.equals(this.timestamp, getLatestMinedXRPRippleBlockRI.timestamp) &&
        Objects.equals(this.transactionsCount, getLatestMinedXRPRippleBlockRI.transactionsCount) &&
        Objects.equals(this.totalCoins, getLatestMinedXRPRippleBlockRI.totalCoins) &&
        Objects.equals(this.totalFees, getLatestMinedXRPRippleBlockRI.totalFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHash, blockHeight, previousBlockHash, timestamp, transactionsCount, totalCoins, totalFees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLatestMinedXRPRippleBlockRI {\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    totalCoins: ").append(toIndentedString(totalCoins)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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
    openapiFields.add("blockHash");
    openapiFields.add("blockHeight");
    openapiFields.add("previousBlockHash");
    openapiFields.add("timestamp");
    openapiFields.add("transactionsCount");
    openapiFields.add("totalCoins");
    openapiFields.add("totalFees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockHash");
    openapiRequiredFields.add("blockHeight");
    openapiRequiredFields.add("previousBlockHash");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionsCount");
    openapiRequiredFields.add("totalCoins");
    openapiRequiredFields.add("totalFees");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetLatestMinedXRPRippleBlockRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetLatestMinedXRPRippleBlockRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLatestMinedXRPRippleBlockRI is not found in the empty JSON string", GetLatestMinedXRPRippleBlockRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetLatestMinedXRPRippleBlockRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLatestMinedXRPRippleBlockRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetLatestMinedXRPRippleBlockRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("blockHash") != null && !jsonObj.get("blockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockHash").toString()));
      }
      if (jsonObj.get("previousBlockHash") != null && !jsonObj.get("previousBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousBlockHash").toString()));
      }
      // validate the optional field `totalCoins`
      if (jsonObj.getAsJsonObject("totalCoins") != null) {
        GetLatestMinedXRPRippleBlockRITotalCoins.validateJsonObject(jsonObj.getAsJsonObject("totalCoins"));
      }
      // validate the optional field `totalFees`
      if (jsonObj.getAsJsonObject("totalFees") != null) {
        GetLatestMinedXRPRippleBlockRITotalFees.validateJsonObject(jsonObj.getAsJsonObject("totalFees"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLatestMinedXRPRippleBlockRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLatestMinedXRPRippleBlockRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLatestMinedXRPRippleBlockRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLatestMinedXRPRippleBlockRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLatestMinedXRPRippleBlockRI>() {
           @Override
           public void write(JsonWriter out, GetLatestMinedXRPRippleBlockRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLatestMinedXRPRippleBlockRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLatestMinedXRPRippleBlockRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLatestMinedXRPRippleBlockRI
  * @throws IOException if the JSON string is invalid with respect to GetLatestMinedXRPRippleBlockRI
  */
  public static GetLatestMinedXRPRippleBlockRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLatestMinedXRPRippleBlockRI.class);
  }

 /**
  * Convert an instance of GetLatestMinedXRPRippleBlockRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

