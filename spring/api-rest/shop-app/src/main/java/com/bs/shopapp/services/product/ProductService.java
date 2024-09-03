package com.bs.shopapp.services.product;

import Requests.AddProductRequest;
import com.bs.shopapp.exceptions.ProductNotFoundException;
import com.bs.shopapp.models.Category;
import java.util.List;
import java.util.UUID;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.bs.shopapp.models.Product;
import com.bs.shopapp.repositories.CategoryRepository;
import com.bs.shopapp.repositories.ProductRepository;

public class ProductService implements IProductService {

  @Autowired()
  private ProductRepository productRepository;
  @Autowired()
  private CategoryRepository categoryRepository;
  
  @Override
  public Product addProduct(AddProductRequest request) {
    
    // Verify is the category exists, if not exists create category and set in product with id and everything
    Category category = Optional.ofNullable(this.categoryRepository.findByName(request.getCategory().getName())).orElseGet(() -> {
      Category newCategory = new Category(request.getCategory().getName());
      return this.categoryRepository.save(newCategory);
    });
    request.setCategory(category);
    
    return this.productRepository.save(this.createProduct(request, category));
  }

  @Override
  public Product getProduct(UUID product_id) {
    return this.productRepository
      .findById(product_id)
      .orElseThrow(
        () -> new ProductNotFoundException("Product not found")
      );
  }

  @Override
  public List<Product> getAllProducts() {
    return (List<Product>) this.productRepository.findAll();
  }

  @Override
  public List<Product> getProductsByCategory(String category_name) {
    return this.productRepository.findByCategoryName(category_name);
  }

  @Override
  public List<Product> getProductsByBrand(String brand) {
    return this.productRepository.findByBrand(brand);
  }

  @Override
  public List<Product> getProductsByCategoryAndBrand(String category_name, String brand) {
    return this.productRepository.findByCategoryAndBrand(category_name, brand);
  }

  @Override
  public List<Product> getProductsByName(String product_name) {
    return this.productRepository.findByName(product_name);
  }

  @Override
  public List<Product> getProductsByNameAndBrand(String product_name, String brand) {
    return this.productRepository.findByBrandAndName(brand, product_name);
  }

  @Override
  public Long countProductsByNameAndBrand(String product_name, String brand) {
    return this.productRepository.countByBrandAndName(brand, product_name);
  }

  @Override
  public void deleteProductById(UUID product_id) {
    productRepository
      .findById(product_id)
      .ifPresentOrElse(
        productRepository::delete,
        () -> {
          throw new ProductNotFoundException("Product not found");
        }
      );
  }

  @Override
  public void updateProduct(Product product, UUID product_id) {
    throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
  }
  
  private Product createProduct(AddProductRequest request, Category category) {
    return new Product(
      request.getName(), 
      request.getDescription(),
      request.getPrice(),
      request.getInventory(),
      request.getBrand(),
      category   
    );
  }

}
