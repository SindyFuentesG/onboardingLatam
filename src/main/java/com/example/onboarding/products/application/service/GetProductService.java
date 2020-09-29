package com.example.onboarding.products.application.service;

import org.springframework.stereotype.Service;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.port.in.GetProductUseCase;

@Service
public class GetProductService implements GetProductUseCase {

  @Override
  public Product getProduct() {
    return Product.builder().name("TV").description("Smart TV").price(150000.98).quantity(100)
        .id(1L).build();
  }

}
