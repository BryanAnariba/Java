package data;

import domain.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    public List<Category> getAll () {
        Connection conn = null;
        PreparedStatement pStmt = null;
        ResultSet result = null;
        Category category = null;
        List<Category> categories = new ArrayList<Category>();
        return categories;
    }
}
