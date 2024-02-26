package Exercices;

import java.util.Scanner;

/*
  Llenar un arreglo de 5 elementos e imprimirlos en orden
*/

public class ExerciseOne {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int number;
    int numbers[] = new int[5];
    
    for(int i=0; i<numbers.length; i++) {
      System.out.println("Write the " + (i+1) + " number: ");
      number = inputData.nextInt();
      numbers[i] = number;
    }
        
    for(int i=0; i<numbers.length; i++) {
      System.out.println((i+1) + " number is: " + numbers[i]);
    }
    
  }
  
}
