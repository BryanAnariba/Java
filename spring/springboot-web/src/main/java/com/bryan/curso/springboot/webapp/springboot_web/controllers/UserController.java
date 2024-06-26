package com.bryan.curso.springboot.webapp.springboot_web.controllers;

//import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bryan.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details (Model model) {
    User user = new User("Bryan Ariel", "Allen Stark");
    model.addAttribute("user", user);
    return "details";
  }
}
