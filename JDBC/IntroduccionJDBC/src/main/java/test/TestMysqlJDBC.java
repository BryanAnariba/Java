package test;

import java.sql.*;

public class TestMysqlJDBC {
    public static void main(String[] args) {
        String options = "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String urlDBConnection = "jdbc:mysql://localhost:3307/test" + options;
        try {
            // para web, si no funciona descomentar
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Connection conexion = DriverManager.getConnection( urlDBConnection, "root", "admin" );
            
            // creacion
            Statement stmt = conexion.createStatement();
            
            // stmt => sentencia
            var sql = "SELECT idPersona, nombrePersona, apellidoPersona, emailPersona, telefonoPersona FROM Persona;";
            
            // ejecucion
            ResultSet result = stmt.executeQuery( sql );
            
            // mapeo
            while ( result.next() ) {
                System.out.println( 
                    "{ idPersona: " +  result.getInt( "idPersona" ) + "," +
                    "nombrePersona: " + result.getString( "nombrePersona" ) + ", " +
                    "apellidoPersona: " + result.getString( "apellidoPersona" ) + ", " +
                    "emailPersona: " + result.getString( "emailPersona" ) + "," +
                    "telefonoPersona: " + result.getString( "telefonoPersona" ) + " }"
                );
            }
            
            result.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace( System.out );
        } catch ( SQLException ex ) {
            ex.printStackTrace( System.out );
        }
    }
}
