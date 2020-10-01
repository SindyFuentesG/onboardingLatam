package com.example.onboarding.serialization;

import java.lang.reflect.Type;
import java.util.function.Function;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class NumberValueAdapter<T extends NumberSerializable>
    implements JsonSerializer<T>, JsonDeserializer<T> {

  private final Function<Number, T> functionFactory;

  public NumberValueAdapter(Function<Number, T> functionFactory) {
    this.functionFactory = functionFactory;
  }

  @Override
  public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    Number value = json.getAsNumber();
    return functionFactory.apply(value);
  }

  @Override
  public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
    Number value = src.valueOf();
    return new JsonPrimitive(value);
  }

}
