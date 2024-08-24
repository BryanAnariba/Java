package com.bs.web_rest_api.repositories;

import com.bs.web_rest_api.entities.Role;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, UUID>{
  
  Optional<Role> findByName(String name);
}
