package Exercices;

import java.util.Scanner;

public class ExersiceNine {

  public static void main(String[] args) {
    
    String names[] = new String[5];
    int ages[] = new int[5];
    Scanner inputData = new Scanner(System.in);
    
    for (int i = 0; i < names.length; i++) {
      System.out.println("Write the " + (i+1) + " name: ");
      names[i] = inputData.nextLine();
      System.out.println("Write the " + (i+1) + " age: ");
      ages[i] = inputData.nextInt();
      inputData.nextLine();
    }
    
    System.out.println("=====ADULTS PERSONS=====");
    for(int i = 0; i < ages.length; i++) {
      if (ages[i] > 18) {
        System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
      }
    }
  }
  
}

