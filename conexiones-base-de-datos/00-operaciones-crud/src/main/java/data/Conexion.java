package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    
    private static final String DATA_BASE = "products_db";
    private static final String USER = "bryansanchez";
    private static final String PASSWORD = "3500";
    
    private static final String URL_DB = (
        "jdbc:sqlserver://localhost:1433;database=" + Conexion.DATA_BASE + 
        ";user=" + Conexion.USER +
        ";password=" + Conexion.PASSWORD +
        ";encrypt=true;" + "trustServerCertificate=true;" + 
        "loginTimeout=30;"
    );
    
    public static Connection getConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection( Conexion.URL_DB );
        return conexion;
    }
    
    public static void close (ResultSet rs) throws SQLException {
        rs.close();
    }
    
    public static void close ( Statement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( PreparedStatement pStmt ) throws SQLException {
        pStmt.close();
    }
    
    public static void close ( Connection conn ) throws SQLException {
        conn.close();
    }
    
}
