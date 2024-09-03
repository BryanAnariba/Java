package Requests;

import com.bs.shopapp.models.Category;
import com.bs.shopapp.models.Image;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AddProductRequest {

  private UUID id;

  private String name;

  private String description;

  private BigDecimal price;

  private int inventory;

  private String brand;

  private Category category;

  private List<Image> images;

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

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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
  
    @Override
  public int hashCode() {
    int hash = 5;
    hash = 47 * hash + Objects.hashCode(this.id);
    hash = 47 * hash + Objects.hashCode(this.name);
    hash = 47 * hash + Objects.hashCode(this.description);
    hash = 47 * hash + Objects.hashCode(this.price);
    hash = 47 * hash + this.inventory;
    hash = 47 * hash + Objects.hashCode(this.brand);
    hash = 47 * hash + Objects.hashCode(this.category);
    hash = 47 * hash + Objects.hashCode(this.images);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AddProductRequest other = (AddProductRequest) obj;
    if (this.inventory != other.inventory) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.brand, other.brand)) {
      return false;
    }
    if (!Objects.equals(this.id, other.id)) {
      return false;
    }
    if (!Objects.equals(this.price, other.price)) {
      return false;
    }
    if (!Objects.equals(this.category, other.category)) {
      return false;
    }
    return Objects.equals(this.images, other.images);
  }

  public AddProductRequest(UUID id, String name, String description, BigDecimal price, int inventory, String brand, Category category, List<Image> images) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.inventory = inventory;
    this.brand = brand;
    this.category = category;
    this.images = images;
  }

  public AddProductRequest() {
  }

  

}
