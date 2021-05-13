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

/**
 * NewConfirmedCoinsTransactionsAndEachConfirmationRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class NewConfirmedCoinsTransactionsAndEachConfirmationRI {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CONFIRMATIONS_COUNT = "confirmationsCount";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS_COUNT)
  private Integer confirmationsCount;

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

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address of the transaction, per which the result is returned.
   * @return address
  **/
  @ApiModelProperty(example = "15XyNC88pujwuuur8DCsXBCfEhJJMzHayU", required = true, value = "Represents the address of the transaction, per which the result is returned.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.
   * @return callbackSecretKey
  **/
  @ApiModelProperty(example = "yourSecretKey", required = true, value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.
   * @return callbackUrl
  **/
  @ApiModelProperty(example = "https://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI confirmationsCount(Integer confirmationsCount) {
    
    this.confirmationsCount = confirmationsCount;
    return this;
  }

   /**
   * Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.
   * @return confirmationsCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.")

  public Integer getConfirmationsCount() {
    return confirmationsCount;
  }


  public void setConfirmationsCount(Integer confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the subscription was created in Unix Timestamp.
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "1611238648", required = true, value = "Defines the specific time/date when the subscription was created in Unix Timestamp.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Defines the type of the specific event available for the customer to subscribe to for callback notification.
   * @return eventType
  **/
  @ApiModelProperty(example = "ADDRESS_COINS_TRANSACTION_CONFIRMED_EACH_CONFIRMATION", required = true, value = "Defines the type of the specific event available for the customer to subscribe to for callback notification.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Defines whether the subscription is active or not. Set as boolean.
   * @return isActive
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the subscription is active or not. Set as boolean.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique ID used to reference the specific callback subscription.
   * @return referenceId
  **/
  @ApiModelProperty(example = "bc243c86-0902-4386-b30d-e6b30fa1f2aa", required = true, value = "Represents a unique ID used to reference the specific callback subscription.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public NewConfirmedCoinsTransactionsAndEachConfirmationRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identification string that defines the transaction.
   * @return transactionId
  **/
  @ApiModelProperty(example = "96b4ea92dcca3a046c0ca2738ed9400f3c04f6c5f497cce4f3a148b1c948a1b3", required = true, value = "Represents the unique identification string that defines the transaction.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedCoinsTransactionsAndEachConfirmationRI newConfirmedCoinsTransactionsAndEachConfirmationRI = (NewConfirmedCoinsTransactionsAndEachConfirmationRI) o;
    return Objects.equals(this.address, newConfirmedCoinsTransactionsAndEachConfirmationRI.address) &&
        Objects.equals(this.callbackSecretKey, newConfirmedCoinsTransactionsAndEachConfirmationRI.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, newConfirmedCoinsTransactionsAndEachConfirmationRI.callbackUrl) &&
        Objects.equals(this.confirmationsCount, newConfirmedCoinsTransactionsAndEachConfirmationRI.confirmationsCount) &&
        Objects.equals(this.createdTimestamp, newConfirmedCoinsTransactionsAndEachConfirmationRI.createdTimestamp) &&
        Objects.equals(this.eventType, newConfirmedCoinsTransactionsAndEachConfirmationRI.eventType) &&
        Objects.equals(this.isActive, newConfirmedCoinsTransactionsAndEachConfirmationRI.isActive) &&
        Objects.equals(this.referenceId, newConfirmedCoinsTransactionsAndEachConfirmationRI.referenceId) &&
        Objects.equals(this.transactionId, newConfirmedCoinsTransactionsAndEachConfirmationRI.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, callbackSecretKey, callbackUrl, confirmationsCount, createdTimestamp, eventType, isActive, referenceId, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedCoinsTransactionsAndEachConfirmationRI {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationsCount: ").append(toIndentedString(confirmationsCount)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

}

