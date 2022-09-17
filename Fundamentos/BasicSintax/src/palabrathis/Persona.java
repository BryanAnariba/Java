package palabrathis;
public class Persona {
    public String nombre = "";
    public String apellido = "";
    
    Persona ( String nombre, String apellido ){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println( "IMPRIMIENTO DESDE LA CLASE PERSONA: " + this );
        System.out.println("");
        new Impresion().imprimir(this);
        //System.out.println( "IMPRIMIENTO NOMBRE DESDE LA CLASE PERSONA: " + this.nombre + ', ' + this.apellido );
    }
    
}
