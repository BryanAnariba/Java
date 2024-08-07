package com.http_exceptions.http_exeptions.controllers;

import com.http_exceptions.http_exceptions.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http_exceptions.http_exeptions.models.User;
import com.http_exceptions.http_exeptions.services.IUserService;

@RestController()
@RequestMapping("/api")
public class AppController {

  @Autowired()
  private IUserService userService;

  @GetMapping("/http-exeptions/app")
  public String index() {
    // int value = 100/0;
    int value = Integer.parseInt("10x");
    System.out.println("{ value: " + value + " }");
    return "Ok-200";
  }

  // http://localhost:3500/api/users/1122
  @GetMapping("/users/{id}")
  public User findById(@PathVariable(name = "id") int id) {
    // FORMA TRADICIONAL
    /*
    User user = this.userService.findById(id);
    if (user == null) {
      throw new UserNotFoundException("Sometime went wrong: The User was Not Found");
    }
    System.out.println(user.getFirstName());
    return user;
    */
    
    // USANDO API OPTIONAL STREAM DE JAVA 8
    User user = this.userService.findById(id).orElseThrow(() -> new UserNotFoundException("Sometime went wrong: the user was not found"));
    return user;
  }
}
