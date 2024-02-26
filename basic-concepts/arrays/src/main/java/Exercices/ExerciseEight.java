package Exercices;

// Crear un array de tipo String de 20 elementos y mostrar por pantalla el elemento con mayor letras

import java.util.Scanner;


public class ExerciseEight {
  
  public static void main(String[] args) {
    
    Scanner inputData = new Scanner(System.in);
    String words[] = new String[20];
    String wordWithMajorLenght = "";
    int positicionWordWithMajorLenght = 0;
    
    for (int i = 0; i < words.length; i++) {
      System.out.println("Write the " + (i+1) + " Word: ");
      words[i] = inputData.nextLine();
    }
    
    wordWithMajorLenght = words[0];
    
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > wordWithMajorLenght.length()) {
        wordWithMajorLenght = words[i];
        positicionWordWithMajorLenght = i;
      }
    }
   
    System.out.println("Word with major length is: " + wordWithMajorLenght + " position: " + positicionWordWithMajorLenght);
    
  }
  
}
