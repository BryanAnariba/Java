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
public class TiendaLibrosEjercicio {
    public static void main ( String[] args ) {
        String nombre = "";
        int id = 0;
        double precio = 0.00;
        boolean envioGratuito = false;
        Scanner consola = new Scanner( System.in );
        
        System.out.println( "Proporciona el nombre:" );
        nombre = consola.nextLine();
        System.out.println( "Proporciona el Id:" );
        id = Integer.parseInt( consola.nextLine() );
        System.out.println( "Proporciona el precio:" );
        precio = Double.parseDouble( consola.nextLine() );
        System.out.println( "Proporciona el envio gratuito:" );
        envioGratuito = Boolean.parseBoolean( consola.nextLine() );
        
        System.out.println( nombre + " #" + id );
        System.out.println( "Precio: $" + precio );
        System.out.println( "Envio Gratuito: " + envioGratuito );
    }
}
