package com.example.onboarding.products.application.domain;

import com.example.onboarding.serialization.NumberSerializable;
import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Price implements NumberSerializable {

  Double value;

  public static Price fromNumber(Number number) {
    return new Price(number.doubleValue());
  }

  private Price(Double value) {
    Preconditions.checkNotNull(value, "Price can not be null");
    Preconditions.checkArgument(value >= 0, "Price must be higher than zero");
    this.value = value;
  }

  @Override
  public Number valueOf() {
    return value;
  }

}
