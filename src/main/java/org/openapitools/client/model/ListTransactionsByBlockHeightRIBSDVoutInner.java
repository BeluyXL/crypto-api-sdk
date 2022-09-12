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
import org.openapitools.client.model.ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey;

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
 * ListTransactionsByBlockHeightRIBSDVoutInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSDVoutInner {
  public static final String SERIALIZED_NAME_IS_SPENT = "isSpent";
  @SerializedName(SERIALIZED_NAME_IS_SPENT)
  private Boolean isSpent;

  public static final String SERIALIZED_NAME_SCRIPT_PUB_KEY = "scriptPubKey";
  @SerializedName(SERIALIZED_NAME_SCRIPT_PUB_KEY)
  private ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey scriptPubKey;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ListTransactionsByBlockHeightRIBSDVoutInner() { 
  }

  public ListTransactionsByBlockHeightRIBSDVoutInner isSpent(Boolean isSpent) {
    
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


  public ListTransactionsByBlockHeightRIBSDVoutInner scriptPubKey(ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey scriptPubKey) {
    
    this.scriptPubKey = scriptPubKey;
    return this;
  }

   /**
   * Get scriptPubKey
   * @return scriptPubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey getScriptPubKey() {
    return scriptPubKey;
  }


  public void setScriptPubKey(ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey scriptPubKey) {
    this.scriptPubKey = scriptPubKey;
  }


  public ListTransactionsByBlockHeightRIBSDVoutInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Represents the sent/received amount.", required = true, value = "Represents the sent/received amount.")

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
    ListTransactionsByBlockHeightRIBSDVoutInner listTransactionsByBlockHeightRIBSDVoutInner = (ListTransactionsByBlockHeightRIBSDVoutInner) o;
    return Objects.equals(this.isSpent, listTransactionsByBlockHeightRIBSDVoutInner.isSpent) &&
        Objects.equals(this.scriptPubKey, listTransactionsByBlockHeightRIBSDVoutInner.scriptPubKey) &&
        Objects.equals(this.value, listTransactionsByBlockHeightRIBSDVoutInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSpent, scriptPubKey, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSDVoutInner {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHeightRIBSDVoutInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListTransactionsByBlockHeightRIBSDVoutInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTransactionsByBlockHeightRIBSDVoutInner is not found in the empty JSON string", ListTransactionsByBlockHeightRIBSDVoutInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListTransactionsByBlockHeightRIBSDVoutInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTransactionsByBlockHeightRIBSDVoutInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListTransactionsByBlockHeightRIBSDVoutInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `scriptPubKey`
      if (jsonObj.getAsJsonObject("scriptPubKey") != null) {
        ListTransactionsByBlockHeightRIBSDVoutInnerScriptPubKey.validateJsonObject(jsonObj.getAsJsonObject("scriptPubKey"));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTransactionsByBlockHeightRIBSDVoutInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTransactionsByBlockHeightRIBSDVoutInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTransactionsByBlockHeightRIBSDVoutInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHeightRIBSDVoutInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHeightRIBSDVoutInner>() {
           @Override
           public void write(JsonWriter out, ListTransactionsByBlockHeightRIBSDVoutInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTransactionsByBlockHeightRIBSDVoutInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHeightRIBSDVoutInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHeightRIBSDVoutInner
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHeightRIBSDVoutInner
  */
  public static ListTransactionsByBlockHeightRIBSDVoutInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHeightRIBSDVoutInner.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHeightRIBSDVoutInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

