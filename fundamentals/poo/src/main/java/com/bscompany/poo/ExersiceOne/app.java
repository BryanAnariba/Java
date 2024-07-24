package com.bscompany.poo.ExersiceOne;

public class app {
  public static void main(String[] args) {
    Circle newCircle = new Circle();
    newCircle.setX(10);
    newCircle.setY(20);
    newCircle.setColor("Yellow");
    newCircle.setDiameter(20);
    System.out.println("The Area in the " +newCircle.getColor()+ " is: " + newCircle.getArea());
    
    Circle newCircleTwo = new Circle(10,10,10, "Red");
    System.out.println("The Area in the " +newCircleTwo.getColor()+ " is: " + newCircleTwo.getArea());
    
    System.out.println("Diameter AVG: " + Circle.avgDiameter + ", Default Color: " + Circle.DEFAULT_COLOR);
  }
}
