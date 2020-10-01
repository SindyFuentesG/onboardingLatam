package com.example.onboarding.products.application.domain;

import com.google.common.base.Preconditions;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductNotCreated {

  Name name;
  Description description;
  Price price;
  Quantity quantity;

  public ProductNotCreated(Name name, Description description, Price price, Quantity quantity) {
    this.name = Preconditions.checkNotNull(name);
    this.description = Preconditions.checkNotNull(description);
    this.price = Preconditions.checkNotNull(price);
    this.quantity = Preconditions.checkNotNull(quantity);
  }
}
