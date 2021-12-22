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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSDVout;
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionIDRIBSDVin;

/**
 * Dogecoin
 */
@ApiModel(description = "Dogecoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class GetWalletTransactionDetailsByTransactionIDRIBSD {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<GetWalletTransactionDetailsByTransactionIDRIBSDVin> vin = new ArrayList<GetWalletTransactionDetailsByTransactionIDRIBSDVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<GetTransactionDetailsByTransactionIDRIBSDVout> vout = new ArrayList<GetTransactionDetailsByTransactionIDRIBSDVout>();

  public GetWalletTransactionDetailsByTransactionIDRIBSD() { 
  }

  public GetWalletTransactionDetailsByTransactionIDRIBSD locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSD size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "266", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSD version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the transaction version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Represents the transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSD vin(List<GetWalletTransactionDetailsByTransactionIDRIBSDVin> vin) {
    
    this.vin = vin;
    return this;
  }

  public GetWalletTransactionDetailsByTransactionIDRIBSD addVinItem(GetWalletTransactionDetailsByTransactionIDRIBSDVin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Object Array representation of transaction inputs
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction inputs")

  public List<GetWalletTransactionDetailsByTransactionIDRIBSDVin> getVin() {
    return vin;
  }


  public void setVin(List<GetWalletTransactionDetailsByTransactionIDRIBSDVin> vin) {
    this.vin = vin;
  }


  public GetWalletTransactionDetailsByTransactionIDRIBSD vout(List<GetTransactionDetailsByTransactionIDRIBSDVout> vout) {
    
    this.vout = vout;
    return this;
  }

  public GetWalletTransactionDetailsByTransactionIDRIBSD addVoutItem(GetTransactionDetailsByTransactionIDRIBSDVout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Object Array representation of transaction outputs
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction outputs")

  public List<GetTransactionDetailsByTransactionIDRIBSDVout> getVout() {
    return vout;
  }


  public void setVout(List<GetTransactionDetailsByTransactionIDRIBSDVout> vout) {
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
    GetWalletTransactionDetailsByTransactionIDRIBSD getWalletTransactionDetailsByTransactionIDRIBSD = (GetWalletTransactionDetailsByTransactionIDRIBSD) o;
    return Objects.equals(this.locktime, getWalletTransactionDetailsByTransactionIDRIBSD.locktime) &&
        Objects.equals(this.size, getWalletTransactionDetailsByTransactionIDRIBSD.size) &&
        Objects.equals(this.version, getWalletTransactionDetailsByTransactionIDRIBSD.version) &&
        Objects.equals(this.vin, getWalletTransactionDetailsByTransactionIDRIBSD.vin) &&
        Objects.equals(this.vout, getWalletTransactionDetailsByTransactionIDRIBSD.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, version, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletTransactionDetailsByTransactionIDRIBSD {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
