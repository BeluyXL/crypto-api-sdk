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
import org.openapitools.client.model.ListTransactionsByAddressRIBSBVin;
import org.openapitools.client.model.ListTransactionsByAddressRIBSBVout;

/**
 * Bitcoin
 */
@ApiModel(description = "Bitcoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class ListTransactionsByAddressRIBSB {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_V_SIZE = "vSize";
  @SerializedName(SERIALIZED_NAME_V_SIZE)
  private Integer vSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<ListTransactionsByAddressRIBSBVin> vin = new ArrayList<ListTransactionsByAddressRIBSBVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListTransactionsByAddressRIBSBVout> vout = new ArrayList<ListTransactionsByAddressRIBSBVout>();


  public ListTransactionsByAddressRIBSB locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public ListTransactionsByAddressRIBSB size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @ApiModelProperty(example = "125", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListTransactionsByAddressRIBSB vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Defines the transaction&#39;s virtual size.
   * @return vSize
  **/
  @ApiModelProperty(example = "166", required = true, value = "Defines the transaction's virtual size.")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public ListTransactionsByAddressRIBSB version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the version of the transaction.
   * @return version
  **/
  @ApiModelProperty(example = "2", required = true, value = "Defines the version of the transaction.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListTransactionsByAddressRIBSB vin(List<ListTransactionsByAddressRIBSBVin> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListTransactionsByAddressRIBSB addVinItem(ListTransactionsByAddressRIBSBVin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<ListTransactionsByAddressRIBSBVin> getVin() {
    return vin;
  }


  public void setVin(List<ListTransactionsByAddressRIBSBVin> vin) {
    this.vin = vin;
  }


  public ListTransactionsByAddressRIBSB vout(List<ListTransactionsByAddressRIBSBVout> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListTransactionsByAddressRIBSB addVoutItem(ListTransactionsByAddressRIBSBVout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<ListTransactionsByAddressRIBSBVout> getVout() {
    return vout;
  }


  public void setVout(List<ListTransactionsByAddressRIBSBVout> vout) {
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
    ListTransactionsByAddressRIBSB listTransactionsByAddressRIBSB = (ListTransactionsByAddressRIBSB) o;
    return Objects.equals(this.locktime, listTransactionsByAddressRIBSB.locktime) &&
        Objects.equals(this.size, listTransactionsByAddressRIBSB.size) &&
        Objects.equals(this.vSize, listTransactionsByAddressRIBSB.vSize) &&
        Objects.equals(this.version, listTransactionsByAddressRIBSB.version) &&
        Objects.equals(this.vin, listTransactionsByAddressRIBSB.vin) &&
        Objects.equals(this.vout, listTransactionsByAddressRIBSB.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, vSize, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByAddressRIBSB {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
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

}

