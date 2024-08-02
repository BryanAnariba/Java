package com.app.dependencyinjection.repositories;

import java.util.List;

import com.app.dependencyinjection.models.Product;

public interface IProductRepository {
  List<Product> findAll();
  Product findById(int productId);
}
