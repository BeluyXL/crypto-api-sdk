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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput;
import org.openapitools.client.model.ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit;
import org.openapitools.client.model.ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend;

/**
 * ListUnspentTransactionOutputsByAddressRIBlockchainSpecific
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListUnspentTransactionOutputsByAddressRIBlockchainSpecific {
  public static final String SERIALIZED_NAME_V_SIZE = "vSize";
  @SerializedName(SERIALIZED_NAME_V_SIZE)
  private Integer vSize;

  public static final String SERIALIZED_NAME_BINDING_SIG = "bindingSig";
  @SerializedName(SERIALIZED_NAME_BINDING_SIG)
  private String bindingSig;

  public static final String SERIALIZED_NAME_EXPIRY_HEIGHT = "expiryHeight";
  @SerializedName(SERIALIZED_NAME_EXPIRY_HEIGHT)
  private Integer expiryHeight;

  public static final String SERIALIZED_NAME_JOIN_SPLIT_PUB_KEY = "joinSplitPubKey";
  @SerializedName(SERIALIZED_NAME_JOIN_SPLIT_PUB_KEY)
  private String joinSplitPubKey;

  public static final String SERIALIZED_NAME_JOIN_SPLIT_SIG = "joinSplitSig";
  @SerializedName(SERIALIZED_NAME_JOIN_SPLIT_SIG)
  private String joinSplitSig;

  public static final String SERIALIZED_NAME_OVERWINTERED = "overwintered";
  @SerializedName(SERIALIZED_NAME_OVERWINTERED)
  private Boolean overwintered;

  public static final String SERIALIZED_NAME_V_JOIN_SPLIT = "vJoinSplit";
  @SerializedName(SERIALIZED_NAME_V_JOIN_SPLIT)
  private List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit> vJoinSplit = null;

  public static final String SERIALIZED_NAME_V_SHIELDED_OUTPUT = "vShieldedOutput";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_OUTPUT)
  private List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput> vShieldedOutput = null;

  public static final String SERIALIZED_NAME_V_SHIELDED_SPEND = "vShieldedSpend";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_SPEND)
  private List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend> vShieldedSpend = new ArrayList<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend>();

  public static final String SERIALIZED_NAME_VALUE_BALANCE = "valueBalance";
  @SerializedName(SERIALIZED_NAME_VALUE_BALANCE)
  private String valueBalance;

  public static final String SERIALIZED_NAME_VERSION_GROUP_ID = "versionGroupId";
  @SerializedName(SERIALIZED_NAME_VERSION_GROUP_ID)
  private String versionGroupId;

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific() { 
  }

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction
   * @return vSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "125", required = true, value = "Represents the virtual size of this transaction")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific bindingSig(String bindingSig) {
    
    this.bindingSig = bindingSig;
    return this;
  }

   /**
   * It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions.
   * @return bindingSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "603624b3e78e0de0415dea320797a107076a9f7aabd39f44bc4957803330e9891cb33744ac2ec749c2d2d341f29467c49c0ae35bf34765e2fb7c4cda68584804", required = true, value = "It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions.")

  public String getBindingSig() {
    return bindingSig;
  }


  public void setBindingSig(String bindingSig) {
    this.bindingSig = bindingSig;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific expiryHeight(Integer expiryHeight) {
    
    this.expiryHeight = expiryHeight;
    return this;
  }

   /**
   * Represents a block height after which the transaction will expire.
   * @return expiryHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents a block height after which the transaction will expire.")

  public Integer getExpiryHeight() {
    return expiryHeight;
  }


  public void setExpiryHeight(Integer expiryHeight) {
    this.expiryHeight = expiryHeight;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific joinSplitPubKey(String joinSplitPubKey) {
    
    this.joinSplitPubKey = joinSplitPubKey;
    return this;
  }

   /**
   * Represents an encoding of a JoinSplitSig public validating key.
   * @return joinSplitPubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5d2673b4c727241410e42f214a39218e4f13354d77db8ec31243a7be7ed8e2b7", required = true, value = "Represents an encoding of a JoinSplitSig public validating key.")

  public String getJoinSplitPubKey() {
    return joinSplitPubKey;
  }


  public void setJoinSplitPubKey(String joinSplitPubKey) {
    this.joinSplitPubKey = joinSplitPubKey;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific joinSplitSig(String joinSplitSig) {
    
    this.joinSplitSig = joinSplitSig;
    return this;
  }

   /**
   * Is used to sign transactions that contain at least one JoinSplit description.
   * @return joinSplitSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8b06b926d619ead780b0769e5997ded93f9851fd0efd4b667afc5bcc2792b26cd4a565b4efa7733535fdc09fa566ca59042785d7fd8043d37fdf9e144465080a", required = true, value = "Is used to sign transactions that contain at least one JoinSplit description.")

  public String getJoinSplitSig() {
    return joinSplitSig;
  }


  public void setJoinSplitSig(String joinSplitSig) {
    this.joinSplitSig = joinSplitSig;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific overwintered(Boolean overwintered) {
    
    this.overwintered = overwintered;
    return this;
  }

   /**
   * \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain.
   * @return overwintered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "\"Overwinter\" is the network upgrade for the Zcash blockchain.")

  public Boolean getOverwintered() {
    return overwintered;
  }


  public void setOverwintered(Boolean overwintered) {
    this.overwintered = overwintered;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific vJoinSplit(List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit> vJoinSplit) {
    
    this.vJoinSplit = vJoinSplit;
    return this;
  }

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific addVJoinSplitItem(ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit vJoinSplitItem) {
    if (this.vJoinSplit == null) {
      this.vJoinSplit = new ArrayList<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit>();
    }
    this.vJoinSplit.add(vJoinSplitItem);
    return this;
  }

   /**
   * Represents a sequence of JoinSplit descriptions using BCTV14 proofs.
   * @return vJoinSplit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents a sequence of JoinSplit descriptions using BCTV14 proofs.")

  public List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit> getvJoinSplit() {
    return vJoinSplit;
  }


  public void setvJoinSplit(List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVJoinSplit> vJoinSplit) {
    this.vJoinSplit = vJoinSplit;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific vShieldedOutput(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput> vShieldedOutput) {
    
    this.vShieldedOutput = vShieldedOutput;
    return this;
  }

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific addVShieldedOutputItem(GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput vShieldedOutputItem) {
    if (this.vShieldedOutput == null) {
      this.vShieldedOutput = new ArrayList<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput>();
    }
    this.vShieldedOutput.add(vShieldedOutputItem);
    return this;
  }

   /**
   * Object Array representation of transaction output descriptions
   * @return vShieldedOutput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object Array representation of transaction output descriptions")

  public List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput> getvShieldedOutput() {
    return vShieldedOutput;
  }


  public void setvShieldedOutput(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutput> vShieldedOutput) {
    this.vShieldedOutput = vShieldedOutput;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific vShieldedSpend(List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend> vShieldedSpend) {
    
    this.vShieldedSpend = vShieldedSpend;
    return this;
  }

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific addVShieldedSpendItem(ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend vShieldedSpendItem) {
    this.vShieldedSpend.add(vShieldedSpendItem);
    return this;
  }

   /**
   * Object Array representation of transaction spend descriptions
   * @return vShieldedSpend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction spend descriptions")

  public List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend> getvShieldedSpend() {
    return vShieldedSpend;
  }


  public void setvShieldedSpend(List<ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend> vShieldedSpend) {
    this.vShieldedSpend = vShieldedSpend;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific valueBalance(String valueBalance) {
    
    this.valueBalance = valueBalance;
    return this;
  }

   /**
   * Defines the transaction value balance.
   * @return valueBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the transaction value balance.")

  public String getValueBalance() {
    return valueBalance;
  }


  public void setValueBalance(String valueBalance) {
    this.valueBalance = valueBalance;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecific versionGroupId(String versionGroupId) {
    
    this.versionGroupId = versionGroupId;
    return this;
  }

   /**
   * Represents the transaction version group ID.
   * @return versionGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x892f2085", required = true, value = "Represents the transaction version group ID.")

  public String getVersionGroupId() {
    return versionGroupId;
  }


  public void setVersionGroupId(String versionGroupId) {
    this.versionGroupId = versionGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnspentTransactionOutputsByAddressRIBlockchainSpecific listUnspentTransactionOutputsByAddressRIBlockchainSpecific = (ListUnspentTransactionOutputsByAddressRIBlockchainSpecific) o;
    return Objects.equals(this.vSize, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.vSize) &&
        Objects.equals(this.bindingSig, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.bindingSig) &&
        Objects.equals(this.expiryHeight, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.expiryHeight) &&
        Objects.equals(this.joinSplitPubKey, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.joinSplitPubKey) &&
        Objects.equals(this.joinSplitSig, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.joinSplitSig) &&
        Objects.equals(this.overwintered, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.overwintered) &&
        Objects.equals(this.vJoinSplit, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.vJoinSplit) &&
        Objects.equals(this.vShieldedOutput, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.vShieldedOutput) &&
        Objects.equals(this.vShieldedSpend, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.vShieldedSpend) &&
        Objects.equals(this.valueBalance, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.valueBalance) &&
        Objects.equals(this.versionGroupId, listUnspentTransactionOutputsByAddressRIBlockchainSpecific.versionGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vSize, bindingSig, expiryHeight, joinSplitPubKey, joinSplitSig, overwintered, vJoinSplit, vShieldedOutput, vShieldedSpend, valueBalance, versionGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnspentTransactionOutputsByAddressRIBlockchainSpecific {\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
    sb.append("    bindingSig: ").append(toIndentedString(bindingSig)).append("\n");
    sb.append("    expiryHeight: ").append(toIndentedString(expiryHeight)).append("\n");
    sb.append("    joinSplitPubKey: ").append(toIndentedString(joinSplitPubKey)).append("\n");
    sb.append("    joinSplitSig: ").append(toIndentedString(joinSplitSig)).append("\n");
    sb.append("    overwintered: ").append(toIndentedString(overwintered)).append("\n");
    sb.append("    vJoinSplit: ").append(toIndentedString(vJoinSplit)).append("\n");
    sb.append("    vShieldedOutput: ").append(toIndentedString(vShieldedOutput)).append("\n");
    sb.append("    vShieldedSpend: ").append(toIndentedString(vShieldedSpend)).append("\n");
    sb.append("    valueBalance: ").append(toIndentedString(valueBalance)).append("\n");
    sb.append("    versionGroupId: ").append(toIndentedString(versionGroupId)).append("\n");
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
