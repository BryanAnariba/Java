package test;

public class TestArreglos {
    public static void main(String[] args) {
        int arregloNumeros[] = new int[3];
        
        System.out.println("Arreglo Numeros Enteros referencia en memoria: " + arregloNumeros);
        
        arregloNumeros[0] = 10;
        arregloNumeros[1] = 11;
        arregloNumeros[2] = 12;
        System.out.println( "Que hay en la posicion 0 de mi arreglo: " + arregloNumeros[0] );
        System.out.println( "Que hay en la posicion 1 de mi arreglo: " + arregloNumeros[1] );
        System.out.println( "Que hay en la posicion 2 de mi arreglo: " + arregloNumeros[2] );
        
        System.out.println("-------------------------------");
        for ( int i = 0; i < arregloNumeros.length; i++ ) {
            System.out.println( "Valor del arreglo en la " + i + " posicion: " + arregloNumeros[i] );
        }
    }   
    
}
