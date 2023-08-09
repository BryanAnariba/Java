package src;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) {
        String DATA_BASE = "products_db";
        String USER = "bryansanchez";
        String PASSWORD = "3500";
        
        String conexionUrl = (
                    "jdbc:sqlserver://localhost:1433;database=" + DATA_BASE + 
                    ";user=" + USER + 
                    ";password=" + PASSWORD +
                    ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;"
                );
        
        try {
            Connection conexion = DriverManager.getConnection(conexionUrl);
            Statement stmt = conexion.createStatement();
            String query = "SELECT categoryId, categoryName, categoryStatus FROM Category";
            ResultSet resultado = stmt.executeQuery(query);
            while ( resultado.next() ) {
                System.out.println("{ categoryId: " + resultado.getInt("categoryId") + ", categoryName: " + resultado.getString("categoryName") + ", categoryStatus: " + resultado.getBoolean("categoryStatus")  +" }");
            }
            resultado.close();
            stmt.close();
            conexion.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        } 
    }
}
