package com.bs.web_rest_api.entities;

import com.bs.web_rest_api.validations.IsExistsInDataBase;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import com.bs.web_rest_api.validations.IsRequired;

@Entity()
@Table(name = "products")
public class Product {

  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @IsRequired
  @Column(length = 150, nullable = false, unique = true)
  private String name;

  @NotBlank(message = "{NotBlank.product.description}")
  @Size(min = 3)
  // @Pattern()
  @Column(length = 255, nullable = false)
  private String description;

  @Min(0)
  @NotNull()
  @Column(precision = 2, nullable = false)
  private Double price;

  @IsRequired() // esta es generica del spring
  @IsExistsInDataBase() // Esta validacion la creamos, ver en validaciones
  @Column(unique = true, nullable = false, length = 255)
  private String sku;
  
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

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

}
