package test;

import encapsulamiento.Persona;

public class Encapsulamiento {

    public static void main(String[] args) {
        String eliminado = "";
        Persona persona1 = new Persona( "Bryan Ariel Sanchez Anariba", 1000.99, true );
        System.out.println( "Nombre Persona: " + persona1.getNombre() );
        persona1.setSueldo( 2000.99 );
        System.out.println( "Sueldo Persona: " + persona1.getSueldo() );
        eliminado = persona1.isEliminado() ? "Si": "No";
        System.out.println( "La Persona se encuentra eliminada: " + eliminado );
        System.out.println("");
        System.out.println("toString()");
        System.out.println( persona1.toString() );
    }
    
}
