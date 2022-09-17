/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class main {
    public static void main ( String[] args ) {
        // ===============================>  ESTRUCTURA IF
        var condicion = true;
        if ( condicion ) {
            System.out.println( "Condicion Verdadera" );
        } else {
            System.out.println( "Condicion Falsa" );
        }
        
        var numero = 3;
        var numeroTexto = "";
        
        if ( numero == 1 ) {
            numeroTexto = "Numero Uno";
        } else if ( numero == 2 ) {
            numeroTexto = "Numero Dos";
        } else if ( numero == 3 ) {
            numeroTexto = "Numero Tres";
        } else {
            numeroTexto = "Numero Desconocido";
        }
        System.out.println( numeroTexto );
        
        // Calculo de la estaciones del anio
        var mes = 0;
        var estacion = "";
        Scanner entradaDatos = new Scanner( System.in );
        System.out.println("Digite el mes:");
        mes =  Integer.parseInt( entradaDatos.nextLine() );
        if ( mes == 1 || mes == 2 || mes == 12 ) {
            estacion = "Estamos en Invierno";
        } else if ( mes == 3 || mes == 4 || mes == 5 ) {
            estacion = "Estamos en Primavera";
        } else if ( mes == 6 || mes == 7 || mes == 8 ) {
            estacion = "Estamos en Verano";
        } else if ( mes == 9 || mes == 10 || mes == 11 ) {
            estacion = "Estamos en Otonio";
        } else {
            estacion = "Estacion Desconocida";
        }
        System.out.println( estacion );
        
        // ===============================> ESTRUCTURA SWITCH
        var numeroATexto = 2;
        var texto = "";
        switch ( numeroATexto ) {
            case 1:
                texto = "Uno";
            break;
            case 2:
                texto = "Dos";
            break;
            case 3:
                texto = "Tres";
            break;
            case 4:
                texto = "Cuatro";
            break;
            case 5:
                texto = "Cinco";
            break;
            default:
                texto = "Numero No Contemplado";
            break;
        }
        System.out.println("Numero: " + numeroATexto + " a letra es: " + texto);
        
        // ESTACIONES DEL ANIO CON SWITCH
        switch ( mes ) {
            case 1: case 2: case 12:
                estacion = "Estamos en Invierno";
            break;
            case 3: case 4: case 5:
                estacion = "Estamos en Primavera";
            break;
            case 6: case 7: case 8:
                estacion = "Estamos en Verano";
            break;
            case 9: case 10: case 11:
                estacion = "Estamos en Otonio";
            break;
            default:
                estacion = "Estacion Desconocida";
            break;
        }
        System.out.println( estacion );
        
        // EJERCICIO
        /*
            El usuario proporcionará un valor entre 0 y 10.

            Si está entre 9 y 10: imprimir una A

            Si está entre 8 y menor a 9: imprimir una B

            Si está entre 7 y menor a 8: imprimir una C

            Si está entre 6 y menor a 7: imprimir una D

            Si está entre 0 y menor a 6: imprimir una F

            cualquier otro valor debe imprimir: Valor desconocido
            Proporciona un valor entre 0 y 10:
            A
        */
        double notaAlumno = 0;
        System.out.println("Proporciona un valor entre 0 y 10");
        notaAlumno = Double.parseDouble( entradaDatos.nextLine() );
        var indice = "";
        if ( notaAlumno >= 9 && notaAlumno <= 10 ) {
            indice = "A";
        } else if ( notaAlumno >= 8 && notaAlumno < 9 ) {
            indice = "B";
        } else if ( notaAlumno >= 7 && notaAlumno < 8 ) {
            indice = "C";
        } else if ( notaAlumno >= 6 && notaAlumno < 7 ) {
            indice = "D";
        } else if ( notaAlumno >= 0 && notaAlumno < 6 ) {
            indice = "F";
        } else {
            indice = "Invalid";
        }
        System.out.println( indice );
    }
}
