package com.example.onboarding.products.application.domain;

import org.apache.commons.lang3.StringUtils;
import com.example.onboarding.serialization.StringSerializable;
import com.google.common.base.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class Name implements StringSerializable {

  String value;

  private Name(String value) {
    Preconditions.checkNotNull(value, "Name can not be null");
    Preconditions.checkArgument(StringUtils.isNotBlank(value), "Name can't be blank");
    Preconditions.checkArgument(StringUtils.length(value) <= 100,
        "Name can't have more than 100 characters");
    this.value = value;
  }

  @Override
  public String valueOf() {
    return value;
  }

}
