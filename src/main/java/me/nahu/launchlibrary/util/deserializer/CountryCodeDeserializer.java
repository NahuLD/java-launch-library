package me.nahu.launchlibrary.util.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.neovisionaries.i18n.CountryCode;

import java.lang.reflect.Type;

public class CountryCodeDeserializer implements JsonDeserializer<CountryCode> {
    @Override
    public CountryCode deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return CountryCode.getByAlpha3Code(json.getAsString());
    }
}
