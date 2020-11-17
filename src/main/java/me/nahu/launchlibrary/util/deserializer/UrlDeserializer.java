package me.nahu.launchlibrary.util.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDeserializer implements JsonDeserializer<URL> {
    @Override
    public URL deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return new URL(json.getAsString());
        } catch (MalformedURLException exception) {
            return null;
        }
    }
}
