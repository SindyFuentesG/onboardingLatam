package com.example.onboarding.products.application.service;

import org.springframework.stereotype.Service;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.domain.ProductNotCreated;
import com.example.onboarding.products.application.port.in.CreateProductUseCase;
import com.example.onboarding.products.application.port.out.CreateProductPort;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateProductService implements CreateProductUseCase {

  private final CreateProductPort createProductPort;

  @Override
  public Try<Product> createProduct(CreateProductCommand command) {
    ProductNotCreated product = command.getProduct();
    return createProductPort.createProduct(product);
  }

}
