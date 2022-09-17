package test;

import contextoestatico.Persona;

public class PersonaPrueba {
// esto no se puede hacer desde un metodo static
//    private int contador;
//    this.contador = 1;
    
    public static void main(String[] args) {
        Persona personaUno = new Persona( "Bryan Anariba" );
        imprimir( personaUno );
        Persona personaDos = new Persona( "Ariel Sanchez" );
        imprimir( personaDos );
       
    }
    
    // SI LLAMAMOS METODOS DESDE UN ESTATICO EL METODO A LLAMAR DEBE SER STATIC OSEA IMPRIMIR DEBE SER STATIC
    public static void imprimir ( Persona persona) { 
        System.out.println( "Persona: " + persona );
    }
}
