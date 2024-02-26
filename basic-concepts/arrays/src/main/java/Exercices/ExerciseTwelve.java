package Exercices;

import java.util.Scanner;

public class ExerciseTwelve {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int array[];
    int nElements;
    int pairCounter = 0;
    int impairCounter = 0;
    int pairNumbers[];
    int impairNumbers[];
    
    System.out.println("Write the quantity of elements in your array: ");
    nElements = inputData.nextInt();
    array = new int[nElements];
    
    for (int i = 0; i < array.length; i++) {
      System.out.println("WRITE THE ELEMENT: ");
      array[i] = inputData.nextInt();
      if (array[i] % 2 == 0) {
        pairCounter += 1;
      } else {
        impairCounter += 1;
      }
    }
    
    pairNumbers = new int[pairCounter];
    impairNumbers = new int[impairCounter];
    pairCounter = 0;
    impairCounter = 0;
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        pairNumbers[pairCounter] = array[i];
        pairCounter += 1;
      } else {
        impairNumbers[impairCounter] = array[i];
        impairCounter += 1;
      }
    }
    
    System.out.println("PAIR NUMBERS");
    for (int i = 0; i < pairNumbers.length; i++) {
      System.out.println(pairNumbers[i]);
    }
    
    System.out.println("IMPAIR NUMBERS");
    for (int i = 0; i < impairNumbers.length; i++) {
      System.out.println(impairNumbers[i]);
    }
    
  }
  
}
