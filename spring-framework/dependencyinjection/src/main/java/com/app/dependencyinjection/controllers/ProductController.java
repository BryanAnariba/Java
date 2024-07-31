package com.app.dependencyinjection.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dependencyinjection.models.Product;
import com.app.dependencyinjection.repositories.ProductService;

@RestController()
@RequestMapping("/api/products")
public class ProductController {

  private ProductService productService = new ProductService();

  @GetMapping("")
  public List<Product> getProducts () {
    return this.productService.findAll();
  }

  @GetMapping("/{productId}")
  public Product getOneProduct (@PathVariable int productId) {
    return this.productService.findById(productId);
  }

}
