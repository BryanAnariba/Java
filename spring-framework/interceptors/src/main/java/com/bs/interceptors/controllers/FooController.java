package com.bs.interceptors.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/app")
public class FooController {

  @GetMapping("/logger")
  public Map<String, String> logger () {
    return Collections.singletonMap("message", "Handle logger for FooController.java");
  }

  @GetMapping("/bar")
  public Map<String, String> bar () {
    return Collections.singletonMap("message", "Handle bar for FooController.java");
  }

  @GetMapping("/baz")
  public Map<String, String> baz () {
    return Collections.singletonMap("message", "Handle baz for FooController.java");
  }

}
