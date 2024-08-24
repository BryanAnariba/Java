package com.bs.web_rest_api.repositories;

import com.bs.web_rest_api.entities.User;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, UUID>{
  
}
