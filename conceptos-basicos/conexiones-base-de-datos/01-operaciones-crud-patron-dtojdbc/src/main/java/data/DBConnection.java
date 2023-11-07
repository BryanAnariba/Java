package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    private static final String DATA_BASE = "products_db";
    private static final String USER = "bryansanchez";
    private static final String PASSWORD = "3500";
    
    private static final String URL_DB = (
        "jdbc:sqlserver://localhost:1433;database=" + DBConnection.DATA_BASE + 
        ";user=" + DBConnection.USER +
        ";password=" + DBConnection.PASSWORD +
        ";encrypt=true;" + "trustServerCertificate=true;" + 
        "loginTimeout=30;"
    );
    
    public static Connection getBDConnection() throws SQLException {
        Connection conexion = DriverManager.getConnection( DBConnection.URL_DB );
        return conexion;
    }
    
    public static void close (ResultSet rs)  {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close ( Statement stmt ) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close ( PreparedStatement pStmt ) {
        try {
            pStmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close ( Connection conn ) {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
