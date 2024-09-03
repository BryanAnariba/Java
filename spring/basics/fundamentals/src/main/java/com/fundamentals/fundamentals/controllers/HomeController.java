package com.fundamentals.fundamentals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class HomeController {

  // http://localhost:3500
  @GetMapping({ "", "/", "/home" })
  public String goHome() {
    // return "forward:/users/list";
    return "redirect:/users/list";
  }

}
