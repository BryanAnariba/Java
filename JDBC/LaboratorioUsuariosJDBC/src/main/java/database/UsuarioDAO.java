package database;

import database.Conexion;
import java.sql.*;
import java.util.*;
import domain.Usuario;

public class UsuarioDAO {
    // OPERACIONES CRUD
    private static final String FIND_STMT = "SELECT idUsuario, nombreUsuario, passwordUsuario FROM Usuario;";
    private static final String FIND_ONE_STMT = "SELECT idUsuario, nombreUsuario, passwordUsuario FROM Usuario WHERE idUsuario = ?;";
    private static final String CREATE_STMT = "INSERT INTO Usuario ( nombreUsuario, passwordUsuario ) VALUES ( ?, ? )";
    private static final String EDIT_STMT = "UPDATE Usuario SET nombreUsuario = ?, passwordUsuario = ? WHERE idUsuario = ?";
    private static final String DELETE_STMT = "DELETE FROM Usuario WHERE idUsuario = ?";
    
    public List<Usuario> findAll () {
        // LIMPIAMOS VARIABLES DE CONEXION
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        // CONSULTAMOS A LA BASE DE DATOS
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement( FIND_STMT ); 
            rs = stmt.executeQuery();
            while ( rs.next() ) {
                Usuario usuario = new Usuario( rs.getInt( "idUsuario" ), rs.getString( "nombreUsuario" ), rs.getString( "passwordUsuario" ) );
                usuarios.add(usuario);
            }
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return usuarios;
    }
    
    public int create( Usuario usuario ) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosInsertados = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement( CREATE_STMT );
            stmt.setString( 1, usuario.getNombreUsuario() );
            stmt.setString( 2, usuario.getPasswordUsuario() );
            registrosInsertados = stmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        
        return registrosInsertados;
    }
    
    public static Usuario findOne ( Usuario usuario ) { 
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuarioEncontrado = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement( FIND_ONE_STMT );
            stmt.setInt( 1, usuario.getIdUsuario() );
            rs = stmt.executeQuery();
            while ( rs.next() ) {
                usuarioEncontrado = new Usuario( rs.getInt( "idUsuario" ) ,rs.getString( "nombreUsuario" ), rs.getString( "passwordUsuario" ) );
            }
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return usuarioEncontrado;
    }
    
    public static  int updateOne ( Usuario usuario ) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosActualizados = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement( EDIT_STMT );
            stmt.setString( 1, usuario.getNombreUsuario() );
            stmt.setString( 2, usuario.getPasswordUsuario() );
            stmt.setInt( 3, usuario.getIdUsuario() );
            registrosActualizados = stmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return registrosActualizados;
    }  
    
    public static int deleteOne ( Usuario usuario ) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosEliminados = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement( DELETE_STMT );
            stmt.setInt( 1, usuario.getIdUsuario() );
            registrosEliminados = stmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return registrosEliminados;
    }
}
