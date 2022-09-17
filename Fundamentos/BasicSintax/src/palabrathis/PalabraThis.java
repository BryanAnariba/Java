package palabrathis;
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona( "Bryan Ariel", "Sanchez Anariba" );
        System.out.println("");
        System.out.println("Persona DESDE EL MAIN = " + persona );
        System.out.println( "Nombre DESDE EL MAIN: " + persona.nombre + ", Apellido DESDE EL MAIN: " + persona.apellido );
    }
}

