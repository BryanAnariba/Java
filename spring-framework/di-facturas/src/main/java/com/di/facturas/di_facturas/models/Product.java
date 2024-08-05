package com.di.facturas.di_facturas.models;

public class Product {
  
  private String productName;
  private int productPrice;

  public Product(String productName, int productPrice) {
    this.productName = productName;
    this.productPrice = productPrice;
  }
  
  public Product () {}
  
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(int productPrice) {
    this.productPrice = productPrice;
  }
  
}
