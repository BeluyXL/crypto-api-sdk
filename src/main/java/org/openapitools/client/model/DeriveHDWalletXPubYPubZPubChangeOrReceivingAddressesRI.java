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
import org.openapitools.client.model.DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner;

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
 * DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner> addresses = new ArrayList<>();

  public DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI() { 
  }

  public DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI addresses(List<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI addAddressesItem(DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Represents the address details.
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the address details.")

  public List<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner> addresses) {
    this.addresses = addresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI deriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI = (DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI) o;
    return Objects.equals(this.addresses, deriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI is not found in the empty JSON string", DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      if (jsonArrayaddresses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("addresses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
        }

        // validate the optional field `addresses` (array)
        for (int i = 0; i < jsonArrayaddresses.size(); i++) {
          DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRIAddressesInner.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.class));

       return (TypeAdapter<T>) new TypeAdapter<DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI>() {
           @Override
           public void write(JsonWriter out, DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI
  * @throws IOException if the JSON string is invalid with respect to DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI
  */
  public static DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI.class);
  }

 /**
  * Convert an instance of DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

