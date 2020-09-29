package com.example.onboarding.products.adapters.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.port.in.GetProductUseCase;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductsController {

  private final GetProductUseCase getProductUseCase;

  @GetMapping
  public ResponseEntity<Product> getProduct() {
    return ResponseEntity.ok(getProductUseCase.getProduct());
  }

}
