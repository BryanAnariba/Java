package com.bs.web_rest_api.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.bs.web_rest_api.entities.Product;

public interface IProductService {
  List<Product> findAll();
  Optional<Product> findById(UUID product_id);
  Product save(Product product);
  Optional<Product> update(UUID product_id, Product product);
  Optional<Product> delete(UUID product_id);
  boolean existsBySku(String sku);
}
