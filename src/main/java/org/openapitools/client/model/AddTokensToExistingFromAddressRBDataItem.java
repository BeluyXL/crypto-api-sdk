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
import org.openapitools.client.model.AddTokensToExistingFromAddressRBTokenData;

/**
 * AddTokensToExistingFromAddressRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class AddTokensToExistingFromAddressRBDataItem {
  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CONFIRMATIONS_COUNT = "confirmationsCount";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS_COUNT)
  private Integer confirmationsCount;

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

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT = "minimumTransferAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT)
  private String minimumTransferAmount;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_TOKEN_DATA = "tokenData";
  @SerializedName(SERIALIZED_NAME_TOKEN_DATA)
  private AddTokensToExistingFromAddressRBTokenData tokenData;


  public AddTokensToExistingFromAddressRBDataItem callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.
   * @return callbackSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourSecretString", value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public AddTokensToExistingFromAddressRBDataItem callbackUrl(String callbackUrl) {
    
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


  public AddTokensToExistingFromAddressRBDataItem confirmationsCount(Integer confirmationsCount) {
    
    this.confirmationsCount = confirmationsCount;
    return this;
  }

   /**
   * Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.
   * @return confirmationsCount
  **/
  @ApiModelProperty(example = "3", required = true, value = "Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.")

  public Integer getConfirmationsCount() {
    return confirmationsCount;
  }


  public void setConfirmationsCount(Integer confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
  }


  public AddTokensToExistingFromAddressRBDataItem feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.
   * @return feePriority
  **/
  @ApiModelProperty(example = "standard", required = true, value = "Represents the fee priority of the automation, whether it is \"SLOW\", \"STANDARD\" or \"FAST\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public AddTokensToExistingFromAddressRBDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that forwards the tokens.
   * @return fromAddress
  **/
  @ApiModelProperty(example = "mizRduUBKEbJ6uzYJUegPh78gEGgM3WjAr", required = true, value = "Represents the hash of the address that forwards the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public AddTokensToExistingFromAddressRBDataItem minimumTransferAmount(String minimumTransferAmount) {
    
    this.minimumTransferAmount = minimumTransferAmount;
    return this;
  }

   /**
   * Represents the minimum transfer amount of the currency in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding.
   * @return minimumTransferAmount
  **/
  @ApiModelProperty(example = "0.00001", required = true, value = "Represents the minimum transfer amount of the currency in the `fromAddress` that can be allowed for an automatic forwarding.")

  public String getMinimumTransferAmount() {
    return minimumTransferAmount;
  }


  public void setMinimumTransferAmount(String minimumTransferAmount) {
    this.minimumTransferAmount = minimumTransferAmount;
  }


  public AddTokensToExistingFromAddressRBDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address the currency is forwarded to.
   * @return toAddress
  **/
  @ApiModelProperty(example = "mnumE76iEKN47bUsdni85oped5D1fRwKWi", required = true, value = "Represents the hash of the address the currency is forwarded to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public AddTokensToExistingFromAddressRBDataItem tokenData(AddTokensToExistingFromAddressRBTokenData tokenData) {
    
    this.tokenData = tokenData;
    return this;
  }

   /**
   * Get tokenData
   * @return tokenData
  **/
  @ApiModelProperty(required = true, value = "")

  public AddTokensToExistingFromAddressRBTokenData getTokenData() {
    return tokenData;
  }


  public void setTokenData(AddTokensToExistingFromAddressRBTokenData tokenData) {
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
    AddTokensToExistingFromAddressRBDataItem addTokensToExistingFromAddressRBDataItem = (AddTokensToExistingFromAddressRBDataItem) o;
    return Objects.equals(this.callbackSecretKey, addTokensToExistingFromAddressRBDataItem.callbackSecretKey) &&
        Objects.equals(this.callbackUrl, addTokensToExistingFromAddressRBDataItem.callbackUrl) &&
        Objects.equals(this.confirmationsCount, addTokensToExistingFromAddressRBDataItem.confirmationsCount) &&
        Objects.equals(this.feePriority, addTokensToExistingFromAddressRBDataItem.feePriority) &&
        Objects.equals(this.fromAddress, addTokensToExistingFromAddressRBDataItem.fromAddress) &&
        Objects.equals(this.minimumTransferAmount, addTokensToExistingFromAddressRBDataItem.minimumTransferAmount) &&
        Objects.equals(this.toAddress, addTokensToExistingFromAddressRBDataItem.toAddress) &&
        Objects.equals(this.tokenData, addTokensToExistingFromAddressRBDataItem.tokenData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackSecretKey, callbackUrl, confirmationsCount, feePriority, fromAddress, minimumTransferAmount, toAddress, tokenData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTokensToExistingFromAddressRBDataItem {\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationsCount: ").append(toIndentedString(confirmationsCount)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
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

}

