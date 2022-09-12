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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BannedIpAddress;
import org.openapitools.client.model.BannedIpAddressDetailsInner;
import org.openapitools.client.model.EndpointNotAllowedForApiKey;
import org.openapitools.client.model.EndpointNotAllowedForPlan;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.cryptoapis.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T15:09:18.638874Z[Etc/UTC]")
public class ListTransactionsByBlockHashE403 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListTransactionsByBlockHashE403.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListTransactionsByBlockHashE403.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListTransactionsByBlockHashE403' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BannedIpAddress> adapterBannedIpAddress = gson.getDelegateAdapter(this, TypeToken.get(BannedIpAddress.class));
            final TypeAdapter<EndpointNotAllowedForApiKey> adapterEndpointNotAllowedForApiKey = gson.getDelegateAdapter(this, TypeToken.get(EndpointNotAllowedForApiKey.class));
            final TypeAdapter<EndpointNotAllowedForPlan> adapterEndpointNotAllowedForPlan = gson.getDelegateAdapter(this, TypeToken.get(EndpointNotAllowedForPlan.class));
            final TypeAdapter<FeatureMainnetsNotAllowedForPlan> adapterFeatureMainnetsNotAllowedForPlan = gson.getDelegateAdapter(this, TypeToken.get(FeatureMainnetsNotAllowedForPlan.class));

            return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHashE403>() {
                @Override
                public void write(JsonWriter out, ListTransactionsByBlockHashE403 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BannedIpAddress`
                    if (value.getActualInstance() instanceof BannedIpAddress) {
                        JsonObject obj = adapterBannedIpAddress.toJsonTree((BannedIpAddress)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointNotAllowedForApiKey`
                    if (value.getActualInstance() instanceof EndpointNotAllowedForApiKey) {
                        JsonObject obj = adapterEndpointNotAllowedForApiKey.toJsonTree((EndpointNotAllowedForApiKey)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `EndpointNotAllowedForPlan`
                    if (value.getActualInstance() instanceof EndpointNotAllowedForPlan) {
                        JsonObject obj = adapterEndpointNotAllowedForPlan.toJsonTree((EndpointNotAllowedForPlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FeatureMainnetsNotAllowedForPlan`
                    if (value.getActualInstance() instanceof FeatureMainnetsNotAllowedForPlan) {
                        JsonObject obj = adapterFeatureMainnetsNotAllowedForPlan.toJsonTree((FeatureMainnetsNotAllowedForPlan)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan");
                }

                @Override
                public ListTransactionsByBlockHashE403 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BannedIpAddress
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BannedIpAddress.validateJsonObject(jsonObject);
                        actualAdapter = adapterBannedIpAddress;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BannedIpAddress'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BannedIpAddress failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BannedIpAddress'", e);
                    }

                    // deserialize EndpointNotAllowedForApiKey
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EndpointNotAllowedForApiKey.validateJsonObject(jsonObject);
                        actualAdapter = adapterEndpointNotAllowedForApiKey;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EndpointNotAllowedForApiKey'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EndpointNotAllowedForApiKey failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EndpointNotAllowedForApiKey'", e);
                    }

                    // deserialize EndpointNotAllowedForPlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EndpointNotAllowedForPlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterEndpointNotAllowedForPlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EndpointNotAllowedForPlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EndpointNotAllowedForPlan failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EndpointNotAllowedForPlan'", e);
                    }

                    // deserialize FeatureMainnetsNotAllowedForPlan
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FeatureMainnetsNotAllowedForPlan.validateJsonObject(jsonObject);
                        actualAdapter = adapterFeatureMainnetsNotAllowedForPlan;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FeatureMainnetsNotAllowedForPlan'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FeatureMainnetsNotAllowedForPlan failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FeatureMainnetsNotAllowedForPlan'", e);
                    }

                    if (match == 1) {
                        ListTransactionsByBlockHashE403 ret = new ListTransactionsByBlockHashE403();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ListTransactionsByBlockHashE403: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ListTransactionsByBlockHashE403() {
        super("oneOf", Boolean.FALSE);
    }

    public ListTransactionsByBlockHashE403(BannedIpAddress o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashE403(EndpointNotAllowedForApiKey o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashE403(EndpointNotAllowedForPlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashE403(FeatureMainnetsNotAllowedForPlan o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BannedIpAddress", new GenericType<BannedIpAddress>() {
        });
        schemas.put("EndpointNotAllowedForApiKey", new GenericType<EndpointNotAllowedForApiKey>() {
        });
        schemas.put("EndpointNotAllowedForPlan", new GenericType<EndpointNotAllowedForPlan>() {
        });
        schemas.put("FeatureMainnetsNotAllowedForPlan", new GenericType<FeatureMainnetsNotAllowedForPlan>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListTransactionsByBlockHashE403.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BannedIpAddress) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointNotAllowedForApiKey) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EndpointNotAllowedForPlan) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FeatureMainnetsNotAllowedForPlan) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan");
    }

    /**
     * Get the actual instance, which can be the following:
     * BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan
     *
     * @return The actual instance (BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BannedIpAddress`. If the actual instance is not `BannedIpAddress`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BannedIpAddress`
     * @throws ClassCastException if the instance is not `BannedIpAddress`
     */
    public BannedIpAddress getBannedIpAddress() throws ClassCastException {
        return (BannedIpAddress)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointNotAllowedForApiKey`. If the actual instance is not `EndpointNotAllowedForApiKey`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointNotAllowedForApiKey`
     * @throws ClassCastException if the instance is not `EndpointNotAllowedForApiKey`
     */
    public EndpointNotAllowedForApiKey getEndpointNotAllowedForApiKey() throws ClassCastException {
        return (EndpointNotAllowedForApiKey)super.getActualInstance();
    }

    /**
     * Get the actual instance of `EndpointNotAllowedForPlan`. If the actual instance is not `EndpointNotAllowedForPlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EndpointNotAllowedForPlan`
     * @throws ClassCastException if the instance is not `EndpointNotAllowedForPlan`
     */
    public EndpointNotAllowedForPlan getEndpointNotAllowedForPlan() throws ClassCastException {
        return (EndpointNotAllowedForPlan)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FeatureMainnetsNotAllowedForPlan`. If the actual instance is not `FeatureMainnetsNotAllowedForPlan`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FeatureMainnetsNotAllowedForPlan`
     * @throws ClassCastException if the instance is not `FeatureMainnetsNotAllowedForPlan`
     */
    public FeatureMainnetsNotAllowedForPlan getFeatureMainnetsNotAllowedForPlan() throws ClassCastException {
        return (FeatureMainnetsNotAllowedForPlan)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHashE403
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with BannedIpAddress
    try {
      BannedIpAddress.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BannedIpAddress failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EndpointNotAllowedForApiKey
    try {
      EndpointNotAllowedForApiKey.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointNotAllowedForApiKey failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EndpointNotAllowedForPlan
    try {
      EndpointNotAllowedForPlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EndpointNotAllowedForPlan failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with FeatureMainnetsNotAllowedForPlan
    try {
      FeatureMainnetsNotAllowedForPlan.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for FeatureMainnetsNotAllowedForPlan failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ListTransactionsByBlockHashE403 with oneOf schemas: BannedIpAddress, EndpointNotAllowedForApiKey, EndpointNotAllowedForPlan, FeatureMainnetsNotAllowedForPlan. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHashE403 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHashE403
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHashE403
  */
  public static ListTransactionsByBlockHashE403 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHashE403.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHashE403 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

