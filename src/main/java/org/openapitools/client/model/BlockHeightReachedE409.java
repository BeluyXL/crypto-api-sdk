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
import org.openapitools.client.model.AlreadyExists;
import org.openapitools.client.model.BannedIpAddressDetailsInner;
import org.openapitools.client.model.InvalidData;

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
public class BlockHeightReachedE409 extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BlockHeightReachedE409.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BlockHeightReachedE409.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BlockHeightReachedE409' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AlreadyExists> adapterAlreadyExists = gson.getDelegateAdapter(this, TypeToken.get(AlreadyExists.class));
            final TypeAdapter<InvalidData> adapterInvalidData = gson.getDelegateAdapter(this, TypeToken.get(InvalidData.class));

            return (TypeAdapter<T>) new TypeAdapter<BlockHeightReachedE409>() {
                @Override
                public void write(JsonWriter out, BlockHeightReachedE409 value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AlreadyExists`
                    if (value.getActualInstance() instanceof AlreadyExists) {
                        JsonObject obj = adapterAlreadyExists.toJsonTree((AlreadyExists)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidData`
                    if (value.getActualInstance() instanceof InvalidData) {
                        JsonObject obj = adapterInvalidData.toJsonTree((InvalidData)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AlreadyExists, InvalidData");
                }

                @Override
                public BlockHeightReachedE409 read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AlreadyExists
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AlreadyExists.validateJsonObject(jsonObject);
                        actualAdapter = adapterAlreadyExists;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AlreadyExists'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AlreadyExists failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AlreadyExists'", e);
                    }

                    // deserialize InvalidData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidData.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InvalidData failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InvalidData'", e);
                    }

                    if (match == 1) {
                        BlockHeightReachedE409 ret = new BlockHeightReachedE409();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for BlockHeightReachedE409: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public BlockHeightReachedE409() {
        super("oneOf", Boolean.FALSE);
    }

    public BlockHeightReachedE409(AlreadyExists o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BlockHeightReachedE409(InvalidData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlreadyExists", new GenericType<AlreadyExists>() {
        });
        schemas.put("InvalidData", new GenericType<InvalidData>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return BlockHeightReachedE409.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AlreadyExists, InvalidData
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AlreadyExists) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidData) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AlreadyExists, InvalidData");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlreadyExists, InvalidData
     *
     * @return The actual instance (AlreadyExists, InvalidData)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlreadyExists`. If the actual instance is not `AlreadyExists`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlreadyExists`
     * @throws ClassCastException if the instance is not `AlreadyExists`
     */
    public AlreadyExists getAlreadyExists() throws ClassCastException {
        return (AlreadyExists)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidData`. If the actual instance is not `InvalidData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidData`
     * @throws ClassCastException if the instance is not `InvalidData`
     */
    public InvalidData getInvalidData() throws ClassCastException {
        return (InvalidData)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlockHeightReachedE409
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AlreadyExists
    try {
      AlreadyExists.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AlreadyExists failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InvalidData
    try {
      InvalidData.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InvalidData failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for BlockHeightReachedE409 with oneOf schemas: AlreadyExists, InvalidData. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of BlockHeightReachedE409 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockHeightReachedE409
  * @throws IOException if the JSON string is invalid with respect to BlockHeightReachedE409
  */
  public static BlockHeightReachedE409 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockHeightReachedE409.class);
  }

 /**
  * Convert an instance of BlockHeightReachedE409 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

