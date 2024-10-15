package com.bscompany.corejava;

public class Strings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Kakaroto");
        sb.append(" Perez");
        String name = "Goku";
        String secondName = "Goku Perez";
        name = name + " Perez";
        
        System.out.println(
            "Name: " + name + 
            "\nHashcode: " + name.hashCode() +
            "\nUppercase Name: " + name.toUpperCase() +
            "\nLowercase Name: " + name.toLowerCase() +
            "\nName == secondName: " + name.equals(secondName) +
            "\nsb: " + sb.toString()
        );
    }
}
