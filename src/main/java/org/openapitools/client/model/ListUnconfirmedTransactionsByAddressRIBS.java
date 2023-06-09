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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVinInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVoutInner;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSBSCGasPrice;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSZVJoinSplitInner;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSB;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSBC;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSBSC;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSD;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSD2;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSE;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSEC;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSECFee;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSL;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSZ;

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
public class ListUnconfirmedTransactionsByAddressRIBS extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListUnconfirmedTransactionsByAddressRIBS.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListUnconfirmedTransactionsByAddressRIBS.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListUnconfirmedTransactionsByAddressRIBS' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSB> adapterListUnconfirmedTransactionsByAddressRIBSB = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSB.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSBC> adapterListUnconfirmedTransactionsByAddressRIBSBC = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSBC.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSBSC> adapterListUnconfirmedTransactionsByAddressRIBSBSC = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSBSC.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSD> adapterListUnconfirmedTransactionsByAddressRIBSD = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSD.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSD2> adapterListUnconfirmedTransactionsByAddressRIBSD2 = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSD2.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSE> adapterListUnconfirmedTransactionsByAddressRIBSE = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSE.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSEC> adapterListUnconfirmedTransactionsByAddressRIBSEC = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSEC.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSL> adapterListUnconfirmedTransactionsByAddressRIBSL = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSL.class));
            final TypeAdapter<ListUnconfirmedTransactionsByAddressRIBSZ> adapterListUnconfirmedTransactionsByAddressRIBSZ = gson.getDelegateAdapter(this, TypeToken.get(ListUnconfirmedTransactionsByAddressRIBSZ.class));

            return (TypeAdapter<T>) new TypeAdapter<ListUnconfirmedTransactionsByAddressRIBS>() {
                @Override
                public void write(JsonWriter out, ListUnconfirmedTransactionsByAddressRIBS value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSB`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSB) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSB.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSB)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSBC`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSBC) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSBC.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSBC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSBSC`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSBSC) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSBSC.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSBSC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSD`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSD) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSD.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSD2`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSD2) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSD2.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSD2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSE`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSE) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSE.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSE)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSEC`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSEC) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSEC.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSEC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSL`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSL) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSL.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSL)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListUnconfirmedTransactionsByAddressRIBSZ`
                    if (value.getActualInstance() instanceof ListUnconfirmedTransactionsByAddressRIBSZ) {
                        JsonObject obj = adapterListUnconfirmedTransactionsByAddressRIBSZ.toJsonTree((ListUnconfirmedTransactionsByAddressRIBSZ)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ");
                }

                @Override
                public ListUnconfirmedTransactionsByAddressRIBS read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSB
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSB.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSB;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSB'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSB failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSB'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSBC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSBC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSBC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSBC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSBC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSBC'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSBSC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSBSC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSBSC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSBSC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSBSC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSBSC'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSD.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSD failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSD'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSD2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSD2.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSD2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSD2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSD2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSD2'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSE
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSE.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSE;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSE'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSE failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSE'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSEC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSEC.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSEC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSEC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSEC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSEC'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSL
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSL.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSL;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSL'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSL failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSL'", e);
                    }

                    // deserialize ListUnconfirmedTransactionsByAddressRIBSZ
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListUnconfirmedTransactionsByAddressRIBSZ.validateJsonObject(jsonObject);
                        actualAdapter = adapterListUnconfirmedTransactionsByAddressRIBSZ;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ListUnconfirmedTransactionsByAddressRIBSZ'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSZ failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ListUnconfirmedTransactionsByAddressRIBSZ'", e);
                    }

                    if (match == 1) {
                        ListUnconfirmedTransactionsByAddressRIBS ret = new ListUnconfirmedTransactionsByAddressRIBS();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ListUnconfirmedTransactionsByAddressRIBS: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ListUnconfirmedTransactionsByAddressRIBS() {
        super("oneOf", Boolean.FALSE);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSBC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSBSC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSD2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSE o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSEC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListUnconfirmedTransactionsByAddressRIBS(ListUnconfirmedTransactionsByAddressRIBSZ o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSB", new GenericType<ListUnconfirmedTransactionsByAddressRIBSB>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSBC", new GenericType<ListUnconfirmedTransactionsByAddressRIBSBC>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSBSC", new GenericType<ListUnconfirmedTransactionsByAddressRIBSBSC>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSD", new GenericType<ListUnconfirmedTransactionsByAddressRIBSD>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSD2", new GenericType<ListUnconfirmedTransactionsByAddressRIBSD2>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSE", new GenericType<ListUnconfirmedTransactionsByAddressRIBSE>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSEC", new GenericType<ListUnconfirmedTransactionsByAddressRIBSEC>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSL", new GenericType<ListUnconfirmedTransactionsByAddressRIBSL>() {
        });
        schemas.put("ListUnconfirmedTransactionsByAddressRIBSZ", new GenericType<ListUnconfirmedTransactionsByAddressRIBSZ>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListUnconfirmedTransactionsByAddressRIBS.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSBC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSBSC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSD) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSD2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSE) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSEC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSL) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListUnconfirmedTransactionsByAddressRIBSZ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ");
    }

    /**
     * Get the actual instance, which can be the following:
     * ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ
     *
     * @return The actual instance (ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSB`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSB`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSB`
     */
    public ListUnconfirmedTransactionsByAddressRIBSB getListUnconfirmedTransactionsByAddressRIBSB() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSB)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSBC`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSBC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSBC`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSBC`
     */
    public ListUnconfirmedTransactionsByAddressRIBSBC getListUnconfirmedTransactionsByAddressRIBSBC() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSBC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSBSC`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSBSC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSBSC`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSBSC`
     */
    public ListUnconfirmedTransactionsByAddressRIBSBSC getListUnconfirmedTransactionsByAddressRIBSBSC() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSBSC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSD`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSD`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSD`
     */
    public ListUnconfirmedTransactionsByAddressRIBSD getListUnconfirmedTransactionsByAddressRIBSD() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSD)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSD2`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSD2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSD2`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSD2`
     */
    public ListUnconfirmedTransactionsByAddressRIBSD2 getListUnconfirmedTransactionsByAddressRIBSD2() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSD2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSE`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSE`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSE`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSE`
     */
    public ListUnconfirmedTransactionsByAddressRIBSE getListUnconfirmedTransactionsByAddressRIBSE() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSE)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSEC`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSEC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSEC`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSEC`
     */
    public ListUnconfirmedTransactionsByAddressRIBSEC getListUnconfirmedTransactionsByAddressRIBSEC() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSEC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSL`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSL`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSL`
     */
    public ListUnconfirmedTransactionsByAddressRIBSL getListUnconfirmedTransactionsByAddressRIBSL() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSL)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListUnconfirmedTransactionsByAddressRIBSZ`. If the actual instance is not `ListUnconfirmedTransactionsByAddressRIBSZ`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListUnconfirmedTransactionsByAddressRIBSZ`
     * @throws ClassCastException if the instance is not `ListUnconfirmedTransactionsByAddressRIBSZ`
     */
    public ListUnconfirmedTransactionsByAddressRIBSZ getListUnconfirmedTransactionsByAddressRIBSZ() throws ClassCastException {
        return (ListUnconfirmedTransactionsByAddressRIBSZ)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListUnconfirmedTransactionsByAddressRIBS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSB
    try {
      ListUnconfirmedTransactionsByAddressRIBSB.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSB failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSBC
    try {
      ListUnconfirmedTransactionsByAddressRIBSBC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSBC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSBSC
    try {
      ListUnconfirmedTransactionsByAddressRIBSBSC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSBSC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSD
    try {
      ListUnconfirmedTransactionsByAddressRIBSD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSD failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSD2
    try {
      ListUnconfirmedTransactionsByAddressRIBSD2.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSD2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSE
    try {
      ListUnconfirmedTransactionsByAddressRIBSE.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSE failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSEC
    try {
      ListUnconfirmedTransactionsByAddressRIBSEC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSEC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSL
    try {
      ListUnconfirmedTransactionsByAddressRIBSL.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSL failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ListUnconfirmedTransactionsByAddressRIBSZ
    try {
      ListUnconfirmedTransactionsByAddressRIBSZ.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ListUnconfirmedTransactionsByAddressRIBSZ failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ListUnconfirmedTransactionsByAddressRIBS with oneOf schemas: ListUnconfirmedTransactionsByAddressRIBSB, ListUnconfirmedTransactionsByAddressRIBSBC, ListUnconfirmedTransactionsByAddressRIBSBSC, ListUnconfirmedTransactionsByAddressRIBSD, ListUnconfirmedTransactionsByAddressRIBSD2, ListUnconfirmedTransactionsByAddressRIBSE, ListUnconfirmedTransactionsByAddressRIBSEC, ListUnconfirmedTransactionsByAddressRIBSL, ListUnconfirmedTransactionsByAddressRIBSZ. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ListUnconfirmedTransactionsByAddressRIBS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListUnconfirmedTransactionsByAddressRIBS
  * @throws IOException if the JSON string is invalid with respect to ListUnconfirmedTransactionsByAddressRIBS
  */
  public static ListUnconfirmedTransactionsByAddressRIBS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListUnconfirmedTransactionsByAddressRIBS.class);
  }

 /**
  * Convert an instance of ListUnconfirmedTransactionsByAddressRIBS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

