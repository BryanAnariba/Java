package com.http_exceptions.http_exceptions.exceptions;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException (String message) {
    super(message);
  }
}
