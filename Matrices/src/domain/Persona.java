package domain;

public class Persona {
    private String nombrePesona = "";
    
    public Persona ( String nombrePersona ) {
        this.nombrePesona = nombrePersona;
    }
    
    public void setNombrePersona( String nombrePersona ) {
        this.nombrePesona = nombrePersona;
    }
    
    public String getNombrePersona() {
        return this.nombrePesona;
    }
}
