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
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey;

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
 * ListTransactionsByBlockHashRIBSLVoutInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ListTransactionsByBlockHashRIBSLVoutInner {
  public static final String SERIALIZED_NAME_IS_SPENT = "isSpent";
  @SerializedName(SERIALIZED_NAME_IS_SPENT)
  private Boolean isSpent;

  public static final String SERIALIZED_NAME_SCRIPT_PUB_KEY = "scriptPubKey";
  @SerializedName(SERIALIZED_NAME_SCRIPT_PUB_KEY)
  private ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey scriptPubKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ListTransactionsByBlockHashRIBSLVoutInner() { 
  }

  public ListTransactionsByBlockHashRIBSLVoutInner isSpent(Boolean isSpent) {
    
    this.isSpent = isSpent;
    return this;
  }

   /**
   * Defines whether the output is spent or not.
   * @return isSpent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Defines whether the output is spent or not.")

  public Boolean getIsSpent() {
    return isSpent;
  }


  public void setIsSpent(Boolean isSpent) {
    this.isSpent = isSpent;
  }


  public ListTransactionsByBlockHashRIBSLVoutInner scriptPubKey(ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey scriptPubKey) {
    
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Get scriptPubKey
   * @return scriptPubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey getScriptPubKey() {
    return scriptPubKey;
  }


  public void setScriptPubKey(ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }


  public ListTransactionsByBlockHashRIBSLVoutInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.03505975", required = true, value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHashRIBSLVoutInner listTransactionsByBlockHashRIBSLVoutInner = (ListTransactionsByBlockHashRIBSLVoutInner) o;
    return Objects.equals(this.isSpent, listTransactionsByBlockHashRIBSLVoutInner.isSpent) &&
        Objects.equals(this.scriptPubKey, listTransactionsByBlockHashRIBSLVoutInner.scriptPubKey) &&
        Objects.equals(this.value, listTransactionsByBlockHashRIBSLVoutInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpent, scriptPubKey, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHashRIBSLVoutInner {\n");
    sb.append("    isSpent: ").append(toIndentedString(isSpent)).append("\n");
    sb.append("    scriptPubKey: ").append(toIndentedString(scriptPubKey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("isSpent");
    openapiFields.add("scriptPubKey");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isSpent");
    openapiRequiredFields.add("scriptPubKey");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHashRIBSLVoutInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListTransactionsByBlockHashRIBSLVoutInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTransactionsByBlockHashRIBSLVoutInner is not found in the empty JSON string", ListTransactionsByBlockHashRIBSLVoutInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListTransactionsByBlockHashRIBSLVoutInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTransactionsByBlockHashRIBSLVoutInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListTransactionsByBlockHashRIBSLVoutInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `scriptPubKey`
      if (jsonObj.getAsJsonObject("scriptPubKey") != null) {
        ListTransactionsByBlockHashRIBSLVoutInnerScriptPubKey.validateJsonObject(jsonObj.getAsJsonObject("scriptPubKey"));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTransactionsByBlockHashRIBSLVoutInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTransactionsByBlockHashRIBSLVoutInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTransactionsByBlockHashRIBSLVoutInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSLVoutInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHashRIBSLVoutInner>() {
           @Override
           public void write(JsonWriter out, ListTransactionsByBlockHashRIBSLVoutInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTransactionsByBlockHashRIBSLVoutInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHashRIBSLVoutInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHashRIBSLVoutInner
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHashRIBSLVoutInner
  */
  public static ListTransactionsByBlockHashRIBSLVoutInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHashRIBSLVoutInner.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHashRIBSLVoutInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

