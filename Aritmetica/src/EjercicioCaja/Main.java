package EjercicioCaja;

public class Main {
    public static void main( String[] args ) {
        Caja miCubito = new Caja();
        System.out.println( "Objecto en memoria => " + miCubito );
        
        miCubito.setAlto( 2 );
        miCubito.setAncho( 3 );
        miCubito.setProfundidad( 6 );
        
        double volumen = miCubito.getVolumenCaja();
        
        System.out.println( "El volumen de la caja 1 es: " + volumen );
        
        Caja miSegundoCubito = new Caja( 5, 5, 5 );
        volumen = miSegundoCubito.getVolumenCaja();
        System.out.println( "El volumen de la caja 2 es: " + volumen );
        
    }
}
