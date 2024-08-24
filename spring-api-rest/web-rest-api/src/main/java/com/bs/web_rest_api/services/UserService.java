package com.bs.web_rest_api.services;

import com.bs.web_rest_api.entities.Role;
import com.bs.web_rest_api.entities.User;
import com.bs.web_rest_api.repositories.RoleRepository;
import com.bs.web_rest_api.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service()
public class UserService implements IUserService {
  
  @Autowired()
  private UserRepository userRepository;
  
  @Autowired()
  private RoleRepository roleRepository;
  
  @Autowired()
  private PasswordEncoder passwordEncoder;

  @Override
  @Transactional(readOnly = true)
  public List<User> findAll() {
    return (List<User>)this.userRepository.findAll();
  }

  @Override
  @Transactional()
  public User save(User user) {
    // Buscamos el role user
    Optional<Role> existsUserRole = this.roleRepository.findByName("USER");
    
    // Agregamos el role a la lista
    List<Role> roles = new ArrayList<>();
    existsUserRole.ifPresent(r -> {
      roles.add(r);
    });
    
    //  Si en la peticion el usuario es admin, agregamos el role admin tambien al usuario, por lo que tendria los dos
    if (user.isIs_admin()) {
      Optional<Role> existsAdminRole = this.roleRepository.findByName("ADMIN");
      existsAdminRole.ifPresent(r -> {
        roles.add(r);
      });
    }
    
    user.setRoles(roles);
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return this.userRepository.save(user);
  }
  
}
