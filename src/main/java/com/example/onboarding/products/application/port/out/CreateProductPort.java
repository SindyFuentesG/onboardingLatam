package com.example.onboarding.products.application.port.out;

import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.domain.ProductNotCreated;
import io.vavr.control.Try;

public interface CreateProductPort {

  Try<Product> createProduct(ProductNotCreated product);

}
