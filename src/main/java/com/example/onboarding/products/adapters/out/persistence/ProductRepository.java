package com.example.onboarding.products.adapters.out.persistence;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductJpaEntity, Long> {

}
