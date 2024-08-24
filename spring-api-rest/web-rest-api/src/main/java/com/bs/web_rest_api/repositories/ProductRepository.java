package com.bs.web_rest_api.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.bs.web_rest_api.entities.Product;

public interface ProductRepository extends CrudRepository<Product, UUID> {
  boolean existsBySku(String sku);
}
