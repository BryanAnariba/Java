package com.app.dependencyinjection.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.app.dependencyinjection.models.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductRepositoryJson implements IProductRepository {

  private List<Product> productList;

  public ProductRepositoryJson (Resource resource) {
    // no es necesario ya que lo recibimos por parametro: Resource resource = new ClassPathResource("data/products.json");
    this.readValueJson(resource);
  }
  
  @Override
  public List<Product> findAll() {
    return this.productList;
  }

  private void readValueJson (Resource resource) {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      this.productList = Arrays.asList(objectMapper.readValue(resource.getInputStream(), Product[].class));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public Product findById(int productId) {
    return productList
      .stream()
      .filter(p -> p.getProductId() == productId)
      .findFirst()
      .orElse(null);
  }

}
