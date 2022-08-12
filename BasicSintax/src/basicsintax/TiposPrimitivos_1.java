/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicsintax;

/**
 *
 * @author Bryan
 */
public class TiposPrimitivos_1 {
    public static void main ( String[] args ) {
        byte numeroByte = 15;
        System.out.println( "Byte Number: " + numeroByte );
        System.out.println( "Byte Min Value: " + Byte.MIN_VALUE );
        System.out.println( "Byte Max Value: " + Byte.MAX_VALUE );
        short numeroShort = 0;
        System.out.println( "Short Number Value: " + numeroShort );
        System.out.println( "Short Min value: " + Short.MIN_VALUE );
        System.out.println( "Short Max Value: " + Short.MAX_VALUE );
        int numeroInt = 500000;
        System.out.println( "Int Number: " + numeroInt );
        System.out.println( "Int Min Value: " + Integer.MIN_VALUE );
        System.out.println( "Int Max Value: " + Integer.MAX_VALUE );
        long numeroLong = 922337203;
        System.out.println( "Long Number Value: " + numeroLong );
        System.out.println( "Long Min Value: " + Long.MIN_VALUE );
        System.out.println( "Long Max Value: " + Long.MAX_VALUE );
        float numeroFloat = (float)3.4028235E38F;
        System.out.println( "Float Number: " + numeroFloat );
        System.out.println( "Float Min Value: " + Float.MIN_VALUE );
        System.out.println( "Float Max Value: " + Float.MAX_VALUE );
        double numeroDouble = 15000000.52654;
        System.out.println( "Double Number Value: " + numeroDouble );
        System.out.println( "Double Min Value: " + Double.MIN_VALUE );
        System.out.println( "Double Max Value: " + Double.MAX_VALUE );
        
        var numeroUno = 15;
        System.out.println( "Var infiriendo valor en este caso entero: " + numeroUno );
        
        char isActive = 'S';
        System.out.println( "El usuario se encuentra activo: " + isActive );
        char varChar = '\u0021'; // codigo unicode !
        char varChar2 = 33; // numeric !
        char varChar3 = '!'; // Normal
        System.out.println("Unicode value: " + varChar );
        System.out.println("Unicode value 2: " + varChar2 );
        System.out.println("Unicode value 3: " + varChar3 );
        
        // BOOLS VALUES
        boolean isAdmin = true;
        int edad = 15;
        var isAdult = edad >= 18 ? true : false;
        if ( isAdmin ) {
            System.out.println( "You are administrator" );
        } else {
            System.out.println( "You are not administrator" );
        }
        
        if ( isAdult ) {
            System.out.println( "You are very old person" );
        } else {
            System.out.println( "You are very young person" );
        }
    }
}
