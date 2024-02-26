package Exercices;

import java.util.Scanner;

/*
  Llenar un arreglo de 10 elementos de tipo float e imprimirlos en orden
*/

public class ExerciseTwo {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    float numbers[] = new float[10];
    
    for(int i=0; i<numbers.length; i++) {
      System.out.println("Write the " + (i+1) + " number: ");
      numbers[i] = inputData.nextFloat();
    }
    
    for(int i=0; i<numbers.length; i++) {
      System.out.println((i+1) + " number is: " + numbers[i]);
    }
    
  }
  
}
