package com.bryan.mvc_web_app.controllers;

import com.bryan.mvc_web_app.models.UserModel;
import com.bryan.mvc_web_app.models.dtos.PaginationDto;
import com.bryan.mvc_web_app.models.dtos.ParamDto;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/request-params")
public class RequestParamsController {
    
    // Accediendo a application.properties file
    @Value("${config.code}")
    private Integer code;
    
    @Value("${config.username}")
    private String username;
    
    @Value("${config.message}")
    private String message;
    
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    
    
    /* 
        http://localhost:3500/api/request-params/user-message?message=hi!
        Or
        http://localhost:3500/api/request-params/user-message
    */
    @GetMapping("/user-message") 
    public ResponseEntity<ParamDto> getUserById(@RequestParam(required = false, defaultValue = "Default message") String message) {
       ParamDto paramDto = new ParamDto();
       paramDto.setMessage(message);
       return ResponseEntity.ok(paramDto);
    }
    
    // http://localhost:3500/api/request-params/products?limit=10&skip=0
    @GetMapping("/products")
    public ResponseEntity<PaginationDto> getProducts(@RequestParam() int limit, @RequestParam() int skip) {
        PaginationDto paginationDto = new PaginationDto();
        paginationDto.setLimit(limit);
        paginationDto.setSkip(skip);
        return ResponseEntity.ok(paginationDto);
    }
    
    // http://localhost:3500/api/request-params/products/445e8726-6e0d-4636-b9fd-f687fee5bff6
    @GetMapping("/products/{product_id}")
    public ResponseEntity<?> getProduct(@PathVariable() String product_id) {
        Map<String, Object> product = new HashMap<>();
        product.put("product_id", product_id);
        product.put("name", "Coca Cola");
        product.put("price", 2.75);
        product.put("stock", 100);
        return ResponseEntity.ok(product);
    }
    
    // http://localhost:3500/api/request-params/orders/445e8726-6e0d-4636-b9fd-f687fee5bff6/products/862540d6-d0d9-4166-acad-c9758596954a
    @GetMapping("/orders/{order_id}/products/{product_id}")
    public ResponseEntity<?> getOrderWithProducts(@PathVariable() UUID order_id, @PathVariable() UUID product_id) {
        Map<String, Object> order = new HashMap<>();
        order.put("order_id", order_id);
        order.put("order_name", "Order with 3 Can of soda");
        order.put("product_id", product_id);
        order.put("name", "sprite");
        order.put("price", 1.25);
        order.put("quantity", 3);
        return ResponseEntity.ok(order);
    }
    
    // http://localhost:3500/api/request-params/users/create
    @PostMapping("/users/create")
    public ResponseEntity<UserModel> createUser(@RequestBody() UserModel user) {
        return ResponseEntity.ok(user);
    }
    
    // http://localhost:3500/api/request-params/getting-values-from-application-properties
    @GetMapping("/getting-values-from-application-properties")
    public ResponseEntity<Map<String, Object>> getValues() {
        Map<String, Object> values = new HashMap<>();
        values.put("code", this.code);
        values.put("username", this.username);
        values.put("message", this.message);
        values.put("listOfValues", this.listOfValues);
        return ResponseEntity.ok(values);
    }
    
}
