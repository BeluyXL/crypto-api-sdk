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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVoutInner;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSB;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSBC;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSBSC;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSBSCGasPrice;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSE;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSEC;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSL;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSZ;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSZVJoinSplitInner;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSZVinInner;

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
public class ListTransactionsByBlockHashRIBS extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListTransactionsByBlockHashRIBS.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListTransactionsByBlockHashRIBS.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListTransactionsByBlockHashRIBS' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListTransactionsByBlockHashRIBSB> adapterListTransactionsByBlockHashRIBSB = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSB.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSBC> adapterListTransactionsByBlockHashRIBSBC = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSBC.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSBSC> adapterListTransactionsByBlockHashRIBSBSC = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSBSC.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSD> adapterListTransactionsByBlockHashRIBSD = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSD.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSD2> adapterListTransactionsByBlockHashRIBSD2 = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSD2.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSE> adapterListTransactionsByBlockHashRIBSE = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSE.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSEC> adapterListTransactionsByBlockHashRIBSEC = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSEC.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSL> adapterListTransactionsByBlockHashRIBSL = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSL.class));
            final TypeAdapter<ListTransactionsByBlockHashRIBSZ> adapterListTransactionsByBlockHashRIBSZ = gson.getDelegateAdapter(this, TypeToken.get(ListTransactionsByBlockHashRIBSZ.class));

            return (TypeAdapter<T>) new TypeAdapter<ListTransactionsByBlockHashRIBS>() {
                @Override
                public void write(JsonWriter out, ListTransactionsByBlockHashRIBS value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSB`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSB) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSB.toJsonTree((ListTransactionsByBlockHashRIBSB)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSBC`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSBC) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSBC.toJsonTree((ListTransactionsByBlockHashRIBSBC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSBSC`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSBSC) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSBSC.toJsonTree((ListTransactionsByBlockHashRIBSBSC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSD`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSD) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSD.toJsonTree((ListTransactionsByBlockHashRIBSD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSD2`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSD2) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSD2.toJsonTree((ListTransactionsByBlockHashRIBSD2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSE`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSE) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSE.toJsonTree((ListTransactionsByBlockHashRIBSE)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSEC`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSEC) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSEC.toJsonTree((ListTransactionsByBlockHashRIBSEC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSL`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSL) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSL.toJsonTree((ListTransactionsByBlockHashRIBSL)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListTransactionsByBlockHashRIBSZ`
                    if (value.getActualInstance() instanceof ListTransactionsByBlockHashRIBSZ) {
                        JsonObject obj = adapterListTransactionsByBlockHashRIBSZ.toJsonTree((ListTransactionsByBlockHashRIBSZ)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ");
                }

                @Override
                public ListTransactionsByBlockHashRIBS read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ListTransactionsByBlockHashRIBSB
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSB.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSB;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSB'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSB failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSB'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSBC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSBC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSBC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSBC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSBC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSBC'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSBSC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSBSC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSBSC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSBSC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSBSC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSBSC'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSD.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSD failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSD'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSD2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSD2.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSD2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSD2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSD2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSD2'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSE
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSE.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSE;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSE'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSE failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSE'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSEC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSEC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSEC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSEC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSEC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSEC'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSL
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSL.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSL;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSL'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSL failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSL'", e);
                    }

                    // deserialize ListTransactionsByBlockHashRIBSZ
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListTransactionsByBlockHashRIBSZ.validateJsonObject(jsonObject);
                        actualAdapter = adapterListTransactionsByBlockHashRIBSZ;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListTransactionsByBlockHashRIBSZ'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSZ failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListTransactionsByBlockHashRIBSZ'", e);
                    }

                    if (match == 1) {
                        ListTransactionsByBlockHashRIBS ret = new ListTransactionsByBlockHashRIBS();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ListTransactionsByBlockHashRIBS: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ListTransactionsByBlockHashRIBS() {
        super("oneOf", Boolean.FALSE);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSBC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSBSC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSD2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSE o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSEC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListTransactionsByBlockHashRIBS(ListTransactionsByBlockHashRIBSZ o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ListTransactionsByBlockHashRIBSB", new GenericType<ListTransactionsByBlockHashRIBSB>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSBC", new GenericType<ListTransactionsByBlockHashRIBSBC>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSBSC", new GenericType<ListTransactionsByBlockHashRIBSBSC>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSD", new GenericType<ListTransactionsByBlockHashRIBSD>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSD2", new GenericType<ListTransactionsByBlockHashRIBSD2>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSE", new GenericType<ListTransactionsByBlockHashRIBSE>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSEC", new GenericType<ListTransactionsByBlockHashRIBSEC>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSL", new GenericType<ListTransactionsByBlockHashRIBSL>() {
        });
        schemas.put("ListTransactionsByBlockHashRIBSZ", new GenericType<ListTransactionsByBlockHashRIBSZ>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListTransactionsByBlockHashRIBS.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ListTransactionsByBlockHashRIBSB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSBC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSBSC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSD) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSD2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSE) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSEC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSL) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListTransactionsByBlockHashRIBSZ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ");
    }

    /**
     * Get the actual instance, which can be the following:
     * ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ
     *
     * @return The actual instance (ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSB`. If the actual instance is not `ListTransactionsByBlockHashRIBSB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSB`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSB`
     */
    public ListTransactionsByBlockHashRIBSB getListTransactionsByBlockHashRIBSB() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSB)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSBC`. If the actual instance is not `ListTransactionsByBlockHashRIBSBC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSBC`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSBC`
     */
    public ListTransactionsByBlockHashRIBSBC getListTransactionsByBlockHashRIBSBC() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSBC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSBSC`. If the actual instance is not `ListTransactionsByBlockHashRIBSBSC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSBSC`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSBSC`
     */
    public ListTransactionsByBlockHashRIBSBSC getListTransactionsByBlockHashRIBSBSC() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSBSC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSD`. If the actual instance is not `ListTransactionsByBlockHashRIBSD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSD`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSD`
     */
    public ListTransactionsByBlockHashRIBSD getListTransactionsByBlockHashRIBSD() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSD)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSD2`. If the actual instance is not `ListTransactionsByBlockHashRIBSD2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSD2`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSD2`
     */
    public ListTransactionsByBlockHashRIBSD2 getListTransactionsByBlockHashRIBSD2() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSD2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSE`. If the actual instance is not `ListTransactionsByBlockHashRIBSE`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSE`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSE`
     */
    public ListTransactionsByBlockHashRIBSE getListTransactionsByBlockHashRIBSE() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSE)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSEC`. If the actual instance is not `ListTransactionsByBlockHashRIBSEC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSEC`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSEC`
     */
    public ListTransactionsByBlockHashRIBSEC getListTransactionsByBlockHashRIBSEC() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSEC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSL`. If the actual instance is not `ListTransactionsByBlockHashRIBSL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSL`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSL`
     */
    public ListTransactionsByBlockHashRIBSL getListTransactionsByBlockHashRIBSL() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSL)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListTransactionsByBlockHashRIBSZ`. If the actual instance is not `ListTransactionsByBlockHashRIBSZ`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListTransactionsByBlockHashRIBSZ`
     * @throws ClassCastException if the instance is not `ListTransactionsByBlockHashRIBSZ`
     */
    public ListTransactionsByBlockHashRIBSZ getListTransactionsByBlockHashRIBSZ() throws ClassCastException {
        return (ListTransactionsByBlockHashRIBSZ)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListTransactionsByBlockHashRIBS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ListTransactionsByBlockHashRIBSB
    try {
      ListTransactionsByBlockHashRIBSB.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSB failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSBC
    try {
      ListTransactionsByBlockHashRIBSBC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSBC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSBSC
    try {
      ListTransactionsByBlockHashRIBSBSC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSBSC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSD
    try {
      ListTransactionsByBlockHashRIBSD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSD failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSD2
    try {
      ListTransactionsByBlockHashRIBSD2.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSD2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSE
    try {
      ListTransactionsByBlockHashRIBSE.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSE failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSEC
    try {
      ListTransactionsByBlockHashRIBSEC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSEC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSL
    try {
      ListTransactionsByBlockHashRIBSL.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSL failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListTransactionsByBlockHashRIBSZ
    try {
      ListTransactionsByBlockHashRIBSZ.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListTransactionsByBlockHashRIBSZ failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ListTransactionsByBlockHashRIBS with oneOf schemas: ListTransactionsByBlockHashRIBSB, ListTransactionsByBlockHashRIBSBC, ListTransactionsByBlockHashRIBSBSC, ListTransactionsByBlockHashRIBSD, ListTransactionsByBlockHashRIBSD2, ListTransactionsByBlockHashRIBSE, ListTransactionsByBlockHashRIBSEC, ListTransactionsByBlockHashRIBSL, ListTransactionsByBlockHashRIBSZ. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ListTransactionsByBlockHashRIBS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListTransactionsByBlockHashRIBS
  * @throws IOException if the JSON string is invalid with respect to ListTransactionsByBlockHashRIBS
  */
  public static ListTransactionsByBlockHashRIBS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTransactionsByBlockHashRIBS.class);
  }

 /**
  * Convert an instance of ListTransactionsByBlockHashRIBS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

