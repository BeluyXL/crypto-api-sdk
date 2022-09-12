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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVinInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVoutInner;

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
 * Zcash
 */
@ApiModel(description = "Zcash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSZ {
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

  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Long locktime;

  public static final String SERIALIZED_NAME_OVERWINTERED = "overwintered";
  @SerializedName(SERIALIZED_NAME_OVERWINTERED)
  private Boolean overwintered;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_V_JOIN_SPLIT = "vJoinSplit";
  @SerializedName(SERIALIZED_NAME_V_JOIN_SPLIT)
  private List<GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner> vJoinSplit = new ArrayList<>();

  public static final String SERIALIZED_NAME_V_SHIELDED_OUTPUT = "vShieldedOutput";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_OUTPUT)
  private List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner> vShieldedOutput = new ArrayList<>();

  public static final String SERIALIZED_NAME_V_SHIELDED_SPEND = "vShieldedSpend";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_SPEND)
  private List<GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner> vShieldedSpend = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE_BALANCE = "valueBalance";
  @SerializedName(SERIALIZED_NAME_VALUE_BALANCE)
  private String valueBalance;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_GROUP_ID = "versionGroupId";
  @SerializedName(SERIALIZED_NAME_VERSION_GROUP_ID)
  private String versionGroupId;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<GetTransactionDetailsByTransactionIDRIBSZVinInner> vin = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTransactionDetailsByTransactionIDRIBSZVoutInner> vout = new ArrayList<>();

  public GetTransactionDetailsByTransactionIDRIBSZ() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSZ bindingSig(String bindingSig) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ expiryHeight(Integer expiryHeight) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ joinSplitPubKey(String joinSplitPubKey) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ joinSplitSig(String joinSplitSig) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ locktime(Long locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Long getLocktime() {
    return locktime;
  }


  public void setLocktime(Long locktime) {
    this.locktime = locktime;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ overwintered(Boolean overwintered) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "234", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ vJoinSplit(List<GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner> vJoinSplit) {
    
    this.vJoinSplit = vJoinSplit;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZ addVJoinSplitItem(GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner vJoinSplitItem) {
    this.vJoinSplit.add(vJoinSplitItem);
    return this;
  }

   /**
   * Represents a sequence of JoinSplit descriptions using BCTV14 proofs.
   * @return vJoinSplit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a sequence of JoinSplit descriptions using BCTV14 proofs.")

  public List<GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner> getvJoinSplit() {
    return vJoinSplit;
  }


  public void setvJoinSplit(List<GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner> vJoinSplit) {
    this.vJoinSplit = vJoinSplit;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ vShieldedOutput(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner> vShieldedOutput) {
    
    this.vShieldedOutput = vShieldedOutput;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZ addVShieldedOutputItem(GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner vShieldedOutputItem) {
    this.vShieldedOutput.add(vShieldedOutputItem);
    return this;
  }

   /**
   * Object Array representation of transaction output descriptions
   * @return vShieldedOutput
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction output descriptions")

  public List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner> getvShieldedOutput() {
    return vShieldedOutput;
  }


  public void setvShieldedOutput(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner> vShieldedOutput) {
    this.vShieldedOutput = vShieldedOutput;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ vShieldedSpend(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner> vShieldedSpend) {
    
    this.vShieldedSpend = vShieldedSpend;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZ addVShieldedSpendItem(GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner vShieldedSpendItem) {
    this.vShieldedSpend.add(vShieldedSpendItem);
    return this;
  }

   /**
   * Object Array representation of transaction spend descriptions
   * @return vShieldedSpend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction spend descriptions")

  public List<GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner> getvShieldedSpend() {
    return vShieldedSpend;
  }


  public void setvShieldedSpend(List<GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner> vShieldedSpend) {
    this.vShieldedSpend = vShieldedSpend;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ valueBalance(String valueBalance) {
    
    this.valueBalance = valueBalance;
    return this;
  }

   /**
   * String representation of the transaction value balance
   * @return valueBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "String representation of the transaction value balance")

  public String getValueBalance() {
    return valueBalance;
  }


  public void setValueBalance(String valueBalance) {
    this.valueBalance = valueBalance;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the version of the transaction.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Defines the version of the transaction.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ versionGroupId(String versionGroupId) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSZ vin(List<GetTransactionDetailsByTransactionIDRIBSZVinInner> vin) {
    
    this.vin = vin;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZ addVinItem(GetTransactionDetailsByTransactionIDRIBSZVinInner vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Object Array representation of transaction inputs
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction inputs")

  public List<GetTransactionDetailsByTransactionIDRIBSZVinInner> getVin() {
    return vin;
  }


  public void setVin(List<GetTransactionDetailsByTransactionIDRIBSZVinInner> vin) {
    this.vin = vin;
  }


  public GetTransactionDetailsByTransactionIDRIBSZ vout(List<GetTransactionDetailsByTransactionIDRIBSZVoutInner> vout) {
    
    this.vout = vout;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSZ addVoutItem(GetTransactionDetailsByTransactionIDRIBSZVoutInner voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Object Array representation of transaction outputs
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction outputs")

  public List<GetTransactionDetailsByTransactionIDRIBSZVoutInner> getVout() {
    return vout;
  }


  public void setVout(List<GetTransactionDetailsByTransactionIDRIBSZVoutInner> vout) {
    this.vout = vout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDRIBSZ getTransactionDetailsByTransactionIDRIBSZ = (GetTransactionDetailsByTransactionIDRIBSZ) o;
    return Objects.equals(this.bindingSig, getTransactionDetailsByTransactionIDRIBSZ.bindingSig) &&
        Objects.equals(this.expiryHeight, getTransactionDetailsByTransactionIDRIBSZ.expiryHeight) &&
        Objects.equals(this.joinSplitPubKey, getTransactionDetailsByTransactionIDRIBSZ.joinSplitPubKey) &&
        Objects.equals(this.joinSplitSig, getTransactionDetailsByTransactionIDRIBSZ.joinSplitSig) &&
        Objects.equals(this.locktime, getTransactionDetailsByTransactionIDRIBSZ.locktime) &&
        Objects.equals(this.overwintered, getTransactionDetailsByTransactionIDRIBSZ.overwintered) &&
        Objects.equals(this.size, getTransactionDetailsByTransactionIDRIBSZ.size) &&
        Objects.equals(this.vJoinSplit, getTransactionDetailsByTransactionIDRIBSZ.vJoinSplit) &&
        Objects.equals(this.vShieldedOutput, getTransactionDetailsByTransactionIDRIBSZ.vShieldedOutput) &&
        Objects.equals(this.vShieldedSpend, getTransactionDetailsByTransactionIDRIBSZ.vShieldedSpend) &&
        Objects.equals(this.valueBalance, getTransactionDetailsByTransactionIDRIBSZ.valueBalance) &&
        Objects.equals(this.version, getTransactionDetailsByTransactionIDRIBSZ.version) &&
        Objects.equals(this.versionGroupId, getTransactionDetailsByTransactionIDRIBSZ.versionGroupId) &&
        Objects.equals(this.vin, getTransactionDetailsByTransactionIDRIBSZ.vin) &&
        Objects.equals(this.vout, getTransactionDetailsByTransactionIDRIBSZ.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingSig, expiryHeight, joinSplitPubKey, joinSplitSig, locktime, overwintered, size, vJoinSplit, vShieldedOutput, vShieldedSpend, valueBalance, version, versionGroupId, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSZ {\n");
    sb.append("    bindingSig: ").append(toIndentedString(bindingSig)).append("\n");
    sb.append("    expiryHeight: ").append(toIndentedString(expiryHeight)).append("\n");
    sb.append("    joinSplitPubKey: ").append(toIndentedString(joinSplitPubKey)).append("\n");
    sb.append("    joinSplitSig: ").append(toIndentedString(joinSplitSig)).append("\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    overwintered: ").append(toIndentedString(overwintered)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vJoinSplit: ").append(toIndentedString(vJoinSplit)).append("\n");
    sb.append("    vShieldedOutput: ").append(toIndentedString(vShieldedOutput)).append("\n");
    sb.append("    vShieldedSpend: ").append(toIndentedString(vShieldedSpend)).append("\n");
    sb.append("    valueBalance: ").append(toIndentedString(valueBalance)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroupId: ").append(toIndentedString(versionGroupId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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
    openapiFields.add("bindingSig");
    openapiFields.add("expiryHeight");
    openapiFields.add("joinSplitPubKey");
    openapiFields.add("joinSplitSig");
    openapiFields.add("locktime");
    openapiFields.add("overwintered");
    openapiFields.add("size");
    openapiFields.add("vJoinSplit");
    openapiFields.add("vShieldedOutput");
    openapiFields.add("vShieldedSpend");
    openapiFields.add("valueBalance");
    openapiFields.add("version");
    openapiFields.add("versionGroupId");
    openapiFields.add("vin");
    openapiFields.add("vout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bindingSig");
    openapiRequiredFields.add("expiryHeight");
    openapiRequiredFields.add("joinSplitPubKey");
    openapiRequiredFields.add("joinSplitSig");
    openapiRequiredFields.add("locktime");
    openapiRequiredFields.add("overwintered");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("vJoinSplit");
    openapiRequiredFields.add("vShieldedOutput");
    openapiRequiredFields.add("vShieldedSpend");
    openapiRequiredFields.add("valueBalance");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("versionGroupId");
    openapiRequiredFields.add("vin");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDRIBSZ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionDetailsByTransactionIDRIBSZ.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionDetailsByTransactionIDRIBSZ is not found in the empty JSON string", GetTransactionDetailsByTransactionIDRIBSZ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionDetailsByTransactionIDRIBSZ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionDetailsByTransactionIDRIBSZ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionDetailsByTransactionIDRIBSZ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("bindingSig") != null && !jsonObj.get("bindingSig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bindingSig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bindingSig").toString()));
      }
      if (jsonObj.get("joinSplitPubKey") != null && !jsonObj.get("joinSplitPubKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinSplitPubKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinSplitPubKey").toString()));
      }
      if (jsonObj.get("joinSplitSig") != null && !jsonObj.get("joinSplitSig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `joinSplitSig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("joinSplitSig").toString()));
      }
      JsonArray jsonArrayvJoinSplit = jsonObj.getAsJsonArray("vJoinSplit");
      if (jsonArrayvJoinSplit != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vJoinSplit").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vJoinSplit` to be an array in the JSON string but got `%s`", jsonObj.get("vJoinSplit").toString()));
        }

        // validate the optional field `vJoinSplit` (array)
        for (int i = 0; i < jsonArrayvJoinSplit.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner.validateJsonObject(jsonArrayvJoinSplit.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvShieldedOutput = jsonObj.getAsJsonArray("vShieldedOutput");
      if (jsonArrayvShieldedOutput != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vShieldedOutput").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vShieldedOutput` to be an array in the JSON string but got `%s`", jsonObj.get("vShieldedOutput").toString()));
        }

        // validate the optional field `vShieldedOutput` (array)
        for (int i = 0; i < jsonArrayvShieldedOutput.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner.validateJsonObject(jsonArrayvShieldedOutput.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvShieldedSpend = jsonObj.getAsJsonArray("vShieldedSpend");
      if (jsonArrayvShieldedSpend != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vShieldedSpend").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vShieldedSpend` to be an array in the JSON string but got `%s`", jsonObj.get("vShieldedSpend").toString()));
        }

        // validate the optional field `vShieldedSpend` (array)
        for (int i = 0; i < jsonArrayvShieldedSpend.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner.validateJsonObject(jsonArrayvShieldedSpend.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("valueBalance") != null && !jsonObj.get("valueBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueBalance").toString()));
      }
      if (jsonObj.get("versionGroupId") != null && !jsonObj.get("versionGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionGroupId").toString()));
      }
      JsonArray jsonArrayvin = jsonObj.getAsJsonArray("vin");
      if (jsonArrayvin != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vin").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vin` to be an array in the JSON string but got `%s`", jsonObj.get("vin").toString()));
        }

        // validate the optional field `vin` (array)
        for (int i = 0; i < jsonArrayvin.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSZVinInner.validateJsonObject(jsonArrayvin.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvout = jsonObj.getAsJsonArray("vout");
      if (jsonArrayvout != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vout").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vout` to be an array in the JSON string but got `%s`", jsonObj.get("vout").toString()));
        }

        // validate the optional field `vout` (array)
        for (int i = 0; i < jsonArrayvout.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSZVoutInner.validateJsonObject(jsonArrayvout.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionDetailsByTransactionIDRIBSZ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionDetailsByTransactionIDRIBSZ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSZ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSZ.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDRIBSZ>() {
           @Override
           public void write(JsonWriter out, GetTransactionDetailsByTransactionIDRIBSZ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionDetailsByTransactionIDRIBSZ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDRIBSZ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDRIBSZ
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDRIBSZ
  */
  public static GetTransactionDetailsByTransactionIDRIBSZ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDRIBSZ.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDRIBSZ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

