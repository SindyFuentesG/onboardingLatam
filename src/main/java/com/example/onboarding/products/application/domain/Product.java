package com.example.onboarding.products.application.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Product {

  Long id;
  String name;
  String description;
  Double price;
  Integer quantity;


}
