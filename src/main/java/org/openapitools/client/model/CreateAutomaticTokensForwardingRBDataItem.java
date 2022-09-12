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
import org.openapitools.client.model.CreateAutomaticTokensForwardingRBTokenData;

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
 * CreateAutomaticTokensForwardingRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class CreateAutomaticTokensForwardingRBDataItem {
  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CONFIRMATIONS_COUNT = "confirmationsCount";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS_COUNT)
  private String confirmationsCount;

  /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.
   */
  @JsonAdapter(FeePriorityEnum.Adapter.class)
  public enum FeePriorityEnum {
    SLOW("slow"),
    
    STANDARD("standard"),
    
    FAST("fast");

    private String value;

    FeePriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeePriorityEnum fromValue(String value) {
      for (FeePriorityEnum b : FeePriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeePriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeePriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeePriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeePriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_PRIORITY = "feePriority";
  @SerializedName(SERIALIZED_NAME_FEE_PRIORITY)
  private FeePriorityEnum feePriority;

  public static final String SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT = "minimumTransferAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT)
  private String minimumTransferAmount;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_TOKEN_DATA = "tokenData";
  @SerializedName(SERIALIZED_NAME_TOKEN_DATA)
  private CreateAutomaticTokensForwardingRBTokenData tokenData;

  public CreateAutomaticTokensForwardingRBDataItem() { 
  }

  public CreateAutomaticTokensForwardingRBDataItem callbackSecretKey(String callbackSecretKey) {
    
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


  public CreateAutomaticTokensForwardingRBDataItem callbackUrl(String callbackUrl) {
    
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


  public CreateAutomaticTokensForwardingRBDataItem confirmationsCount(String confirmationsCount) {
    
    this.confirmationsCount = confirmationsCount;
    return this;
  }

   /**
   * Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.
   * @return confirmationsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.")

  public String getConfirmationsCount() {
    return confirmationsCount;
  }


  public void setConfirmationsCount(String confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
  }


  public CreateAutomaticTokensForwardingRBDataItem feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.
   * @return feePriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standard", required = true, value = "Represents the fee priority of the automation, whether it is \"SLOW\", \"STANDARD\" or \"FAST\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public CreateAutomaticTokensForwardingRBDataItem minimumTransferAmount(String minimumTransferAmount) {
    
    this.minimumTransferAmount = minimumTransferAmount;
    return this;
  }

   /**
   * Represents the minimum transfer amount of the currency in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding.
   * @return minimumTransferAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00002", required = true, value = "Represents the minimum transfer amount of the currency in the `fromAddress` that can be allowed for an automatic forwarding.")

  public String getMinimumTransferAmount() {
    return minimumTransferAmount;
  }


  public void setMinimumTransferAmount(String minimumTransferAmount) {
    this.minimumTransferAmount = minimumTransferAmount;
  }


  public CreateAutomaticTokensForwardingRBDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address the currency is forwarded to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tb1q54j7qcu7kgsrx87yn0r9zjdvsxrnvxg4qua2z6", required = true, value = "Represents the hash of the address the currency is forwarded to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public CreateAutomaticTokensForwardingRBDataItem tokenData(CreateAutomaticTokensForwardingRBTokenData tokenData) {
    
    this.tokenData = tokenData;
    return this;
  }

   /**
   * Get tokenData
   * @return tokenData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateAutomaticTokensForwardingRBTokenData getTokenData() {
    return tokenData;
  }


  public void setTokenData(CreateAutomaticTokensForwardingRBTokenData tokenData) {
    this.tokenData = tokenData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAutomaticTokensForwardingRBDataItem createAutomaticTokensForwardingRBDataItem = (CreateAutomaticTokensForwardingRBDataItem) o;
    return Objects.equals(this.callbackSecretKey, createAutomaticTokensForwardingRBDataItem.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, createAutomaticTokensForwardingRBDataItem.callbackUrl) &&
        Objects.equals(this.confirmationsCount, createAutomaticTokensForwardingRBDataItem.confirmationsCount) &&
        Objects.equals(this.feePriority, createAutomaticTokensForwardingRBDataItem.feePriority) &&
        Objects.equals(this.minimumTransferAmount, createAutomaticTokensForwardingRBDataItem.minimumTransferAmount) &&
        Objects.equals(this.toAddress, createAutomaticTokensForwardingRBDataItem.toAddress) &&
        Objects.equals(this.tokenData, createAutomaticTokensForwardingRBDataItem.tokenData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackSecretKey, callbackUrl, confirmationsCount, feePriority, minimumTransferAmount, toAddress, tokenData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAutomaticTokensForwardingRBDataItem {\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationsCount: ").append(toIndentedString(confirmationsCount)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    minimumTransferAmount: ").append(toIndentedString(minimumTransferAmount)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    tokenData: ").append(toIndentedString(tokenData)).append("\n");
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
    openapiFields.add("confirmationsCount");
    openapiFields.add("feePriority");
    openapiFields.add("minimumTransferAmount");
    openapiFields.add("toAddress");
    openapiFields.add("tokenData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("callbackUrl");
    openapiRequiredFields.add("confirmationsCount");
    openapiRequiredFields.add("feePriority");
    openapiRequiredFields.add("minimumTransferAmount");
    openapiRequiredFields.add("toAddress");
    openapiRequiredFields.add("tokenData");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAutomaticTokensForwardingRBDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAutomaticTokensForwardingRBDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAutomaticTokensForwardingRBDataItem is not found in the empty JSON string", CreateAutomaticTokensForwardingRBDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAutomaticTokensForwardingRBDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAutomaticTokensForwardingRBDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAutomaticTokensForwardingRBDataItem.openapiRequiredFields) {
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
      if (jsonObj.get("confirmationsCount") != null && !jsonObj.get("confirmationsCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmationsCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmationsCount").toString()));
      }
      if (jsonObj.get("feePriority") != null && !jsonObj.get("feePriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feePriority").toString()));
      }
      if (jsonObj.get("minimumTransferAmount") != null && !jsonObj.get("minimumTransferAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minimumTransferAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minimumTransferAmount").toString()));
      }
      if (jsonObj.get("toAddress") != null && !jsonObj.get("toAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toAddress").toString()));
      }
      // validate the optional field `tokenData`
      if (jsonObj.getAsJsonObject("tokenData") != null) {
        CreateAutomaticTokensForwardingRBTokenData.validateJsonObject(jsonObj.getAsJsonObject("tokenData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAutomaticTokensForwardingRBDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAutomaticTokensForwardingRBDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAutomaticTokensForwardingRBDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAutomaticTokensForwardingRBDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAutomaticTokensForwardingRBDataItem>() {
           @Override
           public void write(JsonWriter out, CreateAutomaticTokensForwardingRBDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAutomaticTokensForwardingRBDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAutomaticTokensForwardingRBDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAutomaticTokensForwardingRBDataItem
  * @throws IOException if the JSON string is invalid with respect to CreateAutomaticTokensForwardingRBDataItem
  */
  public static CreateAutomaticTokensForwardingRBDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAutomaticTokensForwardingRBDataItem.class);
  }

 /**
  * Convert an instance of CreateAutomaticTokensForwardingRBDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

