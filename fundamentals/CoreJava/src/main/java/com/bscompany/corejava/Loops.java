package com.bscompany.corejava;

public class Loops {
    public static void main(String[] args) {
        /*While loop*/
        int counter = 1;
        while (counter <= 3) {
            System.out.println("Hi!");
            counter ++;
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello!");
                j++;
            }
        }
        System.out.println("Bye!");
        
        /*Do while loop*/
        int i = 1;
        do {
            System.out.println("Hi in do while!");
            i++;
        } while (i <= 4);
        
        /*For loop*/
        for (int k = 1; k <= 4; k++) {
            System.out.println("Hi in for!");
        }
        
        for (int j=1; j<=5; j++) {
            System.out.println("Day " + j + "!");
            for (int h=1;h<=9;h++) {
                System.out.println("    " + (h+8) + " - " + (h+9));
            }
        }
    }
}
