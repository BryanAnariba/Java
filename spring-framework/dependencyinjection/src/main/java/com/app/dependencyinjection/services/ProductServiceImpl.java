package com.app.dependencyinjection.services;

import java.util.List;
import java.util.stream.Collectors;

import com.app.dependencyinjection.models.Product;
import com.app.dependencyinjection.repositories.IProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service()
public class ProductServiceImpl implements IProductService {

  // DI CON Autowired principio de holliwod, no nos llames nosotros lo haremos el mas usado gracias a Spring
  @Autowired()
  @Qualifier("productRepositoryJson") // Ay dos repos con esta interface pero con Qualifier seleccionas que repo quieres usar
  private IProductRepository productRepository;
  @Autowired()
  private Environment environment;

  // DI POR Constructor
  /*
  private IProductRepository productRepository;
  public ProductServiceImpl (
    @Qualifier("productRepositoryImpl") IProductRepository productRepository // Ay dos repos con esta interface pero con Qualifier seleccionas que repo quieres usar
  ) {
    this.productRepository = productRepository;
  }
  */
  

  // DI POR Setter
  /*
  @Autowired()
  private IProductRepository productRepository;
  public void setProductServiceImpl (IProductRepository productRepository) {
    this.productRepository = productRepository;
  }
  */

  public List<Product> findAll () {
    return this.productRepository
      .findAll()
      .stream()
      .map(p -> {
        Product newProduct = (Product)p.clone();
        newProduct.setProductPrice(this.getProductWithIsv(newProduct.getProductPrice()));
        return newProduct;

        // Si descomentas esto usar @RequestScope() o @SessionScope()
        // p.setProductPrice(this.getProductWithIsv(p.getProductPrice()));
        // return p;
      })
      .collect(Collectors.toList());
  }

  @Override
  public Product findById (int productId) {
    Product existsProduct = new Product();

    // Si descomentas esto usar @RequestScope() o @SessionScope()
    // existsProduct =  (Product)this.productRepository.findById(productId);
    // existsProduct.setProductPrice(this.getProductWithIsv(existsProduct.getProductPrice()));
    // return existsProduct;

    existsProduct =  (Product)this.productRepository.findById(productId).clone();
    existsProduct.setProductPrice(this.getProductWithIsv(existsProduct.getProductPrice()));
    return existsProduct;
  }

  public float getProductWithIsv (float productPrice) {
    float productPriceWithISV = (productPrice + (productPrice * Float.parseFloat(this.environment.getProperty("config.price.isv"))));
    return productPriceWithISV;
  }

}
