package com.bs.web_rest_api.controllers;

import java.util.List;
import java.util.Optional;
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

import com.bs.web_rest_api.entities.Product;
import com.bs.web_rest_api.services.ProductServiceImpl;

@RestController()
@RequestMapping("/api/products")
public class ProductController {

  @Autowired()
  private ProductServiceImpl productService;

  @GetMapping(path = "")
  public List<Product> list () {
    return this.productService.findAll();
  }

  @GetMapping(path = "/{product_id}")
  public ResponseEntity<?> view (@PathVariable("product_id") UUID product_id) {
    Optional<Product> existsProduct = this.productService.findById(product_id);
    if (existsProduct.isPresent()) return ResponseEntity.ok(existsProduct.orElseThrow());
    return ResponseEntity.notFound().build();
  }

  @PostMapping(path = "")
  public ResponseEntity<Product> create(@RequestBody() Product product) {
    return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.save(product));
  }

  @PutMapping(path = "/{product_id}")
  public ResponseEntity<Product> update(@PathVariable("product_id") UUID product_id, @RequestBody() Product product) {
    return ResponseEntity.status(HttpStatus.OK).body(this.productService.save(product));
  }

  @DeleteMapping(path = "/{product_id}")
  public ResponseEntity<?> delete(@PathVariable("product_id") UUID product_id) {
    Optional<Product> existsProduct = this.productService.delete(product_id);
    if (existsProduct.isPresent()) return ResponseEntity.ok(existsProduct.orElseThrow());
    return ResponseEntity.notFound().build();
  }

}
