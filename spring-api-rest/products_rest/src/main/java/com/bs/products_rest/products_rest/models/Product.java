package com.bs.products_rest.products_rest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity()
public class Product {
    
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(length = 150, nullable = false)
  private String name;
  
  @Column(precision = 2, nullable = false)
  private float price;

  public Product() {
  }
  
  public Product(UUID id) {
    this.id = id;
  }

  public Product(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public Product(UUID id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

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

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
  
}
