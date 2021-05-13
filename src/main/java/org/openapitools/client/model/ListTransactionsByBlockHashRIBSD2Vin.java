/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
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
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2ScriptSig;

/**
 * ListTransactionsByBlockHashRIBSD2Vin
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class ListTransactionsByBlockHashRIBSD2Vin {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_COINBASE = "coinbase";
  @SerializedName(SERIALIZED_NAME_COINBASE)
  private String coinbase;

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private ListTransactionsByBlockHashRIBSD2ScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = new ArrayList<String>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private Integer vout;


  public ListTransactionsByBlockHashRIBSD2Vin addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListTransactionsByBlockHashRIBSD2Vin addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListTransactionsByBlockHashRIBSD2Vin coinbase(String coinbase) {
    
    this.coinbase = coinbase;
    return this;
  }

   /**
   * Represents the coinbase hex.
   * @return coinbase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "037a3a2f", value = "Represents the coinbase hex.")

  public String getCoinbase() {
    return coinbase;
  }


  public void setCoinbase(String coinbase) {
    this.coinbase = coinbase;
  }


  public ListTransactionsByBlockHashRIBSD2Vin scriptSig(ListTransactionsByBlockHashRIBSD2ScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHashRIBSD2ScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(ListTransactionsByBlockHashRIBSD2ScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public ListTransactionsByBlockHashRIBSD2Vin sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @ApiModelProperty(example = "4294967295", required = true, value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public ListTransactionsByBlockHashRIBSD2Vin txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return txid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ddeb07a87366077535455148a79fabc160dbe5d455a3b69a70246316d1acf384", value = "Represents the reference transaction identifier.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ListTransactionsByBlockHashRIBSD2Vin txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public ListTransactionsByBlockHashRIBSD2Vin addTxinwitnessItem(String txinwitnessItem) {
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }


  public ListTransactionsByBlockHashRIBSD2Vin value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListTransactionsByBlockHashRIBSD2Vin vout(Integer vout) {
    
    this.vout = vout;
    return this;
  }

   /**
   * It refers to the index of the output address of this transaction. The index starts from 0.
   * @return vout
  **/
  @ApiModelProperty(example = "2", required = true, value = "It refers to the index of the output address of this transaction. The index starts from 0.")

  public Integer getVout() {
    return vout;
  }


  public void setVout(Integer vout) {
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
    ListTransactionsByBlockHashRIBSD2Vin listTransactionsByBlockHashRIBSD2Vin = (ListTransactionsByBlockHashRIBSD2Vin) o;
    return Objects.equals(this.addresses, listTransactionsByBlockHashRIBSD2Vin.addresses) &&
        Objects.equals(this.coinbase, listTransactionsByBlockHashRIBSD2Vin.coinbase) &&
        Objects.equals(this.scriptSig, listTransactionsByBlockHashRIBSD2Vin.scriptSig) &&
        Objects.equals(this.sequence, listTransactionsByBlockHashRIBSD2Vin.sequence) &&
        Objects.equals(this.txid, listTransactionsByBlockHashRIBSD2Vin.txid) &&
        Objects.equals(this.txinwitness, listTransactionsByBlockHashRIBSD2Vin.txinwitness) &&
        Objects.equals(this.value, listTransactionsByBlockHashRIBSD2Vin.value) &&
        Objects.equals(this.vout, listTransactionsByBlockHashRIBSD2Vin.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, coinbase, scriptSig, sequence, txid, txinwitness, value, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHashRIBSD2Vin {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    coinbase: ").append(toIndentedString(coinbase)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txinwitness: ").append(toIndentedString(txinwitness)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

}

