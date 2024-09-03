package com.http_exceptions.http_exeptions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.http_exceptions.http_exeptions.models.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service()
public class UserService implements IUserService {
  
  @Autowired()
  private List<User> users;
  
  public UserService() {
//    this.users = new ArrayList<>();
//    this.users.add(new User(1, "User First Name One", "User Last Name One"));
//    this.users.add(new User(2, "User First Name Two", "User Last Name Two"));
//    this.users.add(new User(3, "User First Name Three", "User Last Name Three"));
//    this.users.add(new User(4, "User First Name Four", "User Last Name Four"));
//    this.users.add(new User(4, "User First Name Five", "User Last Name Five"));
  }
  
  @Override
  public Optional<User> findById(int id) {
    Optional<User> userFounded = null;
    /*for (User user : this.users) {
      if (user.getId() == id) {
        userFounded = user;
        break;
      }
    }*/
    userFounded = this.users.stream().filter(u -> u.getId() == id).findFirst();
    return userFounded;
  }
  
  @Override
  public List<User> findAll() {
    return this.users;
  }
  
}
