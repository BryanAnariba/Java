package domain;

public class PersonaDTO {
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private String emailPersona;
    private String telefonoPersona;

    public PersonaDTO() {
        
    }
    
    // PARA ELIMINAR UN REGISTRO O BUSCAR ES NECESARIO UN CONSTRUCTOR CON UN PARAMETRO
    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }

    // PARA INSERTAR SI ES NECESARIO VARIOS PARAMETROS
    public PersonaDTO(String nombrePersona, String apellidoPersona, String emailPersona, String telefonoPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.emailPersona = emailPersona;
        this.telefonoPersona = telefonoPersona;
    }

    // PARA MODIFICAR UN REGISTRO SI SE OCUPA TODO, DESDE EL ID HASTA LOS ATRIBUTOR
    public PersonaDTO(int idPersona, String nombrePersona, String apellidoPersona, String emailPersona, String telefonoPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.emailPersona = emailPersona;
        this.telefonoPersona = telefonoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", emailPersona=" + emailPersona + ", telefonoPersona=" + telefonoPersona + '}';
    }
}
