package com.bscompany.corejava;

class classA {

    public void show() {
        System.out.println("ClassA show!");
    }
}

class ClassB extends classA {

    @Override
    public void show() {
        System.out.println("ClassB show!");
    }
}

class ClassC extends classA {

    @Override
    public void show() {
        System.out.println("ClassC show!");
    }
}

public class Polymorphim {

    // 07:41
    public static void main(String[] args) {
        classA ca = new classA();
        ca.show();

        ClassB cb = new ClassB();
        cb.show();
    }
}
