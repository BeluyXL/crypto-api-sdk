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
 * Dash
 */
@ApiModel(description = "Dash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashFromCallbackRIBSD {
  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Long nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_HEX = "versionHex";
  @SerializedName(SERIALIZED_NAME_VERSION_HEX)
  private String versionHex;

  public GetBlockDetailsByBlockHashFromCallbackRIBSD() { 
  }

  public GetBlockDetailsByBlockHashFromCallbackRIBSD bits(String bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * Represents a specific sub-unit of Dash. Bits have two-decimal precision.
   * @return bits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "421808151", required = true, value = "Represents a specific sub-unit of Dash. Bits have two-decimal precision.")

  public String getBits() {
    return bits;
  }


  public void setBits(String bits) {
    this.bits = bits;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.
   * @return chainwork
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0000000000000000000000000000000000000000000065cbab6e72cb49a0c2f7", required = true, value = "Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "118376853.4818659", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleRoot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1cee8c0df02427cbcfd2d2a88678848b4c08eb89d580df34a52464a6fed4df7f", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD nonce(Long nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the proof of work
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3850564744", required = true, value = "Represents a random value that can be adjusted to satisfy the proof of work")

  public Long getNonce() {
    return nonce;
  }


  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "26171", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the version of the specific block on the blockchain.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "536870912", required = true, value = "Represents the version of the specific block on the blockchain.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSD versionHex(String versionHex) {
    
    this.versionHex = versionHex;
    return this;
  }

   /**
   * Is the hexadecimal string representation of the block&#39;s version.
   * @return versionHex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20000000", required = true, value = "Is the hexadecimal string representation of the block's version.")

  public String getVersionHex() {
    return versionHex;
  }


  public void setVersionHex(String versionHex) {
    this.versionHex = versionHex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashFromCallbackRIBSD getBlockDetailsByBlockHashFromCallbackRIBSD = (GetBlockDetailsByBlockHashFromCallbackRIBSD) o;
    return Objects.equals(this.bits, getBlockDetailsByBlockHashFromCallbackRIBSD.bits) &&
        Objects.equals(this.chainwork, getBlockDetailsByBlockHashFromCallbackRIBSD.chainwork) &&
        Objects.equals(this.difficulty, getBlockDetailsByBlockHashFromCallbackRIBSD.difficulty) &&
        Objects.equals(this.merkleRoot, getBlockDetailsByBlockHashFromCallbackRIBSD.merkleRoot) &&
        Objects.equals(this.nonce, getBlockDetailsByBlockHashFromCallbackRIBSD.nonce) &&
        Objects.equals(this.size, getBlockDetailsByBlockHashFromCallbackRIBSD.size) &&
        Objects.equals(this.version, getBlockDetailsByBlockHashFromCallbackRIBSD.version) &&
        Objects.equals(this.versionHex, getBlockDetailsByBlockHashFromCallbackRIBSD.versionHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bits, chainwork, difficulty, merkleRoot, nonce, size, version, versionHex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashFromCallbackRIBSD {\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionHex: ").append(toIndentedString(versionHex)).append("\n");
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
    openapiFields.add("bits");
    openapiFields.add("chainwork");
    openapiFields.add("difficulty");
    openapiFields.add("merkleRoot");
    openapiFields.add("nonce");
    openapiFields.add("size");
    openapiFields.add("version");
    openapiFields.add("versionHex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bits");
    openapiRequiredFields.add("chainwork");
    openapiRequiredFields.add("difficulty");
    openapiRequiredFields.add("merkleRoot");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("versionHex");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBlockDetailsByBlockHashFromCallbackRIBSD
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetBlockDetailsByBlockHashFromCallbackRIBSD.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBlockDetailsByBlockHashFromCallbackRIBSD is not found in the empty JSON string", GetBlockDetailsByBlockHashFromCallbackRIBSD.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetBlockDetailsByBlockHashFromCallbackRIBSD.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBlockDetailsByBlockHashFromCallbackRIBSD` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetBlockDetailsByBlockHashFromCallbackRIBSD.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("bits") != null && !jsonObj.get("bits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bits").toString()));
      }
      if (jsonObj.get("chainwork") != null && !jsonObj.get("chainwork").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chainwork` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chainwork").toString()));
      }
      if (jsonObj.get("difficulty") != null && !jsonObj.get("difficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `difficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("difficulty").toString()));
      }
      if (jsonObj.get("merkleRoot") != null && !jsonObj.get("merkleRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merkleRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merkleRoot").toString()));
      }
      if (jsonObj.get("versionHex") != null && !jsonObj.get("versionHex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionHex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionHex").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBlockDetailsByBlockHashFromCallbackRIBSD.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBlockDetailsByBlockHashFromCallbackRIBSD' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBlockDetailsByBlockHashFromCallbackRIBSD> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHashFromCallbackRIBSD.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBlockDetailsByBlockHashFromCallbackRIBSD>() {
           @Override
           public void write(JsonWriter out, GetBlockDetailsByBlockHashFromCallbackRIBSD value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBlockDetailsByBlockHashFromCallbackRIBSD read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBlockDetailsByBlockHashFromCallbackRIBSD given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBlockDetailsByBlockHashFromCallbackRIBSD
  * @throws IOException if the JSON string is invalid with respect to GetBlockDetailsByBlockHashFromCallbackRIBSD
  */
  public static GetBlockDetailsByBlockHashFromCallbackRIBSD fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBlockDetailsByBlockHashFromCallbackRIBSD.class);
  }

 /**
  * Convert an instance of GetBlockDetailsByBlockHashFromCallbackRIBSD to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

