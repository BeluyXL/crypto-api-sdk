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
import org.openapitools.client.model.GetZilliqaAddressDetailsRIBalance;

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
 * GetZilliqaAddressDetailsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetZilliqaAddressDetailsRI {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private GetZilliqaAddressDetailsRIBalance balance;

  public static final String SERIALIZED_NAME_INCOMING_TRANSACTIONS_COUNT = "incomingTransactionsCount";
  @SerializedName(SERIALIZED_NAME_INCOMING_TRANSACTIONS_COUNT)
  private Integer incomingTransactionsCount;

  public static final String SERIALIZED_NAME_OUTGOING_TRANSACTIONS_COUNT = "outgoingTransactionsCount";
  @SerializedName(SERIALIZED_NAME_OUTGOING_TRANSACTIONS_COUNT)
  private Integer outgoingTransactionsCount;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public GetZilliqaAddressDetailsRI() { 
  }

  public GetZilliqaAddressDetailsRI balance(GetZilliqaAddressDetailsRIBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetZilliqaAddressDetailsRIBalance getBalance() {
    return balance;
  }


  public void setBalance(GetZilliqaAddressDetailsRIBalance balance) {
    this.balance = balance;
  }


  public GetZilliqaAddressDetailsRI incomingTransactionsCount(Integer incomingTransactionsCount) {
    
    this.incomingTransactionsCount = incomingTransactionsCount;
    return this;
  }

   /**
   * Defines the received transaction count to the address.
   * @return incomingTransactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Defines the received transaction count to the address.")

  public Integer getIncomingTransactionsCount() {
    return incomingTransactionsCount;
  }


  public void setIncomingTransactionsCount(Integer incomingTransactionsCount) {
    this.incomingTransactionsCount = incomingTransactionsCount;
  }


  public GetZilliqaAddressDetailsRI outgoingTransactionsCount(Integer outgoingTransactionsCount) {
    
    this.outgoingTransactionsCount = outgoingTransactionsCount;
    return this;
  }

   /**
   * Defines the sent transaction count from the address.
   * @return outgoingTransactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Defines the sent transaction count from the address.")

  public Integer getOutgoingTransactionsCount() {
    return outgoingTransactionsCount;
  }


  public void setOutgoingTransactionsCount(Integer outgoingTransactionsCount) {
    this.outgoingTransactionsCount = outgoingTransactionsCount;
  }


  public GetZilliqaAddressDetailsRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Defines the entire count of the transactions.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Defines the entire count of the transactions.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetZilliqaAddressDetailsRI getZilliqaAddressDetailsRI = (GetZilliqaAddressDetailsRI) o;
    return Objects.equals(this.balance, getZilliqaAddressDetailsRI.balance) &&
        Objects.equals(this.incomingTransactionsCount, getZilliqaAddressDetailsRI.incomingTransactionsCount) &&
        Objects.equals(this.outgoingTransactionsCount, getZilliqaAddressDetailsRI.outgoingTransactionsCount) &&
        Objects.equals(this.transactionsCount, getZilliqaAddressDetailsRI.transactionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, incomingTransactionsCount, outgoingTransactionsCount, transactionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetZilliqaAddressDetailsRI {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    incomingTransactionsCount: ").append(toIndentedString(incomingTransactionsCount)).append("\n");
    sb.append("    outgoingTransactionsCount: ").append(toIndentedString(outgoingTransactionsCount)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("incomingTransactionsCount");
    openapiFields.add("outgoingTransactionsCount");
    openapiFields.add("transactionsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("incomingTransactionsCount");
    openapiRequiredFields.add("outgoingTransactionsCount");
    openapiRequiredFields.add("transactionsCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetZilliqaAddressDetailsRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetZilliqaAddressDetailsRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetZilliqaAddressDetailsRI is not found in the empty JSON string", GetZilliqaAddressDetailsRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetZilliqaAddressDetailsRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetZilliqaAddressDetailsRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetZilliqaAddressDetailsRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `balance`
      if (jsonObj.getAsJsonObject("balance") != null) {
        GetZilliqaAddressDetailsRIBalance.validateJsonObject(jsonObj.getAsJsonObject("balance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetZilliqaAddressDetailsRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetZilliqaAddressDetailsRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetZilliqaAddressDetailsRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetZilliqaAddressDetailsRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetZilliqaAddressDetailsRI>() {
           @Override
           public void write(JsonWriter out, GetZilliqaAddressDetailsRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetZilliqaAddressDetailsRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetZilliqaAddressDetailsRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetZilliqaAddressDetailsRI
  * @throws IOException if the JSON string is invalid with respect to GetZilliqaAddressDetailsRI
  */
  public static GetZilliqaAddressDetailsRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetZilliqaAddressDetailsRI.class);
  }

 /**
  * Convert an instance of GetZilliqaAddressDetailsRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

