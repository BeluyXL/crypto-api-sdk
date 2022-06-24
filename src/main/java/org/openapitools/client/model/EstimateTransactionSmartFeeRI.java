/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
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
 * EstimateTransactionSmartFeeRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class EstimateTransactionSmartFeeRI {
  public static final String SERIALIZED_NAME_CONFIRMATION_TARGET = "confirmationTarget";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION_TARGET)
  private Integer confirmationTarget;

  public static final String SERIALIZED_NAME_FEE_RATE = "feeRate";
  @SerializedName(SERIALIZED_NAME_FEE_RATE)
  private String feeRate;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public EstimateTransactionSmartFeeRI() { 
  }

  public EstimateTransactionSmartFeeRI confirmationTarget(Integer confirmationTarget) {
    
    this.confirmationTarget = confirmationTarget;
    return this;
  }

   /**
   * Represents the confirmation target in blocks
   * @return confirmationTarget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the confirmation target in blocks")

  public Integer getConfirmationTarget() {
    return confirmationTarget;
  }


  public void setConfirmationTarget(Integer confirmationTarget) {
    this.confirmationTarget = confirmationTarget;
  }


  public EstimateTransactionSmartFeeRI feeRate(String feeRate) {
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * Represents the Fee Rate value.
   * @return feeRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00001", required = true, value = "Represents the Fee Rate value.")

  public String getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }


  public EstimateTransactionSmartFeeRI unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the fee unit.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Defines the fee unit.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateTransactionSmartFeeRI estimateTransactionSmartFeeRI = (EstimateTransactionSmartFeeRI) o;
    return Objects.equals(this.confirmationTarget, estimateTransactionSmartFeeRI.confirmationTarget) &&
        Objects.equals(this.feeRate, estimateTransactionSmartFeeRI.feeRate) &&
        Objects.equals(this.unit, estimateTransactionSmartFeeRI.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationTarget, feeRate, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateTransactionSmartFeeRI {\n");
    sb.append("    confirmationTarget: ").append(toIndentedString(confirmationTarget)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("confirmationTarget");
    openapiFields.add("feeRate");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("confirmationTarget");
    openapiRequiredFields.add("feeRate");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EstimateTransactionSmartFeeRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EstimateTransactionSmartFeeRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimateTransactionSmartFeeRI is not found in the empty JSON string", EstimateTransactionSmartFeeRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EstimateTransactionSmartFeeRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EstimateTransactionSmartFeeRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EstimateTransactionSmartFeeRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("feeRate") != null && !jsonObj.get("feeRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feeRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feeRate").toString()));
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimateTransactionSmartFeeRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimateTransactionSmartFeeRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimateTransactionSmartFeeRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimateTransactionSmartFeeRI.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimateTransactionSmartFeeRI>() {
           @Override
           public void write(JsonWriter out, EstimateTransactionSmartFeeRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EstimateTransactionSmartFeeRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EstimateTransactionSmartFeeRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimateTransactionSmartFeeRI
  * @throws IOException if the JSON string is invalid with respect to EstimateTransactionSmartFeeRI
  */
  public static EstimateTransactionSmartFeeRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateTransactionSmartFeeRI.class);
  }

 /**
  * Convert an instance of EstimateTransactionSmartFeeRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
