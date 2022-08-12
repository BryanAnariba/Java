package operaciones;

public class PruebaAritmetica {
    public static void main( String[] args ) {
        // VARIABLES LOCALES
        int a = 10;
        int b = 12;
        
        Aritmetica valorUnoAritmetica = new Aritmetica( 0, 0 );
        
        valorUnoAritmetica.setA( 5 );
        valorUnoAritmetica.setB( 10 );
        System.out.println("=========================OBJETO 1===========================\n");
        System.out.println( 
            "Suma de " + 
            valorUnoAritmetica.getA() +
            "+" +
            valorUnoAritmetica.getB() +
            "=" + valorUnoAritmetica.getSuma() 
        );
        valorUnoAritmetica.getResta();
        
        System.out.println("=========================OBJETO 2===========================\n");
        Aritmetica valorDosAritmetica = new Aritmetica();
        valorDosAritmetica.setA( a );
        valorDosAritmetica.setB( b );
        valorDosAritmetica.getResta();
        
        System.out.println("\n");
        miMetodo();
    }
    
    public static void miMetodo () {
        System.out.println("OTRO METODO FUERA DEL MAIN: las variables creadas en el main no se pueden acceder aca eso se debe por el alcance o ambito de variables");
    }
    
}
