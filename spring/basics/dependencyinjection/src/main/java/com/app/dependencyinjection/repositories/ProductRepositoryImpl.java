package com.app.dependencyinjection.repositories;

import java.util.ArrayList;
import java.util.List;

import com.app.dependencyinjection.models.Product;

import org.springframework.stereotype.Repository;
// import org.springframework.web.context.annotation.RequestScope;
// import org.springframework.web.context.annotation.SessionScope;

@Repository("productRepositoryImpl")
// @RequestScope() // Con esto evitamos la mutacion pero no al 100%
// @SessionScope() // Con esto evitamos la mutacion pero hasta que el navegador se cierre util para carrito de compras o login con sessiones de usuarios
public class ProductRepositoryImpl implements IProductRepository {
  private ArrayList<Product> data = new ArrayList<>();

  public ProductRepositoryImpl () {
    this.data.add(new Product(1, "Corsair 2x16GB DDR4 3200Mhz Ram", 69.99f));
    this.data.add(new Product(2,"Intel Core i7 12700H", 299.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3060TI", 499.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3050TI", 399.99f));
    this.data.add(new Product(3, "Zotac Gaming RTX 3090TI", 799.99f));
  }

  @Override
  public List<Product> findAll() {
    return this.data;
  }

  @Override
  public Product findById (int productId) {
    return this.data
      .stream()
      .filter(product -> product.getProductId() == productId)
      .findFirst()
      .orElseThrow();
  }

}
