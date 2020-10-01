package com.example.onboarding.serialization;

import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.vavr.control.Try;

public class TryAdapter<T> implements JsonSerializer<Try<T>> {

  @Override
  public JsonElement serialize(Try<T> src, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject response = new JsonObject();
    if (src.isSuccess()) {
      response.add("data", context.serialize(src.get()));
    } else {
      Throwable cause = src.getCause();
      response.add("error", new JsonPrimitive(cause.getMessage()));
    }
    return response;
  }

}
