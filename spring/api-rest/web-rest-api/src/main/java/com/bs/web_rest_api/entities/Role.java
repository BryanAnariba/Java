package com.bs.web_rest_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity()
@Table(name = "roles")
public class Role {
  
  public Role () {}
  
  public Role (String name) {
    this.name = name;
  }
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(length = 100, nullable = false)
  private String name;
  
  @Column(length = 150, nullable = true)
  private String description;
  
  @Column(name = "is_active")
  private boolean is_active;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isIs_active() {
    return is_active;
  }

  public void setIs_active(boolean is_active) {
    this.is_active = is_active;
  }
  
}
