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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSB;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBC;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBSC;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBSCGasPrice;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSD;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSD2;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSE;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSEC;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSL;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZ;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVJoinSplitInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedOutputInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVShieldedSpendInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVinInner;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSZVoutInner;

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
public class GetTransactionDetailsByTransactionIDRIBS extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetTransactionDetailsByTransactionIDRIBS.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetTransactionDetailsByTransactionIDRIBS.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetTransactionDetailsByTransactionIDRIBS' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSB> adapterGetTransactionDetailsByTransactionIDRIBSB = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSB.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBC> adapterGetTransactionDetailsByTransactionIDRIBSBC = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSBC.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSBSC> adapterGetTransactionDetailsByTransactionIDRIBSBSC = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSBSC.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSD> adapterGetTransactionDetailsByTransactionIDRIBSD = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSD.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSD2> adapterGetTransactionDetailsByTransactionIDRIBSD2 = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSD2.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSE> adapterGetTransactionDetailsByTransactionIDRIBSE = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSE.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSEC> adapterGetTransactionDetailsByTransactionIDRIBSEC = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSEC.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSL> adapterGetTransactionDetailsByTransactionIDRIBSL = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSL.class));
            final TypeAdapter<GetTransactionDetailsByTransactionIDRIBSZ> adapterGetTransactionDetailsByTransactionIDRIBSZ = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionDetailsByTransactionIDRIBSZ.class));

            return (TypeAdapter<T>) new TypeAdapter<GetTransactionDetailsByTransactionIDRIBS>() {
                @Override
                public void write(JsonWriter out, GetTransactionDetailsByTransactionIDRIBS value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSB`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSB) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSB.toJsonTree((GetTransactionDetailsByTransactionIDRIBSB)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSBC`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSBC) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSBC.toJsonTree((GetTransactionDetailsByTransactionIDRIBSBC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSBSC`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSBSC) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSBSC.toJsonTree((GetTransactionDetailsByTransactionIDRIBSBSC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSD`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSD) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSD.toJsonTree((GetTransactionDetailsByTransactionIDRIBSD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSD2`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSD2) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSD2.toJsonTree((GetTransactionDetailsByTransactionIDRIBSD2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSE`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSE) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSE.toJsonTree((GetTransactionDetailsByTransactionIDRIBSE)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSEC`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSEC) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSEC.toJsonTree((GetTransactionDetailsByTransactionIDRIBSEC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSL`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSL) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSL.toJsonTree((GetTransactionDetailsByTransactionIDRIBSL)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetTransactionDetailsByTransactionIDRIBSZ`
                    if (value.getActualInstance() instanceof GetTransactionDetailsByTransactionIDRIBSZ) {
                        JsonObject obj = adapterGetTransactionDetailsByTransactionIDRIBSZ.toJsonTree((GetTransactionDetailsByTransactionIDRIBSZ)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ");
                }

                @Override
                public GetTransactionDetailsByTransactionIDRIBS read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetTransactionDetailsByTransactionIDRIBSB
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSB.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSB;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSB'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSB failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSB'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSBC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSBC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSBC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSBC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSBC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSBC'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSBSC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSBSC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSBSC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSBSC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSBSC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSBSC'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSD.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSD failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSD'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSD2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSD2.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSD2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSD2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSD2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSD2'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSE
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSE.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSE;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSE'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSE failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSE'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSEC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSEC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSEC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSEC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSEC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSEC'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSL
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSL.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSL;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSL'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSL failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSL'", e);
                    }

                    // deserialize GetTransactionDetailsByTransactionIDRIBSZ
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetTransactionDetailsByTransactionIDRIBSZ.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetTransactionDetailsByTransactionIDRIBSZ;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetTransactionDetailsByTransactionIDRIBSZ'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSZ failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetTransactionDetailsByTransactionIDRIBSZ'", e);
                    }

                    if (match == 1) {
                        GetTransactionDetailsByTransactionIDRIBS ret = new GetTransactionDetailsByTransactionIDRIBS();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetTransactionDetailsByTransactionIDRIBS: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetTransactionDetailsByTransactionIDRIBS() {
        super("oneOf", Boolean.FALSE);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSBC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSBSC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSD2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSE o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSEC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetTransactionDetailsByTransactionIDRIBS(GetTransactionDetailsByTransactionIDRIBSZ o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetTransactionDetailsByTransactionIDRIBSB", new GenericType<GetTransactionDetailsByTransactionIDRIBSB>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSBC", new GenericType<GetTransactionDetailsByTransactionIDRIBSBC>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSBSC", new GenericType<GetTransactionDetailsByTransactionIDRIBSBSC>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSD", new GenericType<GetTransactionDetailsByTransactionIDRIBSD>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSD2", new GenericType<GetTransactionDetailsByTransactionIDRIBSD2>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSE", new GenericType<GetTransactionDetailsByTransactionIDRIBSE>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSEC", new GenericType<GetTransactionDetailsByTransactionIDRIBSEC>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSL", new GenericType<GetTransactionDetailsByTransactionIDRIBSL>() {
        });
        schemas.put("GetTransactionDetailsByTransactionIDRIBSZ", new GenericType<GetTransactionDetailsByTransactionIDRIBSZ>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetTransactionDetailsByTransactionIDRIBS.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSBC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSBSC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSD) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSD2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSE) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSEC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSL) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetTransactionDetailsByTransactionIDRIBSZ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ
     *
     * @return The actual instance (GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSB`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSB`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSB`
     */
    public GetTransactionDetailsByTransactionIDRIBSB getGetTransactionDetailsByTransactionIDRIBSB() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSB)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSBC`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSBC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSBC`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSBC`
     */
    public GetTransactionDetailsByTransactionIDRIBSBC getGetTransactionDetailsByTransactionIDRIBSBC() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSBC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSBSC`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSBSC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSBSC`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSBSC`
     */
    public GetTransactionDetailsByTransactionIDRIBSBSC getGetTransactionDetailsByTransactionIDRIBSBSC() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSBSC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSD`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSD`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSD`
     */
    public GetTransactionDetailsByTransactionIDRIBSD getGetTransactionDetailsByTransactionIDRIBSD() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSD)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSD2`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSD2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSD2`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSD2`
     */
    public GetTransactionDetailsByTransactionIDRIBSD2 getGetTransactionDetailsByTransactionIDRIBSD2() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSD2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSE`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSE`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSE`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSE`
     */
    public GetTransactionDetailsByTransactionIDRIBSE getGetTransactionDetailsByTransactionIDRIBSE() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSE)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSEC`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSEC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSEC`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSEC`
     */
    public GetTransactionDetailsByTransactionIDRIBSEC getGetTransactionDetailsByTransactionIDRIBSEC() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSEC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSL`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSL`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSL`
     */
    public GetTransactionDetailsByTransactionIDRIBSL getGetTransactionDetailsByTransactionIDRIBSL() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSL)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetTransactionDetailsByTransactionIDRIBSZ`. If the actual instance is not `GetTransactionDetailsByTransactionIDRIBSZ`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetTransactionDetailsByTransactionIDRIBSZ`
     * @throws ClassCastException if the instance is not `GetTransactionDetailsByTransactionIDRIBSZ`
     */
    public GetTransactionDetailsByTransactionIDRIBSZ getGetTransactionDetailsByTransactionIDRIBSZ() throws ClassCastException {
        return (GetTransactionDetailsByTransactionIDRIBSZ)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionDetailsByTransactionIDRIBS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSB
    try {
      GetTransactionDetailsByTransactionIDRIBSB.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSB failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSBC
    try {
      GetTransactionDetailsByTransactionIDRIBSBC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSBC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSBSC
    try {
      GetTransactionDetailsByTransactionIDRIBSBSC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSBSC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSD
    try {
      GetTransactionDetailsByTransactionIDRIBSD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSD failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSD2
    try {
      GetTransactionDetailsByTransactionIDRIBSD2.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSD2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSE
    try {
      GetTransactionDetailsByTransactionIDRIBSE.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSE failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSEC
    try {
      GetTransactionDetailsByTransactionIDRIBSEC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSEC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSL
    try {
      GetTransactionDetailsByTransactionIDRIBSL.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSL failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetTransactionDetailsByTransactionIDRIBSZ
    try {
      GetTransactionDetailsByTransactionIDRIBSZ.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetTransactionDetailsByTransactionIDRIBSZ failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetTransactionDetailsByTransactionIDRIBS with oneOf schemas: GetTransactionDetailsByTransactionIDRIBSB, GetTransactionDetailsByTransactionIDRIBSBC, GetTransactionDetailsByTransactionIDRIBSBSC, GetTransactionDetailsByTransactionIDRIBSD, GetTransactionDetailsByTransactionIDRIBSD2, GetTransactionDetailsByTransactionIDRIBSE, GetTransactionDetailsByTransactionIDRIBSEC, GetTransactionDetailsByTransactionIDRIBSL, GetTransactionDetailsByTransactionIDRIBSZ. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetTransactionDetailsByTransactionIDRIBS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionDetailsByTransactionIDRIBS
  * @throws IOException if the JSON string is invalid with respect to GetTransactionDetailsByTransactionIDRIBS
  */
  public static GetTransactionDetailsByTransactionIDRIBS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionDetailsByTransactionIDRIBS.class);
  }

 /**
  * Convert an instance of GetTransactionDetailsByTransactionIDRIBS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

