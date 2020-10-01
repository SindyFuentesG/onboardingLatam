package com.example.onboarding.products.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;
import com.example.onboarding.products.application.domain.Product;
import com.example.onboarding.products.application.domain.ProductNotCreated;
import com.example.onboarding.products.application.port.out.CreateProductPort;
import com.example.onboarding.products.application.port.out.FindAllProductsPort;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ProductPersistenceAdapter implements FindAllProductsPort, CreateProductPort {

  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  @Override
  public List<Product> findAllProducts() {
    List<ProductJpaEntity> products = (List<ProductJpaEntity>) productRepository.findAll();
    return products.stream().map(product -> productMapper.mapToDomainEntity(product))
        .collect(Collectors.toList());
  }

  @Override
  public Try<Product> createProduct(ProductNotCreated product) {
    return Try.of(() -> {
      ProductJpaEntity productJpaEntity = productMapper.mapToJpaEntity(product);
      ProductJpaEntity createdProduct = productRepository.save(productJpaEntity);
      return productMapper.mapToDomainEntity(createdProduct);
    });

  }

}
