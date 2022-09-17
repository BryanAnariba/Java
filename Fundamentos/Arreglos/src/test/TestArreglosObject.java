package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main( String[] args ) {
        String personasArray[] = { "Merary", "Karla", "Bonnie" };
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona( "Bryan" );
        personas[1] = new Persona( "Ariel" );
        
        
        System.out.println( "Persona 1: " + personas[0] + ", Nombre: " + personas[0].getNombrePersona() );
        System.out.println( "Persona 2: " + personas[1] + ", Nombre: " + personas[1].getNombrePersona() );
        
        System.out.println("-----------------------------------");
        Persona personasList[] = new Persona[3];
        
        for ( int k = 0; k < personasArray.length; k++ ) {
            personasList[k] = new Persona( personasArray[k] );
        }
                
        for( int i = 0; i < personasList.length; i++ ) {
            System.out.println( "Persona: " + i + ": " + personasList[i].getNombrePersona() );
        }
    }
}
