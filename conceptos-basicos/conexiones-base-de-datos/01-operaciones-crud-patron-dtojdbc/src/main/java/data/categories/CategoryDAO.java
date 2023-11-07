package data.categories;

import dto.CategoryDTO;
import java.util.List;

public interface CategoryDAO {
    public List<CategoryDTO> findAll();
    public int create( CategoryDTO category );
    public int updateOne( CategoryDTO category );
    public int deleteOne( CategoryDTO category );
}
