package com.bs.products_rest.products_rest.services;

import java.util.List;

import com.bs.products_rest.products_rest.models.Product;
import com.bs.products_rest.products_rest.repositories.ProductRepository;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class ProductService {
  
  @Autowired()
  private ProductRepository productRepository;
  
  public List<Product> find() {
    return (List<Product>) this.productRepository.findAll();
  }
  
  public Product create(Product product) {
    return this.productRepository.save(product);
  }
  
  public Product getOne(UUID product_id) {
    return this.productRepository.findById(product_id).get();
  }
  
  public void delete(UUID product_id) {
    this.productRepository.deleteById(product_id);
  }
}
