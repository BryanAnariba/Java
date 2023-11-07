package data.products;

import data.DBConnection;
import dto.ProductDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO_JDBC implements ProductDAO {
    
    private int getLastProductId () {
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;
        
        int lastId = 0;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("SELECT COUNT(Product.productId) + 1 AS lastProductId FROM Product");
            rs = pStmt.executeQuery();
            while ( rs.next() ) {
                lastId = rs.getInt("lastProductId");
            }
            System.out.println("{ lastProductId: " + lastId + " }");
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return lastId;
        
    }

    @Override
    public List<ProductDTO> findAll() {
        
        List<ProductDTO> products = new ArrayList<ProductDTO>();
        ProductDTO product = null;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;     
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement(
                "SELECT Product.productId, Product.categoryId, Product.productName, Product.productDescription, Product.price, Product.inStock, Category.categoryName, Category.categoryStatus FROM Product INNER JOIN Category ON ( Product.categoryId = Category.categoryId )"
            );
            rs = pStmt.executeQuery();
            while ( rs.next() ) {
                product = new ProductDTO(
                    rs.getInt("productId"),
                    rs.getInt("categoryId"),
                    rs.getString("productName"),
                    rs.getString("productDescription"),
                    rs.getDouble("price"),
                    rs.getInt("inStock"),
                    rs.getString("categoryName"),    
                    rs.getBoolean("categoryStatus") 
                );
                //System.out.println(product);
                products.add(product);
            }
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return products;
        
    }

    @Override
    public ProductDTO findOne( ProductDTO productData ) {
        
        ProductDTO product = null;
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet rs = null;     
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement(
                "SELECT Product.productId, Product.categoryId, Product.productName, Product.productDescription, Product.price, Product.inStock, Category.categoryName, Category.categoryStatus FROM Product INNER JOIN Category ON ( Product.categoryId = Category.categoryId ) WHERE Product.productId = ?"
            );
            pStmt.setInt(1, productData.getProductId());
            rs = pStmt.executeQuery();
            while ( rs.next() ) {
                product = new ProductDTO(
                    rs.getInt("productId"),
                    rs.getInt("categoryId"),
                    rs.getString("productName"),
                    rs.getString("productDescription"),
                    rs.getDouble("price"),
                    rs.getInt("inStock"),
                    rs.getString("categoryName"),    
                    rs.getBoolean("categoryStatus") 
                );
            }
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return product;
        
    }

    @Override
    public int create(ProductDTO product) {
        
        Connection conn = null;
        PreparedStatement pStmt = null;
        
        int rowsAffected = 0;
        
        try {
            conn = DBConnection.getBDConnection();
            pStmt = conn.prepareStatement("INSERT INTO Product ( productId, categoryId, productName, productDescription, price, inStock ) VALUES ( ?, ?, ?, ?, ?, ? )");
            pStmt.setInt( 1, this.getLastProductId() );
            pStmt.setInt( 2, product.getCategoryId() );
            pStmt.setString( 3, product.getProductName() );
            pStmt.setString( 4, product.getProductDescription() );
            pStmt.setDouble( 5, product.getPrice() );
            pStmt.setInt( 6, product.getInStock() );
            rowsAffected = pStmt.executeUpdate();
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        } finally {
            DBConnection.close(pStmt);
            DBConnection.close(conn);
        }
        
        return rowsAffected;
        
    }

    @Override
    public int updateOne(ProductDTO product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteOne(ProductDTO product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
