package com.bscompany.corejava;

// Actuan como interfaces pero deben de tener un metodo abstracto al menos y puede tener metodos normales, caso que interfaces no
abstract class Car {
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic () {
        System.out.println("I am playing music!!!");
    }
}

class Honda extends Car {

    @Override
    public void drive() {
        System.out.println("Honda is driving in v-tec motor!");
    }

    @Override
    public void fly() {
        System.out.println("Honda cannot fly!");
    }
    
}

public class AbstractClasses {
    public static void main(String[] args) {
        Honda hCivic = new Honda();
        hCivic.drive();
        hCivic.fly();
    }
}
