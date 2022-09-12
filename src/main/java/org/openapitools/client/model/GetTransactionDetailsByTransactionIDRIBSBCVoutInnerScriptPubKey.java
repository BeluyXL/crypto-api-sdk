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
 * Represents the script public key.
 */
@ApiModel(description = "Represents the script public key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_REQ_SIGS = "reqSigs";
  @SerializedName(SERIALIZED_NAME_REQ_SIGS)
  private Integer reqSigs;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * Represents the assembly of the script public key of the address.
   * @return asm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OP_DUP OP_HASH160 386f23363c11a19412b0dbb1b05a5d4d95c7a68a OP_EQUALVERIFY OP_CHECKSIG", required = true, value = "Represents the assembly of the script public key of the address.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the script public key of the address.
   * @return hex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a914507a5bd8cac1d9efdf4c0a4bfacb3e0abb4f8d1587", required = true, value = "Represents the hex of the script public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey reqSigs(Integer reqSigs) {
    
    this.reqSigs = reqSigs;
    return this;
  }

   /**
   * Represents the required signatures.
   * @return reqSigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Represents the required signatures.")

  public Integer getReqSigs() {
    return reqSigs;
  }


  public void setReqSigs(Integer reqSigs) {
    this.reqSigs = reqSigs;
  }


  public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pubkeyhash", required = true, value = "Represents the script type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey = (GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey) o;
    return Objects.equals(this.addresses, getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.addresses) &&
        Objects.equals(this.asm, getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.asm) &&
        Objects.equals(this.hex, getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.hex) &&
        Objects.equals(this.reqSigs, getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.reqSigs) &&
        Objects.equals(this.type, getTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, asm, hex, reqSigs, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    reqSigs: ").append(toIndentedString(reqSigs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("asm");
    openapiFields.add("hex");
    openapiFields.add("reqSigs");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("asm");
    openapiRequiredFields.add("hex");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey is not found in the empty JSON string", GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      if (jsonObj.get("asm") != null && !jsonObj.get("asm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asm").toString()));
      }
      if (jsonObj.get("hex") != null && !jsonObj.get("hex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hex").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey>() {
           @Override
           public void write(JsonWriter out, GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey
  */
  public static GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDRIBSBCVoutInnerScriptPubKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

