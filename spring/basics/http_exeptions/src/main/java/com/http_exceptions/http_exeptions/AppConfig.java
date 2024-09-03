package com.http_exceptions.http_exeptions;

import com.http_exceptions.http_exeptions.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class AppConfig {
  
  @Bean()
  public List<User> getUsers () {
    List<User> users = new ArrayList<>();
    users.add(new User(1, "User First Name One", "User Last Name One"));
    users.add(new User(2, "User First Name Two", "User Last Name Two"));
    users.add(new User(3, "User First Name Three", "User Last Name Three"));
    users.add(new User(4, "User First Name Four", "User Last Name Four"));
    users.add(new User(5, "User First Name Five", "User Last Name Five"));
    return users;
  }
  
}
