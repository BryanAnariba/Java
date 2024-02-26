package Exercices;

// INVERTIR UN ARRAY DE NELEMENTOS

import java.util.Scanner;


public class ExerciseThirteen {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int array[];
    int nElement = 0;
    
    System.out.println("Write the quantity of elements of your array: ");
    nElement = inputData.nextInt();
    array = new int[nElement];
    
    for (int i = 0; i < array.length; i++) {
      System.out.println("WRITE AN ELEMENT: ");
      array[i] = inputData.nextInt();
    }
    
//    for(int i=0; i<array.length; i++) {
//      System.out.println(array[i]);
//    }
    
    System.out.println("INVERTED ARRAY");
    for(int i=array.length - 1; i>=0; i--) {
      System.out.println(array[i]);
    }
  }
  
}
