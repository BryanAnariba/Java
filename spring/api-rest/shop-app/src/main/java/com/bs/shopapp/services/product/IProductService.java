package com.bs.shopapp.services.product;

import Requests.AddProductRequest;
import java.util.List;
import java.util.UUID;
import com.bs.shopapp.models.Product;

public interface IProductService {

  Product addProduct(AddProductRequest product);

  Product getProduct(UUID product_id);

  List<Product> getAllProducts();

  List<Product> getProductsByCategory(String category_name);

  List<Product> getProductsByBrand(String brand);

  List<Product> getProductsByCategoryAndBrand(String category_name, String brand);

  List<Product> getProductsByName(String product_name);

  List<Product> getProductsByNameAndBrand(String product_name, String brand);

  Long countProductsByNameAndBrand(String product_name, String brand);

  void deleteProductById(UUID product_id);

  void updateProduct(Product product, UUID product_id);

}
