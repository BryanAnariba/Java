package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("Edades: " + edades);
        
        edades[0][0] = 25;
        edades[0][1] = 24;
        edades[1][0] = 23;
        edades[1][1] = 22;
        edades[2][0] = 21;
        edades[2][1] = 20;
        System.out.println("Edad en fila 0 columna 0 = " + edades[0][0]);
        System.out.println("Edad en fila 0 columna 1 = " + edades[0][1]);
        System.out.println("Edad en fila 1 columna 0 = " + edades[1][0]);
        System.out.println("Edad en fila 1 columna 1 = " + edades[1][1]);
        System.out.println("Edad en fila 2 columna 0 = " + edades[2][0]);
        System.out.println("Edad en fila 2 columna 1 = " + edades[2][1]);
        
        
        System.out.println("==========================");
        System.out.println("====IMPRMIENDO CON FOR====");
        System.out.println("==========================");
        
        for ( int filas = 0; filas < edades.length; filas++ ) {
            for ( int columnas = 0; columnas < edades[filas].length; columnas++  ) {                
                System.out.println("Edad en la fila " + filas + " columna " + columnas + " = " + edades[filas][columnas] );
            }
        }
        System.out.println("============================");
        System.out.println("====IMPRMIENDO CON FOR 2====");
        System.out.println("============================");
        String frutas[][] = new String[3][2];
        String frutasSintaxisSimplicada[][] = { { "Naranja", "Limon" }, { "Fresa", "Mora" } };
        for ( int filaFrutaSimplificada = 0; filaFrutaSimplificada < frutasSintaxisSimplicada.length; filaFrutaSimplificada++ ) {
            for ( int columnaFrutaSimplificada = 0; columnaFrutaSimplificada < frutasSintaxisSimplicada[filaFrutaSimplificada].length; columnaFrutaSimplificada++ ) {
                System.out.println("Fruta en fila " + filaFrutaSimplificada + " columna " + columnaFrutaSimplificada + " = " + frutasSintaxisSimplicada[filaFrutaSimplificada][columnaFrutaSimplificada] );
            }
        }
        
        // CREANDO MATRIZ DE TIPO OBJETO PERSONA
        System.out.println("=====================================");
        System.out.println("CREANDO MATRIZ DE TIPO OBJETO PERSONA");
        System.out.println("=====================================");
        Persona matrizPersona[][] = new Persona[2][3];
        matrizPersona[0][0] = new Persona( "Bryan" );
        matrizPersona[0][1] = new Persona( "Ariel" );
        matrizPersona[0][2] = new Persona( "Erick" );
        matrizPersona[1][0] = new Persona( "David" );
        matrizPersona[1][1] = new Persona( "Juan" );
        matrizPersona[1][2] = new Persona( "Juana" );
        
        for ( int personaFila = 0; personaFila < matrizPersona.length; personaFila++ ) {
            for ( int personaColumna = 0; personaColumna < matrizPersona[personaFila].length; personaColumna++ ) {
                System.out.println("{ fila: " + personaFila + ", columna: " + personaColumna + ", valor: " + matrizPersona[personaFila][personaColumna].getNombrePersona() + " }");
            }
        }
    }
}
