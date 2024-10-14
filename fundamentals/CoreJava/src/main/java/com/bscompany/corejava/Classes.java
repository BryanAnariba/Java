package com.bscompany.corejava;

class Calculator {
    private int numberOne;
    private int numberTwo;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public int add () {
        return this.numberOne + this.numberTwo;
    }
    
    public int substract () {
        return this.numberOne - this.numberTwo;
    }
    
    public int product () {
        return this.numberOne * this.numberTwo;
    }
    
    public double divide () {
        return this.numberOne / this.numberTwo;
    }

    public Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    
    
}

public class Classes {
    public static void main(String[] args) {
        // 03: 15
        Calculator calculator = new Calculator(5,6);
        System.out.println("Add 5 + 6 = " + calculator.add());
    }
}
