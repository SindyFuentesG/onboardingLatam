package com.example.onboarding.products.application.domain;

import com.example.onboarding.serialization.NumberSerializable;
import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Quantity implements NumberSerializable {

  Integer value;

  public static Quantity fromNumber(Number number) {
    return new Quantity(number.intValue());
  }

  private Quantity(Integer value) {
    Preconditions.checkNotNull(value, "Price can not be null");
    Preconditions.checkArgument(value > 0, "Quantity must be higher than zero");
    this.value = value;
  }

  @Override
  public Number valueOf() {
    return value;
  }



}
