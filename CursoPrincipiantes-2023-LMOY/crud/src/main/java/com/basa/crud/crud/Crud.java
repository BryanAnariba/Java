package com.basa.crud.crud;

import com.basa.crud.dao.UsuarioDao;
import com.basa.crud.models.Usuario;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud {

    public static void main(String[] args) {
        UsuarioDao dao  = new UsuarioDao();
        
        /*
        CREACION USUARIO
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario("Usuario 4");
        nuevoUsuario.setApellidoUsuario("Apellido 4");
        nuevoUsuario.setFechaNacimiento(new Date(1997,2,20));
        nuevoUsuario.setTelefonoUsuario("999888777");
        
        try {
            dao.createUsuario(nuevoUsuario);
        } catch (Exception ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /*OBTENIENDO TODOS LOS USUARIOS*/
        List<Usuario> usuariosRegistrados = new ArrayList<Usuario>();
        try {
            usuariosRegistrados = dao.find();
        } catch (Exception ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        for ( Usuario u: usuariosRegistrados ) {
            System.out.println(u.toString());
        }
        
    }
}
