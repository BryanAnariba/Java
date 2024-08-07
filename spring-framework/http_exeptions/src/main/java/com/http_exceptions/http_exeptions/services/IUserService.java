package com.http_exceptions.http_exeptions.services;

import java.util.List;

import com.http_exceptions.http_exeptions.models.User;
import java.util.Optional;

public interface IUserService {

  Optional<User> findById (int id);

  List<User> findAll();
}
