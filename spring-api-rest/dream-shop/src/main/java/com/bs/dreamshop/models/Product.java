package com.bs.dreamshop.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity()
public class Product {
  
  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Column(length = 100, nullable = false, unique = true)
  private String name;
  
  @Column(length = 250, nullable = false)
  private String description;
  
  @Column(length = 80, nullable = false)
  private String brand;
  
  @Column(precision = 2, nullable = false)
  private BigDecimal price;
  
  @Column(nullable = false)
  private int inventory;
  
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "category_id")
  private Category category;
  
  @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Image> images;

  public Product() {
  }

  public Product(UUID id, String name, String description, String brand, BigDecimal price, int inventory, Category category, List<Image> images) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.brand = brand;
    this.price = price;
    this.inventory = inventory;
    this.category = category;
    this.images = images;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public int getInventory() {
    return inventory;
  }

  public void setInventory(int inventory) {
    this.inventory = inventory;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }
  
}
