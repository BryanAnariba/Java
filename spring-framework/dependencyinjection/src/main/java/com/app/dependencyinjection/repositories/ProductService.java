package com.app.dependencyinjection.repositories;

import java.util.List;
import java.util.stream.Collectors;

import com.app.dependencyinjection.models.Product;

public class ProductService {

  private ProductRepository productRepository = new ProductRepository();

  public List<Product> findAll () {
    return this.productRepository
      .findAll()
      .stream()
      .map(p -> {
        float productPriceWithISV = (p.getProductPrice() + (p.getProductPrice() * 0.15f));
        // Poniendo ISV a cada producto y retornando cada instancia de producto, OJO ESTO SE HACE POR QUE INCREMENTA EL PRECIO EN CADA PETICION QUE HACES ASI QUE ENVIANDO UNA NUEVA INSTANCIA NO HAY INMUTABILIDAD
        Product newProduct = new Product(p.getProductId(), p.getProductName(), productPriceWithISV);
        return newProduct;
      })
      .collect(Collectors.toList());
  }

  public Product findById (int productId) {
    Product existsProduct = new Product();
    existsProduct =  this.productRepository.findById(productId);
    float productPriceWithISV = 0;
    productPriceWithISV = (existsProduct.getProductPrice() + (existsProduct.getProductPrice() * 0.15f));

    // Poniendo ISV a cada producto y retornando la instancia de producto, OJO ESTO SE HACE POR QUE INCREMENTA EL PRECIO EN CADA PETICION QUE HACES ASI QUE ENVIANDO UNA NUEVA INSTANCIA NO HAY INMUTABILIDAD
    Product newProduct = new Product(existsProduct.getProductId(),existsProduct.getProductName(), productPriceWithISV);
    return newProduct;
  }

}
