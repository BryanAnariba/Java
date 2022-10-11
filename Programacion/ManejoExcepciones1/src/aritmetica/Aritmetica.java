
package aritmetica;

import Excepciones.OperacionExcepcion;

public class Aritmetica {
    
    // si le quitas el RunTimeException y Pones Exception entonces comenta el sgundo y descomenta el primero
    //public static int division ( int numerador, int denominador ) throws OperacionExcepcion {
    
    public static int division ( int numerador, int denominador ) {
        if ( denominador == 0 ) {
            throw new OperacionExcepcion( "No se puede dividir por cero" );
        } 
        return numerador / denominador;
    }
}
