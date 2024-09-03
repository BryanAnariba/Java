package com.bs.shopapp.exceptions;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException (String message) {
    super(message);
  }
}
