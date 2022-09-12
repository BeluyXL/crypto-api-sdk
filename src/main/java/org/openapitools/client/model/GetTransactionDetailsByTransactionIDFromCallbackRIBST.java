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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed;

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
public class GetTransactionDetailsByTransactionIDFromCallbackRIBST {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BANDWIDTH_USED = "bandwidthUsed";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH_USED)
  private GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed bandwidthUsed;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_ENERGY_USED = "energyUsed";
  @SerializedName(SERIALIZED_NAME_ENERGY_USED)
  private GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed energyUsed;

  public static final String SERIALIZED_NAME_HAS_INTERNAL_TRANSACTIONS = "hasInternalTransactions";
  @SerializedName(SERIALIZED_NAME_HAS_INTERNAL_TRANSACTIONS)
  private Boolean hasInternalTransactions;

  public static final String SERIALIZED_NAME_HAS_TOKEN_TRANSFERS = "hasTokenTransfers";
  @SerializedName(SERIALIZED_NAME_HAS_TOKEN_TRANSFERS)
  private String hasTokenTransfers;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private String recipients;

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private String senders;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public GetTransactionDetailsByTransactionIDFromCallbackRIBST() { 
  }

  public GetTransactionDetailsByTransactionIDFromCallbackRIBST amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the amount of the transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST bandwidthUsed(GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed bandwidthUsed) {
    
    this.bandwidthUsed = bandwidthUsed;
    return this;
  }

   /**
   * Get bandwidthUsed
   * @return bandwidthUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed getBandwidthUsed() {
    return bandwidthUsed;
  }


  public void setBandwidthUsed(GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed bandwidthUsed) {
    this.bandwidthUsed = bandwidthUsed;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Represents the specific transaction contract.
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the specific transaction contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST energyUsed(GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed energyUsed) {
    
    this.energyUsed = energyUsed;
    return this;
  }

   /**
   * Get energyUsed
   * @return energyUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed getEnergyUsed() {
    return energyUsed;
  }


  public void setEnergyUsed(GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed energyUsed) {
    this.energyUsed = energyUsed;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST hasInternalTransactions(Boolean hasInternalTransactions) {
    
    this.hasInternalTransactions = hasInternalTransactions;
    return this;
  }

   /**
   * Defines if the transaction includes internal transactions (true) or not (false).
   * @return hasInternalTransactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines if the transaction includes internal transactions (true) or not (false).")

  public Boolean getHasInternalTransactions() {
    return hasInternalTransactions;
  }


  public void setHasInternalTransactions(Boolean hasInternalTransactions) {
    this.hasInternalTransactions = hasInternalTransactions;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST hasTokenTransfers(String hasTokenTransfers) {
    
    this.hasTokenTransfers = hasTokenTransfers;
    return this;
  }

   /**
   * Defines if the transaction includes token transfers (true) or not (false).
   * @return hasTokenTransfers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines if the transaction includes token transfers (true) or not (false).")

  public String getHasTokenTransfers() {
    return hasTokenTransfers;
  }


  public void setHasTokenTransfers(String hasTokenTransfers) {
    this.hasTokenTransfers = hasTokenTransfers;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Represents the transaction&#39;s input value.
   * @return input
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the transaction's input value.")

  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST recipients(String recipients) {
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Represents the recipient address.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the recipient address.")

  public String getRecipients() {
    return recipients;
  }


  public void setRecipients(String recipients) {
    this.recipients = recipients;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST senders(String senders) {
    
    this.senders = senders;
    return this;
  }

   /**
   * Represents the sender address.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the sender address.")

  public String getSenders() {
    return senders;
  }


  public void setSenders(String senders) {
    this.senders = senders;
  }


  public GetTransactionDetailsByTransactionIDFromCallbackRIBST transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Represents the status of this transaction.
   * @return transactionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1", required = true, value = "Represents the status of this transaction.")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDFromCallbackRIBST getTransactionDetailsByTransactionIDFromCallbackRIBST = (GetTransactionDetailsByTransactionIDFromCallbackRIBST) o;
    return Objects.equals(this.amount, getTransactionDetailsByTransactionIDFromCallbackRIBST.amount) &&
        Objects.equals(this.bandwidthUsed, getTransactionDetailsByTransactionIDFromCallbackRIBST.bandwidthUsed) &&
        Objects.equals(this.contract, getTransactionDetailsByTransactionIDFromCallbackRIBST.contract) &&
        Objects.equals(this.energyUsed, getTransactionDetailsByTransactionIDFromCallbackRIBST.energyUsed) &&
        Objects.equals(this.hasInternalTransactions, getTransactionDetailsByTransactionIDFromCallbackRIBST.hasInternalTransactions) &&
        Objects.equals(this.hasTokenTransfers, getTransactionDetailsByTransactionIDFromCallbackRIBST.hasTokenTransfers) &&
        Objects.equals(this.input, getTransactionDetailsByTransactionIDFromCallbackRIBST.input) &&
        Objects.equals(this.recipients, getTransactionDetailsByTransactionIDFromCallbackRIBST.recipients) &&
        Objects.equals(this.senders, getTransactionDetailsByTransactionIDFromCallbackRIBST.senders) &&
        Objects.equals(this.transactionStatus, getTransactionDetailsByTransactionIDFromCallbackRIBST.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bandwidthUsed, contract, energyUsed, hasInternalTransactions, hasTokenTransfers, input, recipients, senders, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDFromCallbackRIBST {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bandwidthUsed: ").append(toIndentedString(bandwidthUsed)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    energyUsed: ").append(toIndentedString(energyUsed)).append("\n");
    sb.append("    hasInternalTransactions: ").append(toIndentedString(hasInternalTransactions)).append("\n");
    sb.append("    hasTokenTransfers: ").append(toIndentedString(hasTokenTransfers)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("transactionStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("bandwidthUsed");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("energyUsed");
    openapiRequiredFields.add("hasInternalTransactions");
    openapiRequiredFields.add("hasTokenTransfers");
    openapiRequiredFields.add("input");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("transactionStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDFromCallbackRIBST
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionDetailsByTransactionIDFromCallbackRIBST.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionDetailsByTransactionIDFromCallbackRIBST is not found in the empty JSON string", GetTransactionDetailsByTransactionIDFromCallbackRIBST.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionDetailsByTransactionIDFromCallbackRIBST.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionDetailsByTransactionIDFromCallbackRIBST` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionDetailsByTransactionIDFromCallbackRIBST.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // validate the optional field `bandwidthUsed`
      if (jsonObj.getAsJsonObject("bandwidthUsed") != null) {
        GetTransactionDetailsByTransactionIDFromCallbackRIBSTBandwidthUsed.validateJsonObject(jsonObj.getAsJsonObject("bandwidthUsed"));
      }
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      // validate the optional field `energyUsed`
      if (jsonObj.getAsJsonObject("energyUsed") != null) {
        GetTransactionDetailsByTransactionIDFromCallbackRIBSTEnergyUsed.validateJsonObject(jsonObj.getAsJsonObject("energyUsed"));
      }
      if (jsonObj.get("hasTokenTransfers") != null && !jsonObj.get("hasTokenTransfers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hasTokenTransfers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hasTokenTransfers").toString()));
      }
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipients` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
      }
      if (jsonObj.get("senders") != null && !jsonObj.get("senders").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senders` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senders").toString()));
      }
      if (jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionDetailsByTransactionIDFromCallbackRIBST.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionDetailsByTransactionIDFromCallbackRIBST' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionDetailsByTransactionIDFromCallbackRIBST> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDFromCallbackRIBST.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDFromCallbackRIBST>() {
           @Override
           public void write(JsonWriter out, GetTransactionDetailsByTransactionIDFromCallbackRIBST value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionDetailsByTransactionIDFromCallbackRIBST read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDFromCallbackRIBST given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDFromCallbackRIBST
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDFromCallbackRIBST
  */
  public static GetTransactionDetailsByTransactionIDFromCallbackRIBST fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDFromCallbackRIBST.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDFromCallbackRIBST to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

