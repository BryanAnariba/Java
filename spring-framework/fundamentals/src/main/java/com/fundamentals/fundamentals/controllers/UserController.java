package com.fundamentals.fundamentals.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.fundamentals.fundamentals.models.User;

// https://www.youtube.com/watch?v=PA-V-GxYa9w&list=PL07efmqYWHZ_cxA1GvuXQMA-VYk8dhuiv

@Controller()
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "User Details Page");
    model.addAttribute("message", "Welcom@ Bryan Sanchez!");
    return "details";
  }

  @GetMapping("/details-two")
  public String detailsTwo(Map<String, Object> model) {
    model.put("title", "User Details Page Two");
    model.put("message", "Welcom@ Bryan Sanchez!");
    return "details-two";
  }

  @GetMapping( "/user-details")
  public String getUserDetails(Map<String, Object> model) {
    User user = new User("Juan", "Peres", 18, true, "");
    model.put("user", user);
    return "user-details";
  }

  @GetMapping("/users/list")
  public String getUsers (ModelMap model) {
    // List<User> users = new ArrayList<>();
    // users.add(new User("Juan", "Perez", 18, true, "juan@gmail.com"));
    // users.add(new User("Larry", "Knonga", 18, true, "larryknonga@gmail.com"));
    // users.add(new User("Goku", "Perez", 18, false, "goku@gmail.com"));
    // model.addAttribute("title", "User List");
    // model.addAttribute("users", users);
    return "user-list";
  }

  // el metodo getUsers llama este metodo1
  @ModelAttribute("users") 
  public List<User> getUserData () {
    List<User> users = new ArrayList<>();
    users.add(new User("Juan", "Perez", 18, true, "juan@gmail.com"));
    users.add(new User("Larry", "Knonga", 18, true, "larryknonga@gmail.com"));
    users.add(new User("Goku", "Perez", 18, false, "goku@gmail.com"));
    return users;
  }

}
