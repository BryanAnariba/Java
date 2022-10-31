package database;
import java.sql.*;

public class Conexion {
    private static final String OPCIONES_CONEXION = "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_URL_CONEXION = "jdbc:mysql://localhost:3307/usuarios_dev" + Conexion.OPCIONES_CONEXION;
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //  PARA HACER CONSULTAS
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection( Conexion.JDBC_URL_CONEXION, Conexion.JDBC_USER, Conexion.JDBC_PASSWORD );
    }
    
    //  PARA CERRAR FLUJOS DESPUES DE HACER CONSULTAS
    public static void close ( ResultSet rs ) throws SQLException {
        rs.close();
    }
    
    public static void close ( PreparedStatement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( Connection conn ) throws SQLException {
        conn.close();
    }
    
}
