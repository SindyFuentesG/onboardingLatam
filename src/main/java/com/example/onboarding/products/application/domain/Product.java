package com.example.onboarding.products.application.domain;

import com.google.common.base.Preconditions;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Product {

  Long id;
  Name name;
  Description description;
  Price price;
  Quantity quantity;

  public Product(Long id, Name name, Description description, Price price, Quantity quantity) {
    this.id = Preconditions.checkNotNull(id);
    this.name = Preconditions.checkNotNull(name);
    this.description = Preconditions.checkNotNull(description);
    this.price = Preconditions.checkNotNull(price);
    this.quantity = Preconditions.checkNotNull(quantity);
  }


}
