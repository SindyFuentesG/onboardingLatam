package com.example.onboarding.products.application.domain;

import com.example.onboarding.serialization.StringSerializable;
import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Description implements StringSerializable {

  String value;

  private Description(String value) {
    Preconditions.checkNotNull(value, "Description can not be null");
    this.value = value;
  }

  @Override
  public String valueOf() {
    return value;
  }

}
