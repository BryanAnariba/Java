package com.bscompany.corejava;

class Calculator {
    
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
    
    public int mult(int n1, int n2) {
        return n1 * n2;
    }
    
    public int divide(int n1, int n2) {
        if (n1 > 0) return n1 / n2;
        return 0;
    }
}

class AdvanceCalculator extends Calculator {    
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("5+5="+cal.add(5, 5));
        System.out.println("5-5="+cal.sub(5, 5));
        System.out.println("5*5="+cal.mult(5, 5));
        System.out.println("5/5="+cal.divide(5, 5));  
        AdvanceCalculator advCal = new AdvanceCalculator();
        System.out.println("5 Elevated to 2=" + advCal.power(5, 2));
    }
}
