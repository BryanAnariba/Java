package com.app.dependencyinjection.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.app.dependencyinjection.models.Product;

@Primary()
@Repository()
public class CategoryRepositoryImpl implements IProductRepository {

  @Override
  public List<Product> findAll() {
    return Collections.singletonList(
      new Product(1, "BULKAN 2x8GB DDR4 3600Mhz Ram", 99.99f)
    );
  }

  @Override
  public Product findById(int productId) {
    return new Product(productId, "BULKAN 2x8GB DDR4 3600Mhz Ram", 99.99f);
  }

}
