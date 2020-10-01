package com.example.onboarding.products.adapters.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.onboarding.products.application.port.in.CreateProductUseCase;
import com.example.onboarding.products.application.port.in.FindAllProductsUseCase;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductsController {

  private final FindAllProductsUseCase findAllProductsUseCase;
  private final CreateProductUseCase createProductUseCase;

  @GetMapping
  public ResponseEntity<?> getProduct() {
    return ResponseEntity.ok(findAllProductsUseCase.findAllProducts());
  }

  @PostMapping
  public ResponseEntity<?> createProduct(
      @RequestBody CreateProductUseCase.CreateProductCommand command) {
    return ResponseEntity.ok(createProductUseCase.createProduct(command));
  }

}
