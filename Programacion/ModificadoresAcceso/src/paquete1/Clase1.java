package paquete1;

public class Clase1 {
    protected String atributoProtected = "Atributo protegido";
    
    protected Clase1() {
        System.out.println("Constructor protected Clase1");
    }
    
    public Clase1( String arg ) {
        System.out.println("Constructor public Clase1");
    }
    
    public void metodoProtected () {
        System.out.println("METODO PROTECTED CLASE1");
    }
}
