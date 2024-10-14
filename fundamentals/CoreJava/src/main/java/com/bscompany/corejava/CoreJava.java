package com.bscompany.corejava;

public class CoreJava {

  public static void main(String[] args) {
    // Data Types Primitives:
    float average = 7.16f;
    byte by = 127;
    short sh = 558;
    long lo = 4568l;
    boolean isMinor = false;
    int numberOne = 10;
    int numberTwo = 12;
    int result = numberOne + numberTwo;
    char isActive = 'S';
    System.out.println(
      "Result: " + result + 
      "\nAvg: " + average + 
      "\nIs active: " + isActive + 
      "\nbyte Value: " + by + 
      "\nShort Value: " + sh + 
      "\nLong Value: " + lo + 
      "\nBoolean Value: " + isMinor
    );

    // Casting and conversion:
    byte b = 125;
    int a = 257;
    byte k = (byte)a;
    float f = 5.6f;
    int t = (int)f;
    System.out.println(
      "b = " + b + 
      ", a = " + a + 
      ", k = " + k +
      ", t = " + t
    );
  }
}
