package hn.com.basa.conceptos.basicos;

public class NumerosPrimos_02 {
    public static void main(String[] args) {
        String resultado = "";
        int contador = 0;
        int numeros = 1;
        while ( contador < 100 ) {
            if ( esNumeroPrimo( numeros ) ) {
                resultado += numeros + ", ";
                contador ++;
            }
            numeros ++;
        }
        System.out.println(resultado);
    }
    
    private static Boolean esNumeroPrimo ( Integer numero ) {
        
        Boolean esPrimo = true;
        
        for ( int i = 2; i <= numero ; i++ ) {
            Boolean esPar = numero % i == 0;
            if ( !esPar ) {
                esPrimo = false;
            }
        }
        
        return esPrimo;
        
    }
}
