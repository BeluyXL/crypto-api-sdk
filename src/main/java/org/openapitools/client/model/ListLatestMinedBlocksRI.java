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
import org.openapitools.client.model.ListLatestMinedBlocksRIBS;
import org.openapitools.client.model.ListLatestMinedBlocksRITotalCoins;
import org.openapitools.client.model.ListLatestMinedBlocksRITotalFees;

/**
 * ListLatestMinedBlocksRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListLatestMinedBlocksRI {
  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public static final String SERIALIZED_NAME_TOTAL_COINS = "totalCoins";
  @SerializedName(SERIALIZED_NAME_TOTAL_COINS)
  private ListLatestMinedBlocksRITotalCoins totalCoins;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private ListLatestMinedBlocksRITotalFees totalFees;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC = "blockchainSpecific";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPECIFIC)
  private ListLatestMinedBlocksRIBS blockchainSpecific;

  public ListLatestMinedBlocksRI() { 
  }

  public ListLatestMinedBlocksRI hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return hash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "000000000000000426bd189cdfaab96a94d72089dda11cf110bd2a87116174a9", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public ListLatestMinedBlocksRI height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2099743", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public ListLatestMinedBlocksRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "000000000000001e592591fc762bd2bf4d37d0b75e29c49b41576507a501cbc3", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public ListLatestMinedBlocksRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1634642334", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListLatestMinedBlocksRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  public ListLatestMinedBlocksRI totalCoins(ListLatestMinedBlocksRITotalCoins totalCoins) {
    
    this.totalCoins = totalCoins;
    return this;
  }

   /**
   * Get totalCoins
   * @return totalCoins
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListLatestMinedBlocksRITotalCoins getTotalCoins() {
    return totalCoins;
  }


  public void setTotalCoins(ListLatestMinedBlocksRITotalCoins totalCoins) {
    this.totalCoins = totalCoins;
  }


  public ListLatestMinedBlocksRI totalFees(ListLatestMinedBlocksRITotalFees totalFees) {
    
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Get totalFees
   * @return totalFees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListLatestMinedBlocksRITotalFees getTotalFees() {
    return totalFees;
  }


  public void setTotalFees(ListLatestMinedBlocksRITotalFees totalFees) {
    this.totalFees = totalFees;
  }


  public ListLatestMinedBlocksRI blockchainSpecific(ListLatestMinedBlocksRIBS blockchainSpecific) {
    
    this.blockchainSpecific = blockchainSpecific;
    return this;
  }

   /**
   * Get blockchainSpecific
   * @return blockchainSpecific
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListLatestMinedBlocksRIBS getBlockchainSpecific() {
    return blockchainSpecific;
  }


  public void setBlockchainSpecific(ListLatestMinedBlocksRIBS blockchainSpecific) {
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
    ListLatestMinedBlocksRI listLatestMinedBlocksRI = (ListLatestMinedBlocksRI) o;
    return Objects.equals(this.hash, listLatestMinedBlocksRI.hash) &&
        Objects.equals(this.height, listLatestMinedBlocksRI.height) &&
        Objects.equals(this.previousBlockHash, listLatestMinedBlocksRI.previousBlockHash) &&
        Objects.equals(this.timestamp, listLatestMinedBlocksRI.timestamp) &&
        Objects.equals(this.transactionsCount, listLatestMinedBlocksRI.transactionsCount) &&
        Objects.equals(this.totalCoins, listLatestMinedBlocksRI.totalCoins) &&
        Objects.equals(this.totalFees, listLatestMinedBlocksRI.totalFees) &&
        Objects.equals(this.blockchainSpecific, listLatestMinedBlocksRI.blockchainSpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, height, previousBlockHash, timestamp, transactionsCount, totalCoins, totalFees, blockchainSpecific);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLatestMinedBlocksRI {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
    sb.append("    totalCoins: ").append(toIndentedString(totalCoins)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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
