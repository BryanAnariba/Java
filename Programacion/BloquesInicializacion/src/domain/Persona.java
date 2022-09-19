package domain;

public class Persona {
    private final int idPersona;
    private static int contadotPersonas;
    
    static {
        System.out.println("Ejecucion Bloque Static solo variables static se ejecutaran aqui");
        ++Persona.contadotPersonas;
    }
    
    {
        System.out.println("Ejecucion Bloque No Estatico solo variables de clase se ejecutaran aqui y static");
        this.idPersona = Persona.contadotPersonas++;
    }
    
    public Persona () {
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona () {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}   

