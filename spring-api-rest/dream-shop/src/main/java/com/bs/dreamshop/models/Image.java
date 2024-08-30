package com.bs.dreamshop.models;

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
  
  @Column(nullable = false)
  private String fileName;
  
  @Column(nullable = false)
  private String fileType;
  
  @Column(nullable = false)
  private Blob image;
  
  @Column(nullable = false)
  private String downloadUrl;
  
  @ManyToOne()
  @JoinColumn(name="product_id")
  private Product product;

  public Image() {
  }

  public Image(UUID id, String fileName, String fileType, Blob image, String downloadUrl, Product product) {
    this.id = id;
    this.fileName = fileName;
    this.fileType = fileType;
    this.image = image;
    this.downloadUrl = downloadUrl;
    this.product = product;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public Blob getImage() {
    return image;
  }

  public void setImage(Blob image) {
    this.image = image;
  }

  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
  
}
