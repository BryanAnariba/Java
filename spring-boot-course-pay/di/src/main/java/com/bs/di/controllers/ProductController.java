package com.bs.di.controllers;

import com.bs.di.models.Product;
import com.bs.di.services.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/products")
public class ProductController {
    
    // DI Como angular basico
    // private ProductService productService = new ProductService();
    
    // DI Con Spring implementa por medio de la interfaz
    @Autowired()
    private IProductService productService;
    
    @GetMapping("")
    public List<Product> getProducts () {
        return this.productService.findAll();
    }
    
    @GetMapping("{product_id}")
    public Product getProduct(@PathVariable("product_id") Long product_id) {
        return this.productService.findOne(product_id);
    }
}
