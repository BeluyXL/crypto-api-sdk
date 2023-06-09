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
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBS;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIRecipientsInner;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRISendersInner;

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
 * ListUnconfirmedTransactionsByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ListUnconfirmedTransactionsByAddressRI {
  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListUnconfirmedTransactionsByAddressRIRecipientsInner> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListUnconfirmedTransactionsByAddressRISendersInner> senders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private ListUnconfirmedTransactionsByAddressRIBS blockchainSpecific;

  public ListUnconfirmedTransactionsByAddressRI() { 
  }

  public ListUnconfirmedTransactionsByAddressRI recipients(List<ListUnconfirmedTransactionsByAddressRIRecipientsInner> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRI addRecipientsItem(ListUnconfirmedTransactionsByAddressRIRecipientsInner recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<ListUnconfirmedTransactionsByAddressRIRecipientsInner> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListUnconfirmedTransactionsByAddressRIRecipientsInner> recipients) {
    this.recipients = recipients;
  }


  public ListUnconfirmedTransactionsByAddressRI senders(List<ListUnconfirmedTransactionsByAddressRISendersInner> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRI addSendersItem(ListUnconfirmedTransactionsByAddressRISendersInner sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<ListUnconfirmedTransactionsByAddressRISendersInner> getSenders() {
    return senders;
  }


  public void setSenders(List<ListUnconfirmedTransactionsByAddressRISendersInner> senders) {
    this.senders = senders;
  }


  public ListUnconfirmedTransactionsByAddressRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1633518942013", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListUnconfirmedTransactionsByAddressRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as &#x60;transactionId&#x60; for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols &#x60;hash&#x60; is different from &#x60;transactionId&#x60; for SegWit transactions.
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3d74a44fe666308242b2c9dd0197a601779d17ba9fe8f7a23612c53a910bc98d", required = true, value = "Represents the same as `transactionId` for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols `hash` is different from `transactionId` for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListUnconfirmedTransactionsByAddressRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3d74a44fe666308242b2c9dd0197a601779d17ba9fe8f7a23612c53a910bc98d", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListUnconfirmedTransactionsByAddressRI blockchainSpecific(ListUnconfirmedTransactionsByAddressRIBS blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedTransactionsByAddressRIBS getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(ListUnconfirmedTransactionsByAddressRIBS blockchainSpecific) {
    this.blockchainSpecific = blockchainSpecific;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnconfirmedTransactionsByAddressRI listUnconfirmedTransactionsByAddressRI = (ListUnconfirmedTransactionsByAddressRI) o;
    return Objects.equals(this.recipients, listUnconfirmedTransactionsByAddressRI.recipients) &&
        Objects.equals(this.senders, listUnconfirmedTransactionsByAddressRI.senders) &&
        Objects.equals(this.timestamp, listUnconfirmedTransactionsByAddressRI.timestamp) &&
        Objects.equals(this.transactionHash, listUnconfirmedTransactionsByAddressRI.transactionHash) &&
        Objects.equals(this.transactionId, listUnconfirmedTransactionsByAddressRI.transactionId) &&
        Objects.equals(this.blockchainSpecific, listUnconfirmedTransactionsByAddressRI.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, senders, timestamp, transactionHash, transactionId, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnconfirmedTransactionsByAddressRI {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    blockchainSpecific: ").append(toIndentedString(blockchainSpecific)).append("\n");
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
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("timestamp");
    openapiFields.add("transactionHash");
    openapiFields.add("transactionId");
    openapiFields.add("blockchainSpecific");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("blockchainSpecific");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListUnconfirmedTransactionsByAddressRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListUnconfirmedTransactionsByAddressRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListUnconfirmedTransactionsByAddressRI is not found in the empty JSON string", ListUnconfirmedTransactionsByAddressRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListUnconfirmedTransactionsByAddressRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListUnconfirmedTransactionsByAddressRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListUnconfirmedTransactionsByAddressRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      if (jsonArrayrecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
        }

        // validate the optional field `recipients` (array)
        for (int i = 0; i < jsonArrayrecipients.size(); i++) {
          ListUnconfirmedTransactionsByAddressRIRecipientsInner.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysenders = jsonObj.getAsJsonArray("senders");
      if (jsonArraysenders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("senders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `senders` to be an array in the JSON string but got `%s`", jsonObj.get("senders").toString()));
        }

        // validate the optional field `senders` (array)
        for (int i = 0; i < jsonArraysenders.size(); i++) {
          ListUnconfirmedTransactionsByAddressRISendersInner.validateJsonObject(jsonArraysenders.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("transactionHash") != null && !jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      // validate the optional field `blockchainSpecific`
      if (jsonObj.getAsJsonObject("blockchainSpecific") != null) {
        ListUnconfirmedTransactionsByAddressRIBS.validateJsonObject(jsonObj.getAsJsonObject("blockchainSpecific"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListUnconfirmedTransactionsByAddressRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListUnconfirmedTransactionsByAddressRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListUnconfirmedTransactionsByAddressRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRI.class));

       return (TypeAdapter<T>) new TypeAdapter<ListUnconfirmedTransactionsByAddressRI>() {
           @Override
           public void write(JsonWriter out, ListUnconfirmedTransactionsByAddressRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListUnconfirmedTransactionsByAddressRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListUnconfirmedTransactionsByAddressRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListUnconfirmedTransactionsByAddressRI
  * @throws IOException if the JSON string is invalid with respect to ListUnconfirmedTransactionsByAddressRI
  */
  public static ListUnconfirmedTransactionsByAddressRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListUnconfirmedTransactionsByAddressRI.class);
  }

 /**
  * Convert an instance of ListUnconfirmedTransactionsByAddressRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

