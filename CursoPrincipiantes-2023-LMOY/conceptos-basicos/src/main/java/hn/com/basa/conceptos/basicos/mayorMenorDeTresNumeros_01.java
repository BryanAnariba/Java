package hn.com.basa.conceptos.basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mayorMenorDeTresNumeros_01 {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader entradaDatosPorConsola = new InputStreamReader( System.in );
        BufferedReader buffer = new BufferedReader( entradaDatosPorConsola );
        
        System.out.println("Escriba el primer numero: ");
        int numeroUno = Integer.parseInt(buffer.readLine());
        
        System.out.println("Escriba el segundo numero: ");
        int numeroDos = Integer.parseInt(buffer.readLine());
        
        System.out.println("Escriba el tercer numero: ");
        int numeroTres = Integer.parseInt(buffer.readLine());

        calcularMayorTresNumeros( numeroUno, numeroDos, numeroTres );
        calcularMenorTresNumeros( numeroUno, numeroDos, numeroTres );
    }
    
    private static void calcularMayorTresNumeros ( int numeroUno, int numeroDos, int numeroTres ) {
        String response = "";
        if ( numeroUno > numeroDos && numeroUno > numeroTres ) {
            response = "El numero mas grande es el " + numeroUno;
        }
        
        if ( numeroDos > numeroUno && numeroDos > numeroTres ) {
            response = "El numero mas grande es el " + numeroDos;
        }
        
        if ( numeroTres > numeroUno && numeroTres > numeroDos ) {
            response = "El numero mas grande es el " + numeroTres;
        }
        
        if ( numeroUno == numeroDos && numeroUno == numeroTres  ) {
            response = "Los Numeros son iguales";
        }
        
        System.out.println(response);
    } 
    
    private static void calcularMenorTresNumeros ( int numeroUno, int numeroDos, int numeroTres ) {
        String response = "";
        if ( numeroUno < numeroDos && numeroUno < numeroTres ) {
            response = "El numero mas chikito es el " + numeroUno;
        }
        
        if ( numeroDos < numeroUno && numeroDos < numeroTres ) {
            response = "El numero mas chikito es el " + numeroDos;
        }
        
        if ( numeroTres < numeroUno && numeroTres < numeroDos ) {
            response = "El numero mas chikito es el " + numeroTres;
        }
        
        if ( numeroUno == numeroDos && numeroUno == numeroTres  ) {
            response = "Los Numeros son iguales";
        }
        
        System.out.println(response);
    } 
    
}
