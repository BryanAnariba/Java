package Exercices;

import java.util.Scanner;

/*
  Cargar un arreglo de nElementos y verificar posteriormente si el mismo esta
  en forma creciente, decreciente o desordenado, no se admiten negativos solo
  numeros positivos
*/

public class ExerciseFive {

  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    int numbers[];
    int element = 0;
    boolean inIncrease = false;
    boolean inDecrease = false;
    boolean unOrdered = false;
    boolean isNegative = false;
    
    System.out.println("Write the longitude of array: ");
    element = inputData.nextInt();
    
    if (element < 0) {
      System.out.println("Incorrect number, should be a positive number");
      System.exit(0);
    }
    
    numbers = new int[element];
    do {
      for (int i = 0; i < numbers.length; i++) {
        System.out.println("Write the first number, should be an positive number: ");
        numbers[i] = inputData.nextInt(); 
      }
      
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) {
          isNegative = true;
          break;
        } else {
          isNegative = false;
        }
      }
      
      if (isNegative) {
        System.out.println("Please write your numbers again because this array contains negative numbers.");
      }
      
    } while (isNegative == true);     
    
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] < numbers[i+1]) {
        inIncrease = true;
      } 
      if (numbers[i] > numbers[i+1]) {
        inDecrease = true;
      } 
    }
    
    if (inIncrease == true && inDecrease == false) {
      System.out.println("The numbers array is increasing");
    } else if (inIncrease == false && inDecrease == true) {
      System.out.println("The numbers array is decreasing");
    } else if (inIncrease == true && inDecrease == true) {
      System.out.println("The numbers array is unordering");
    } else {
      System.out.println("The numbers array are equals");
    }
  }
  
}
