package com.di.facturas.di_facturas.models;

public class Item {
  
  private Product product;
  private int itemQuantity;

  public Item(Product product, int itemQuantity) {
    this.product = product;
    this.itemQuantity = itemQuantity;
  }
  
  public Item() {}

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getItemQuantity() {
    return itemQuantity;
  }

  public void setItemQuantity(int itemQuantity) {
    this.itemQuantity = itemQuantity;
  }
  
  public double getTotalItemImport () {
    return this.itemQuantity * this.product.getProductPrice();
  }
   
}
