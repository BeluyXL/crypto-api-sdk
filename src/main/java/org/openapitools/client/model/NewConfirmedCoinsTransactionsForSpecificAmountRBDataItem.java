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
 * NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem {
  public static final String SERIALIZED_NAME_ALLOW_DUPLICATES = "allowDuplicates";
  @SerializedName(SERIALIZED_NAME_ALLOW_DUPLICATES)
  private Boolean allowDuplicates = false;

  public static final String SERIALIZED_NAME_AMOUNT_HIGHER_THAN = "amountHigherThan";
  @SerializedName(SERIALIZED_NAME_AMOUNT_HIGHER_THAN)
  private Long amountHigherThan;

  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem() { 
  }

  public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem allowDuplicates(Boolean allowDuplicates) {
    
    this.allowDuplicates = allowDuplicates;
    return this;
  }

   /**
   * Specifies a flag that permits or denies the creation of duplicate addresses.
   * @return allowDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies a flag that permits or denies the creation of duplicate addresses.")

  public Boolean getAllowDuplicates() {
    return allowDuplicates;
  }


  public void setAllowDuplicates(Boolean allowDuplicates) {
    this.allowDuplicates = allowDuplicates;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem amountHigherThan(Long amountHigherThan) {
    
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


  public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs 2.0. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).
   * @return callbackSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourSecretKey", value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs 2.0. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security).")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem callbackUrl(String callbackUrl) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem newConfirmedCoinsTransactionsForSpecificAmountRBDataItem = (NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem) o;
    return Objects.equals(this.allowDuplicates, newConfirmedCoinsTransactionsForSpecificAmountRBDataItem.allowDuplicates) &&
        Objects.equals(this.amountHigherThan, newConfirmedCoinsTransactionsForSpecificAmountRBDataItem.amountHigherThan) &&
        Objects.equals(this.callbackSecretKey, newConfirmedCoinsTransactionsForSpecificAmountRBDataItem.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, newConfirmedCoinsTransactionsForSpecificAmountRBDataItem.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDuplicates, amountHigherThan, callbackSecretKey, callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem {\n");
    sb.append("    allowDuplicates: ").append(toIndentedString(allowDuplicates)).append("\n");
    sb.append("    amountHigherThan: ").append(toIndentedString(amountHigherThan)).append("\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
    openapiFields.add("allowDuplicates");
    openapiFields.add("amountHigherThan");
    openapiFields.add("callbackSecretKey");
    openapiFields.add("callbackUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amountHigherThan");
    openapiRequiredFields.add("callbackUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem is not found in the empty JSON string", NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem>() {
           @Override
           public void write(JsonWriter out, NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem
  * @throws IOException if the JSON string is invalid with respect to NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem
  */
  public static NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem.class);
  }

 /**
  * Convert an instance of NewConfirmedCoinsTransactionsForSpecificAmountRBDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

