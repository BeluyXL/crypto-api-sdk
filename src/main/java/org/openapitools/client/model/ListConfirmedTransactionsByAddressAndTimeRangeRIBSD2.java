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
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSD2VinInner;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSD2VoutInner;

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
public class ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 {
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
  private List<ListConfirmedTransactionsByAddressRIBSD2VinInner> vin = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListConfirmedTransactionsByAddressRIBSD2VoutInner> vout = new ArrayList<>();

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2() { 
  }

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 locktime(Long locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Long getLocktime() {
    return locktime;
  }


  public void setLocktime(Long locktime) {
    this.locktime = locktime;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "196", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the transaction&#39;s version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Represents the transaction's version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 vin(List<ListConfirmedTransactionsByAddressRIBSD2VinInner> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 addVinItem(ListConfirmedTransactionsByAddressRIBSD2VinInner vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<ListConfirmedTransactionsByAddressRIBSD2VinInner> getVin() {
    return vin;
  }


  public void setVin(List<ListConfirmedTransactionsByAddressRIBSD2VinInner> vin) {
    this.vin = vin;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 vout(List<ListConfirmedTransactionsByAddressRIBSD2VoutInner> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 addVoutItem(ListConfirmedTransactionsByAddressRIBSD2VoutInner voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<ListConfirmedTransactionsByAddressRIBSD2VoutInner> getVout() {
    return vout;
  }


  public void setVout(List<ListConfirmedTransactionsByAddressRIBSD2VoutInner> vout) {
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
    ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 listConfirmedTransactionsByAddressAndTimeRangeRIBSD2 = (ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2) o;
    return Objects.equals(this.locktime, listConfirmedTransactionsByAddressAndTimeRangeRIBSD2.locktime) &&
        Objects.equals(this.size, listConfirmedTransactionsByAddressAndTimeRangeRIBSD2.size) &&
        Objects.equals(this.version, listConfirmedTransactionsByAddressAndTimeRangeRIBSD2.version) &&
        Objects.equals(this.vin, listConfirmedTransactionsByAddressAndTimeRangeRIBSD2.vin) &&
        Objects.equals(this.vout, listConfirmedTransactionsByAddressAndTimeRangeRIBSD2.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 is not found in the empty JSON string", ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.openapiRequiredFields) {
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
          ListConfirmedTransactionsByAddressRIBSD2VinInner.validateJsonObject(jsonArrayvin.get(i).getAsJsonObject());
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
          ListConfirmedTransactionsByAddressRIBSD2VoutInner.validateJsonObject(jsonArrayvout.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.class));

       return (TypeAdapter<T>) new TypeAdapter<ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2>() {
           @Override
           public void write(JsonWriter out, ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2
  * @throws IOException if the JSON string is invalid with respect to ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2
  */
  public static ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2.class);
  }

 /**
  * Convert an instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSD2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

