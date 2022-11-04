package test;

import database.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.util.List;
import database.IPersonaDAO;
import java.sql.SQLException;

public class TestManejoJDBC {
    public static void main(String[] args) {
        // PARA VER FUNCIONAMIENTO DESCOMENTAR PORCIONES DE CODIGO
        IPersonaDAO personaDao = new PersonaDaoJDBC();
        
        // INSERTANTO PERSONA
        /*
            PersonaDTO personaNueva = new PersonaDTO( "Nombre PersonaDTO Tres", "Apellido PersonaDTO Tres", "persona3@gmail.com", "99999999" );
            operacionesCrud.create(personaNueva);
        */
        
        // OBTENIENDO UNA PERSONA
        /*
            PersonaDTO personaGet = new PersonaDTO( 1 );
            PersonaDTO personaEncontrada = operacionesCrud.findOne( personaGet );
            System.out.println( personaEncontrada );
        */
        
        // ACTUALIZANDO UNA PERSONA
        /*
            PersonaDTO personaEditar = new PersonaDTO( 3, "Nombre PersonaDTO Tres", "Apellido PersonaDTO Tres", "persona3editada@gmail.com", "88888888" );
            operacionesCrud.updateOne(personaEditar);
        */
        
        // ELIMINANDO UNA PERSONA
        /*
            PersonaDTO personaEliminar = new PersonaDTO( 3 );
            operacionesCrud.deleteOne(personaEliminar); 
        */
        
        // OBTENIENDO PERSONAS
        /* */
        List<PersonaDTO> personas;
        try {
            personas = personaDao.find();
            personas.forEach(persona -> {
            System.out.println(persona);
        });
        } catch (SQLException ex) {
            ex.printStackTrace( System.out );
        }
        
        
    }
}
