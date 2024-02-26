package Exercices;

// Cargar un arreglo de n elementos, imprimir el menor y un mensaje si se repite dentro del arreglo

import java.util.Scanner;


public class ExerciseTen {
  
  public static void main(String[] args) {
    
   Scanner inputData= new Scanner(System.in);
   int nElements = 0;
   String words[];
   char repeatedWord = 'N';
   String minWord = "";
   int repeatedWordQ = 0;
   
    System.out.println("Write the quantity of positions of array: ");
    nElements = inputData.nextInt();
    
    words = new String[nElements];
    inputData.nextLine();
    for (int i = 0; i < words.length; i++) {
      System.out.println("Write the " + (i+1) + " word: ");
      words[i] = inputData.nextLine();
    }
    
    minWord = words[0];
    for (int i = 0; i < words.length; i++) { 
      if (words[i].length() < minWord.length()) {
        minWord = words[i];
      }
    }
    
    for (int i = 0; i < words.length; i++) { 
      if (words[i].equals(minWord)) {
        repeatedWordQ += 1;
      }
    }
    
    if (repeatedWordQ > 1) {
      repeatedWord = 'S';
    }
    System.out.println("Min word: " + minWord + ", this word are repeat (S/N): " + repeatedWord);
  }
  
}

