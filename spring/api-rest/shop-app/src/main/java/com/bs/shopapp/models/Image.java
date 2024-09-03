package com.bs.shopapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.sql.Blob;
import java.util.UUID;

@Entity()
public class Image {

  @Id()
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 80, name = "file_name", nullable = false)
  private String file_name;

  @Column(length = 80, name = "file_type", nullable = false)
  private String file_type;

  @Column()
  private Blob image;

  @Column(length = 255, name = "donwload_url", nullable = false)
  private String donwload_url;

  @ManyToOne()
  @JoinColumn(name = "product_id")
  private Product product;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFile_name() {
    return file_name;
  }

  public void setFile_name(String file_name) {
    this.file_name = file_name;
  }

  public String getFile_type() {
    return file_type;
  }

  public void setFile_type(String file_type) {
    this.file_type = file_type;
  }

  public Blob getImage() {
    return image;
  }

  public void setImage(Blob image) {
    this.image = image;
  }

  public String getDonwload_url() {
    return donwload_url;
  }

  public void setDonwload_url(String donwload_url) {
    this.donwload_url = donwload_url;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Image(UUID id, String file_name, String file_type, Blob image, String donwload_url, Product product) {
    this.id = id;
    this.file_name = file_name;
    this.file_type = file_type;
    this.image = image;
    this.donwload_url = donwload_url;
    this.product = product;
  }

  public Image() {
  }

}
