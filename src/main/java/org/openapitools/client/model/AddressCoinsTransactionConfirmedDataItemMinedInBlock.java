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
 * Defines the block height in which this transaction was mined and confirmed in.
 */
@ApiModel(description = "Defines the block height in which this transaction was mined and confirmed in.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class AddressCoinsTransactionConfirmedDataItemMinedInBlock {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public AddressCoinsTransactionConfirmedDataItemMinedInBlock() { 
  }

  public AddressCoinsTransactionConfirmedDataItemMinedInBlock height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Defines the number of blocks in the blockchain preceding this specific block.
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "667861", required = true, value = "Defines the number of blocks in the blockchain preceding this specific block.")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public AddressCoinsTransactionConfirmedDataItemMinedInBlock hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Represents the hash of the block&#39;s header, i.e. an output that has a fixed length.
   * @return hash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b00d27cccd5e4f4fa1b28824d9a1e5fef88e6c37cdeb09e37eb39aa1d3d63448", required = true, value = "Represents the hash of the block's header, i.e. an output that has a fixed length.")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public AddressCoinsTransactionConfirmedDataItemMinedInBlock timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this transaction was mined in seconds since Unix Epoch time.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1610365213", required = true, value = "Defines the exact date/time when this transaction was mined in seconds since Unix Epoch time.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCoinsTransactionConfirmedDataItemMinedInBlock addressCoinsTransactionConfirmedDataItemMinedInBlock = (AddressCoinsTransactionConfirmedDataItemMinedInBlock) o;
    return Objects.equals(this.height, addressCoinsTransactionConfirmedDataItemMinedInBlock.height) &&
        Objects.equals(this.hash, addressCoinsTransactionConfirmedDataItemMinedInBlock.hash) &&
        Objects.equals(this.timestamp, addressCoinsTransactionConfirmedDataItemMinedInBlock.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, hash, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCoinsTransactionConfirmedDataItemMinedInBlock {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("hash");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("hash");
    openapiRequiredFields.add("timestamp");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressCoinsTransactionConfirmedDataItemMinedInBlock
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressCoinsTransactionConfirmedDataItemMinedInBlock.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressCoinsTransactionConfirmedDataItemMinedInBlock is not found in the empty JSON string", AddressCoinsTransactionConfirmedDataItemMinedInBlock.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressCoinsTransactionConfirmedDataItemMinedInBlock.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressCoinsTransactionConfirmedDataItemMinedInBlock` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressCoinsTransactionConfirmedDataItemMinedInBlock.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("hash") != null && !jsonObj.get("hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressCoinsTransactionConfirmedDataItemMinedInBlock.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressCoinsTransactionConfirmedDataItemMinedInBlock' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressCoinsTransactionConfirmedDataItemMinedInBlock> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressCoinsTransactionConfirmedDataItemMinedInBlock.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressCoinsTransactionConfirmedDataItemMinedInBlock>() {
           @Override
           public void write(JsonWriter out, AddressCoinsTransactionConfirmedDataItemMinedInBlock value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressCoinsTransactionConfirmedDataItemMinedInBlock read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressCoinsTransactionConfirmedDataItemMinedInBlock given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressCoinsTransactionConfirmedDataItemMinedInBlock
  * @throws IOException if the JSON string is invalid with respect to AddressCoinsTransactionConfirmedDataItemMinedInBlock
  */
  public static AddressCoinsTransactionConfirmedDataItemMinedInBlock fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressCoinsTransactionConfirmedDataItemMinedInBlock.class);
  }

 /**
  * Convert an instance of AddressCoinsTransactionConfirmedDataItemMinedInBlock to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

