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
import org.openapitools.client.model.GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders;
import org.openapitools.client.model.ListOmniTransactionsByAddressRIRecipients;
import org.openapitools.client.model.ListUnconfirmedOmniTransactionsByAddressRIFee;

/**
 * ListUnconfirmedOmniTransactionsByPropertyIDRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class ListUnconfirmedOmniTransactionsByPropertyIDRI {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DIVISIBLE = "divisible";
  @SerializedName(SERIALIZED_NAME_DIVISIBLE)
  private Boolean divisible;

  public static final String SERIALIZED_NAME_MINED = "mined";
  @SerializedName(SERIALIZED_NAME_MINED)
  private Boolean mined;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListOmniTransactionsByAddressRIRecipients> recipients = new ArrayList<ListOmniTransactionsByAddressRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders> senders = new ArrayList<GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders>();

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Boolean sent;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_IINT = "typeIint";
  @SerializedName(SERIALIZED_NAME_TYPE_IINT)
  private Integer typeIint;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListUnconfirmedOmniTransactionsByAddressRIFee fee;


  public ListUnconfirmedOmniTransactionsByPropertyIDRI amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the sent tokens.
   * @return amount
  **/
  @ApiModelProperty(example = "9.146383", required = true, value = "Defines the amount of the sent tokens.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI divisible(Boolean divisible) {
    
    this.divisible = divisible;
    return this;
  }

   /**
   * Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible.
   * @return divisible
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \"true\", the attribute is divisible.")

  public Boolean getDivisible() {
    return divisible;
  }


  public void setDivisible(Boolean divisible) {
    this.divisible = divisible;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI mined(Boolean mined) {
    
    this.mined = mined;
    return this;
  }

   /**
   * Defines whether the transaction has been mined or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is mined.
   * @return mined
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the transaction has been mined or not, as boolean. E.g. if set to \"true\", it means the transaction is mined.")

  public Boolean getMined() {
    return mined;
  }


  public void setMined(Boolean mined) {
    this.mined = mined;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Represents the identifier of the tokens to send.
   * @return propertyId
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the identifier of the tokens to send.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI recipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListUnconfirmedOmniTransactionsByPropertyIDRI addRecipientsItem(ListOmniTransactionsByAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents an object of addresses that receive the transactions.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that receive the transactions.")

  public List<ListOmniTransactionsByAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI senders(List<GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListUnconfirmedOmniTransactionsByPropertyIDRI addSendersItem(GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<GetUnconfirmedOmniTransactionByTransactionIDTxidRISenders> senders) {
    this.senders = senders;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI sent(Boolean sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Defines whether the transaction has been sent or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is sent.
   * @return sent
  **/
  @ApiModelProperty(example = "false", required = true, value = "Defines whether the transaction has been sent or not, as boolean. E.g. if set to \"true\", it means the transaction is sent.")

  public Boolean getSent() {
    return sent;
  }


  public void setSent(Boolean sent) {
    this.sent = sent;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1616487033", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @ApiModelProperty(example = "37ed9145565ffc8c51df7370bd82d546d892973f15cb6c974e7b6b52f1bf5aa9", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction as a string.
   * @return type
  **/
  @ApiModelProperty(example = "Simple Send", required = true, value = "Defines the type of the transaction as a string.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI typeIint(Integer typeIint) {
    
    this.typeIint = typeIint;
    return this;
  }

   /**
   * Defines the type of the transaction as a number.
   * @return typeIint
  **/
  @ApiModelProperty(example = "0", required = true, value = "Defines the type of the transaction as a number.")

  public Integer getTypeIint() {
    return typeIint;
  }


  public void setTypeIint(Integer typeIint) {
    this.typeIint = typeIint;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the specific version.
   * @return version
  **/
  @ApiModelProperty(example = "0", required = true, value = "Defines the specific version.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListUnconfirmedOmniTransactionsByPropertyIDRI fee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedOmniTransactionsByAddressRIFee getFee() {
    return fee;
  }


  public void setFee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnconfirmedOmniTransactionsByPropertyIDRI listUnconfirmedOmniTransactionsByPropertyIDRI = (ListUnconfirmedOmniTransactionsByPropertyIDRI) o;
    return Objects.equals(this.amount, listUnconfirmedOmniTransactionsByPropertyIDRI.amount) &&
        Objects.equals(this.divisible, listUnconfirmedOmniTransactionsByPropertyIDRI.divisible) &&
        Objects.equals(this.mined, listUnconfirmedOmniTransactionsByPropertyIDRI.mined) &&
        Objects.equals(this.propertyId, listUnconfirmedOmniTransactionsByPropertyIDRI.propertyId) &&
        Objects.equals(this.recipients, listUnconfirmedOmniTransactionsByPropertyIDRI.recipients) &&
        Objects.equals(this.senders, listUnconfirmedOmniTransactionsByPropertyIDRI.senders) &&
        Objects.equals(this.sent, listUnconfirmedOmniTransactionsByPropertyIDRI.sent) &&
        Objects.equals(this.timestamp, listUnconfirmedOmniTransactionsByPropertyIDRI.timestamp) &&
        Objects.equals(this.transactionId, listUnconfirmedOmniTransactionsByPropertyIDRI.transactionId) &&
        Objects.equals(this.type, listUnconfirmedOmniTransactionsByPropertyIDRI.type) &&
        Objects.equals(this.typeIint, listUnconfirmedOmniTransactionsByPropertyIDRI.typeIint) &&
        Objects.equals(this.version, listUnconfirmedOmniTransactionsByPropertyIDRI.version) &&
        Objects.equals(this.fee, listUnconfirmedOmniTransactionsByPropertyIDRI.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, divisible, mined, propertyId, recipients, senders, sent, timestamp, transactionId, type, typeIint, version, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnconfirmedOmniTransactionsByPropertyIDRI {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisible: ").append(toIndentedString(divisible)).append("\n");
    sb.append("    mined: ").append(toIndentedString(mined)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIint: ").append(toIndentedString(typeIint)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

