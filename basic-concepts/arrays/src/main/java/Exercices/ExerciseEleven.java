package Exercices;

// Crear un arreglo de n elementos y dado ese arreglo separar los elementos positivos y negativos en diferentes arrays

import java.util.Scanner;


public class ExerciseEleven {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int array[];
    int nElements = 0;
    int positiveCounter = 0;
    int negativeCounter = 0;
    int zeroCounter = 0;
    int positiveArray[];
    int negativeArray[];
    
    System.out.println("Write the quantity of elements for you array: ");
    nElements = inputData.nextInt();
    
    array = new int[nElements];
    
    for (int i = 0; i < array.length; i++) {
      System.out.println("WRITE AN ELEMENT: ");
      array[i] = inputData.nextInt();
      
      if (array[i] > 0) {
        positiveCounter += 1;
      } else if (array[i] < 0) {
        negativeCounter += 1;
      } else {
        zeroCounter += 1;
      }
    }
    
    positiveArray= new int[positiveCounter];
    negativeArray = new int[negativeCounter];
    positiveCounter = 0;
    negativeCounter = 0;
    zeroCounter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        positiveArray[positiveCounter] = array[i];
        positiveCounter += 1;
      } else if (array[i] < 0) {
        negativeArray[negativeCounter] = array[i];
        negativeCounter += 1;
      } else {
        zeroCounter += 1;
      }
    }
    
    System.out.println("===POSITIVE NUMBERS===");
    for (int i = 0; i < positiveArray.length; i++) {
      System.out.println(positiveArray[i]);
    }
    
    System.out.println("===NEGATIVE NUMBERS===");
    for (int i = 0; i < negativeArray.length; i++) {
      System.out.println(negativeArray[i]);
    }
    
    System.out.println("Zeros founded: " + zeroCounter);
  }
  
}


