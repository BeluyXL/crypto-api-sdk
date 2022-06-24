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
 * EstimateTokenGasLimitRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class EstimateTokenGasLimitRBDataItem {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contractType";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private String contractType;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public EstimateTokenGasLimitRBDataItem() { 
  }

  public EstimateTokenGasLimitRBDataItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents transactions&#39; amount.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.12", required = true, value = "Represents transactions' amount.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public EstimateTokenGasLimitRBDataItem contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Defines the specific token identifier.  For Ethereum-based transactions it is the contract.
   * @return contract
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x092de782a7e1e0a92991ad829a0a33aef3c7545e", required = true, value = "Defines the specific token identifier.  For Ethereum-based transactions it is the contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public EstimateTokenGasLimitRBDataItem contractType(String contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Represents the ERC contract type. It can be ERC20 or ERC721
   * @return contractType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ERC-20", required = true, value = "Represents the ERC contract type. It can be ERC20 or ERC721")

  public String getContractType() {
    return contractType;
  }


  public void setContractType(String contractType) {
    this.contractType = contractType;
  }


  public EstimateTokenGasLimitRBDataItem recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xc065b539490f81b6c297c37b1925c3be2f190738", required = true, value = "The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public EstimateTokenGasLimitRBDataItem sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x6f61e3c2fbb8c8be698bd0907ba6c04b62800fe5", required = true, value = "Represents the address which sends this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one sender.")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateTokenGasLimitRBDataItem estimateTokenGasLimitRBDataItem = (EstimateTokenGasLimitRBDataItem) o;
    return Objects.equals(this.amount, estimateTokenGasLimitRBDataItem.amount) &&
        Objects.equals(this.contract, estimateTokenGasLimitRBDataItem.contract) &&
        Objects.equals(this.contractType, estimateTokenGasLimitRBDataItem.contractType) &&
        Objects.equals(this.recipient, estimateTokenGasLimitRBDataItem.recipient) &&
        Objects.equals(this.sender, estimateTokenGasLimitRBDataItem.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, contract, contractType, recipient, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateTokenGasLimitRBDataItem {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("contract");
    openapiFields.add("contractType");
    openapiFields.add("recipient");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("contract");
    openapiRequiredFields.add("contractType");
    openapiRequiredFields.add("recipient");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EstimateTokenGasLimitRBDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EstimateTokenGasLimitRBDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimateTokenGasLimitRBDataItem is not found in the empty JSON string", EstimateTokenGasLimitRBDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EstimateTokenGasLimitRBDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EstimateTokenGasLimitRBDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EstimateTokenGasLimitRBDataItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      if (jsonObj.get("contractType") != null && !jsonObj.get("contractType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractType").toString()));
      }
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if (jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimateTokenGasLimitRBDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimateTokenGasLimitRBDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimateTokenGasLimitRBDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimateTokenGasLimitRBDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimateTokenGasLimitRBDataItem>() {
           @Override
           public void write(JsonWriter out, EstimateTokenGasLimitRBDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EstimateTokenGasLimitRBDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EstimateTokenGasLimitRBDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimateTokenGasLimitRBDataItem
  * @throws IOException if the JSON string is invalid with respect to EstimateTokenGasLimitRBDataItem
  */
  public static EstimateTokenGasLimitRBDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateTokenGasLimitRBDataItem.class);
  }

 /**
  * Convert an instance of EstimateTokenGasLimitRBDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
