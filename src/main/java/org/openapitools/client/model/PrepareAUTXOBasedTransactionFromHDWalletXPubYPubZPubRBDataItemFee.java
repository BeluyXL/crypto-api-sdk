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
 * PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_EXACT_AMOUNT = "exactAmount";
  @SerializedName(SERIALIZED_NAME_EXACT_AMOUNT)
  private String exactAmount;

  /**
   * Represents the fee priority
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    SLOW("slow"),
    
    STANDARD("standard"),
    
    FAST("fast");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private PriorityEnum priority;

  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee() { 
  }

  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the fee address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tb1q8wus03xdv3t6aknmsnpd0jmeu7dgh93j34pj5a", value = "Represents the fee address")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee exactAmount(String exactAmount) {
    
    this.exactAmount = exactAmount;
    return this;
  }

   /**
   * Representation of the exact amount value
   * @return exactAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00023", value = "Representation of the exact amount value")

  public String getExactAmount() {
    return exactAmount;
  }


  public void setExactAmount(String exactAmount) {
    this.exactAmount = exactAmount;
  }


  public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee priority(PriorityEnum priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Represents the fee priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "standard", value = "Represents the fee priority")

  public PriorityEnum getPriority() {
    return priority;
  }


  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee = (PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee) o;
    return Objects.equals(this.address, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.address) &&
        Objects.equals(this.exactAmount, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.exactAmount) &&
        Objects.equals(this.priority, prepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, exactAmount, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    exactAmount: ").append(toIndentedString(exactAmount)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("exactAmount");
    openapiFields.add("priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee is not found in the empty JSON string", PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("exactAmount") != null && !jsonObj.get("exactAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exactAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exactAmount").toString()));
      }
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.class));

       return (TypeAdapter<T>) new TypeAdapter<PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee>() {
           @Override
           public void write(JsonWriter out, PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee
  * @throws IOException if the JSON string is invalid with respect to PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee
  */
  public static PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee.class);
  }

 /**
  * Convert an instance of PrepareAUTXOBasedTransactionFromHDWalletXPubYPubZPubRBDataItemFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

