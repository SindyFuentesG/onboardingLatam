package com.example.onboarding.products.application.port.out;

import java.util.List;
import com.example.onboarding.products.application.domain.Product;

public interface FindAllProductsPort {

  List<Product> findAllProducts();

}
