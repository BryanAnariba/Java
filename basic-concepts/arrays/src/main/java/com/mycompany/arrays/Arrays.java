package com.mycompany.arrays;

public class Arrays {

  public static void main(String[] args) {
    
    int numbers[] = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 4;
    numbers[3] = 6;
    numbers[4] = 8;
      
    for (int i=0; i<numbers.length; i++) {
      System.out.println((i+1) + " Position is: " + numbers[i]);      
    }
    
  }
  
}
