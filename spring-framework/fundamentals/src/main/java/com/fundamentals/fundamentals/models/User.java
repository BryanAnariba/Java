package com.fundamentals.fundamentals.models;

public class User {
  private String firstName;
  private String lastName;
  private int age;
  private boolean isActive;
  private String email;

  public User() {}

  public User(String firstName, String lastName, int age, boolean isActive, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isActive = isActive;
    this.email = email;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public boolean isActive() {
    return isActive;
  }
  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
