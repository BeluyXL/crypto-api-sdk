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
import org.openapitools.client.model.GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance;
import org.openapitools.client.model.GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner;
import org.openapitools.client.model.GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner;

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
 * GetHDWalletXPubYPubZPubAssetsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetHDWalletXPubYPubZPubAssetsRI {
  public static final String SERIALIZED_NAME_FUNGIBLE_TOKENS = "fungibleTokens";
  @SerializedName(SERIALIZED_NAME_FUNGIBLE_TOKENS)
  private List<GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner> fungibleTokens = null;

  public static final String SERIALIZED_NAME_NON_FUNGIBLE_TOKENS = "nonFungibleTokens";
  @SerializedName(SERIALIZED_NAME_NON_FUNGIBLE_TOKENS)
  private List<GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner> nonFungibleTokens = null;

  public static final String SERIALIZED_NAME_CONFIRMED_BALANCE = "confirmedBalance";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_BALANCE)
  private GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance confirmedBalance;

  public GetHDWalletXPubYPubZPubAssetsRI() { 
  }

  public GetHDWalletXPubYPubZPubAssetsRI fungibleTokens(List<GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner> fungibleTokens) {
    
    this.fungibleTokens = fungibleTokens;
    return this;
  }

  public GetHDWalletXPubYPubZPubAssetsRI addFungibleTokensItem(GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner fungibleTokensItem) {
    if (this.fungibleTokens == null) {
      this.fungibleTokens = new ArrayList<>();
    }
    this.fungibleTokens.add(fungibleTokensItem);
    return this;
  }

   /**
   * Represents fungible tokens&#39;es detailed information
   * @return fungibleTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents fungible tokens'es detailed information")

  public List<GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner> getFungibleTokens() {
    return fungibleTokens;
  }


  public void setFungibleTokens(List<GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner> fungibleTokens) {
    this.fungibleTokens = fungibleTokens;
  }


  public GetHDWalletXPubYPubZPubAssetsRI nonFungibleTokens(List<GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner> nonFungibleTokens) {
    
    this.nonFungibleTokens = nonFungibleTokens;
    return this;
  }

  public GetHDWalletXPubYPubZPubAssetsRI addNonFungibleTokensItem(GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner nonFungibleTokensItem) {
    if (this.nonFungibleTokens == null) {
      this.nonFungibleTokens = new ArrayList<>();
    }
    this.nonFungibleTokens.add(nonFungibleTokensItem);
    return this;
  }

   /**
   * Represents non-fungible tokens&#39;es detailed information.
   * @return nonFungibleTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents non-fungible tokens'es detailed information.")

  public List<GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner> getNonFungibleTokens() {
    return nonFungibleTokens;
  }


  public void setNonFungibleTokens(List<GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner> nonFungibleTokens) {
    this.nonFungibleTokens = nonFungibleTokens;
  }


  public GetHDWalletXPubYPubZPubAssetsRI confirmedBalance(GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance confirmedBalance) {
    
    this.confirmedBalance = confirmedBalance;
    return this;
  }

   /**
   * Get confirmedBalance
   * @return confirmedBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance getConfirmedBalance() {
    return confirmedBalance;
  }


  public void setConfirmedBalance(GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance confirmedBalance) {
    this.confirmedBalance = confirmedBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHDWalletXPubYPubZPubAssetsRI getHDWalletXPubYPubZPubAssetsRI = (GetHDWalletXPubYPubZPubAssetsRI) o;
    return Objects.equals(this.fungibleTokens, getHDWalletXPubYPubZPubAssetsRI.fungibleTokens) &&
        Objects.equals(this.nonFungibleTokens, getHDWalletXPubYPubZPubAssetsRI.nonFungibleTokens) &&
        Objects.equals(this.confirmedBalance, getHDWalletXPubYPubZPubAssetsRI.confirmedBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fungibleTokens, nonFungibleTokens, confirmedBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHDWalletXPubYPubZPubAssetsRI {\n");
    sb.append("    fungibleTokens: ").append(toIndentedString(fungibleTokens)).append("\n");
    sb.append("    nonFungibleTokens: ").append(toIndentedString(nonFungibleTokens)).append("\n");
    sb.append("    confirmedBalance: ").append(toIndentedString(confirmedBalance)).append("\n");
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
    openapiFields.add("fungibleTokens");
    openapiFields.add("nonFungibleTokens");
    openapiFields.add("confirmedBalance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("confirmedBalance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetHDWalletXPubYPubZPubAssetsRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetHDWalletXPubYPubZPubAssetsRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHDWalletXPubYPubZPubAssetsRI is not found in the empty JSON string", GetHDWalletXPubYPubZPubAssetsRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetHDWalletXPubYPubZPubAssetsRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetHDWalletXPubYPubZPubAssetsRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetHDWalletXPubYPubZPubAssetsRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfungibleTokens = jsonObj.getAsJsonArray("fungibleTokens");
      if (jsonArrayfungibleTokens != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fungibleTokens").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fungibleTokens` to be an array in the JSON string but got `%s`", jsonObj.get("fungibleTokens").toString()));
        }

        // validate the optional field `fungibleTokens` (array)
        for (int i = 0; i < jsonArrayfungibleTokens.size(); i++) {
          GetHDWalletXPubYPubZPubAssetsRIFungibleTokensInner.validateJsonObject(jsonArrayfungibleTokens.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraynonFungibleTokens = jsonObj.getAsJsonArray("nonFungibleTokens");
      if (jsonArraynonFungibleTokens != null) {
        // ensure the json data is an array
        if (!jsonObj.get("nonFungibleTokens").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `nonFungibleTokens` to be an array in the JSON string but got `%s`", jsonObj.get("nonFungibleTokens").toString()));
        }

        // validate the optional field `nonFungibleTokens` (array)
        for (int i = 0; i < jsonArraynonFungibleTokens.size(); i++) {
          GetHDWalletXPubYPubZPubAssetsRINonFungibleTokensInner.validateJsonObject(jsonArraynonFungibleTokens.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `confirmedBalance`
      if (jsonObj.getAsJsonObject("confirmedBalance") != null) {
        GetHDWalletXPubYPubZPubAssetsRIConfirmedBalance.validateJsonObject(jsonObj.getAsJsonObject("confirmedBalance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHDWalletXPubYPubZPubAssetsRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHDWalletXPubYPubZPubAssetsRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHDWalletXPubYPubZPubAssetsRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHDWalletXPubYPubZPubAssetsRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHDWalletXPubYPubZPubAssetsRI>() {
           @Override
           public void write(JsonWriter out, GetHDWalletXPubYPubZPubAssetsRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetHDWalletXPubYPubZPubAssetsRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetHDWalletXPubYPubZPubAssetsRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetHDWalletXPubYPubZPubAssetsRI
  * @throws IOException if the JSON string is invalid with respect to GetHDWalletXPubYPubZPubAssetsRI
  */
  public static GetHDWalletXPubYPubZPubAssetsRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHDWalletXPubYPubZPubAssetsRI.class);
  }

 /**
  * Convert an instance of GetHDWalletXPubYPubZPubAssetsRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

