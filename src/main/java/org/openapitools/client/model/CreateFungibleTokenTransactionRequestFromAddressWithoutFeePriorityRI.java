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
import org.openapitools.client.model.CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner;
import org.openapitools.client.model.CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS;
import org.openapitools.client.model.CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender;

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
 * CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI {
  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private List<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner> recipient = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender sender;

  public static final String SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA = "tokenTypeSpecificData";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA)
  private CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS tokenTypeSpecificData;

  public static final String SERIALIZED_NAME_TRANSACTION_REQUEST_ID = "transactionRequestId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REQUEST_ID)
  private String transactionRequestId;

  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI() { 
  }

  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).
   * @return callbackSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourSecretString", value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;.
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. `We support ONLY httpS type of protocol`.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Represents an optional note to add a free text in, explaining or providing additional detail on the transaction request.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourAdditionalInformationhere", value = "Represents an optional note to add a free text in, explaining or providing additional detail on the transaction request.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI recipient(List<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner> recipient) {
    
    this.recipient = recipient;
    return this;
  }

  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI addRecipientItem(CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner recipientItem) {
    this.recipient.add(recipientItem);
    return this;
  }

   /**
   * Defines the destination for the transaction, i.e. the recipient(s).
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the destination for the transaction, i.e. the recipient(s).")

  public List<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner> getRecipient() {
    return recipient;
  }


  public void setRecipient(List<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner> recipient) {
    this.recipient = recipient;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI sender(CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender getSender() {
    return sender;
  }


  public void setSender(CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender sender) {
    this.sender = sender;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI tokenTypeSpecificData(CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS tokenTypeSpecificData) {
    
    this.tokenTypeSpecificData = tokenTypeSpecificData;
    return this;
  }

   /**
   * Get tokenTypeSpecificData
   * @return tokenTypeSpecificData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS getTokenTypeSpecificData() {
    return tokenTypeSpecificData;
  }


  public void setTokenTypeSpecificData(CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS tokenTypeSpecificData) {
    this.tokenTypeSpecificData = tokenTypeSpecificData;
  }


  public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI transactionRequestId(String transactionRequestId) {
    
    this.transactionRequestId = transactionRequestId;
    return this;
  }

   /**
   * Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which &#x60;referenceId&#x60; concern that specific transaction request.
   * @return transactionRequestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "62daacdbc8a7282e9ea01c35", required = true, value = "Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which `referenceId` concern that specific transaction request.")

  public String getTransactionRequestId() {
    return transactionRequestId;
  }


  public void setTransactionRequestId(String transactionRequestId) {
    this.transactionRequestId = transactionRequestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI = (CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI) o;
    return Objects.equals(this.callbackSecretKey, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.callbackUrl) &&
        Objects.equals(this.note, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.note) &&
        Objects.equals(this.recipient, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.recipient) &&
        Objects.equals(this.sender, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.sender) &&
        Objects.equals(this.tokenTypeSpecificData, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.tokenTypeSpecificData) &&
        Objects.equals(this.transactionRequestId, createFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.transactionRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackSecretKey, callbackUrl, note, recipient, sender, tokenTypeSpecificData, transactionRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI {\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    tokenTypeSpecificData: ").append(toIndentedString(tokenTypeSpecificData)).append("\n");
    sb.append("    transactionRequestId: ").append(toIndentedString(transactionRequestId)).append("\n");
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
    openapiFields.add("callbackSecretKey");
    openapiFields.add("callbackUrl");
    openapiFields.add("note");
    openapiFields.add("recipient");
    openapiFields.add("sender");
    openapiFields.add("tokenTypeSpecificData");
    openapiFields.add("transactionRequestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recipient");
    openapiRequiredFields.add("sender");
    openapiRequiredFields.add("tokenTypeSpecificData");
    openapiRequiredFields.add("transactionRequestId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI is not found in the empty JSON string", CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("callbackSecretKey") != null && !jsonObj.get("callbackSecretKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackSecretKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackSecretKey").toString()));
      }
      if (jsonObj.get("callbackUrl") != null && !jsonObj.get("callbackUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callbackUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callbackUrl").toString()));
      }
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      JsonArray jsonArrayrecipient = jsonObj.getAsJsonArray("recipient");
      if (jsonArrayrecipient != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipient").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipient` to be an array in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
        }

        // validate the optional field `recipient` (array)
        for (int i = 0; i < jsonArrayrecipient.size(); i++) {
          CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIRecipientInner.validateJsonObject(jsonArrayrecipient.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `sender`
      if (jsonObj.getAsJsonObject("sender") != null) {
        CreateSingleTransactionRequestFromAddressWithoutFeePriorityRISender.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      }
      // validate the optional field `tokenTypeSpecificData`
      if (jsonObj.getAsJsonObject("tokenTypeSpecificData") != null) {
        CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRIS.validateJsonObject(jsonObj.getAsJsonObject("tokenTypeSpecificData"));
      }
      if (jsonObj.get("transactionRequestId") != null && !jsonObj.get("transactionRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRequestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI>() {
           @Override
           public void write(JsonWriter out, CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI
  * @throws IOException if the JSON string is invalid with respect to CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI
  */
  public static CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI.class);
  }

 /**
  * Convert an instance of CreateFungibleTokenTransactionRequestFromAddressWithoutFeePriorityRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

