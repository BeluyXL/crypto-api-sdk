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
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBS;

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
 * GetBlockDetailsByBlockHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashRI {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_NEXT_BLOCK_HASH = "nextBlockHash";
  @SerializedName(SERIALIZED_NAME_NEXT_BLOCK_HASH)
  private String nextBlockHash;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private GetBlockDetailsByBlockHashRIBS blockchainSpecific;

  public GetBlockDetailsByBlockHashRI() { 
  }

  public GetBlockDetailsByBlockHashRI hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return hash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0000000006b3f483bec16b8a85c632bdd30a14a202c83a9148002c9ee441dd0c", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public GetBlockDetailsByBlockHashRI height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1941208", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public GetBlockDetailsByBlockHashRI nextBlockHash(String nextBlockHash) {
    
    this.nextBlockHash = nextBlockHash;
    return this;
  }

   /**
   * Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.
   * @return nextBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0000000000000003b08ca90b701da447fb3e7c5c6b43acd33a5e4062fe98dea5", required = true, value = "Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.")

  public String getNextBlockHash() {
    return nextBlockHash;
  }


  public void setNextBlockHash(String nextBlockHash) {
    this.nextBlockHash = nextBlockHash;
  }


  public GetBlockDetailsByBlockHashRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000844434fd86a630ba8e29503d5396a2b6c4003d69bf0a08d96169d4cd", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public GetBlockDetailsByBlockHashRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1615378134", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetBlockDetailsByBlockHashRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "145", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  public GetBlockDetailsByBlockHashRI blockchainSpecific(GetBlockDetailsByBlockHashRIBS blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetBlockDetailsByBlockHashRIBS getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(GetBlockDetailsByBlockHashRIBS blockchainSpecific) {
    this.blockchainSpecific = blockchainSpecific;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashRI getBlockDetailsByBlockHashRI = (GetBlockDetailsByBlockHashRI) o;
    return Objects.equals(this.hash, getBlockDetailsByBlockHashRI.hash) &&
        Objects.equals(this.height, getBlockDetailsByBlockHashRI.height) &&
        Objects.equals(this.nextBlockHash, getBlockDetailsByBlockHashRI.nextBlockHash) &&
        Objects.equals(this.previousBlockHash, getBlockDetailsByBlockHashRI.previousBlockHash) &&
        Objects.equals(this.timestamp, getBlockDetailsByBlockHashRI.timestamp) &&
        Objects.equals(this.transactionsCount, getBlockDetailsByBlockHashRI.transactionsCount) &&
        Objects.equals(this.blockchainSpecific, getBlockDetailsByBlockHashRI.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, height, nextBlockHash, previousBlockHash, timestamp, transactionsCount, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashRI {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    nextBlockHash: ").append(toIndentedString(nextBlockHash)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    blockchainSpecific: ").append(toIndentedString(blockchainSpecific)).append("\n");
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
    openapiFields.add("hash");
    openapiFields.add("height");
    openapiFields.add("nextBlockHash");
    openapiFields.add("previousBlockHash");
    openapiFields.add("timestamp");
    openapiFields.add("transactionsCount");
    openapiFields.add("blockchainSpecific");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hash");
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("nextBlockHash");
    openapiRequiredFields.add("previousBlockHash");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionsCount");
    openapiRequiredFields.add("blockchainSpecific");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBlockDetailsByBlockHashRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetBlockDetailsByBlockHashRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBlockDetailsByBlockHashRI is not found in the empty JSON string", GetBlockDetailsByBlockHashRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetBlockDetailsByBlockHashRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBlockDetailsByBlockHashRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetBlockDetailsByBlockHashRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
      if (jsonObj.get("nextBlockHash") != null && !jsonObj.get("nextBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextBlockHash").toString()));
      }
      if (jsonObj.get("previousBlockHash") != null && !jsonObj.get("previousBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousBlockHash").toString()));
      }
      // validate the optional field `blockchainSpecific`
      if (jsonObj.getAsJsonObject("blockchainSpecific") != null) {
        GetBlockDetailsByBlockHashRIBS.validateJsonObject(jsonObj.getAsJsonObject("blockchainSpecific"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBlockDetailsByBlockHashRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBlockDetailsByBlockHashRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBlockDetailsByBlockHashRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHashRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBlockDetailsByBlockHashRI>() {
           @Override
           public void write(JsonWriter out, GetBlockDetailsByBlockHashRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBlockDetailsByBlockHashRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBlockDetailsByBlockHashRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBlockDetailsByBlockHashRI
  * @throws IOException if the JSON string is invalid with respect to GetBlockDetailsByBlockHashRI
  */
  public static GetBlockDetailsByBlockHashRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBlockDetailsByBlockHashRI.class);
  }

 /**
  * Convert an instance of GetBlockDetailsByBlockHashRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

