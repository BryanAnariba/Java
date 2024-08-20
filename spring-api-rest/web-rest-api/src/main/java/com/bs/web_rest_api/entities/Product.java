package com.bs.web_rest_api.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "products")
public class Product {

  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 150, nullable = false)
  private String name;

  @Column(length = 255, nullable = false)
  private String description;

  @Column(precision = 2, nullable = false)
  private Double price;

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

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

}
