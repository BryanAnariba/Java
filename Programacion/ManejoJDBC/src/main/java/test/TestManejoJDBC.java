package test;

import database.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoJDBC {
    public static void main(String[] args) {
        // PARA VER FUNCIONAMIENTO DESCOMENTAR PORCIONES DE CODIGO
        PersonaDAO operacionesCrud = new PersonaDAO();
        
        // INSERTANTO PERSONA
        /*
            Persona personaNueva = new Persona( "Nombre Persona Tres", "Apellido Persona Tres", "persona3@gmail.com", "99999999" );
            operacionesCrud.create(personaNueva);
        */
        
        // OBTENIENDO UNA PERSONA
        /*
            Persona personaGet = new Persona( 1 );
            Persona personaEncontrada = operacionesCrud.findOne( personaGet );
            System.out.println( personaEncontrada );
        */
        
        // ACTUALIZANDO UNA PERSONA
        /*
            Persona personaEditar = new Persona( 3, "Nombre Persona Tres", "Apellido Persona Tres", "persona3editada@gmail.com", "88888888" );
            operacionesCrud.updateOne(personaEditar);
        */
        
        // ELIMINANDO UNA PERSONA
        /*
            Persona personaEliminar = new Persona( 3 );
            operacionesCrud.deleteOne(personaEliminar); 
        */
        
        // OBTENIENDO PERSONAS
        /*
            List<Persona> personas = operacionesCrud.find();
            personas.forEach(persona -> {
                System.out.println(persona);
            });
        */
    }
}
