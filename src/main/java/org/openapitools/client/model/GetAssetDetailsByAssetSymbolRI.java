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
import org.openapitools.client.model.GetAssetDetailsByAssetIDRIAssetLogo;
import org.openapitools.client.model.GetAssetDetailsByAssetIDRILatestRate;
import org.openapitools.client.model.GetAssetDetailsByAssetSymbolRIS;

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
 * GetAssetDetailsByAssetSymbolRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class GetAssetDetailsByAssetSymbolRI {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_LOGO = "assetLogo";
  @SerializedName(SERIALIZED_NAME_ASSET_LOGO)
  private GetAssetDetailsByAssetIDRIAssetLogo assetLogo;

  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_ASSET_ORIGINAL_SYMBOL = "assetOriginalSymbol";
  @SerializedName(SERIALIZED_NAME_ASSET_ORIGINAL_SYMBOL)
  private String assetOriginalSymbol;

  public static final String SERIALIZED_NAME_ASSET_SYMBOL = "assetSymbol";
  @SerializedName(SERIALIZED_NAME_ASSET_SYMBOL)
  private String assetSymbol;

  /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   */
  @JsonAdapter(AssetTypeEnum.Adapter.class)
  public enum AssetTypeEnum {
    FIAT("fiat"),
    
    CRYPTO("crypto");

    private String value;

    AssetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetTypeEnum fromValue(String value) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private AssetTypeEnum assetType;

  public static final String SERIALIZED_NAME_LATEST_RATE = "latestRate";
  @SerializedName(SERIALIZED_NAME_LATEST_RATE)
  private GetAssetDetailsByAssetIDRILatestRate latestRate;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_SPECIFIC_DATA = "specificData";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_DATA)
  private GetAssetDetailsByAssetSymbolRIS specificData;

  public GetAssetDetailsByAssetSymbolRI() { 
  }

  public GetAssetDetailsByAssetSymbolRI assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Defines the unique ID of the specific asset.
   * @return assetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5b1ea92e584bf50020130615", required = true, value = "Defines the unique ID of the specific asset.")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public GetAssetDetailsByAssetSymbolRI assetLogo(GetAssetDetailsByAssetIDRIAssetLogo assetLogo) {
    
    this.assetLogo = assetLogo;
    return this;
  }

   /**
   * Get assetLogo
   * @return assetLogo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetAssetDetailsByAssetIDRIAssetLogo getAssetLogo() {
    return assetLogo;
  }


  public void setAssetLogo(GetAssetDetailsByAssetIDRIAssetLogo assetLogo) {
    this.assetLogo = assetLogo;
  }


  public GetAssetDetailsByAssetSymbolRI assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * Specifies the name of the asset in question.
   * @return assetName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bitcoin", required = true, value = "Specifies the name of the asset in question.")

  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public GetAssetDetailsByAssetSymbolRI assetOriginalSymbol(String assetOriginalSymbol) {
    
    this.assetOriginalSymbol = assetOriginalSymbol;
    return this;
  }

   /**
   * Specifies the asset&#39;s original symbol as introduced by its founders.
   * @return assetOriginalSymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Specifies the asset's original symbol as introduced by its founders.")

  public String getAssetOriginalSymbol() {
    return assetOriginalSymbol;
  }


  public void setAssetOriginalSymbol(String assetOriginalSymbol) {
    this.assetOriginalSymbol = assetOriginalSymbol;
  }


  public GetAssetDetailsByAssetSymbolRI assetSymbol(String assetSymbol) {
    
    this.assetSymbol = assetSymbol;
    return this;
  }

   /**
   * Specifies the asset&#39;s unique symbol in the Crypto APIs listings.
   * @return assetSymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Specifies the asset's unique symbol in the Crypto APIs listings.")

  public String getAssetSymbol() {
    return assetSymbol;
  }


  public void setAssetSymbol(String assetSymbol) {
    this.assetSymbol = assetSymbol;
  }


  public GetAssetDetailsByAssetSymbolRI assetType(AssetTypeEnum assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Defines the type of the supported asset. This could be either \&quot;crypto\&quot; or \&quot;fiat\&quot;.
   * @return assetType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "crypto", required = true, value = "Defines the type of the supported asset. This could be either \"crypto\" or \"fiat\".")

  public AssetTypeEnum getAssetType() {
    return assetType;
  }


  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }


  public GetAssetDetailsByAssetSymbolRI latestRate(GetAssetDetailsByAssetIDRILatestRate latestRate) {
    
    this.latestRate = latestRate;
    return this;
  }

   /**
   * Get latestRate
   * @return latestRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetAssetDetailsByAssetIDRILatestRate getLatestRate() {
    return latestRate;
  }


  public void setLatestRate(GetAssetDetailsByAssetIDRILatestRate latestRate) {
    this.latestRate = latestRate;
  }


  public GetAssetDetailsByAssetSymbolRI slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Represents the asset&#x60;s unique slug string in Crypto APIs listings.
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bitcoin", value = "Represents the asset`s unique slug string in Crypto APIs listings.")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public GetAssetDetailsByAssetSymbolRI specificData(GetAssetDetailsByAssetSymbolRIS specificData) {
    
    this.specificData = specificData;
    return this;
  }

   /**
   * Get specificData
   * @return specificData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetAssetDetailsByAssetSymbolRIS getSpecificData() {
    return specificData;
  }


  public void setSpecificData(GetAssetDetailsByAssetSymbolRIS specificData) {
    this.specificData = specificData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAssetDetailsByAssetSymbolRI getAssetDetailsByAssetSymbolRI = (GetAssetDetailsByAssetSymbolRI) o;
    return Objects.equals(this.assetId, getAssetDetailsByAssetSymbolRI.assetId) &&
        Objects.equals(this.assetLogo, getAssetDetailsByAssetSymbolRI.assetLogo) &&
        Objects.equals(this.assetName, getAssetDetailsByAssetSymbolRI.assetName) &&
        Objects.equals(this.assetOriginalSymbol, getAssetDetailsByAssetSymbolRI.assetOriginalSymbol) &&
        Objects.equals(this.assetSymbol, getAssetDetailsByAssetSymbolRI.assetSymbol) &&
        Objects.equals(this.assetType, getAssetDetailsByAssetSymbolRI.assetType) &&
        Objects.equals(this.latestRate, getAssetDetailsByAssetSymbolRI.latestRate) &&
        Objects.equals(this.slug, getAssetDetailsByAssetSymbolRI.slug) &&
        Objects.equals(this.specificData, getAssetDetailsByAssetSymbolRI.specificData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetLogo, assetName, assetOriginalSymbol, assetSymbol, assetType, latestRate, slug, specificData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAssetDetailsByAssetSymbolRI {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetLogo: ").append(toIndentedString(assetLogo)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetOriginalSymbol: ").append(toIndentedString(assetOriginalSymbol)).append("\n");
    sb.append("    assetSymbol: ").append(toIndentedString(assetSymbol)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    latestRate: ").append(toIndentedString(latestRate)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    specificData: ").append(toIndentedString(specificData)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("assetLogo");
    openapiFields.add("assetName");
    openapiFields.add("assetOriginalSymbol");
    openapiFields.add("assetSymbol");
    openapiFields.add("assetType");
    openapiFields.add("latestRate");
    openapiFields.add("slug");
    openapiFields.add("specificData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assetId");
    openapiRequiredFields.add("assetLogo");
    openapiRequiredFields.add("assetName");
    openapiRequiredFields.add("assetOriginalSymbol");
    openapiRequiredFields.add("assetSymbol");
    openapiRequiredFields.add("assetType");
    openapiRequiredFields.add("latestRate");
    openapiRequiredFields.add("specificData");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAssetDetailsByAssetSymbolRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAssetDetailsByAssetSymbolRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAssetDetailsByAssetSymbolRI is not found in the empty JSON string", GetAssetDetailsByAssetSymbolRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAssetDetailsByAssetSymbolRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAssetDetailsByAssetSymbolRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetAssetDetailsByAssetSymbolRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // validate the optional field `assetLogo`
      if (jsonObj.getAsJsonObject("assetLogo") != null) {
        GetAssetDetailsByAssetIDRIAssetLogo.validateJsonObject(jsonObj.getAsJsonObject("assetLogo"));
      }
      if (jsonObj.get("assetName") != null && !jsonObj.get("assetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetName").toString()));
      }
      if (jsonObj.get("assetOriginalSymbol") != null && !jsonObj.get("assetOriginalSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetOriginalSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetOriginalSymbol").toString()));
      }
      if (jsonObj.get("assetSymbol") != null && !jsonObj.get("assetSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetSymbol").toString()));
      }
      if (jsonObj.get("assetType") != null && !jsonObj.get("assetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetType").toString()));
      }
      // validate the optional field `latestRate`
      if (jsonObj.getAsJsonObject("latestRate") != null) {
        GetAssetDetailsByAssetIDRILatestRate.validateJsonObject(jsonObj.getAsJsonObject("latestRate"));
      }
      if (jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the optional field `specificData`
      if (jsonObj.getAsJsonObject("specificData") != null) {
        GetAssetDetailsByAssetSymbolRIS.validateJsonObject(jsonObj.getAsJsonObject("specificData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAssetDetailsByAssetSymbolRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAssetDetailsByAssetSymbolRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAssetDetailsByAssetSymbolRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAssetDetailsByAssetSymbolRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAssetDetailsByAssetSymbolRI>() {
           @Override
           public void write(JsonWriter out, GetAssetDetailsByAssetSymbolRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAssetDetailsByAssetSymbolRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAssetDetailsByAssetSymbolRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAssetDetailsByAssetSymbolRI
  * @throws IOException if the JSON string is invalid with respect to GetAssetDetailsByAssetSymbolRI
  */
  public static GetAssetDetailsByAssetSymbolRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAssetDetailsByAssetSymbolRI.class);
  }

 /**
  * Convert an instance of GetAssetDetailsByAssetSymbolRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

