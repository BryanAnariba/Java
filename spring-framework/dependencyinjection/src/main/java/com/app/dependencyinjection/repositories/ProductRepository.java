package com.app.dependencyinjection.repositories;

import java.util.ArrayList;
import java.util.List;

import com.app.dependencyinjection.models.Product;

public class ProductRepository {
  private ArrayList<Product> data = new ArrayList<>();

  public ProductRepository () {
    this.data.add(new Product(1, "Corsair 2x16GB DDR4 3200Mhz Ram", 69.99f));
    this.data.add(new Product(2,"Intel Core i7 12700H", 299.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3060TI", 499.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3050TI", 399.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3090TI", 799.99f));
  }

  public List<Product> findAll() {
    return this.data;
  }

  public Product findById (int productId) {
    return this.data
      .stream()
      .filter(product -> product.getProductId() == productId)
      .findFirst()
      .orElseThrow();
  }

}
