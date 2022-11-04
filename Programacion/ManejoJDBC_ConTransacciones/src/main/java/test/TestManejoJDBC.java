package test;

import database.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class TestManejoJDBC {
    public static void main(String[] args) {
        // PARA VER FUNCIONAMIENTO DESCOMENTAR PORCIONES DE CODIGO
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            
            // DESABILITAMOS EL COMMIT POR QUE SE HARA MANUALMENTE
            if ( conexion.getAutoCommit() ) {
                conexion.setAutoCommit(false);
            }
            
            PersonaDaoJDBC operacionesCrud = new PersonaDaoJDBC( conexion );
            
            // INSERTANTO PERSONA
            /*
            */
            //Persona personaNueva = new PersonaDTO( "Nombre PersonaDTO Tres", "Apellido PersonaDTO Tres", "persona3@gmail.com", "99999999" );
            //PersonaDTO personaNueva = new PersonaDTO( "Nombre Persona Cinco", "esta es una descripcion que tiene mas de cuarenta y cinco caracteres por ende esto hara petar el insert de la persona numero 5", "persona5@gmail.com", "99999999" );
            //operacionesCrud.create(personaNueva); // GRACIAS A LAS TRANSACCIONES DESABILITAMOS EL AUTOCOMMIT Y EL REGISTRO NO SE GUARDA
            //conexion.commit(); // se guardara hasta que llegue aqui el registro, muy util eso asi controlamos que hasta que todo esta bien guardamos, si algo falla arriba el commit no se hara
            
            
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
            /*
            List<Persona> personas = operacionesCrud.find();
            personas.forEach(persona -> {
            System.out.println(persona);
            });
            */
        } catch (SQLException ex) {
            ex.printStackTrace( System.out );
            // si algo falla hacemos rollback
            try {
                conexion.rollback();
            } catch ( SQLException ex1 ) {
                ex1.printStackTrace( System.out );
            }
        }
    }
}
