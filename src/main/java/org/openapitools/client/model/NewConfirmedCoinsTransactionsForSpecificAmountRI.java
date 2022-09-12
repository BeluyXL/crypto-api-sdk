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
 * NewConfirmedCoinsTransactionsForSpecificAmountRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class NewConfirmedCoinsTransactionsForSpecificAmountRI {
  public static final String SERIALIZED_NAME_AMOUNT_HIGHER_THAN = "amountHigherThan";
  @SerializedName(SERIALIZED_NAME_AMOUNT_HIGHER_THAN)
  private Long amountHigherThan;

  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "createdTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Integer createdTimestamp;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public NewConfirmedCoinsTransactionsForSpecificAmountRI() { 
  }

  public NewConfirmedCoinsTransactionsForSpecificAmountRI amountHigherThan(Long amountHigherThan) {
    
    this.amountHigherThan = amountHigherThan;
    return this;
  }

   /**
   * Represents a specific amount of coins after which the system have to send a callback to customers&#39; callbackUrl.
   * @return amountHigherThan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents a specific amount of coins after which the system have to send a callback to customers' callbackUrl.")

  public Long getAmountHigherThan() {
    return amountHigherThan;
  }


  public void setAmountHigherThan(Long amountHigherThan) {
    this.amountHigherThan = amountHigherThan;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).
   * @return callbackSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourSecretKey", value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;.
   * @return callbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. `We support ONLY httpS type of protocol`.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the subscription was created in Unix Timestamp.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1611238648", required = true, value = "Defines the specific time/date when the subscription was created in Unix Timestamp.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Defines the type of the specific event available for the customer to subscribe to for callback notification.
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CONFIRMED_COINS_TRANSACTION_FOR_CERTAIN_AMOUNT_OR_HIGHER", required = true, value = "Defines the type of the specific event available for the customer to subscribe to for callback notification.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Defines whether the subscription is active or not. Set as boolean.
   * @return isActive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the subscription is active or not. Set as boolean.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRI referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique ID used to reference the specific callback subscription.
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bc243c86-0902-4386-b30d-e6b30fa1f2aa", required = true, value = "Represents a unique ID used to reference the specific callback subscription.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedCoinsTransactionsForSpecificAmountRI newConfirmedCoinsTransactionsForSpecificAmountRI = (NewConfirmedCoinsTransactionsForSpecificAmountRI) o;
    return Objects.equals(this.amountHigherThan, newConfirmedCoinsTransactionsForSpecificAmountRI.amountHigherThan) &&
        Objects.equals(this.callbackSecretKey, newConfirmedCoinsTransactionsForSpecificAmountRI.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, newConfirmedCoinsTransactionsForSpecificAmountRI.callbackUrl) &&
        Objects.equals(this.createdTimestamp, newConfirmedCoinsTransactionsForSpecificAmountRI.createdTimestamp) &&
        Objects.equals(this.eventType, newConfirmedCoinsTransactionsForSpecificAmountRI.eventType) &&
        Objects.equals(this.isActive, newConfirmedCoinsTransactionsForSpecificAmountRI.isActive) &&
        Objects.equals(this.referenceId, newConfirmedCoinsTransactionsForSpecificAmountRI.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountHigherThan, callbackSecretKey, callbackUrl, createdTimestamp, eventType, isActive, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedCoinsTransactionsForSpecificAmountRI {\n");
    sb.append("    amountHigherThan: ").append(toIndentedString(amountHigherThan)).append("\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
    openapiFields.add("amountHigherThan");
    openapiFields.add("callbackSecretKey");
    openapiFields.add("callbackUrl");
    openapiFields.add("createdTimestamp");
    openapiFields.add("eventType");
    openapiFields.add("isActive");
    openapiFields.add("referenceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amountHigherThan");
    openapiRequiredFields.add("callbackUrl");
    openapiRequiredFields.add("createdTimestamp");
    openapiRequiredFields.add("eventType");
    openapiRequiredFields.add("isActive");
    openapiRequiredFields.add("referenceId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewConfirmedCoinsTransactionsForSpecificAmountRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NewConfirmedCoinsTransactionsForSpecificAmountRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewConfirmedCoinsTransactionsForSpecificAmountRI is not found in the empty JSON string", NewConfirmedCoinsTransactionsForSpecificAmountRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NewConfirmedCoinsTransactionsForSpecificAmountRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewConfirmedCoinsTransactionsForSpecificAmountRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NewConfirmedCoinsTransactionsForSpecificAmountRI.openapiRequiredFields) {
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
      if (jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if (jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewConfirmedCoinsTransactionsForSpecificAmountRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewConfirmedCoinsTransactionsForSpecificAmountRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewConfirmedCoinsTransactionsForSpecificAmountRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewConfirmedCoinsTransactionsForSpecificAmountRI.class));

       return (TypeAdapter<T>) new TypeAdapter<NewConfirmedCoinsTransactionsForSpecificAmountRI>() {
           @Override
           public void write(JsonWriter out, NewConfirmedCoinsTransactionsForSpecificAmountRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewConfirmedCoinsTransactionsForSpecificAmountRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewConfirmedCoinsTransactionsForSpecificAmountRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewConfirmedCoinsTransactionsForSpecificAmountRI
  * @throws IOException if the JSON string is invalid with respect to NewConfirmedCoinsTransactionsForSpecificAmountRI
  */
  public static NewConfirmedCoinsTransactionsForSpecificAmountRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewConfirmedCoinsTransactionsForSpecificAmountRI.class);
  }

 /**
  * Convert an instance of NewConfirmedCoinsTransactionsForSpecificAmountRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

