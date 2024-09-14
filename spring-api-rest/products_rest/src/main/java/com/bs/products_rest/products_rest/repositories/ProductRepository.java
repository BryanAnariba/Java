package com.bs.products_rest.products_rest.repositories;

import com.bs.products_rest.products_rest.models.Product;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, UUID>{
  
}
