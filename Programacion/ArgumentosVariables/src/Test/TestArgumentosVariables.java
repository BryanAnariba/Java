package Test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros( 1, 2 );
        imprimirNumerosConVariosParametros( "Bryan", 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 );
    }
    
    private static void imprimirNumerosConVariosParametros( String nombre, int... numeros ) { 
        System.out.println("Nombre: " + nombre);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + i + "= " + i);
        }
    }
    private static void imprimirNumeros( int... numeros ) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + i + "= " + i);
        }
    }
}
