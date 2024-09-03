package com.bs.web_rest_api.entities;

import com.bs.web_rest_api.validations.IsRequired;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

@Entity()
@Table(name = "users")
public class User {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @IsRequired()
  @NotBlank()
  @Size(min = 3)
  @Column(length = 150, nullable = false, name = "user_name", unique = true)
  private String user_name;
  
  @Pattern(regexp = "^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")
  @Column(length = 150, nullable = false, unique = true)
  private String email;
  
  @IsRequired()
  @NotBlank()
  @Size(min = 6)
  @Column(length = 400, nullable = false)
  private String password;
  
  @Column(name = "is_active")
  private boolean is_active;
  
  @Transient()
  private boolean is_admin;
  
  @ManyToMany()
  @JoinTable(
    name = "users_roles",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"),
    uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "role_id" }) } // Las llaves deben ser unicas, no se debe repetir la relacion
  )
  private List<Role> roles;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isIs_active() {
    return is_active;
  }

  public void setIs_active(boolean is_active) {
    this.is_active = is_active;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public boolean isIs_admin() {
    return is_admin;
  }

  public void setIs_admin(boolean is_admin) {
    this.is_admin = is_admin;
  }
   
}
