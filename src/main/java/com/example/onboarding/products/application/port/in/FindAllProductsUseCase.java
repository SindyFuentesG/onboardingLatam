package com.example.onboarding.products.application.port.in;

import java.util.List;
import com.example.onboarding.products.application.domain.Product;

public interface FindAllProductsUseCase {

  List<Product> findAllProducts();

}
