package com.bscompany.corejava;

interface Computer {
    void code ();
}

class Laptop implements Computer {
    @Override
    public void code () {
        System.out.println("Code, compile, run!");
    }
}

class Desktop implements Computer {
    @Override
    public void code () {
        System.out.println("Code, compile, run faster!");
    }
}

class Developer {
    public void devApp (Computer computer) {
        computer.code();
    }
}

public class InterfacesConcept {
    public static void main(String[] args) {
        Computer d = new Desktop();
        Computer l = new Laptop();
        Developer fs =  new Developer();
        fs.devApp(l);
        fs.devApp(d);
    }
}
