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
 * Specifies the required signatures.
 */
@ApiModel(description = "Specifies the required signatures.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class ListTransactionsByAddressRIBSD2ScriptSig {
  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ListTransactionsByAddressRIBSD2ScriptSig asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * The asm strands for assembly, which is the symbolic representation of the Bitcoin&#39;s Script language op-codes.
   * @return asm
  **/
  @ApiModelProperty(example = "OP_DUP OP_HASH160 1ec5c66e9789c655ae068d35088b4073345fe0b0 OP_EQUALVERIFY OP_CHECKSIG", required = true, value = "The asm strands for assembly, which is the symbolic representation of the Bitcoin's Script language op-codes.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public ListTransactionsByAddressRIBSD2ScriptSig hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the public key of the address.
   * @return hex
  **/
  @ApiModelProperty(example = "76a9141ec5c66e9789c655ae068d35088b4073345fe0b088ac", required = true, value = "Represents the hex of the public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public ListTransactionsByAddressRIBSD2ScriptSig type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type of the reference transaction identifier.
   * @return type
  **/
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type of the reference transaction identifier.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByAddressRIBSD2ScriptSig listTransactionsByAddressRIBSD2ScriptSig = (ListTransactionsByAddressRIBSD2ScriptSig) o;
    return Objects.equals(this.asm, listTransactionsByAddressRIBSD2ScriptSig.asm) &&
        Objects.equals(this.hex, listTransactionsByAddressRIBSD2ScriptSig.hex) &&
        Objects.equals(this.type, listTransactionsByAddressRIBSD2ScriptSig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asm, hex, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByAddressRIBSD2ScriptSig {\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

