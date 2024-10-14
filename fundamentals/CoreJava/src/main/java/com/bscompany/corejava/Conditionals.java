package com.bscompany.corejava;

public class Conditionals {
  public static void main(String[] args) {
    int x = 8;
    int y = 7;
    int z = 6;
    if (x > y && x > z) {
      System.out.println("x = " + x);
    } else if (y > x && y > z) {
      System.out.println("y = " + y);
    } else {
      System.out.println("z = " + z);
    }
    
    int n = 4;
    int result = n % 2 == 0 ? 10 : 20;
    System.out.println(result);
  }
}
