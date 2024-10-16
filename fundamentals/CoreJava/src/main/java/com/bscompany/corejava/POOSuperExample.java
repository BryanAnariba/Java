package com.bscompany.corejava;

class A {

    public A() {
        System.out.println("In A!");
    }
    
    public A(int n) {
        System.out.println("In A n!");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("In B!");
    }

    public B(int n) {
        super(n);
        System.out.println("In B n!");
    }
}

public class POOSuperExample {
    // 06: 00
    public static void main(String[] args) {
        B b = new B(5);
        // B b = new B();
    }
}
