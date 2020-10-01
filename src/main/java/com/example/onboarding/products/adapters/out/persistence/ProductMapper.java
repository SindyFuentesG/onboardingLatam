package com.example.onboarding.products.adapters.out.persistence;

import org.springframework.stereotype.Component;
import com.example.onboarding.products.application.domain.Description;
import com.example.onboarding.products.application.domain.Name;
import com.example.onboarding.products.application.domain.Price;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.domain.ProductNotCreated;
import com.example.onboarding.products.application.domain.Quantity;

@Component
public class ProductMapper {

  public Product mapToDomainEntity(ProductJpaEntity jpaEntity) {
    return Product.builder().id(jpaEntity.getId()).name(Name.of(jpaEntity.getName()))
        .description(Description.of(jpaEntity.getDescription()))
        .price(Price.of(jpaEntity.getPrice())).quantity(Quantity.of(jpaEntity.getQuantity()))
        .build();
  }

  public ProductJpaEntity mapToJpaEntity(ProductNotCreated product) {
    return ProductJpaEntity.builder().name(product.getName().getValue())
        .description(product.getDescription().getValue()).price(product.getPrice().getValue())
        .quantity(product.getQuantity().getValue()).build();
  }

}
