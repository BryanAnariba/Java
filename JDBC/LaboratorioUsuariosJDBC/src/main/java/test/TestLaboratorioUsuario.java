package test;

import database.UsuarioDAO;
import domain.Usuario;
import java.util.*;

public class TestLaboratorioUsuario {
    public static void main(String[] args) {
        UsuarioDAO operacionCrudConUsuario = new UsuarioDAO();
        
        // CREATE
        //Usuario usuario1 = new Usuario( "edavida", "asd.456" );
        //operacionCrudConUsuario.create(usuario1);
        
        // READ
        List<Usuario> listadoDeUsuarios = operacionCrudConUsuario.findAll();
        listadoDeUsuarios.forEach(usuario -> {
            System.out.println( usuario );
        });
        
        // READ ONE
        //Usuario usuarioId = new Usuario( 2 );
        //Usuario usuarioEncontrado = operacionCrudConUsuario.findOne( usuarioId );
        //System.out.println( usuarioEncontrado );
        
        // UPDATE
        //Usuario usuarioModificar = new Usuario( 2, "bsanchez@crefisa.hn", "asdf.4567" );
        //System.out.println("Registros Modificados: " + operacionCrudConUsuario.updateOne( usuarioModificar ));
        
        // DELETE
        //Usuario usuarioEliminar = new Usuario( 6 );
        //System.out.println("Registros Eliminados: " + operacionCrudConUsuario.deleteOne( usuarioEliminar ));
    }
}
