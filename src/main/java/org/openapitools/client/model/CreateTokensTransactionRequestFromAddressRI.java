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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CreateTokensTransactionRequestFromAddressRIRecipients;
import org.openapitools.client.model.CreateTokensTransactionRequestFromAddressRISenders;
import org.openapitools.client.model.CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData;

/**
 * CreateTokensTransactionRequestFromAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class CreateTokensTransactionRequestFromAddressRI {
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

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<CreateTokensTransactionRequestFromAddressRIRecipients> recipients = new ArrayList<CreateTokensTransactionRequestFromAddressRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private CreateTokensTransactionRequestFromAddressRISenders senders;

  public static final String SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA = "tokenTypeSpecificData";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE_SPECIFIC_DATA)
  private CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData tokenTypeSpecificData;


  public CreateTokensTransactionRequestFromAddressRI feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;slow\&quot;, \&quot;standard\&quot; or \&quot;fast\&quot;.
   * @return feePriority
  **/
  @ApiModelProperty(example = "fast", required = true, value = "Represents the fee priority of the automation, whether it is \"slow\", \"standard\" or \"fast\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public CreateTokensTransactionRequestFromAddressRI recipients(List<CreateTokensTransactionRequestFromAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public CreateTokensTransactionRequestFromAddressRI addRecipientsItem(CreateTokensTransactionRequestFromAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Defines the destination for the transaction, i.e. the recipient(s).
   * @return recipients
  **/
  @ApiModelProperty(example = "0x1316bea88fb7cd4ccc4a57e2f9f4f43d1a86ee59", required = true, value = "Defines the destination for the transaction, i.e. the recipient(s).")

  public List<CreateTokensTransactionRequestFromAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<CreateTokensTransactionRequestFromAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public CreateTokensTransactionRequestFromAddressRI senders(CreateTokensTransactionRequestFromAddressRISenders senders) {
    
    this.senders = senders;
    return this;
  }

   /**
   * Get senders
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "")

  public CreateTokensTransactionRequestFromAddressRISenders getSenders() {
    return senders;
  }


  public void setSenders(CreateTokensTransactionRequestFromAddressRISenders senders) {
    this.senders = senders;
  }


  public CreateTokensTransactionRequestFromAddressRI tokenTypeSpecificData(CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData tokenTypeSpecificData) {
    
    this.tokenTypeSpecificData = tokenTypeSpecificData;
    return this;
  }

   /**
   * Get tokenTypeSpecificData
   * @return tokenTypeSpecificData
  **/
  @ApiModelProperty(required = true, value = "")

  public CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData getTokenTypeSpecificData() {
    return tokenTypeSpecificData;
  }


  public void setTokenTypeSpecificData(CreateTokensTransactionRequestFromAddressRITokenTypeSpecificData tokenTypeSpecificData) {
    this.tokenTypeSpecificData = tokenTypeSpecificData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTokensTransactionRequestFromAddressRI createTokensTransactionRequestFromAddressRI = (CreateTokensTransactionRequestFromAddressRI) o;
    return Objects.equals(this.feePriority, createTokensTransactionRequestFromAddressRI.feePriority) &&
        Objects.equals(this.recipients, createTokensTransactionRequestFromAddressRI.recipients) &&
        Objects.equals(this.senders, createTokensTransactionRequestFromAddressRI.senders) &&
        Objects.equals(this.tokenTypeSpecificData, createTokensTransactionRequestFromAddressRI.tokenTypeSpecificData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePriority, recipients, senders, tokenTypeSpecificData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokensTransactionRequestFromAddressRI {\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    tokenTypeSpecificData: ").append(toIndentedString(tokenTypeSpecificData)).append("\n");
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
