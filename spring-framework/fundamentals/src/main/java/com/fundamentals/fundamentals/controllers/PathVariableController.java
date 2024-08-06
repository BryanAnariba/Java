package com.fundamentals.fundamentals.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundamentals.fundamentals.dtos.ParamDto;
import com.fundamentals.fundamentals.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

@RestController()
@RequestMapping("/api/path-variable")
public class PathVariableController {
  
  @Value("${config.userName}")
  private String userName;

  @Value("${config.message}")
  private String message;

  @Value("${config.listOfValues}")
  private List<String> listOfValues;

  @Value("#{${config.valuesMap}}")
  private Map<String, Object> valuesMap;

  @Value("#{${config.valuesMap}.product}")
  private String product;

  @Value("#{${config.valuesMap}.price}")
  private Double price;

  @Autowired()
  private Environment environment;

  // http://localhost:3500/api/path-variable/baz/hi
  @GetMapping("/baz/{message}")
  public ParamDto baz (@PathVariable() String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;
  }

  // http://localhost:3500/api/path-variable/mix/barbecube wings/1234
  @GetMapping("/mix/{product}/{productId}")
  public Map<String, Object> mixPaths (@PathVariable() String product, @PathVariable Long productId) {
    Map<String, Object> jsonResponse = new HashMap<>();
    jsonResponse.put("product", product);
    jsonResponse.put("productId", productId);
    return jsonResponse;
  }

  // http://localhost:3500/api/path-variable/create
  @PostMapping("/create")
  public User create (@RequestBody() User user) {

    return user;
  }

  // http://localhost:3500/api/path-variable/get-default-values
  @GetMapping("/get-default-values")
  public Map<String, Object> getDefaultValues (@Value("${config.defaultCode}") int defaultCode){
    Map<String, Object> jsonResponse = new HashMap<>();
    jsonResponse.put("defaultCode", defaultCode);
    jsonResponse.put("userName", this.userName);
    jsonResponse.put("message", environment.getProperty("config.message"));
    jsonResponse.put("listOfValues", this.listOfValues);
    jsonResponse.put("valuesMap", this.valuesMap);
    jsonResponse.put("product", this.product);
    jsonResponse.put("price", this.price);
    return jsonResponse;
  }
  
}
