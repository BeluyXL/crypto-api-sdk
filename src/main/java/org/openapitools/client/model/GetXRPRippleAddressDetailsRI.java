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
import org.openapitools.client.model.GetXRPRippleAddressDetailsRIBalance;

/**
 * GetXRPRippleAddressDetailsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class GetXRPRippleAddressDetailsRI {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private GetXRPRippleAddressDetailsRIBalance balance;

  public static final String SERIALIZED_NAME_INCOMING_TRANSACTIONS_COUNT = "incomingTransactionsCount";
  @SerializedName(SERIALIZED_NAME_INCOMING_TRANSACTIONS_COUNT)
  private Integer incomingTransactionsCount;

  public static final String SERIALIZED_NAME_OUTGOING_TRANSACTIONS_COUNT = "outgoingTransactionsCount";
  @SerializedName(SERIALIZED_NAME_OUTGOING_TRANSACTIONS_COUNT)
  private Integer outgoingTransactionsCount;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;


  public GetXRPRippleAddressDetailsRI balance(GetXRPRippleAddressDetailsRIBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")

  public GetXRPRippleAddressDetailsRIBalance getBalance() {
    return balance;
  }


  public void setBalance(GetXRPRippleAddressDetailsRIBalance balance) {
    this.balance = balance;
  }


  public GetXRPRippleAddressDetailsRI incomingTransactionsCount(Integer incomingTransactionsCount) {
    
    this.incomingTransactionsCount = incomingTransactionsCount;
    return this;
  }

   /**
   * Defines the count of all confirmed incoming transactions from the address for coins. This applies to coins only, not to tokens transfers
   * @return incomingTransactionsCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "Defines the count of all confirmed incoming transactions from the address for coins. This applies to coins only, not to tokens transfers")

  public Integer getIncomingTransactionsCount() {
    return incomingTransactionsCount;
  }


  public void setIncomingTransactionsCount(Integer incomingTransactionsCount) {
    this.incomingTransactionsCount = incomingTransactionsCount;
  }


  public GetXRPRippleAddressDetailsRI outgoingTransactionsCount(Integer outgoingTransactionsCount) {
    
    this.outgoingTransactionsCount = outgoingTransactionsCount;
    return this;
  }

   /**
   * Defines the count of all confirmed outgoing transactions for coins. This applies to coins only, not to tokens transfers
   * @return outgoingTransactionsCount
  **/
  @ApiModelProperty(example = "1", required = true, value = "Defines the count of all confirmed outgoing transactions for coins. This applies to coins only, not to tokens transfers")

  public Integer getOutgoingTransactionsCount() {
    return outgoingTransactionsCount;
  }


  public void setOutgoingTransactionsCount(Integer outgoingTransactionsCount) {
    this.outgoingTransactionsCount = outgoingTransactionsCount;
  }


  public GetXRPRippleAddressDetailsRI sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Defines the transaction input&#39;s sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.
   * @return sequence
  **/
  @ApiModelProperty(example = "25648975", required = true, value = "Defines the transaction input's sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime.")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public GetXRPRippleAddressDetailsRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXRPRippleAddressDetailsRI getXRPRippleAddressDetailsRI = (GetXRPRippleAddressDetailsRI) o;
    return Objects.equals(this.balance, getXRPRippleAddressDetailsRI.balance) &&
        Objects.equals(this.incomingTransactionsCount, getXRPRippleAddressDetailsRI.incomingTransactionsCount) &&
        Objects.equals(this.outgoingTransactionsCount, getXRPRippleAddressDetailsRI.outgoingTransactionsCount) &&
        Objects.equals(this.sequence, getXRPRippleAddressDetailsRI.sequence) &&
        Objects.equals(this.transactionsCount, getXRPRippleAddressDetailsRI.transactionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, incomingTransactionsCount, outgoingTransactionsCount, sequence, transactionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXRPRippleAddressDetailsRI {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    incomingTransactionsCount: ").append(toIndentedString(incomingTransactionsCount)).append("\n");
    sb.append("    outgoingTransactionsCount: ").append(toIndentedString(outgoingTransactionsCount)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
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

