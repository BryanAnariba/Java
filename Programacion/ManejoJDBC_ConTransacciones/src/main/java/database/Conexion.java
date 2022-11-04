package database;
import java.sql.*;

public class Conexion {
    private static final String OPCIONES_CONEXION = "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/test" + Conexion.OPCIONES_CONEXION;
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection( Conexion.JDBC_URL, Conexion.JDBC_USER, Conexion.JDBC_PASSWORD );    
    }
    
    public static void close ( ResultSet rs ) throws SQLException {
        rs.close();
    }
    
    public static void close ( Statement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( PreparedStatement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( Connection conn ) throws SQLException {
        conn.close();
    }
}
