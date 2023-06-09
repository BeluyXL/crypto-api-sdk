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
import org.openapitools.client.model.DecodeRawTransactionHexRISLVinInner;
import org.openapitools.client.model.DecodeRawTransactionHexRISLVoutInner;

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
 * Litecoin
 */
@ApiModel(description = "Litecoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class DecodeRawTransactionHexRISL {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_V_SIZE = "vSize";
  @SerializedName(SERIALIZED_NAME_V_SIZE)
  private Integer vSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<DecodeRawTransactionHexRISLVinInner> vin = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<DecodeRawTransactionHexRISLVoutInner> vout = new ArrayList<>();

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public DecodeRawTransactionHexRISL() { 
  }

  public DecodeRawTransactionHexRISL locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public DecodeRawTransactionHexRISL transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as transactionId for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols hash is different from transactionId for SegWit transactions.
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1ec73b0f61359927d02376b35993b756b1097cb9a857bec23da4c98c4977d2b2", required = true, value = "Represents the same as transactionId for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols hash is different from transactionId for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public DecodeRawTransactionHexRISL vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction.
   * @return vSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "141", required = true, value = "Represents the virtual size of this transaction.")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public DecodeRawTransactionHexRISL version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents transaction version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Represents transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public DecodeRawTransactionHexRISL vin(List<DecodeRawTransactionHexRISLVinInner> vin) {
    
    this.vin = vin;
    return this;
  }

  public DecodeRawTransactionHexRISL addVinItem(DecodeRawTransactionHexRISLVinInner vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<DecodeRawTransactionHexRISLVinInner> getVin() {
    return vin;
  }


  public void setVin(List<DecodeRawTransactionHexRISLVinInner> vin) {
    this.vin = vin;
  }


  public DecodeRawTransactionHexRISL vout(List<DecodeRawTransactionHexRISLVoutInner> vout) {
    
    this.vout = vout;
    return this;
  }

  public DecodeRawTransactionHexRISL addVoutItem(DecodeRawTransactionHexRISLVoutInner voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<DecodeRawTransactionHexRISLVoutInner> getVout() {
    return vout;
  }


  public void setVout(List<DecodeRawTransactionHexRISLVoutInner> vout) {
    this.vout = vout;
  }


  public DecodeRawTransactionHexRISL weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Represents the size of a block, measured in weight units and including the segwit discount.
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "245", value = "Represents the size of a block, measured in weight units and including the segwit discount.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeRawTransactionHexRISL decodeRawTransactionHexRISL = (DecodeRawTransactionHexRISL) o;
    return Objects.equals(this.locktime, decodeRawTransactionHexRISL.locktime) &&
        Objects.equals(this.transactionHash, decodeRawTransactionHexRISL.transactionHash) &&
        Objects.equals(this.vSize, decodeRawTransactionHexRISL.vSize) &&
        Objects.equals(this.version, decodeRawTransactionHexRISL.version) &&
        Objects.equals(this.vin, decodeRawTransactionHexRISL.vin) &&
        Objects.equals(this.vout, decodeRawTransactionHexRISL.vout) &&
        Objects.equals(this.weight, decodeRawTransactionHexRISL.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, transactionHash, vSize, version, vin, vout, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeRawTransactionHexRISL {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("locktime");
    openapiFields.add("transactionHash");
    openapiFields.add("vSize");
    openapiFields.add("version");
    openapiFields.add("vin");
    openapiFields.add("vout");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("locktime");
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("vSize");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("vin");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeRawTransactionHexRISL
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeRawTransactionHexRISL.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeRawTransactionHexRISL is not found in the empty JSON string", DecodeRawTransactionHexRISL.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeRawTransactionHexRISL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeRawTransactionHexRISL` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeRawTransactionHexRISL.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("transactionHash") != null && !jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      JsonArray jsonArrayvin = jsonObj.getAsJsonArray("vin");
      if (jsonArrayvin != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vin").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vin` to be an array in the JSON string but got `%s`", jsonObj.get("vin").toString()));
        }

        // validate the optional field `vin` (array)
        for (int i = 0; i < jsonArrayvin.size(); i++) {
          DecodeRawTransactionHexRISLVinInner.validateJsonObject(jsonArrayvin.get(i).getAsJsonObject());
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
          DecodeRawTransactionHexRISLVoutInner.validateJsonObject(jsonArrayvout.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeRawTransactionHexRISL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeRawTransactionHexRISL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeRawTransactionHexRISL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeRawTransactionHexRISL.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeRawTransactionHexRISL>() {
           @Override
           public void write(JsonWriter out, DecodeRawTransactionHexRISL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeRawTransactionHexRISL read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeRawTransactionHexRISL given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeRawTransactionHexRISL
  * @throws IOException if the JSON string is invalid with respect to DecodeRawTransactionHexRISL
  */
  public static DecodeRawTransactionHexRISL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeRawTransactionHexRISL.class);
  }

 /**
  * Convert an instance of DecodeRawTransactionHexRISL to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

