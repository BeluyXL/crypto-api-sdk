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
import org.openapitools.client.model.CreateCoinsTransactionRequestFromAddressRIRecipientsInner;
import org.openapitools.client.model.CreateCoinsTransactionRequestFromAddressRISenders;

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
 * CreateCoinsTransactionRequestFromAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class CreateCoinsTransactionRequestFromAddressRI {
  public static final String SERIALIZED_NAME_ADDRESS_TAG = "addressTag";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TAG)
  private Integer addressTag;

  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CLASSIC_ADDRESS = "classicAddress";
  @SerializedName(SERIALIZED_NAME_CLASSIC_ADDRESS)
  private String classicAddress;

  /**
   * Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;.
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

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<CreateCoinsTransactionRequestFromAddressRIRecipientsInner> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private CreateCoinsTransactionRequestFromAddressRISenders senders;

  public static final String SERIALIZED_NAME_TRANSACTION_REQUEST_ID = "transactionRequestId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REQUEST_ID)
  private String transactionRequestId;

  /**
   * Defines the status of the transaction request, e.g. \&quot;created, \&quot;await_approval\&quot;, \&quot;pending\&quot;, \&quot;prepared\&quot;, \&quot;signed\&quot;, \&quot;broadcasted\&quot;, \&quot;success\&quot;, \&quot;failed\&quot;, \&quot;rejected\&quot;, mined\&quot;.
   */
  @JsonAdapter(TransactionRequestStatusEnum.Adapter.class)
  public enum TransactionRequestStatusEnum {
    CREATED("created"),
    
    AWAIT_APPROVAL("await-approval"),
    
    PENDING("pending"),
    
    PREPARED("prepared"),
    
    SIGNED("signed"),
    
    BROADCASTED("broadcasted"),
    
    SUCCESS("success"),
    
    FAILED("failed"),
    
    REJECTED("rejected"),
    
    MINED("mined");

    private String value;

    TransactionRequestStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionRequestStatusEnum fromValue(String value) {
      for (TransactionRequestStatusEnum b : TransactionRequestStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionRequestStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionRequestStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionRequestStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionRequestStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_REQUEST_STATUS = "transactionRequestStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_REQUEST_STATUS)
  private TransactionRequestStatusEnum transactionRequestStatus;

  public CreateCoinsTransactionRequestFromAddressRI() { 
  }

  public CreateCoinsTransactionRequestFromAddressRI addressTag(Integer addressTag) {
    
    this.addressTag = addressTag;
    return this;
  }

   /**
   * Defines a specific Tag that is an additional XRP address feature. It helps identify a transaction recipient beyond a wallet address. The tag that was encoded into the x-Address along with the Source Classic Address.
   * @return addressTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3999472835", value = "Defines a specific Tag that is an additional XRP address feature. It helps identify a transaction recipient beyond a wallet address. The tag that was encoded into the x-Address along with the Source Classic Address.")

  public Integer getAddressTag() {
    return addressTag;
  }


  public void setAddressTag(Integer addressTag) {
    this.addressTag = addressTag;
  }


  public CreateCoinsTransactionRequestFromAddressRI callbackSecretKey(String callbackSecretKey) {
    
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


  public CreateCoinsTransactionRequestFromAddressRI callbackUrl(String callbackUrl) {
    
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


  public CreateCoinsTransactionRequestFromAddressRI classicAddress(String classicAddress) {
    
    this.classicAddress = classicAddress;
    return this;
  }

   /**
   * Represents the public address, which is a compressed and shortened form of a public key. The classic address is shown when the source address is an x-Address.
   * @return classicAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rA9bXGJcXvZKaWofrRphdJsBWzhyCfH3z", value = "Represents the public address, which is a compressed and shortened form of a public key. The classic address is shown when the source address is an x-Address.")

  public String getClassicAddress() {
    return classicAddress;
  }


  public void setClassicAddress(String classicAddress) {
    this.classicAddress = classicAddress;
  }


  public CreateCoinsTransactionRequestFromAddressRI feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;.
   * @return feePriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standard", required = true, value = "Represents the fee priority of the automation, whether it is \"slow\", \"standard\" or \"fast\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public CreateCoinsTransactionRequestFromAddressRI note(String note) {
    
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


  public CreateCoinsTransactionRequestFromAddressRI recipients(List<CreateCoinsTransactionRequestFromAddressRIRecipientsInner> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public CreateCoinsTransactionRequestFromAddressRI addRecipientsItem(CreateCoinsTransactionRequestFromAddressRIRecipientsInner recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Defines the destination for the transaction, i.e. the recipient(s).
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines the destination for the transaction, i.e. the recipient(s).")

  public List<CreateCoinsTransactionRequestFromAddressRIRecipientsInner> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<CreateCoinsTransactionRequestFromAddressRIRecipientsInner> recipients) {
    this.recipients = recipients;
  }


  public CreateCoinsTransactionRequestFromAddressRI senders(CreateCoinsTransactionRequestFromAddressRISenders senders) {
    
    this.senders = senders;
    return this;
  }

   /**
   * Get senders
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateCoinsTransactionRequestFromAddressRISenders getSenders() {
    return senders;
  }


  public void setSenders(CreateCoinsTransactionRequestFromAddressRISenders senders) {
    this.senders = senders;
  }


  public CreateCoinsTransactionRequestFromAddressRI transactionRequestId(String transactionRequestId) {
    
    this.transactionRequestId = transactionRequestId;
    return this;
  }

   /**
   * Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which &#x60;referenceId&#x60; concern that specific transaction request.
   * @return transactionRequestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6017dd02a309213863be9e55", required = true, value = "Represents a unique identifier of the transaction request (the request sent to make a transaction), which helps in identifying which callback and which `referenceId` concern that specific transaction request.")

  public String getTransactionRequestId() {
    return transactionRequestId;
  }


  public void setTransactionRequestId(String transactionRequestId) {
    this.transactionRequestId = transactionRequestId;
  }


  public CreateCoinsTransactionRequestFromAddressRI transactionRequestStatus(TransactionRequestStatusEnum transactionRequestStatus) {
    
    this.transactionRequestStatus = transactionRequestStatus;
    return this;
  }

   /**
   * Defines the status of the transaction request, e.g. \&quot;created, \&quot;await_approval\&quot;, \&quot;pending\&quot;, \&quot;prepared\&quot;, \&quot;signed\&quot;, \&quot;broadcasted\&quot;, \&quot;success\&quot;, \&quot;failed\&quot;, \&quot;rejected\&quot;, mined\&quot;.
   * @return transactionRequestStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "created", required = true, value = "Defines the status of the transaction request, e.g. \"created, \"await_approval\", \"pending\", \"prepared\", \"signed\", \"broadcasted\", \"success\", \"failed\", \"rejected\", mined\".")

  public TransactionRequestStatusEnum getTransactionRequestStatus() {
    return transactionRequestStatus;
  }


  public void setTransactionRequestStatus(TransactionRequestStatusEnum transactionRequestStatus) {
    this.transactionRequestStatus = transactionRequestStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCoinsTransactionRequestFromAddressRI createCoinsTransactionRequestFromAddressRI = (CreateCoinsTransactionRequestFromAddressRI) o;
    return Objects.equals(this.addressTag, createCoinsTransactionRequestFromAddressRI.addressTag) &&
        Objects.equals(this.callbackSecretKey, createCoinsTransactionRequestFromAddressRI.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, createCoinsTransactionRequestFromAddressRI.callbackUrl) &&
        Objects.equals(this.classicAddress, createCoinsTransactionRequestFromAddressRI.classicAddress) &&
        Objects.equals(this.feePriority, createCoinsTransactionRequestFromAddressRI.feePriority) &&
        Objects.equals(this.note, createCoinsTransactionRequestFromAddressRI.note) &&
        Objects.equals(this.recipients, createCoinsTransactionRequestFromAddressRI.recipients) &&
        Objects.equals(this.senders, createCoinsTransactionRequestFromAddressRI.senders) &&
        Objects.equals(this.transactionRequestId, createCoinsTransactionRequestFromAddressRI.transactionRequestId) &&
        Objects.equals(this.transactionRequestStatus, createCoinsTransactionRequestFromAddressRI.transactionRequestStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressTag, callbackSecretKey, callbackUrl, classicAddress, feePriority, note, recipients, senders, transactionRequestId, transactionRequestStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCoinsTransactionRequestFromAddressRI {\n");
    sb.append("    addressTag: ").append(toIndentedString(addressTag)).append("\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    classicAddress: ").append(toIndentedString(classicAddress)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    transactionRequestId: ").append(toIndentedString(transactionRequestId)).append("\n");
    sb.append("    transactionRequestStatus: ").append(toIndentedString(transactionRequestStatus)).append("\n");
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
    openapiFields.add("addressTag");
    openapiFields.add("callbackSecretKey");
    openapiFields.add("callbackUrl");
    openapiFields.add("classicAddress");
    openapiFields.add("feePriority");
    openapiFields.add("note");
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("transactionRequestId");
    openapiFields.add("transactionRequestStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("feePriority");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("transactionRequestId");
    openapiRequiredFields.add("transactionRequestStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCoinsTransactionRequestFromAddressRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCoinsTransactionRequestFromAddressRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCoinsTransactionRequestFromAddressRI is not found in the empty JSON string", CreateCoinsTransactionRequestFromAddressRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCoinsTransactionRequestFromAddressRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCoinsTransactionRequestFromAddressRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCoinsTransactionRequestFromAddressRI.openapiRequiredFields) {
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
      if (jsonObj.get("classicAddress") != null && !jsonObj.get("classicAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classicAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classicAddress").toString()));
      }
      if (jsonObj.get("feePriority") != null && !jsonObj.get("feePriority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feePriority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feePriority").toString()));
      }
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      if (jsonArrayrecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
        }

        // validate the optional field `recipients` (array)
        for (int i = 0; i < jsonArrayrecipients.size(); i++) {
          CreateCoinsTransactionRequestFromAddressRIRecipientsInner.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `senders`
      if (jsonObj.getAsJsonObject("senders") != null) {
        CreateCoinsTransactionRequestFromAddressRISenders.validateJsonObject(jsonObj.getAsJsonObject("senders"));
      }
      if (jsonObj.get("transactionRequestId") != null && !jsonObj.get("transactionRequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRequestId").toString()));
      }
      if (jsonObj.get("transactionRequestStatus") != null && !jsonObj.get("transactionRequestStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionRequestStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionRequestStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCoinsTransactionRequestFromAddressRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCoinsTransactionRequestFromAddressRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCoinsTransactionRequestFromAddressRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCoinsTransactionRequestFromAddressRI.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCoinsTransactionRequestFromAddressRI>() {
           @Override
           public void write(JsonWriter out, CreateCoinsTransactionRequestFromAddressRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCoinsTransactionRequestFromAddressRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCoinsTransactionRequestFromAddressRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCoinsTransactionRequestFromAddressRI
  * @throws IOException if the JSON string is invalid with respect to CreateCoinsTransactionRequestFromAddressRI
  */
  public static CreateCoinsTransactionRequestFromAddressRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCoinsTransactionRequestFromAddressRI.class);
  }

 /**
  * Convert an instance of CreateCoinsTransactionRequestFromAddressRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

