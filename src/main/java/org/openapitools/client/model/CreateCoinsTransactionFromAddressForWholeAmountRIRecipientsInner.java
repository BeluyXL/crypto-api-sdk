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
 * CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner() { 
  }

  public CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the destination address.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xc065b539490f81b6c297c37b1925c3be2f190732", required = true, value = "Defines the destination address.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount sent to the destination address.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.123", required = true, value = "Defines the amount sent to the destination address.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner createCoinsTransactionFromAddressForWholeAmountRIRecipientsInner = (CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner) o;
    return Objects.equals(this.address, createCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.address) &&
        Objects.equals(this.amount, createCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner is not found in the empty JSON string", CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner>() {
           @Override
           public void write(JsonWriter out, CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner
  * @throws IOException if the JSON string is invalid with respect to CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner
  */
  public static CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner.class);
  }

 /**
  * Convert an instance of CreateCoinsTransactionFromAddressForWholeAmountRIRecipientsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

