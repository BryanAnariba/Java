package app;

import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args) {
    Scanner inputKeyboard = new Scanner(System.in);
    String completeName;
    int numberOne;
    int numberTwo;
    int add;
    System.out.println("Write your name: ");
    completeName = inputKeyboard.nextLine();
    System.out.println("Write the first number: ");
    numberOne = inputKeyboard.nextInt();
    System.out.println("Write the second number: ");
    numberTwo = inputKeyboard.nextInt();
    add = numberOne + numberTwo;
    System.out.println("Welcome " + completeName + " your Add is: " + add);
    inputKeyboard.close();
  }
}
