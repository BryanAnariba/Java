
package test;

import operaciones.Operaciones;
public class testOperaciones {
    public static void main(String[] args) {
       int result = Operaciones.sumar(5, 3);
       System.out.println("Resultado: " + result);
        
       double result2 = Operaciones.sumar( 1, 1.0 );
       System.out.println("Result: " + result2);
    }
}
