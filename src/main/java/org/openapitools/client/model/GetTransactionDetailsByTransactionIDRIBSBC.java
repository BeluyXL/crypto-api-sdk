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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBCVinInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBCVoutInner;

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
 * Bitcoin Cash
 */
@ApiModel(description = "Bitcoin Cash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetTransactionDetailsByTransactionIDRIBSBC {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Long locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<GetTransactionDetailsByTransactionIDRIBSBCVinInner> vin = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTransactionDetailsByTransactionIDRIBSBCVoutInner> vout = new ArrayList<>();

  public GetTransactionDetailsByTransactionIDRIBSBC() { 
  }

  public GetTransactionDetailsByTransactionIDRIBSBC locktime(Long locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain.")

  public Long getLocktime() {
    return locktime;
  }


  public void setLocktime(Long locktime) {
    this.locktime = locktime;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "248", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC version(Integer version) {
    
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


  public GetTransactionDetailsByTransactionIDRIBSBC vin(List<GetTransactionDetailsByTransactionIDRIBSBCVinInner> vin) {
    
    this.vin = vin;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSBC addVinItem(GetTransactionDetailsByTransactionIDRIBSBCVinInner vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<GetTransactionDetailsByTransactionIDRIBSBCVinInner> getVin() {
    return vin;
  }


  public void setVin(List<GetTransactionDetailsByTransactionIDRIBSBCVinInner> vin) {
    this.vin = vin;
  }


  public GetTransactionDetailsByTransactionIDRIBSBC vout(List<GetTransactionDetailsByTransactionIDRIBSBCVoutInner> vout) {
    
    this.vout = vout;
    return this;
  }

  public GetTransactionDetailsByTransactionIDRIBSBC addVoutItem(GetTransactionDetailsByTransactionIDRIBSBCVoutInner voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<GetTransactionDetailsByTransactionIDRIBSBCVoutInner> getVout() {
    return vout;
  }


  public void setVout(List<GetTransactionDetailsByTransactionIDRIBSBCVoutInner> vout) {
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
    GetTransactionDetailsByTransactionIDRIBSBC getTransactionDetailsByTransactionIDRIBSBC = (GetTransactionDetailsByTransactionIDRIBSBC) o;
    return Objects.equals(this.locktime, getTransactionDetailsByTransactionIDRIBSBC.locktime) &&
        Objects.equals(this.size, getTransactionDetailsByTransactionIDRIBSBC.size) &&
        Objects.equals(this.version, getTransactionDetailsByTransactionIDRIBSBC.version) &&
        Objects.equals(this.vin, getTransactionDetailsByTransactionIDRIBSBC.vin) &&
        Objects.equals(this.vout, getTransactionDetailsByTransactionIDRIBSBC.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionDetailsByTransactionIDRIBSBC {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("locktime");
    openapiFields.add("size");
    openapiFields.add("version");
    openapiFields.add("vin");
    openapiFields.add("vout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("locktime");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("vin");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDRIBSBC
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionDetailsByTransactionIDRIBSBC.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionDetailsByTransactionIDRIBSBC is not found in the empty JSON string", GetTransactionDetailsByTransactionIDRIBSBC.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionDetailsByTransactionIDRIBSBC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionDetailsByTransactionIDRIBSBC` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionDetailsByTransactionIDRIBSBC.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayvin = jsonObj.getAsJsonArray("vin");
      if (jsonArrayvin != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vin").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vin` to be an array in the JSON string but got `%s`", jsonObj.get("vin").toString()));
        }

        // validate the optional field `vin` (array)
        for (int i = 0; i < jsonArrayvin.size(); i++) {
          GetTransactionDetailsByTransactionIDRIBSBCVinInner.validateJsonObject(jsonArrayvin.get(i).getAsJsonObject());
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
          GetTransactionDetailsByTransactionIDRIBSBCVoutInner.validateJsonObject(jsonArrayvout.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionDetailsByTransactionIDRIBSBC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionDetailsByTransactionIDRIBSBC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSBC.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBC>() {
           @Override
           public void write(JsonWriter out, GetTransactionDetailsByTransactionIDRIBSBC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionDetailsByTransactionIDRIBSBC read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDRIBSBC given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDRIBSBC
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDRIBSBC
  */
  public static GetTransactionDetailsByTransactionIDRIBSBC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDRIBSBC.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDRIBSBC to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

