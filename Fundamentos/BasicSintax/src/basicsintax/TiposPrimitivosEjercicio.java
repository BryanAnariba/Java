/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicsintax;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class TiposPrimitivosEjercicio {
    public static void main ( String[] args ) {
        var edad = Integer.parseInt( "25" );
        var PI = Double.parseDouble( "3.1416" );
        System.out.println( "Age Value: " + ( edad + 1 ) + " anios ");
        System.out.println( "PI Value: " + PI );
        
        var consola = new Scanner( System.in );
        System.out.println( "Write your age: " );
        edad = Integer.parseInt( consola.nextLine() );
        System.out.println( "New Age value: " + edad );
        
        var edadEnTexto = String.valueOf( 25 );
        System.out.println( "Edad en texto: " + edadEnTexto  );
        
        var character = "Works".charAt( 1 ); // o -> retorna el valor en la posicion que tu indiques de todo el texto
        System.out.println("Character returned: " + character);
        
        System.out.println( "Write a character" );
        character = consola.nextLine().charAt( 0 );
        System.out.println( "Your character is: " + character );
        
    }
}
