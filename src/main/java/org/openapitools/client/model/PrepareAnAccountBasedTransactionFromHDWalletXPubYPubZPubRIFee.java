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
 * When isConfirmed is True - Defines the amount of the transaction fee When isConfirmed is False - For ETH-based blockchains this attribute represents the max fee value.
 */
@ApiModel(description = "When isConfirmed is True - Defines the amount of the transaction fee When isConfirmed is False - For ETH-based blockchains this attribute represents the max fee value.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee {
  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private String gasPrice;

  public static final String SERIALIZED_NAME_MAX_FEE_PER_GAS = "maxFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_GAS)
  private String maxFeePerGas;

  public static final String SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS = "maxPriorityFeePerGas";
  @SerializedName(SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS)
  private String maxPriorityFeePerGas;

  public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee() { 
  }

  public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the amount of gas used by this specific transaction alone.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "552020", required = true, value = "Represents the amount of gas used by this specific transaction alone.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee gasPrice(String gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Represents the price offered to the miner to purchase this amount of gas.
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2500000007", required = true, value = "Represents the price offered to the miner to purchase this amount of gas.")

  public String getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }


  public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee maxFeePerGas(String maxFeePerGas) {
    
    this.maxFeePerGas = maxFeePerGas;
    return this;
  }

   /**
   * Representation of the max fee per gas value
   * @return maxFeePerGas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2000000008", required = true, value = "Representation of the max fee per gas value")

  public String getMaxFeePerGas() {
    return maxFeePerGas;
  }


  public void setMaxFeePerGas(String maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
  }


  public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee maxPriorityFeePerGas(String maxPriorityFeePerGas) {
    
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
    return this;
  }

   /**
   * Rrepresentation of the max priority fee per gas value
   * @return maxPriorityFeePerGas
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2000000000", required = true, value = "Rrepresentation of the max priority fee per gas value")

  public String getMaxPriorityFeePerGas() {
    return maxPriorityFeePerGas;
  }


  public void setMaxPriorityFeePerGas(String maxPriorityFeePerGas) {
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
    PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee = (PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee) o;
    return Objects.equals(this.gasLimit, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.gasLimit) &&
        Objects.equals(this.gasPrice, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.gasPrice) &&
        Objects.equals(this.maxFeePerGas, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.maxFeePerGas) &&
        Objects.equals(this.maxPriorityFeePerGas, prepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.maxPriorityFeePerGas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasLimit, gasPrice, maxFeePerGas, maxPriorityFeePerGas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee {\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
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
    openapiFields.add("gasLimit");
    openapiFields.add("gasPrice");
    openapiFields.add("maxFeePerGas");
    openapiFields.add("maxPriorityFeePerGas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gasLimit");
    openapiRequiredFields.add("gasPrice");
    openapiRequiredFields.add("maxFeePerGas");
    openapiRequiredFields.add("maxPriorityFeePerGas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee is not found in the empty JSON string", PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("gasLimit") != null && !jsonObj.get("gasLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasLimit").toString()));
      }
      if (jsonObj.get("gasPrice") != null && !jsonObj.get("gasPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasPrice").toString()));
      }
      if (jsonObj.get("maxFeePerGas") != null && !jsonObj.get("maxFeePerGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxFeePerGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxFeePerGas").toString()));
      }
      if (jsonObj.get("maxPriorityFeePerGas") != null && !jsonObj.get("maxPriorityFeePerGas").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxPriorityFeePerGas` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxPriorityFeePerGas").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.class));

       return (TypeAdapter<T>) new TypeAdapter<PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee>() {
           @Override
           public void write(JsonWriter out, PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee
  * @throws IOException if the JSON string is invalid with respect to PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee
  */
  public static PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee.class);
  }

 /**
  * Convert an instance of PrepareAnAccountBasedTransactionFromHDWalletXPubYPubZPubRIFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

