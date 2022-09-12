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
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class TransactionRequestRejectionDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_REQUIRED_APPROVALS = "requiredApprovals";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVALS)
  private Integer requiredApprovals;

  public static final String SERIALIZED_NAME_REQUIRED_REJECTIONS = "requiredRejections";
  @SerializedName(SERIALIZED_NAME_REQUIRED_REJECTIONS)
  private Integer requiredRejections;

  public static final String SERIALIZED_NAME_CURRENT_APPROVALS = "currentApprovals";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVALS)
  private Integer currentApprovals;

  public static final String SERIALIZED_NAME_CURRENT_REJECTIONS = "currentRejections";
  @SerializedName(SERIALIZED_NAME_CURRENT_REJECTIONS)
  private Integer currentRejections;

  public TransactionRequestRejectionDataItem() { 
  }

  public TransactionRequestRejectionDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ethereum", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TransactionRequestRejectionDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ropsten", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TransactionRequestRejectionDataItem requiredApprovals(Integer requiredApprovals) {
    
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * The required number of approvals needed to approve the transaction.
   * @return requiredApprovals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The required number of approvals needed to approve the transaction.")

  public Integer getRequiredApprovals() {
    return requiredApprovals;
  }


  public void setRequiredApprovals(Integer requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }


  public TransactionRequestRejectionDataItem requiredRejections(Integer requiredRejections) {
    
    this.requiredRejections = requiredRejections;
    return this;
  }

   /**
   * The required number of rejections needed to reject the transaction.
   * @return requiredRejections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The required number of rejections needed to reject the transaction.")

  public Integer getRequiredRejections() {
    return requiredRejections;
  }


  public void setRequiredRejections(Integer requiredRejections) {
    this.requiredRejections = requiredRejections;
  }


  public TransactionRequestRejectionDataItem currentApprovals(Integer currentApprovals) {
    
    this.currentApprovals = currentApprovals;
    return this;
  }

   /**
   * The current number of approvals given for the transaction.
   * @return currentApprovals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The current number of approvals given for the transaction.")

  public Integer getCurrentApprovals() {
    return currentApprovals;
  }


  public void setCurrentApprovals(Integer currentApprovals) {
    this.currentApprovals = currentApprovals;
  }


  public TransactionRequestRejectionDataItem currentRejections(Integer currentRejections) {
    
    this.currentRejections = currentRejections;
    return this;
  }

   /**
   * The current number of rejections given for the transaction.
   * @return currentRejections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The current number of rejections given for the transaction.")

  public Integer getCurrentRejections() {
    return currentRejections;
  }


  public void setCurrentRejections(Integer currentRejections) {
    this.currentRejections = currentRejections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequestRejectionDataItem transactionRequestRejectionDataItem = (TransactionRequestRejectionDataItem) o;
    return Objects.equals(this.blockchain, transactionRequestRejectionDataItem.blockchain) &&
        Objects.equals(this.network, transactionRequestRejectionDataItem.network) &&
        Objects.equals(this.requiredApprovals, transactionRequestRejectionDataItem.requiredApprovals) &&
        Objects.equals(this.requiredRejections, transactionRequestRejectionDataItem.requiredRejections) &&
        Objects.equals(this.currentApprovals, transactionRequestRejectionDataItem.currentApprovals) &&
        Objects.equals(this.currentRejections, transactionRequestRejectionDataItem.currentRejections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, requiredApprovals, requiredRejections, currentApprovals, currentRejections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequestRejectionDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    requiredRejections: ").append(toIndentedString(requiredRejections)).append("\n");
    sb.append("    currentApprovals: ").append(toIndentedString(currentApprovals)).append("\n");
    sb.append("    currentRejections: ").append(toIndentedString(currentRejections)).append("\n");
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
    openapiFields.add("blockchain");
    openapiFields.add("network");
    openapiFields.add("requiredApprovals");
    openapiFields.add("requiredRejections");
    openapiFields.add("currentApprovals");
    openapiFields.add("currentRejections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockchain");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("requiredApprovals");
    openapiRequiredFields.add("requiredRejections");
    openapiRequiredFields.add("currentApprovals");
    openapiRequiredFields.add("currentRejections");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRequestRejectionDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionRequestRejectionDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRequestRejectionDataItem is not found in the empty JSON string", TransactionRequestRejectionDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionRequestRejectionDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRequestRejectionDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRequestRejectionDataItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("blockchain") != null && !jsonObj.get("blockchain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockchain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockchain").toString()));
      }
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRequestRejectionDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRequestRejectionDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRequestRejectionDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRequestRejectionDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRequestRejectionDataItem>() {
           @Override
           public void write(JsonWriter out, TransactionRequestRejectionDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRequestRejectionDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRequestRejectionDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRequestRejectionDataItem
  * @throws IOException if the JSON string is invalid with respect to TransactionRequestRejectionDataItem
  */
  public static TransactionRequestRejectionDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRequestRejectionDataItem.class);
  }

 /**
  * Convert an instance of TransactionRequestRejectionDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

