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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BannedIpAddressDetailsInner;

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
 * blockchain_data_transaction_not_found
 */
@ApiModel(description = "blockchain_data_transaction_not_found")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class BlockchainDataTransactionNotFound {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<BannedIpAddressDetailsInner> details = null;

  public BlockchainDataTransactionNotFound() { 
  }

  public BlockchainDataTransactionNotFound code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Specifies an error code, e.g. error 404.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "blockchain_data_transaction_not_found", required = true, value = "Specifies an error code, e.g. error 404.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public BlockchainDataTransactionNotFound message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Specifies the message of the error, i.e. why the error was returned, e.g. error 404 stands for “not found”.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The specified transaction has not been found on the specific blockchain.", required = true, value = "Specifies the message of the error, i.e. why the error was returned, e.g. error 404 stands for “not found”.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public BlockchainDataTransactionNotFound details(List<BannedIpAddressDetailsInner> details) {
    
    this.details = details;
    return this;
  }

  public BlockchainDataTransactionNotFound addDetailsItem(BannedIpAddressDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BannedIpAddressDetailsInner> getDetails() {
    return details;
  }


  public void setDetails(List<BannedIpAddressDetailsInner> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainDataTransactionNotFound blockchainDataTransactionNotFound = (BlockchainDataTransactionNotFound) o;
    return Objects.equals(this.code, blockchainDataTransactionNotFound.code) &&
        Objects.equals(this.message, blockchainDataTransactionNotFound.message) &&
        Objects.equals(this.details, blockchainDataTransactionNotFound.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainDataTransactionNotFound {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlockchainDataTransactionNotFound
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BlockchainDataTransactionNotFound.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockchainDataTransactionNotFound is not found in the empty JSON string", BlockchainDataTransactionNotFound.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlockchainDataTransactionNotFound.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockchainDataTransactionNotFound` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlockchainDataTransactionNotFound.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
      if (jsonArraydetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
        }

        // validate the optional field `details` (array)
        for (int i = 0; i < jsonArraydetails.size(); i++) {
          BannedIpAddressDetailsInner.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockchainDataTransactionNotFound.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockchainDataTransactionNotFound' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockchainDataTransactionNotFound> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockchainDataTransactionNotFound.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockchainDataTransactionNotFound>() {
           @Override
           public void write(JsonWriter out, BlockchainDataTransactionNotFound value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockchainDataTransactionNotFound read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockchainDataTransactionNotFound given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockchainDataTransactionNotFound
  * @throws IOException if the JSON string is invalid with respect to BlockchainDataTransactionNotFound
  */
  public static BlockchainDataTransactionNotFound fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockchainDataTransactionNotFound.class);
  }

 /**
  * Convert an instance of BlockchainDataTransactionNotFound to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

