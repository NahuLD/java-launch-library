package me.nahu.launchlibrary.util.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDeserializer implements JsonDeserializer<Date> {
    private static final DateFormat[] DATE_FORMATS = new DateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd"),
            DateFormat.getDateInstance(DateFormat.FULL)
    };

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        for (var formatter : DATE_FORMATS) {
            try {
                return formatter.parse(json.getAsString());
            } catch (ParseException ignored) { }
        }
        return null;
    }
}
