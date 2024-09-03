package com.bs.web_rest_api.services;

import com.bs.web_rest_api.entities.User;
import java.util.List;

public interface IUserService {
  List<User> findAll();
  User save(User user);
}
