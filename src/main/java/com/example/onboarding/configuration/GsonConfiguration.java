package com.example.onboarding.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.onboarding.products.application.domain.Description;
import com.example.onboarding.products.application.domain.Name;
import com.example.onboarding.products.application.domain.Price;
import com.example.onboarding.products.application.domain.Quantity;
import com.example.onboarding.serialization.NumberValueAdapter;
import com.example.onboarding.serialization.StringValueAdapter;
import com.example.onboarding.serialization.TryAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.vavr.control.Try;

@Configuration
public class GsonConfiguration {

  @Bean
  public Gson gson() {
    return new GsonBuilder().registerTypeAdapter(Name.class, new StringValueAdapter<>(Name::of))
        .registerTypeAdapter(Description.class, new StringValueAdapter<>(Description::of))
        .registerTypeAdapter(Price.class, new NumberValueAdapter<>(Price::fromNumber))
        .registerTypeAdapter(Quantity.class, new NumberValueAdapter<>(Quantity::fromNumber))
        .registerTypeAdapter(Try.class, new TryAdapter<>()).create();

  }
}
