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

/**
 * ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-22T11:18:03.645227Z[Etc/UTC]")
public class ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend {
  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private String anchor;

  public static final String SERIALIZED_NAME_CV = "cv";
  @SerializedName(SERIALIZED_NAME_CV)
  private String cv;

  public static final String SERIALIZED_NAME_NULLIFIER = "nullifier";
  @SerializedName(SERIALIZED_NAME_NULLIFIER)
  private String nullifier;

  public static final String SERIALIZED_NAME_PROOF = "proof";
  @SerializedName(SERIALIZED_NAME_PROOF)
  private String proof;

  public static final String SERIALIZED_NAME_RK = "rk";
  @SerializedName(SERIALIZED_NAME_RK)
  private String rk;

  public static final String SERIALIZED_NAME_SPEND_AUTH_SIG = "spendAuthSig";
  @SerializedName(SERIALIZED_NAME_SPEND_AUTH_SIG)
  private String spendAuthSig;

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend() { 
  }

  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend anchor(String anchor) {
    
    this.anchor = anchor;
    return this;
  }

   /**
   * Defines a Merkle tree root of a note commitment tree which uniquely identifies a note commitment tree state given the assumed security properties of the Merkle tree’s hash function.
   * @return anchor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d32ddbaf0d9dc8c10783c01fd9ba5bd0bc2e5efe3d1665d7d6771eb4393736b4", required = true, value = "Defines a Merkle tree root of a note commitment tree which uniquely identifies a note commitment tree state given the assumed security properties of the Merkle tree’s hash function.")

  public String getAnchor() {
    return anchor;
  }


  public void setAnchor(String anchor) {
    this.anchor = anchor;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend cv(String cv) {
    
    this.cv = cv;
    return this;
  }

   /**
   * Defines a value commitment to the value of the input note.
   * @return cv
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "547a9cef4937304f97acacfcd9827b5aa1b2e5b1ae32e360fae828b955564a0e", required = true, value = "Defines a value commitment to the value of the input note.")

  public String getCv() {
    return cv;
  }


  public void setCv(String cv) {
    this.cv = cv;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend nullifier(String nullifier) {
    
    this.nullifier = nullifier;
    return this;
  }

   /**
   * Represents a sequence of nullifiers of the input notes.
   * @return nullifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30e41a9a6605933a75ec42439ab65eb347025002f6486e5549abb82438447dbe", required = true, value = "Represents a sequence of nullifiers of the input notes.")

  public String getNullifier() {
    return nullifier;
  }


  public void setNullifier(String nullifier) {
    this.nullifier = nullifier;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend proof(String proof) {
    
    this.proof = proof;
    return this;
  }

   /**
   * Represents the proof.
   * @return proof
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "030ff7fdb006db7f9acb0d2d6fae180e4395f0b6a979f6ddf48a349bc03ad2e7bb0324a5c3c7e6be131c34126ad22c74138f45f6f77bba706dfc87335a9adffcfef20a03e47751f403a37f9c5e1874aa50818c3eef09304c57c77b111057c09ed2112a7ed310ad285e0b778a4f44b654032b642b8b2df3be16bea011da7a2221bc0f0a0309f51f87caef2ea0f665f1a77d0dd50766d835d181e534818d8c3413b4d555990222574d9c92f81f17ff0af7a0583e76b3d3d4df2927561f37e57e15bc07b3f5d70306a9624c496d0bcb40085894bf32ef05db6469ec145c0ce5529e2697b6a0252c0216930cf7b3a7381762a6a91868e9d2bf823bfc7fb885de1fbd6a6cacae02db590318ffeb357ffd6832893ab0ccd3b15cef1df0fef45c091cf33fccee43a2834d44", required = true, value = "Represents the proof.")

  public String getProof() {
    return proof;
  }


  public void setProof(String proof) {
    this.proof = proof;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend rk(String rk) {
    
    this.rk = rk;
    return this;
  }

   /**
   * Represents the randomized validating key for spendAuthSig.
   * @return rk
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "39bdf742e16c4d1533a56df956bebe4d0214d4a361820db58a293847b6344d30", required = true, value = "Represents the randomized validating key for spendAuthSig.")

  public String getRk() {
    return rk;
  }


  public void setRk(String rk) {
    this.rk = rk;
  }


  public ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend spendAuthSig(String spendAuthSig) {
    
    this.spendAuthSig = spendAuthSig;
    return this;
  }

   /**
   * Used to prove knowledge of the spending key authorizing spending of an input note.
   * @return spendAuthSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0f3b38a91fffbbf58f99d2d070002c0868be6804204b7bf4be0df47f62ee5e0d43222776a71fd7e1421ec54502194192d73681701b743ad427573ca18a95a405", required = true, value = "Used to prove knowledge of the spending key authorizing spending of an input note.")

  public String getSpendAuthSig() {
    return spendAuthSig;
  }


  public void setSpendAuthSig(String spendAuthSig) {
    this.spendAuthSig = spendAuthSig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend = (ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend) o;
    return Objects.equals(this.anchor, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.anchor) &&
        Objects.equals(this.cv, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.cv) &&
        Objects.equals(this.nullifier, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.nullifier) &&
        Objects.equals(this.proof, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.proof) &&
        Objects.equals(this.rk, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.rk) &&
        Objects.equals(this.spendAuthSig, listUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend.spendAuthSig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchor, cv, nullifier, proof, rk, spendAuthSig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnspentTransactionOutputsByAddressRIBlockchainSpecificVShieldedSpend {\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    cv: ").append(toIndentedString(cv)).append("\n");
    sb.append("    nullifier: ").append(toIndentedString(nullifier)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
    sb.append("    rk: ").append(toIndentedString(rk)).append("\n");
    sb.append("    spendAuthSig: ").append(toIndentedString(spendAuthSig)).append("\n");
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
