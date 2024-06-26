package com.bryan.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

  // @RequestMapping(path = "/details", method = RequestMethod.GET)
  @GetMapping(path="/details")
  public Map<String, Object> details () {
    User user = new User("Bryan Ariel", "Allen Stark");
    Map<String, Object> body = new HashMap<String, Object>();
    body.put("user", user);
    return body;
  }
}
