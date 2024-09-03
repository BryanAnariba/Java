package com.app.dependencyinjection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dependencyinjection.models.Product;
import com.app.dependencyinjection.services.ProductServiceImpl;

@RestController()
@RequestMapping("/api/products")
public class ProductController {

  // DI CON AUTOWIRED principio de holliwood, no nos llames nosotros lo haremos
  @Autowired()
  private ProductServiceImpl productServiceImpl;

  // DI Por metodo Constructor esto es como angular casi casi o nest
  /*
  private ProductServiceImpl productServiceImpl;
  public ProductController (ProductServiceImpl productServiceImpl) {
    this.productServiceImpl = productServiceImpl;
  }
  */

  @GetMapping("")
  public List<Product> getProducts () {
    return this.productServiceImpl.findAll();
  }

  @GetMapping("/{productId}")
  public Product getOneProduct (@PathVariable int productId) {
    return this.productServiceImpl.findById(productId);
  }

}
