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
 * Tron
 */
@ApiModel(description = "Tron")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetWalletTransactionDetailsByTransactionIDRIBST {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BANDWIDTH_USED = "bandwidthUsed";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_USED)
  private String bandwidthUsed;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_ENERGY_USED = "energyUsed";
  @SerializedName(SERIALIZED_NAME_ENERGY_USED)
  private String energyUsed;

  public static final String SERIALIZED_NAME_HAS_INTERNAL_TRANSACTIONS = "hasInternalTransactions";
  @SerializedName(SERIALIZED_NAME_HAS_INTERNAL_TRANSACTIONS)
  private Boolean hasInternalTransactions;

  public static final String SERIALIZED_NAME_HAS_TOKEN_TRANSFERS = "hasTokenTransfers";
  @SerializedName(SERIALIZED_NAME_HAS_TOKEN_TRANSFERS)
  private Boolean hasTokenTransfers;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public GetWalletTransactionDetailsByTransactionIDRIBST() { 
  }

  public GetWalletTransactionDetailsByTransactionIDRIBST amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * String representation of the amount value
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String representation of the amount value")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST bandwidthUsed(String bandwidthUsed) {
    
    this.bandwidthUsed = bandwidthUsed;
    return this;
  }

   /**
   * Numeric representation of the transaction used bandwidth
   * @return bandwidthUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction used bandwidth")

  public String getBandwidthUsed() {
    return bandwidthUsed;
  }


  public void setBandwidthUsed(String bandwidthUsed) {
    this.bandwidthUsed = bandwidthUsed;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Numeric representation of the transaction contract
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction contract")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST energyUsed(String energyUsed) {
    
    this.energyUsed = energyUsed;
    return this;
  }

   /**
   * String representation of the transaction used energy
   * @return energyUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String representation of the transaction used energy")

  public String getEnergyUsed() {
    return energyUsed;
  }


  public void setEnergyUsed(String energyUsed) {
    this.energyUsed = energyUsed;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST hasInternalTransactions(Boolean hasInternalTransactions) {
    
    this.hasInternalTransactions = hasInternalTransactions;
    return this;
  }

   /**
   * Get hasInternalTransactions
   * @return hasInternalTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasInternalTransactions() {
    return hasInternalTransactions;
  }


  public void setHasInternalTransactions(Boolean hasInternalTransactions) {
    this.hasInternalTransactions = hasInternalTransactions;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST hasTokenTransfers(Boolean hasTokenTransfers) {
    
    this.hasTokenTransfers = hasTokenTransfers;
    return this;
  }

   /**
   * Get hasTokenTransfers
   * @return hasTokenTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasTokenTransfers() {
    return hasTokenTransfers;
  }


  public void setHasTokenTransfers(Boolean hasTokenTransfers) {
    this.hasTokenTransfers = hasTokenTransfers;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Numeric representation of the transaction input
   * @return input
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Numeric representation of the transaction input")

  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBST status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "String representation of the transaction status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWalletTransactionDetailsByTransactionIDRIBST getWalletTransactionDetailsByTransactionIDRIBST = (GetWalletTransactionDetailsByTransactionIDRIBST) o;
    return Objects.equals(this.amount, getWalletTransactionDetailsByTransactionIDRIBST.amount) &&
        Objects.equals(this.bandwidthUsed, getWalletTransactionDetailsByTransactionIDRIBST.bandwidthUsed) &&
        Objects.equals(this.contract, getWalletTransactionDetailsByTransactionIDRIBST.contract) &&
        Objects.equals(this.energyUsed, getWalletTransactionDetailsByTransactionIDRIBST.energyUsed) &&
        Objects.equals(this.hasInternalTransactions, getWalletTransactionDetailsByTransactionIDRIBST.hasInternalTransactions) &&
        Objects.equals(this.hasTokenTransfers, getWalletTransactionDetailsByTransactionIDRIBST.hasTokenTransfers) &&
        Objects.equals(this.input, getWalletTransactionDetailsByTransactionIDRIBST.input) &&
        Objects.equals(this.status, getWalletTransactionDetailsByTransactionIDRIBST.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bandwidthUsed, contract, energyUsed, hasInternalTransactions, hasTokenTransfers, input, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletTransactionDetailsByTransactionIDRIBST {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bandwidthUsed: ").append(toIndentedString(bandwidthUsed)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    energyUsed: ").append(toIndentedString(energyUsed)).append("\n");
    sb.append("    hasInternalTransactions: ").append(toIndentedString(hasInternalTransactions)).append("\n");
    sb.append("    hasTokenTransfers: ").append(toIndentedString(hasTokenTransfers)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bandwidthUsed");
    openapiFields.add("contract");
    openapiFields.add("energyUsed");
    openapiFields.add("hasInternalTransactions");
    openapiFields.add("hasTokenTransfers");
    openapiFields.add("input");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("bandwidthUsed");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("energyUsed");
    openapiRequiredFields.add("hasInternalTransactions");
    openapiRequiredFields.add("hasTokenTransfers");
    openapiRequiredFields.add("input");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIBST
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWalletTransactionDetailsByTransactionIDRIBST.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWalletTransactionDetailsByTransactionIDRIBST is not found in the empty JSON string", GetWalletTransactionDetailsByTransactionIDRIBST.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWalletTransactionDetailsByTransactionIDRIBST.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWalletTransactionDetailsByTransactionIDRIBST` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWalletTransactionDetailsByTransactionIDRIBST.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("bandwidthUsed") != null && !jsonObj.get("bandwidthUsed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bandwidthUsed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bandwidthUsed").toString()));
      }
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      if (jsonObj.get("energyUsed") != null && !jsonObj.get("energyUsed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `energyUsed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("energyUsed").toString()));
      }
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWalletTransactionDetailsByTransactionIDRIBST.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWalletTransactionDetailsByTransactionIDRIBST' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIBST> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWalletTransactionDetailsByTransactionIDRIBST.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIBST>() {
           @Override
           public void write(JsonWriter out, GetWalletTransactionDetailsByTransactionIDRIBST value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWalletTransactionDetailsByTransactionIDRIBST read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWalletTransactionDetailsByTransactionIDRIBST given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWalletTransactionDetailsByTransactionIDRIBST
  * @throws IOException if the JSON string is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIBST
  */
  public static GetWalletTransactionDetailsByTransactionIDRIBST fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWalletTransactionDetailsByTransactionIDRIBST.class);
  }

 /**
  * Convert an instance of GetWalletTransactionDetailsByTransactionIDRIBST to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

