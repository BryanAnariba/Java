package test;

import Excepciones.OperacionExcepcion;
import aritmetica.Aritmetica;

public class TestExepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division( 10, 0);
            //resultado = 10/0;
        } catch( OperacionExcepcion ex ) {
            System.out.println("Ha ocurrido un error de tipo Operacion Excepcion: " + ex.getMessage());
        } catch ( Exception ex ) {
            //System.out.println("Error: " + ex);
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Este bloque de finally siempre se ejecuta, util para cerrar conexiones");
        }
        System.out.println("Resultado: " + resultado);
    }
}
