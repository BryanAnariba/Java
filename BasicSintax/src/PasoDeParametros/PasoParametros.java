package PasoDeParametros;
public class PasoParametros {
    public static void main( String args[] ) {
        
        // POR VALOR
        int x = 10;
        System.out.println( "x = " + x );
        pasoParametrosPorValor(x);
        System.out.println( "x new value = " + x );
        
        // POR REFERENCIA
        //Persona persona = null;
        Persona persona = new Persona();
        persona.nombre = "Bryan Ariel";
        System.out.println("Nombre Persona valor inicial = " + persona.nombre);
        persona = pasoParametrosPorReferenciaCambioValor(persona);
        System.out.println("Nombre Persona valor final = " + persona.nombre);
        
    }
    
    public static void pasoParametrosPorValor ( int argumento1 ) {
        argumento1++;
        System.out.println( "argumento = " + argumento1 );
    }
    
    public static Persona pasoParametrosPorReferenciaCambioValor ( Persona persona ) {
        if ( persona == null ) {
            return persona;
        }
        persona.nombre = "Juanito";
        return persona;        
    }
    
}
