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
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSB;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSBC;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSD;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSD2;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSE;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSEC;
import org.openapitools.client.model.GetBlockDetailsByBlockHashRIBSL;

/**
 * GetBlockDetailsByBlockHashRIBS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashRIBS {
  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_STRIPPED_SIZE = "strippedSize";
  @SerializedName(SERIALIZED_NAME_STRIPPED_SIZE)
  private Integer strippedSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_HEX = "versionHex";
  @SerializedName(SERIALIZED_NAME_VERSION_HEX)
  private String versionHex;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private String extraData;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_SECONDS = "minedInSeconds";
  @SerializedName(SERIALIZED_NAME_MINED_IN_SECONDS)
  private Integer minedInSeconds;

  public static final String SERIALIZED_NAME_SHA3_UNCLES = "sha3Uncles";
  @SerializedName(SERIALIZED_NAME_SHA3_UNCLES)
  private String sha3Uncles;

  public static final String SERIALIZED_NAME_TOTAL_DIFFICULTY = "totalDifficulty";
  @SerializedName(SERIALIZED_NAME_TOTAL_DIFFICULTY)
  private String totalDifficulty;

  public static final String SERIALIZED_NAME_UNCLES = "uncles";
  @SerializedName(SERIALIZED_NAME_UNCLES)
  private List<String> uncles = new ArrayList<String>();

  public static final String SERIALIZED_NAME_MERKLEROOT = "merkleroot";
  @SerializedName(SERIALIZED_NAME_MERKLEROOT)
  private String merkleroot;


  public GetBlockDetailsByBlockHashRIBS difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @ApiModelProperty(example = "209515044.4071968", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetBlockDetailsByBlockHashRIBS nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the Proof of Work.
   * @return nonce
  **/
  @ApiModelProperty(example = "1535290446", required = true, value = "Represents a random value that can be adjusted to satisfy the Proof of Work.")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public GetBlockDetailsByBlockHashRIBS size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @ApiModelProperty(example = "53598", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetBlockDetailsByBlockHashRIBS bits(String bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Represents a specific sub-unit of Dash. Bits have two-decimal precision.
   * @return bits
  **/
  @ApiModelProperty(example = "191b7fd9", required = true, value = "Represents a specific sub-unit of Dash. Bits have two-decimal precision.")

  public String getBits() {
    return bits;
  }


  public void setBits(String bits) {
    this.bits = bits;
  }


  public GetBlockDetailsByBlockHashRIBS chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.
   * @return chainwork
  **/
  @ApiModelProperty(example = "0000000000000000000000000000000000000000000016b0ef9202fae046555d", required = true, value = "Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public GetBlockDetailsByBlockHashRIBS merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleRoot
  **/
  @ApiModelProperty(example = "14add5ff6fb9dfc58767228b658a48f85d988a1cc49151238f9cef85b53e54d2", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public GetBlockDetailsByBlockHashRIBS strippedSize(Integer strippedSize) {
    
    this.strippedSize = strippedSize;
    return this;
  }

   /**
   * Defines the numeric representation of the block size excluding the witness data.
   * @return strippedSize
  **/
  @ApiModelProperty(example = "895429", required = true, value = "Defines the numeric representation of the block size excluding the witness data.")

  public Integer getStrippedSize() {
    return strippedSize;
  }


  public void setStrippedSize(Integer strippedSize) {
    this.strippedSize = strippedSize;
  }


  public GetBlockDetailsByBlockHashRIBS version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the version of the specific block on the blockchain.
   * @return version
  **/
  @ApiModelProperty(example = "536870912", required = true, value = "Represents the version of the specific block on the blockchain.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetBlockDetailsByBlockHashRIBS versionHex(String versionHex) {
    
    this.versionHex = versionHex;
    return this;
  }

   /**
   * Is the hexadecimal string representation of the block&#39;s version.
   * @return versionHex
  **/
  @ApiModelProperty(example = "20000000", required = true, value = "Is the hexadecimal string representation of the block's version.")

  public String getVersionHex() {
    return versionHex;
  }


  public void setVersionHex(String versionHex) {
    this.versionHex = versionHex;
  }


  public GetBlockDetailsByBlockHashRIBS weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.
   * @return weight
  **/
  @ApiModelProperty(example = "37248", required = true, value = "Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public GetBlockDetailsByBlockHashRIBS extraData(String extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Represents any data that can be included by the miner in the block.
   * @return extraData
  **/
  @ApiModelProperty(required = true, value = "Represents any data that can be included by the miner in the block.")

  public String getExtraData() {
    return extraData;
  }


  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }


  public GetBlockDetailsByBlockHashRIBS gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Defines the total gas limit of all transactions in the block.
   * @return gasLimit
  **/
  @ApiModelProperty(example = "7999992", required = true, value = "Defines the total gas limit of all transactions in the block.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetBlockDetailsByBlockHashRIBS gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the total amount of gas used by all transactions in this block.
   * @return gasUsed
  **/
  @ApiModelProperty(example = "21000", required = true, value = "Represents the total amount of gas used by all transactions in this block.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetBlockDetailsByBlockHashRIBS minedInSeconds(Integer minedInSeconds) {
    
    this.minedInSeconds = minedInSeconds;
    return this;
  }

   /**
   * Specifies the amount of time required for the block to be mined in seconds.
   * @return minedInSeconds
  **/
  @ApiModelProperty(example = "12", required = true, value = "Specifies the amount of time required for the block to be mined in seconds.")

  public Integer getMinedInSeconds() {
    return minedInSeconds;
  }


  public void setMinedInSeconds(Integer minedInSeconds) {
    this.minedInSeconds = minedInSeconds;
  }


  public GetBlockDetailsByBlockHashRIBS sha3Uncles(String sha3Uncles) {
    
    this.sha3Uncles = sha3Uncles;
    return this;
  }

   /**
   * Defines the combined hash of all uncles for a given parent.
   * @return sha3Uncles
  **/
  @ApiModelProperty(example = "0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347", required = true, value = "Defines the combined hash of all uncles for a given parent.")

  public String getSha3Uncles() {
    return sha3Uncles;
  }


  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }


  public GetBlockDetailsByBlockHashRIBS totalDifficulty(String totalDifficulty) {
    
    this.totalDifficulty = totalDifficulty;
    return this;
  }

   /**
   * Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block.
   * @return totalDifficulty
  **/
  @ApiModelProperty(example = "1088214928417257646845", required = true, value = "Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block.")

  public String getTotalDifficulty() {
    return totalDifficulty;
  }


  public void setTotalDifficulty(String totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }


  public GetBlockDetailsByBlockHashRIBS uncles(List<String> uncles) {
    
    this.uncles = uncles;
    return this;
  }

  public GetBlockDetailsByBlockHashRIBS addUnclesItem(String unclesItem) {
    this.uncles.add(unclesItem);
    return this;
  }

   /**
   * Get uncles
   * @return uncles
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getUncles() {
    return uncles;
  }


  public void setUncles(List<String> uncles) {
    this.uncles = uncles;
  }


  public GetBlockDetailsByBlockHashRIBS merkleroot(String merkleroot) {
    
    this.merkleroot = merkleroot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleroot
  **/
  @ApiModelProperty(example = "14add5ff6fb9dfc58767228b658a48f85d988a1cc49151238f9cef85b53e54d2", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleroot() {
    return merkleroot;
  }


  public void setMerkleroot(String merkleroot) {
    this.merkleroot = merkleroot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashRIBS getBlockDetailsByBlockHashRIBS = (GetBlockDetailsByBlockHashRIBS) o;
    return Objects.equals(this.difficulty, getBlockDetailsByBlockHashRIBS.difficulty) &&
        Objects.equals(this.nonce, getBlockDetailsByBlockHashRIBS.nonce) &&
        Objects.equals(this.size, getBlockDetailsByBlockHashRIBS.size) &&
        Objects.equals(this.bits, getBlockDetailsByBlockHashRIBS.bits) &&
        Objects.equals(this.chainwork, getBlockDetailsByBlockHashRIBS.chainwork) &&
        Objects.equals(this.merkleRoot, getBlockDetailsByBlockHashRIBS.merkleRoot) &&
        Objects.equals(this.strippedSize, getBlockDetailsByBlockHashRIBS.strippedSize) &&
        Objects.equals(this.version, getBlockDetailsByBlockHashRIBS.version) &&
        Objects.equals(this.versionHex, getBlockDetailsByBlockHashRIBS.versionHex) &&
        Objects.equals(this.weight, getBlockDetailsByBlockHashRIBS.weight) &&
        Objects.equals(this.extraData, getBlockDetailsByBlockHashRIBS.extraData) &&
        Objects.equals(this.gasLimit, getBlockDetailsByBlockHashRIBS.gasLimit) &&
        Objects.equals(this.gasUsed, getBlockDetailsByBlockHashRIBS.gasUsed) &&
        Objects.equals(this.minedInSeconds, getBlockDetailsByBlockHashRIBS.minedInSeconds) &&
        Objects.equals(this.sha3Uncles, getBlockDetailsByBlockHashRIBS.sha3Uncles) &&
        Objects.equals(this.totalDifficulty, getBlockDetailsByBlockHashRIBS.totalDifficulty) &&
        Objects.equals(this.uncles, getBlockDetailsByBlockHashRIBS.uncles) &&
        Objects.equals(this.merkleroot, getBlockDetailsByBlockHashRIBS.merkleroot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, nonce, size, bits, chainwork, merkleRoot, strippedSize, version, versionHex, weight, extraData, gasLimit, gasUsed, minedInSeconds, sha3Uncles, totalDifficulty, uncles, merkleroot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashRIBS {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    strippedSize: ").append(toIndentedString(strippedSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionHex: ").append(toIndentedString(versionHex)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInSeconds: ").append(toIndentedString(minedInSeconds)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    uncles: ").append(toIndentedString(uncles)).append("\n");
    sb.append("    merkleroot: ").append(toIndentedString(merkleroot)).append("\n");
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

