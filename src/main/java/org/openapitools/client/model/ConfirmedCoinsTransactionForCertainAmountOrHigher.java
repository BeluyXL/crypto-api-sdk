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
import org.openapitools.client.model.ConfirmedCoinsTransactionForCertainAmountOrHigherData;

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
 * ConfirmedCoinsTransactionForCertainAmountOrHigher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ConfirmedCoinsTransactionForCertainAmountOrHigher {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ConfirmedCoinsTransactionForCertainAmountOrHigherData data;

  public ConfirmedCoinsTransactionForCertainAmountOrHigher() { 
  }

  public ConfirmedCoinsTransactionForCertainAmountOrHigher apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Specifies the version of the API that incorporates this endpoint.
   * @return apiVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-03-20", required = true, value = "Specifies the version of the API that incorporates this endpoint.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ConfirmedCoinsTransactionForCertainAmountOrHigher referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique identifier that serves as reference to the specific request which prompts a callback, e.g. Blockchain Events Subscription, Blockchain Automation, etc.
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6038d09050653d1f0e40584c", required = true, value = "Represents a unique identifier that serves as reference to the specific request which prompts a callback, e.g. Blockchain Events Subscription, Blockchain Automation, etc.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public ConfirmedCoinsTransactionForCertainAmountOrHigher idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Specifies a unique ID generated by the system and attached to each callback. It is used by the server to recognize consecutive requests with the same data with the purpose not to perform the same operation twice.
   * @return idempotencyKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e55bf7a4a7188855f1c27541a6c387d04cc3b22ee34d1304b0e6ecad61c9906c", required = true, value = "Specifies a unique ID generated by the system and attached to each callback. It is used by the server to recognize consecutive requests with the same data with the purpose not to perform the same operation twice.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public ConfirmedCoinsTransactionForCertainAmountOrHigher data(ConfirmedCoinsTransactionForCertainAmountOrHigherData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConfirmedCoinsTransactionForCertainAmountOrHigherData getData() {
    return data;
  }


  public void setData(ConfirmedCoinsTransactionForCertainAmountOrHigherData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmedCoinsTransactionForCertainAmountOrHigher confirmedCoinsTransactionForCertainAmountOrHigher = (ConfirmedCoinsTransactionForCertainAmountOrHigher) o;
    return Objects.equals(this.apiVersion, confirmedCoinsTransactionForCertainAmountOrHigher.apiVersion) &&
        Objects.equals(this.referenceId, confirmedCoinsTransactionForCertainAmountOrHigher.referenceId) &&
        Objects.equals(this.idempotencyKey, confirmedCoinsTransactionForCertainAmountOrHigher.idempotencyKey) &&
        Objects.equals(this.data, confirmedCoinsTransactionForCertainAmountOrHigher.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, referenceId, idempotencyKey, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmedCoinsTransactionForCertainAmountOrHigher {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("referenceId");
    openapiFields.add("idempotencyKey");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("apiVersion");
    openapiRequiredFields.add("referenceId");
    openapiRequiredFields.add("idempotencyKey");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfirmedCoinsTransactionForCertainAmountOrHigher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfirmedCoinsTransactionForCertainAmountOrHigher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfirmedCoinsTransactionForCertainAmountOrHigher is not found in the empty JSON string", ConfirmedCoinsTransactionForCertainAmountOrHigher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfirmedCoinsTransactionForCertainAmountOrHigher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfirmedCoinsTransactionForCertainAmountOrHigher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfirmedCoinsTransactionForCertainAmountOrHigher.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if (jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if (jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        ConfirmedCoinsTransactionForCertainAmountOrHigherData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfirmedCoinsTransactionForCertainAmountOrHigher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfirmedCoinsTransactionForCertainAmountOrHigher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfirmedCoinsTransactionForCertainAmountOrHigher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfirmedCoinsTransactionForCertainAmountOrHigher.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfirmedCoinsTransactionForCertainAmountOrHigher>() {
           @Override
           public void write(JsonWriter out, ConfirmedCoinsTransactionForCertainAmountOrHigher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfirmedCoinsTransactionForCertainAmountOrHigher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfirmedCoinsTransactionForCertainAmountOrHigher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfirmedCoinsTransactionForCertainAmountOrHigher
  * @throws IOException if the JSON string is invalid with respect to ConfirmedCoinsTransactionForCertainAmountOrHigher
  */
  public static ConfirmedCoinsTransactionForCertainAmountOrHigher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfirmedCoinsTransactionForCertainAmountOrHigher.class);
  }

 /**
  * Convert an instance of ConfirmedCoinsTransactionForCertainAmountOrHigher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

