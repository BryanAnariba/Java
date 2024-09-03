package com.app.dependencyinjection.services;

import java.util.List;

import com.app.dependencyinjection.models.Product;

public interface IProductService {
  List<Product> findAll();
  Product findById(int productId);
}
