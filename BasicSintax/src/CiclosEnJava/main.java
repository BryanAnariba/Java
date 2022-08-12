/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CiclosEnJava;

/**
 *
 * @author Bryan
 */
public class main {
    public static void main ( String[] args ) {
        // CICLO WHILE
        int contador = 0;
        while ( contador <= 3 ) {
            System.out.println( "Contador While: " + contador );
            contador++;
        }
        
        // CICLO DO WHILE
        contador = 0;
        do {
            System.out.println( "Contador Do While: " + contador );
            contador++;
        } while ( contador <= 3 );
        
        // CICLO FOR
        for ( int i = 0; i <=3; i++ ) {
            System.out.println( "Contador For Asc: " + i );
        }
        
        //inicio:
        for ( int i = 3; i >=0; i-- ) {
            if ( i == 2 ) {
                continue; // se salta la impresion de dos
                //break; // saca del bucle o lo rompe
            } else {
                System.out.println( "Contador For Desc: " + i );
            }
        }
    }
}
