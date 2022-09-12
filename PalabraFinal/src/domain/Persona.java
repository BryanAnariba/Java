package domain;

//public final class Persona {
public class Persona {
    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public final static int MI_CONSTANTE = 1; // en java esto es una constante
//    public final void imprimir() {
    public void imprimir() {
        System.out.println("metodo imprimir desde clase padre");
    }
}
