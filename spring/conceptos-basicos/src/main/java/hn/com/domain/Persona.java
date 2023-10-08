package hn.com.domain;

import lombok.Data; // CREA LOS SETTERS Y GETTERS AUTOMATICAMENTE

@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;    
}
