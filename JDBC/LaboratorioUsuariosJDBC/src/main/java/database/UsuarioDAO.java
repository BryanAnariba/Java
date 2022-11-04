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
    private Connection conexionTransaccional;
    public UsuarioDAO () {
            
    }
        
    public UsuarioDAO ( Connection conexionTransaccional )  {
        this.conexionTransaccional = conexionTransaccional;
    }
    
    public List<Usuario> findAll () throws SQLException {
        // LIMPIAMOS VARIABLES DE CONEXION
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        // CONSULTAMOS A LA BASE DE DATOS
       
        try {
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : Conexion.getConnection(); 
            stmt = conn.prepareStatement( FIND_STMT ); 
            rs = stmt.executeQuery();
            while ( rs.next() ) {
                Usuario usuario = new Usuario( rs.getInt( "idUsuario" ), rs.getString( "nombreUsuario" ), rs.getString( "passwordUsuario" ) );
                usuarios.add(usuario);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if ( this.conexionTransaccional == null ){
                    Conexion.close(conn);
                }
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return usuarios;
    }
    
    public int create( Usuario usuario ) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosInsertados = 0;
        try {
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement( CREATE_STMT );
            stmt.setString( 1, usuario.getNombreUsuario() );
            stmt.setString( 2, usuario.getPasswordUsuario() );
            registrosInsertados = stmt.executeUpdate();
        }  finally {
            try {
                Conexion.close(stmt);
                if ( this.conexionTransaccional == null ) {
                    Conexion.close(conn);
                }
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        
        return registrosInsertados;
    }
    
    public Usuario findOne ( Usuario usuario ) throws SQLException { 
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuarioEncontrado = null;
        try {
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement( FIND_ONE_STMT );
            stmt.setInt( 1, usuario.getIdUsuario() );
            rs = stmt.executeQuery();
            while ( rs.next() ) {
                usuarioEncontrado = new Usuario( rs.getInt( "idUsuario" ) ,rs.getString( "nombreUsuario" ), rs.getString( "passwordUsuario" ) );
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if ( this.conexionTransaccional == null ) {
                    Conexion.close(conn);
                }
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return usuarioEncontrado;
    }
    
    public  int updateOne ( Usuario usuario ) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosActualizados = 0;
        try {
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional :Conexion.getConnection();
            stmt = conn.prepareStatement( EDIT_STMT );
            stmt.setString( 1, usuario.getNombreUsuario() );
            stmt.setString( 2, usuario.getPasswordUsuario() );
            stmt.setInt( 3, usuario.getIdUsuario() );
            registrosActualizados = stmt.executeUpdate();
        } finally {
            try {
                Conexion.close(stmt);
                if ( this.conexionTransaccional == null ) {
                    Conexion.close(conn);
                }
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return registrosActualizados;
    }  
    
    public int deleteOne ( Usuario usuario ) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosEliminados = 0;
        try {
            conn = ( this.conexionTransaccional != null ) ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement( DELETE_STMT );
            stmt.setInt( 1, usuario.getIdUsuario() );
            registrosEliminados = stmt.executeUpdate();
        }  finally {
            try {
                Conexion.close(stmt);
                if ( this.conexionTransaccional == null ) {
                    Conexion.close(conn);
                }
            } catch ( SQLException ex ) {
                ex.printStackTrace( System.out );
            }
        }
        return registrosEliminados;
    }
}
