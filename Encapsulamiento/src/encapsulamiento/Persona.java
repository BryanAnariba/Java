package encapsulamiento;
public class Persona {
    private String nombre = "";
    private double sueldo = 0;
    private boolean eliminado = false;
    private String estaEliminado = "No";
    
    public Persona ( String nombre, double sueldo, boolean eliminado ) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public void setNombre ( String nombre ) {
        this.nombre = nombre;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public void setSueldo ( double sueldo ) {
        this.sueldo = sueldo;
    }
    
    public double getSueldo () {
        return this.sueldo;
    }
    
    public void setEliminado ( boolean eliminado ) {
        this.eliminado = eliminado;
    }
    
    public boolean isEliminado () {
        return this.eliminado;
    }
    
    public String toString() {
        this.estaEliminado = this.eliminado ? "Si" : "No";
        return "Persona { nombre: " + 
                this.nombre + 
                ", sueldo: " + 
                this.sueldo  +
                ", eliminado: " +
                this.estaEliminado + " };";
    }
    
}
