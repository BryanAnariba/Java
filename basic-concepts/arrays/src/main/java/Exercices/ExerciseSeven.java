package Exercices;

// Hallar el mayor y menor elemento de un array

import java.util.Scanner;


public class ExerciseSeven {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int numbers[];
    int nElements = 0;
    int minorElement = 0;
    int majorElement = 0;
    
    System.out.println("Write the positions of array: ");
    nElements = inputData.nextInt();
    if (nElements < 0) {
      System.out.println("The quantity should not be minor than zero!");
      System.exit(0);
    }
    numbers = new int[nElements];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Write the " + (i+1) + " number: ");
      numbers[i] = inputData.nextInt();
    }
    
    minorElement = numbers[0];
    majorElement = numbers[0];
    
    for(int i = 0; i < numbers.length; i++) {
      
      if (numbers[i] < minorElement) {
        minorElement = numbers[i];
      }
      
      if (numbers[i] > majorElement) {
        majorElement = numbers[i];
      }
      
    }
    
    System.out.println("Major Element: " + majorElement);
    System.out.println("Minor Element: " + minorElement);
    
  }
  
}
