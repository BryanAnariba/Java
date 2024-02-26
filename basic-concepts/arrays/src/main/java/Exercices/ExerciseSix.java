package Exercices;

// Crear un arreglo de 10 elementos enteros y contar los elementos negativos, positivos, pares e impares

import java.util.Scanner;


public class ExerciseSix {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int numbers[] = new int[10];
    int negativeNumbers = 0;
    int positiveNumbers = 0;
    int pairNumbers = 0;
    int inPairNumbers = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Write the " + (i+1) + " number: ");
      numbers[i] = inputData.nextInt();
    }
    
    for (int i = 0; i < numbers.length; i++) {
      
      if (numbers[i] < 0) {
        negativeNumbers += 1;
      }
      
      if (numbers[i] >= 0) {
        positiveNumbers += 1;
      }
      
      if ((numbers[i] % 2) == 0) {
        pairNumbers += 1;
      } else {
        inPairNumbers += 1;
      }
      
    }
    
    System.out.println("=========RESULTS=========\nNEGATIVE NUMBERS: " + negativeNumbers + "\nPOSITIVE NUMBERS: " + positiveNumbers + "\nPAIR NUMBERS: " + pairNumbers + "\nIMPAIR NUMBERS: " + inPairNumbers);
    
  }
  
}
