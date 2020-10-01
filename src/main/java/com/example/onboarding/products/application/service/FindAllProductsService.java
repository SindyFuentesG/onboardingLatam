package com.example.onboarding.products.application.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.port.in.FindAllProductsUseCase;
import com.example.onboarding.products.application.port.out.FindAllProductsPort;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindAllProductsService implements FindAllProductsUseCase {

  private final FindAllProductsPort findAllProductsPort;

  @Override
  public List<Product> findAllProducts() {
    return findAllProductsPort.findAllProducts();
  }

  // @Override
  // public Product getProduct() {
  // return Product.builder().name("TV").description("Smart TV").price(150000.98).quantity(100)
  // .id(1L).build();
  // }



}
