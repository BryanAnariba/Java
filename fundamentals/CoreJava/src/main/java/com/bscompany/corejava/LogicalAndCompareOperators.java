package com.bscompany.corejava;

public class LogicalAndCompareOperators {
  public static void main(String[] args) {
  
      int x = 7;
      int y  = 5;
      int a = 5;
      int b = 9;

      boolean result = x > y || a > b || a > 1;
      System.out.println(!result); 
  }
}
