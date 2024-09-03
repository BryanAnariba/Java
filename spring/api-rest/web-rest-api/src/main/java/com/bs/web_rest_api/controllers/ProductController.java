package com.bs.web_rest_api.controllers;

import com.bs.web_rest_api.dtos.ProductDto;
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
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.BindingResult;

@RestController()
@RequestMapping("/api/products")
public class ProductController {

  @Autowired()
  private ProductServiceImpl productService;
  
  @Autowired()
  private ProductDto productDto;

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
  public ResponseEntity<?> create(
    @Valid @RequestBody() Product product, 
    BindingResult result
  ) {
    // Con DTO O VALIDATION
    this.productDto.validate(product, result);
    if (result.hasFieldErrors()) return validation(result); // validaciones como nest
    
    return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.save(product));
  }

  @PutMapping(path = "/{product_id}")
  public ResponseEntity<?> update(
    @PathVariable("product_id") UUID product_id, 
    @Valid @RequestBody() Product product, 
    BindingResult result
  ) {
    // Con DTO O VALIDATION
    this.productDto.validate(product, result);
    if (result.hasFieldErrors()) return validation(result); // Validaciones como nest
    
    Optional<Product> productUpdated = this.productService.update(product_id, product);
    if (productUpdated.isPresent()) return ResponseEntity.status(HttpStatus.OK).body(productUpdated.get());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  }

  @DeleteMapping(path = "/{product_id}")
  public ResponseEntity<?> delete(@PathVariable("product_id") UUID product_id) {
    Optional<Product> existsProduct = this.productService.delete(product_id);
    if (existsProduct.isPresent()) return ResponseEntity.ok(existsProduct.orElseThrow());
    return ResponseEntity.notFound().build();
  }

  private ResponseEntity<Map<String, String>> validation (BindingResult result) {
    Map<String, String> errors = new HashMap<>();
    result.getFieldErrors().forEach(error -> {
      // errors.put(error.getField(), "The field " + error.getField() + " " + error.getDefaultMessage());
      errors.put(error.getField(), error.getDefaultMessage());
    });
    return ResponseEntity.badRequest().body(errors);
  }
}
