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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIFee;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIRecipients;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRISenders;
import org.openapitools.client.model.ListTransactionsByAddressRIBS;

/**
 * ListTransactionsByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class ListTransactionsByAddressRI {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<GetTransactionDetailsByTransactionIDRIRecipients> recipients = new ArrayList<GetTransactionDetailsByTransactionIDRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<GetTransactionDetailsByTransactionIDRISenders> senders = new ArrayList<GetTransactionDetailsByTransactionIDRISenders>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private GetTransactionDetailsByTransactionIDRIFee fee;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private ListTransactionsByAddressRIBS blockchainSpecific;


  public ListTransactionsByAddressRI index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Represents the index position of the transaction in the block.
   * @return index
  **/
  @ApiModelProperty(example = "1", required = true, value = "Represents the index position of the transaction in the block.")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public ListTransactionsByAddressRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000407f119ecb74b44229228910400aaeb9f4e3b9869955b85a53e9b7db", value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public ListTransactionsByAddressRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1903849", value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListTransactionsByAddressRI recipients(List<GetTransactionDetailsByTransactionIDRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListTransactionsByAddressRI addRecipientsItem(GetTransactionDetailsByTransactionIDRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<GetTransactionDetailsByTransactionIDRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<GetTransactionDetailsByTransactionIDRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListTransactionsByAddressRI senders(List<GetTransactionDetailsByTransactionIDRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListTransactionsByAddressRI addSendersItem(GetTransactionDetailsByTransactionIDRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list.")

  public List<GetTransactionDetailsByTransactionIDRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<GetTransactionDetailsByTransactionIDRISenders> senders) {
    this.senders = senders;
  }


  public ListTransactionsByAddressRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1582202940", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListTransactionsByAddressRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as &#x60;transactionId&#x60; for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols &#x60;hash&#x60; is different from &#x60;transactionId&#x60; for SegWit transactions.
   * @return transactionHash
  **/
  @ApiModelProperty(example = "1ec73b0f61359927d02376b35993b756b1097cb9a857bec23da4c98c4977d2b2", required = true, value = "Represents the same as `transactionId` for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols `hash` is different from `transactionId` for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListTransactionsByAddressRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @ApiModelProperty(example = "4b66461bf88b61e1e4326356534c135129defb504c7acb2fd6c92697d79eb250", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ListTransactionsByAddressRI fee(GetTransactionDetailsByTransactionIDRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDRIFee getFee() {
    return fee;
  }


  public void setFee(GetTransactionDetailsByTransactionIDRIFee fee) {
    this.fee = fee;
  }


  public ListTransactionsByAddressRI blockchainSpecific(ListTransactionsByAddressRIBS blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByAddressRIBS getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(ListTransactionsByAddressRIBS blockchainSpecific) {
    this.blockchainSpecific = blockchainSpecific;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByAddressRI listTransactionsByAddressRI = (ListTransactionsByAddressRI) o;
    return Objects.equals(this.index, listTransactionsByAddressRI.index) &&
        Objects.equals(this.minedInBlockHash, listTransactionsByAddressRI.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, listTransactionsByAddressRI.minedInBlockHeight) &&
        Objects.equals(this.recipients, listTransactionsByAddressRI.recipients) &&
        Objects.equals(this.senders, listTransactionsByAddressRI.senders) &&
        Objects.equals(this.timestamp, listTransactionsByAddressRI.timestamp) &&
        Objects.equals(this.transactionHash, listTransactionsByAddressRI.transactionHash) &&
        Objects.equals(this.transactionId, listTransactionsByAddressRI.transactionId) &&
        Objects.equals(this.fee, listTransactionsByAddressRI.fee) &&
        Objects.equals(this.blockchainSpecific, listTransactionsByAddressRI.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, minedInBlockHash, minedInBlockHeight, recipients, senders, timestamp, transactionHash, transactionId, fee, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByAddressRI {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    blockchainSpecific: ").append(toIndentedString(blockchainSpecific)).append("\n");
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
