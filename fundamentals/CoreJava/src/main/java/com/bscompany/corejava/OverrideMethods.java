package com.bscompany.corejava;

class AB {
    
    public int add (int n1, int n2) {
        return n1 + n2;
    }

    public void show() {
        System.out.println("print in show AB!");
    }
    
    public void config() {
        System.out.println("print in config AB!");
    }
}

class BA extends AB {

    @Override
    public int add (int n1, int n2) {
        return n1 + n2;
    }
    
    @Override
    public void show() {
        System.out.println("print in show BA!");
    }
}

public class OverrideMethods {

    public static void main(String[] args) {
        AB ab = new AB();
        ab.show();
        System.out.println(ab.add(5, 5));
        BA ba = new BA();
        ba.show(); // Este llama el metodo sobreescrito
        System.out.println(ba.add(5,5)); // Este llama el metodo sobreescrito
    }
}
