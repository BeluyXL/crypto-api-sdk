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
import org.openapitools.client.model.AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock;

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
public class AddressCoinsTransactionConfirmedEachConfirmationDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK = "minedInBlock";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK)
  private AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CURRENT_CONFIRMATIONS = "currentConfirmations";
  @SerializedName(SERIALIZED_NAME_CURRENT_CONFIRMATIONS)
  private Integer currentConfirmations;

  public static final String SERIALIZED_NAME_TARGET_CONFIRMATIONS = "targetConfirmations";
  @SerializedName(SERIALIZED_NAME_TARGET_CONFIRMATIONS)
  private Integer targetConfirmations;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INCOMING("incoming"),
    
    OUTGOING("outgoing");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public AddressCoinsTransactionConfirmedEachConfirmationDataItem() { 
  }

  public AddressCoinsTransactionConfirmedEachConfirmationDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the specific address to which the transaction has been sent.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15282N4BYEwYh3j1dTgJu64Ey5qWn9Po9F", required = true, value = "Defines the specific address to which the transaction has been sent.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem minedInBlock(AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    
    this.minedInBlock = minedInBlock;
    return this;
  }

   /**
   * Get minedInBlock
   * @return minedInBlock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock getMinedInBlock() {
    return minedInBlock;
  }


  public void setMinedInBlock(AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    this.minedInBlock = minedInBlock;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Defines the unique ID of the specific transaction, i.e. its identification number.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "cbd3dea703bd2bc78bca69ee61ca14e6ffcdd809d07ebbc3b8fea3c30ea38f33", required = true, value = "Defines the unique ID of the specific transaction, i.e. its identification number.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem currentConfirmations(Integer currentConfirmations) {
    
    this.currentConfirmations = currentConfirmations;
    return this;
  }

   /**
   * Defines the number of currently received confirmations for the transaction.
   * @return currentConfirmations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "Defines the number of currently received confirmations for the transaction.")

  public Integer getCurrentConfirmations() {
    return currentConfirmations;
  }


  public void setCurrentConfirmations(Integer currentConfirmations) {
    this.currentConfirmations = currentConfirmations;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem targetConfirmations(Integer targetConfirmations) {
    
    this.targetConfirmations = targetConfirmations;
    return this;
  }

   /**
   * Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.
   * @return targetConfirmations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.")

  public Integer getTargetConfirmations() {
    return targetConfirmations;
  }


  public void setTargetConfirmations(Integer targetConfirmations) {
    this.targetConfirmations = targetConfirmations;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of coins sent with the confirmed transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.0611", required = true, value = "Defines the amount of coins sent with the confirmed transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of the transaction, e.g. BTC.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Defines the unit of the transaction, e.g. BTC.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public AddressCoinsTransactionConfirmedEachConfirmationDataItem direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   * @return direction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "incoming", required = true, value = "Defines whether the transaction is \"incoming\" or \"outgoing\".")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCoinsTransactionConfirmedEachConfirmationDataItem addressCoinsTransactionConfirmedEachConfirmationDataItem = (AddressCoinsTransactionConfirmedEachConfirmationDataItem) o;
    return Objects.equals(this.blockchain, addressCoinsTransactionConfirmedEachConfirmationDataItem.blockchain) &&
        Objects.equals(this.network, addressCoinsTransactionConfirmedEachConfirmationDataItem.network) &&
        Objects.equals(this.address, addressCoinsTransactionConfirmedEachConfirmationDataItem.address) &&
        Objects.equals(this.minedInBlock, addressCoinsTransactionConfirmedEachConfirmationDataItem.minedInBlock) &&
        Objects.equals(this.transactionId, addressCoinsTransactionConfirmedEachConfirmationDataItem.transactionId) &&
        Objects.equals(this.currentConfirmations, addressCoinsTransactionConfirmedEachConfirmationDataItem.currentConfirmations) &&
        Objects.equals(this.targetConfirmations, addressCoinsTransactionConfirmedEachConfirmationDataItem.targetConfirmations) &&
        Objects.equals(this.amount, addressCoinsTransactionConfirmedEachConfirmationDataItem.amount) &&
        Objects.equals(this.unit, addressCoinsTransactionConfirmedEachConfirmationDataItem.unit) &&
        Objects.equals(this.direction, addressCoinsTransactionConfirmedEachConfirmationDataItem.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, address, minedInBlock, transactionId, currentConfirmations, targetConfirmations, amount, unit, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCoinsTransactionConfirmedEachConfirmationDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    minedInBlock: ").append(toIndentedString(minedInBlock)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    currentConfirmations: ").append(toIndentedString(currentConfirmations)).append("\n");
    sb.append("    targetConfirmations: ").append(toIndentedString(targetConfirmations)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("minedInBlock");
    openapiFields.add("transactionId");
    openapiFields.add("currentConfirmations");
    openapiFields.add("targetConfirmations");
    openapiFields.add("amount");
    openapiFields.add("unit");
    openapiFields.add("direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockchain");
    openapiRequiredFields.add("network");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("minedInBlock");
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("currentConfirmations");
    openapiRequiredFields.add("targetConfirmations");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("unit");
    openapiRequiredFields.add("direction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressCoinsTransactionConfirmedEachConfirmationDataItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressCoinsTransactionConfirmedEachConfirmationDataItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressCoinsTransactionConfirmedEachConfirmationDataItem is not found in the empty JSON string", AddressCoinsTransactionConfirmedEachConfirmationDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressCoinsTransactionConfirmedEachConfirmationDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressCoinsTransactionConfirmedEachConfirmationDataItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressCoinsTransactionConfirmedEachConfirmationDataItem.openapiRequiredFields) {
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
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // validate the optional field `minedInBlock`
      if (jsonObj.getAsJsonObject("minedInBlock") != null) {
        AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock.validateJsonObject(jsonObj.getAsJsonObject("minedInBlock"));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressCoinsTransactionConfirmedEachConfirmationDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressCoinsTransactionConfirmedEachConfirmationDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressCoinsTransactionConfirmedEachConfirmationDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressCoinsTransactionConfirmedEachConfirmationDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressCoinsTransactionConfirmedEachConfirmationDataItem>() {
           @Override
           public void write(JsonWriter out, AddressCoinsTransactionConfirmedEachConfirmationDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressCoinsTransactionConfirmedEachConfirmationDataItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressCoinsTransactionConfirmedEachConfirmationDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressCoinsTransactionConfirmedEachConfirmationDataItem
  * @throws IOException if the JSON string is invalid with respect to AddressCoinsTransactionConfirmedEachConfirmationDataItem
  */
  public static AddressCoinsTransactionConfirmedEachConfirmationDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressCoinsTransactionConfirmedEachConfirmationDataItem.class);
  }

 /**
  * Convert an instance of AddressCoinsTransactionConfirmedEachConfirmationDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

