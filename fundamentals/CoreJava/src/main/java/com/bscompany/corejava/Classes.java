package com.bscompany.corejava;

class Calculator {
    public int add (int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    
    public int add (int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }
}

public class Classes {
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}
