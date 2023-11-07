package data;

import domain.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    
    public List<Category> getAll () {
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet result = null;
        Category category = null;
        List<Category> categories = new ArrayList<Category>();
        
        try {
            conn = Conexion.getConexion();
            pStmt = conn.prepareStatement("SELECT categoryId, categoryName, categoryStatus FROM Category");
            result = pStmt.executeQuery();
            
            while ( result.next() ) {
                
                category = new Category( 
                    result.getInt("categoryId"), 
                    result.getString("categoryName"), 
                    result.getBoolean("categoryStatus") 
                );
                
                categories.add(category );
            }
            
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(result);
                Conexion.close(pStmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return categories;
    }
    
    public int create (Category category) {
        Connection conn = null;
        PreparedStatement pStmt = null;
        int registrosCount = 0;
        
        try {
            conn = Conexion.getConexion();
            pStmt = conn.prepareStatement("INSERT INTO Category ( categoryId, categoryName, categoryStatus ) VALUES ( ?, ?, ? )");
            pStmt.setInt(1, category.getCategoryId());
            pStmt.setString(2, category.getCategoryName());
            pStmt.setBoolean(3, category.getCategoryStatus());
            registrosCount = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(pStmt);
                Conexion.close(conn);   
            } catch (SQLException ex) {
                ex.printStackTrace();
            }      
        }
        
        return registrosCount;
    }
    
    public int updateOne ( Category category ) {
        Connection conn = null;
        PreparedStatement pStmt = null;
        int countUpdated = 0;
        try {
            conn = Conexion.getConexion();
            pStmt = conn.prepareStatement("UPDATE Category SET categoryName = ? WHERE categoryId = ?");
            pStmt.setString( 1, category.getCategoryName().toUpperCase() );
            pStmt.setInt( 2, category.getCategoryId() );
            countUpdated = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(pStmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace();
            }
        }        
        return countUpdated;
    }
    
    // SoftDelete Mejor
    public int deleteOne ( Category category ) {
        Connection conn = null;
        PreparedStatement pStmt = null;
        int countDeleted = 0;
        try {
            conn = Conexion.getConexion();
            pStmt = conn.prepareStatement("UPDATE Category SET categoryStatus = ? WHERE categoryId = ?");
            pStmt.setBoolean(1, category.getCategoryStatus());
            pStmt.setInt(2, category.getCategoryId());
            countDeleted = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(pStmt);
                Conexion.close(conn);
            } catch ( SQLException ex ) {
                ex.printStackTrace();
            }
        }
        
        return countDeleted;
    }
}
