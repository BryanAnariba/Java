package CreacionDeClasesEnJava;

public class Main {
    public static void main ( String[] args ) {
        Persona personaUno = new Persona();
        personaUno.nombre = "Bryan Ariel";
        personaUno.apellido = "Sanchez Anariba";
        System.out.println( "Nombre Completo: " + personaUno.getNombreCompleto() );
        
        Persona personaDos = new Persona();
        personaDos.nombre = "Maria Fernanda";
        personaDos.apellido = "Sanchez Anariba";
        System.out.println( "Nombre Completo: " + personaDos.getNombreCompleto() );
        
        System.out.println( "Persona uno en memoria: " + personaUno );
        System.out.println( "Persona dos en memoria: " + personaDos );
    }
}
