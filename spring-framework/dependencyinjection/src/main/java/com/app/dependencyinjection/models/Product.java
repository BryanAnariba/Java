package com.app.dependencyinjection.models;

public class Product implements Cloneable {

  private int productId;
  private String productName;
  private float productPrice;

  public Product () {}

  public Product(int productId, String productName, float productPrice) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
  }
  
  public int getProductId() {
    return productId;
  }
  public void setProductId(int productId) {
    this.productId = productId;
  }
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public float getProductPrice() {
    return productPrice;
  }
  public void setProductPrice(float productPrice) {
    this.productPrice = productPrice;
  }

  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      return new Product(this.getProductId(), this.getProductName(), this.getProductPrice());
    }
  }
  
}
