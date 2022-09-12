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
import org.openapitools.client.model.BannedIpAddressDetailsInner;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.LimitGreaterThanAllowed;
import org.openapitools.client.model.UriNotFound;

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
public class EstimateTokenGasLimitE400 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EstimateTokenGasLimitE400.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EstimateTokenGasLimitE400.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EstimateTokenGasLimitE400' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InvalidPagination> adapterInvalidPagination = gson.getDelegateAdapter(this, TypeToken.get(InvalidPagination.class));
            final TypeAdapter<LimitGreaterThanAllowed> adapterLimitGreaterThanAllowed = gson.getDelegateAdapter(this, TypeToken.get(LimitGreaterThanAllowed.class));
            final TypeAdapter<UriNotFound> adapterUriNotFound = gson.getDelegateAdapter(this, TypeToken.get(UriNotFound.class));

            return (TypeAdapter<T>) new TypeAdapter<EstimateTokenGasLimitE400>() {
                @Override
                public void write(JsonWriter out, EstimateTokenGasLimitE400 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidPagination`
                    if (value.getActualInstance() instanceof InvalidPagination) {
                        JsonObject obj = adapterInvalidPagination.toJsonTree((InvalidPagination)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `LimitGreaterThanAllowed`
                    if (value.getActualInstance() instanceof LimitGreaterThanAllowed) {
                        JsonObject obj = adapterLimitGreaterThanAllowed.toJsonTree((LimitGreaterThanAllowed)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UriNotFound`
                    if (value.getActualInstance() instanceof UriNotFound) {
                        JsonObject obj = adapterUriNotFound.toJsonTree((UriNotFound)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InvalidPagination, LimitGreaterThanAllowed, UriNotFound");
                }

                @Override
                public EstimateTokenGasLimitE400 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InvalidPagination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidPagination.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidPagination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidPagination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InvalidPagination failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InvalidPagination'", e);
                    }

                    // deserialize LimitGreaterThanAllowed
                    try {
                        // validate the JSON object to see if any exception is thrown
                        LimitGreaterThanAllowed.validateJsonObject(jsonObject);
                        actualAdapter = adapterLimitGreaterThanAllowed;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'LimitGreaterThanAllowed'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for LimitGreaterThanAllowed failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'LimitGreaterThanAllowed'", e);
                    }

                    // deserialize UriNotFound
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UriNotFound.validateJsonObject(jsonObject);
                        actualAdapter = adapterUriNotFound;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UriNotFound'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UriNotFound failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UriNotFound'", e);
                    }

                    if (match == 1) {
                        EstimateTokenGasLimitE400 ret = new EstimateTokenGasLimitE400();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for EstimateTokenGasLimitE400: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public EstimateTokenGasLimitE400() {
        super("oneOf", Boolean.FALSE);
    }

    public EstimateTokenGasLimitE400(InvalidPagination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EstimateTokenGasLimitE400(LimitGreaterThanAllowed o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EstimateTokenGasLimitE400(UriNotFound o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InvalidPagination", new GenericType<InvalidPagination>() {
        });
        schemas.put("LimitGreaterThanAllowed", new GenericType<LimitGreaterThanAllowed>() {
        });
        schemas.put("UriNotFound", new GenericType<UriNotFound>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return EstimateTokenGasLimitE400.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InvalidPagination, LimitGreaterThanAllowed, UriNotFound
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InvalidPagination) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LimitGreaterThanAllowed) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UriNotFound) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InvalidPagination, LimitGreaterThanAllowed, UriNotFound");
    }

    /**
     * Get the actual instance, which can be the following:
     * InvalidPagination, LimitGreaterThanAllowed, UriNotFound
     *
     * @return The actual instance (InvalidPagination, LimitGreaterThanAllowed, UriNotFound)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidPagination`. If the actual instance is not `InvalidPagination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidPagination`
     * @throws ClassCastException if the instance is not `InvalidPagination`
     */
    public InvalidPagination getInvalidPagination() throws ClassCastException {
        return (InvalidPagination)super.getActualInstance();
    }

    /**
     * Get the actual instance of `LimitGreaterThanAllowed`. If the actual instance is not `LimitGreaterThanAllowed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LimitGreaterThanAllowed`
     * @throws ClassCastException if the instance is not `LimitGreaterThanAllowed`
     */
    public LimitGreaterThanAllowed getLimitGreaterThanAllowed() throws ClassCastException {
        return (LimitGreaterThanAllowed)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UriNotFound`. If the actual instance is not `UriNotFound`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UriNotFound`
     * @throws ClassCastException if the instance is not `UriNotFound`
     */
    public UriNotFound getUriNotFound() throws ClassCastException {
        return (UriNotFound)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EstimateTokenGasLimitE400
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with InvalidPagination
    try {
      InvalidPagination.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InvalidPagination failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LimitGreaterThanAllowed
    try {
      LimitGreaterThanAllowed.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LimitGreaterThanAllowed failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UriNotFound
    try {
      UriNotFound.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UriNotFound failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for EstimateTokenGasLimitE400 with oneOf schemas: InvalidPagination, LimitGreaterThanAllowed, UriNotFound. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of EstimateTokenGasLimitE400 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimateTokenGasLimitE400
  * @throws IOException if the JSON string is invalid with respect to EstimateTokenGasLimitE400
  */
  public static EstimateTokenGasLimitE400 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateTokenGasLimitE400.class);
  }

 /**
  * Convert an instance of EstimateTokenGasLimitE400 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

