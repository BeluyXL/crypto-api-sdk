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
import org.openapitools.client.model.GetEIP1559FeeRecommendationsRIBaseFeePerGas;
import org.openapitools.client.model.GetEIP1559FeeRecommendationsRIMaxFeePerGas;
import org.openapitools.client.model.GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas;

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
 * GetEIP1559FeeRecommendationsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetEIP1559FeeRecommendationsRI {
  public static final String SERIALIZED_NAME_BASE_FEE_PER_GAS = "baseFeePerGas";
  @SerializedName(SERIALIZED_NAME_BASE_FEE_PER_GAS)
  private GetEIP1559FeeRecommendationsRIBaseFeePerGas baseFeePerGas;

  public static final String SERIALIZED_NAME_MAX_FEE_PER_GAS = "maxFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_GAS)
  private GetEIP1559FeeRecommendationsRIMaxFeePerGas maxFeePerGas;

  public static final String SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS = "maxPriorityFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS)
  private GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas maxPriorityFeePerGas;

  public GetEIP1559FeeRecommendationsRI() { 
  }

  public GetEIP1559FeeRecommendationsRI baseFeePerGas(GetEIP1559FeeRecommendationsRIBaseFeePerGas baseFeePerGas) {
    
    this.baseFeePerGas = baseFeePerGas;
    return this;
  }

   /**
   * Get baseFeePerGas
   * @return baseFeePerGas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetEIP1559FeeRecommendationsRIBaseFeePerGas getBaseFeePerGas() {
    return baseFeePerGas;
  }


  public void setBaseFeePerGas(GetEIP1559FeeRecommendationsRIBaseFeePerGas baseFeePerGas) {
    this.baseFeePerGas = baseFeePerGas;
  }


  public GetEIP1559FeeRecommendationsRI maxFeePerGas(GetEIP1559FeeRecommendationsRIMaxFeePerGas maxFeePerGas) {
    
    this.maxFeePerGas = maxFeePerGas;
    return this;
  }

   /**
   * Get maxFeePerGas
   * @return maxFeePerGas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetEIP1559FeeRecommendationsRIMaxFeePerGas getMaxFeePerGas() {
    return maxFeePerGas;
  }


  public void setMaxFeePerGas(GetEIP1559FeeRecommendationsRIMaxFeePerGas maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
  }


  public GetEIP1559FeeRecommendationsRI maxPriorityFeePerGas(GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas maxPriorityFeePerGas) {
    
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
    return this;
  }

   /**
   * Get maxPriorityFeePerGas
   * @return maxPriorityFeePerGas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas getMaxPriorityFeePerGas() {
    return maxPriorityFeePerGas;
  }


  public void setMaxPriorityFeePerGas(GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEIP1559FeeRecommendationsRI getEIP1559FeeRecommendationsRI = (GetEIP1559FeeRecommendationsRI) o;
    return Objects.equals(this.baseFeePerGas, getEIP1559FeeRecommendationsRI.baseFeePerGas) &&
        Objects.equals(this.maxFeePerGas, getEIP1559FeeRecommendationsRI.maxFeePerGas) &&
        Objects.equals(this.maxPriorityFeePerGas, getEIP1559FeeRecommendationsRI.maxPriorityFeePerGas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFeePerGas, maxFeePerGas, maxPriorityFeePerGas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEIP1559FeeRecommendationsRI {\n");
    sb.append("    baseFeePerGas: ").append(toIndentedString(baseFeePerGas)).append("\n");
    sb.append("    maxFeePerGas: ").append(toIndentedString(maxFeePerGas)).append("\n");
    sb.append("    maxPriorityFeePerGas: ").append(toIndentedString(maxPriorityFeePerGas)).append("\n");
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
    openapiFields.add("baseFeePerGas");
    openapiFields.add("maxFeePerGas");
    openapiFields.add("maxPriorityFeePerGas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("baseFeePerGas");
    openapiRequiredFields.add("maxFeePerGas");
    openapiRequiredFields.add("maxPriorityFeePerGas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetEIP1559FeeRecommendationsRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetEIP1559FeeRecommendationsRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEIP1559FeeRecommendationsRI is not found in the empty JSON string", GetEIP1559FeeRecommendationsRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetEIP1559FeeRecommendationsRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEIP1559FeeRecommendationsRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetEIP1559FeeRecommendationsRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `baseFeePerGas`
      if (jsonObj.getAsJsonObject("baseFeePerGas") != null) {
        GetEIP1559FeeRecommendationsRIBaseFeePerGas.validateJsonObject(jsonObj.getAsJsonObject("baseFeePerGas"));
      }
      // validate the optional field `maxFeePerGas`
      if (jsonObj.getAsJsonObject("maxFeePerGas") != null) {
        GetEIP1559FeeRecommendationsRIMaxFeePerGas.validateJsonObject(jsonObj.getAsJsonObject("maxFeePerGas"));
      }
      // validate the optional field `maxPriorityFeePerGas`
      if (jsonObj.getAsJsonObject("maxPriorityFeePerGas") != null) {
        GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.validateJsonObject(jsonObj.getAsJsonObject("maxPriorityFeePerGas"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEIP1559FeeRecommendationsRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEIP1559FeeRecommendationsRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEIP1559FeeRecommendationsRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEIP1559FeeRecommendationsRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEIP1559FeeRecommendationsRI>() {
           @Override
           public void write(JsonWriter out, GetEIP1559FeeRecommendationsRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEIP1559FeeRecommendationsRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEIP1559FeeRecommendationsRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEIP1559FeeRecommendationsRI
  * @throws IOException if the JSON string is invalid with respect to GetEIP1559FeeRecommendationsRI
  */
  public static GetEIP1559FeeRecommendationsRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEIP1559FeeRecommendationsRI.class);
  }

 /**
  * Convert an instance of GetEIP1559FeeRecommendationsRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

