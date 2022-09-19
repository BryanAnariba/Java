package domain;

public class Persona {
    private String nombrePersona;
    
    public void setNombrePersona ( String nombrePersona ) {
        this.nombrePersona = nombrePersona;
    }
    
    public String getNombrePersona () {
        return this.nombrePersona;
    }
    
    public Persona ( String nombrePersona ) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombrePersona=").append(nombrePersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}
