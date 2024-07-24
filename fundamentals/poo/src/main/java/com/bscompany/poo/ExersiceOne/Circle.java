package com.bscompany.poo.ExersiceOne;

public class Circle {

  private int x;
  private int y;
  private int diameter;
  private String color;
  public static int avgDiameter = 100;
  public static final String DEFAULT_COLOR = "Black";
  
  public Circle () {
    
  }
  
  public Circle (int x, int y, int diameter, String color) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.color = color;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getDiameter() {
    return diameter;
  }

  public void setDiameter(int diameter) {
    this.diameter = diameter;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return Math.PI * Math.pow((this.diameter / 2), 2);
  }
  
  @Override
  public String toString() {
    return "Circle{" + "x=" + x + ", y=" + y + ", diameter=" + diameter + ", color=" + color + '}';
  }
}
