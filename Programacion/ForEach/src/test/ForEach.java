package test;

import domain.Persona;

public class ForEach {
    public static void main(String[] args) {
        int edades[] = new int[4];
        edades[0] = 21;
        edades[1] = 22;
        edades[2] = 23;
        edades[3] = 24;
        
        for( int edad: edades ) {
            System.out.println("Edad: " + edad);
        }
        
        Persona personas[] = new Persona[ 3 ];
        personas[0] = new Persona( "Bryan" );
        personas[1] = new Persona( "Ariel" );
        personas[2] = new Persona( "Erick" );
        
        for ( Persona p: personas ) {
            System.out.println(p);
        }
    }
}
