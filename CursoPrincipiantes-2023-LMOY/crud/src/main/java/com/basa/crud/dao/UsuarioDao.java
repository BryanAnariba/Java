package com.basa.crud.dao;

import com.basa.crud.models.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    OBLIGATORIO: IMPORTAR LA LIBRERIA MYSQL EN MAVEN EN EL pom.xml
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.39</version>
        </dependency>
    </dependencies>
*/

public class UsuarioDao {
    
    private String sql = "INSERT INTO Usuario ( nombreUsuario, apellidoUsuario, fechaNacimiento, telefonoUsuario ) VALUES ( ?,?,?,? )";
    private String sqlSelect = "SELECT idUsuario, nombreUsuario, apellidoUsuario, fechaNacimiento, telefonoUsuario FROM Usuario";
    
    public Connection Conexion () {
        
        final String DATABASE = "CursoDev";
        final String USER = "root";
        final String PWD = "";
        final String HOST = "localhost";
        final String PORT = "3306";
        final String DRIVER_CONNECTION = "com.mysql.jdbc.Driver";
        final String CONEXION = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?useSSL=false";
        Connection sqlConnection = null;
        
        try {
            Class.forName( DRIVER_CONNECTION );
            sqlConnection = DriverManager.getConnection(CONEXION, USER, PWD);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sqlConnection;
        
    }
    
    public void createUsuario ( Usuario usuario ) throws SQLException {
        
        Connection conn = this.Conexion();
        PreparedStatement preparedStmt = conn.prepareStatement(sql);
        preparedStmt.setString(1, usuario.getNombreUsuario());
        preparedStmt.setString(2, usuario.getApellidoUsuario());
        preparedStmt.setDate(3, (Date) usuario.getFechaNacimiento());
        preparedStmt.setString(4, usuario.getTelefonoUsuario());
        preparedStmt.execute();
        preparedStmt.close();
        System.out.println("Usuario Creado Exitosamente");
        
    }
    
    public List<Usuario> find () throws SQLException {
        
        Connection conn = this.Conexion();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.clear();
        PreparedStatement preparedStmt = conn.prepareStatement(sqlSelect);
        ResultSet response = preparedStmt.executeQuery();
        
        while ( response.next() ) {
            Usuario u = new Usuario();
            u.setIdUsuario(response.getInt("idUsuario"));
            u.setNombreUsuario(response.getString("nombreUsuario"));
            u.setApellidoUsuario(response.getString("apellidoUsuario"));
            u.setFechaNacimiento(response.getDate("fechaNacimiento"));
            u.setTelefonoUsuario(response.getString("telefonoUsuario"));
            usuarios.add(u);
        }
        
        return usuarios;
        
    }
    
}
