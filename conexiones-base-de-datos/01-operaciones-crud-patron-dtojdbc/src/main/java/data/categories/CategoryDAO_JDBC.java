package data.categories;

import dto.CategoryDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO_JDBC implements CategoryDAO {
    
    private int getLastCategoryId () {
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        int lastId = 0;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("SELECT COUNT(categoryId) + 1 AS lastCategoryId FROM Category");
            rs = pStmt.executeQuery();
            while ( rs.next() ) {
                lastId = rs.getInt("lastCategoryId");
            }
            System.out.println("{ lastId: " + lastId + " }");
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return lastId;
    }
    
    public List<CategoryDTO> findAll() {
        List<CategoryDTO> categories = new ArrayList<CategoryDTO>();
        CategoryDTO category = null;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("SELECT * FROM Category");
            rs = pStmt.executeQuery();
            while ( rs.next() ) {
                category = new CategoryDTO(
                    rs.getInt("categoryId"),
                    rs.getString("categoryName"),
                    rs.getBoolean("categoryStatus")
                );
                categories.add(category);
            }
            
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return categories;
    }
    
    public int create ( CategoryDTO category ) {
        int rowsAffected = 0;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        
        try {
            int categoryId = this.getLastCategoryId();
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("INSERT INTO Category ( categoryId, categoryName, categoryStatus ) VALUES (?,?,?)");
            pStmt.setInt(1, categoryId);
            pStmt.setString(2, category.getCategoryName().trim().toUpperCase());
            pStmt.setBoolean(3, category.isCategoryStatus());
            rowsAffected = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return rowsAffected;
    }
    
    public int updateOne ( CategoryDTO category ) {
        int rowsAffected = 0;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("UPDATE Category SET categoryName = ? WHERE categoryId = ?");
            pStmt.setString(1, category.getCategoryName().trim().toUpperCase());
            pStmt.setInt(2, category.getCategoryId());
            rowsAffected = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return rowsAffected;
    }
    
    public int deleteOne ( CategoryDTO category ) {
        int rowsAffected = 0;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareCall("UPDATE Category SET categoryStatus = ? WHERE categoryId = ?");
            pStmt.setBoolean(1, category.isCategoryStatus());
            pStmt.setInt(2, category.getCategoryId());
            rowsAffected =  pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return rowsAffected;
    }
    
}
