package com.bs.products_rest.products_rest.controllers;

import com.bs.products_rest.products_rest.models.Product;
import com.bs.products_rest.products_rest.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/products")
public class ProductController {
  
  @Autowired()
  private ProductService productService;
  
  @GetMapping("")
  public List<Product> getItems () {
    return this.productService.find();
  }
}
