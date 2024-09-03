package com.bs.shopapp.repositories;

import com.bs.shopapp.models.Product;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, UUID> {
  
  List<Product> findByCategoryName (String category_name);
  List<Product> findByBrand  (String brand);
  List<Product> findByCategoryAndBrand (String category_name, String brand);
  List<Product> findByName(String product_name);
  List<Product> findByBrandAndName(String brand, String product_name);
  Long countByBrandAndName(String brand, String product_name);
  
}
