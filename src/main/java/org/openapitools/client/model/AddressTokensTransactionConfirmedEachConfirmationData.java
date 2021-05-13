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
import org.openapitools.client.model.AddressTokensTransactionConfirmedEachConfirmationDataItem;

/**
 * Specifies all data, as attributes, included into the callback notification, which depends on the &#x60;event&#x60;.
 */
@ApiModel(description = "Specifies all data, as attributes, included into the callback notification, which depends on the `event`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:47:47.583665Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedEachConfirmationData {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private AddressTokensTransactionConfirmedEachConfirmationDataItem item;


  public AddressTokensTransactionConfirmedEachConfirmationData product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * Represents the Crypto APIs 2.0 product which sends the callback.
   * @return product
  **/
  @ApiModelProperty(example = "Blockchain Events", required = true, value = "Represents the Crypto APIs 2.0 product which sends the callback.")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public AddressTokensTransactionConfirmedEachConfirmationData event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Defines the specific event, for which a callback subscription is set.
   * @return event
  **/
  @ApiModelProperty(example = "ADDRESS_TOKENS_TRANSACTION_CONFIRMED_EACH_CONFIRMATION", required = true, value = "Defines the specific event, for which a callback subscription is set.")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public AddressTokensTransactionConfirmedEachConfirmationData item(AddressTokensTransactionConfirmedEachConfirmationDataItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressTokensTransactionConfirmedEachConfirmationDataItem getItem() {
    return item;
  }


  public void setItem(AddressTokensTransactionConfirmedEachConfirmationDataItem item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionConfirmedEachConfirmationData addressTokensTransactionConfirmedEachConfirmationData = (AddressTokensTransactionConfirmedEachConfirmationData) o;
    return Objects.equals(this.product, addressTokensTransactionConfirmedEachConfirmationData.product) &&
        Objects.equals(this.event, addressTokensTransactionConfirmedEachConfirmationData.event) &&
        Objects.equals(this.item, addressTokensTransactionConfirmedEachConfirmationData.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, event, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedEachConfirmationData {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

