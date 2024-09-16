package com.bs.products_rest.products_rest.controllers;

import com.bs.products_rest.products_rest.models.Product;
import com.bs.products_rest.products_rest.services.ProductService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  
  @GetMapping("/{product_id}")
  public ResponseEntity<Product> getItem (@PathVariable UUID product_id) {
    try {
      Product product = this.productService.getOne(product_id);
      return new ResponseEntity<Product>(product, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }
  }
  
  @PostMapping("")
  public ResponseEntity<?> createItem (@RequestBody Product product) {
    Product saved = this.productService.create(product);
    return ResponseEntity.ok(saved);
  }
  
  @PutMapping("/{product_id}")
  public ResponseEntity<?> updateItem (@PathVariable UUID product_id, @RequestBody Product product) {
    try {
      Product existsProduct = this.productService.getOne(product_id);
      existsProduct.setName(product.getName());
      existsProduct.setPrice(product.getPrice());
      Product saved = this.productService.create(existsProduct);
      return ResponseEntity.ok(saved);
    } catch (Exception e) {
      return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }
  }
  
  @DeleteMapping("/{product_id}")
  public ResponseEntity<?> deleteItem (@PathVariable UUID product_id) {
    try {
      Product existsProduct = this.productService.getOne(product_id);
      this.productService.delete(product_id);
      return new ResponseEntity(HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
    }
  }
}
