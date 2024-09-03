package com.bs.web_rest_api.controllers;

import com.bs.web_rest_api.entities.User;
import com.bs.web_rest_api.services.UserService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api/users")
public class UserController {
  
  @Autowired()
  private UserService userService;
  
  @GetMapping("")
  public List<User> getItem () {
    return this.userService.findAll();
  }
  
  @PostMapping("")
  public ResponseEntity<?> create (
    @Valid @RequestBody User user,
    BindingResult result
  ) {
    if (result.hasFieldErrors()) return validation(result); // validaciones como nest
    return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.save(user));
  }

  private ResponseEntity<User> validation(BindingResult result) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }
  
}
