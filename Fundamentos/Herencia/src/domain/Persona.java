package domain;

public class Persona {
    protected String nombrePersona = "";
    protected char generoPersona;
    protected int edadPersona = 0;
    protected String direccionPersona = "";
    
    public Persona () {
        
    }
    
    public Persona ( String nombrePersona ) {
        this.nombrePersona = nombrePersona;
    }
    
    public Persona ( String nombrePersona, char generoPersona, int edadPersona, String direccionPersona ) {
        this.nombrePersona = nombrePersona;
        this.generoPersona = generoPersona;
        this.edadPersona = edadPersona;
        this.direccionPersona = direccionPersona;
    }

    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public char getGeneroPersona() {
        return this.generoPersona;
    }

    public void setGeneroPersona(char generoPersona) {
        this.generoPersona = generoPersona;
    }

    public int getEdadPersona() {
        return this.edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public String getDireccionPersona() {
        return this.direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", generoPersona=" + generoPersona + ", edadPersona=" + edadPersona + ", direccionPersona=" + direccionPersona + '}';
    }
}
