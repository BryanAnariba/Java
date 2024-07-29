package com.fundamentals.fundamentals.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fundamentals.fundamentals.dtos.UserDto;
import com.fundamentals.fundamentals.models.User;

@RestController()
@RequestMapping("/api/users")
public class UserRestController {

  // http://localhost:3500/api/users/details
  @RequestMapping(path = "/details", method = RequestMethod.GET)
  public UserDto getUserDetails() {
    User user = new User("Juan", "Peres", 18, true, "juan@gmail.com");
    UserDto userDto = new UserDto();
    userDto.setTitle("User Details");
    userDto.setUser(user);
    return userDto;
  }

  // http://localhost:3500/api/users/list
  @RequestMapping(path = "list", method = RequestMethod.GET)
  public List<User> getUsers () {
    List<User> users = new ArrayList<>();
    users.add(new User("Juan", "Perez", 18, true, "juan@gmail.com"));
    users.add(new User("Larry", "Knonga", 18, true, "larryknonga@gmail.com"));
    users.add(new User("Goku", "Perez", 18, true, "goku@gmail.com"));
    return users;
  }

}
