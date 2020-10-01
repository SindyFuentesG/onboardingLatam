package com.example.onboarding.products.application.port.in;

import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.domain.ProductNotCreated;
import io.vavr.control.Try;
import lombok.Value;

public interface CreateProductUseCase {

  Try<Product> createProduct(CreateProductCommand command);

  @Value(staticConstructor = "of")
  class CreateProductCommand {
    ProductNotCreated product;
  }

}
