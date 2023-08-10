package data.products;

import dto.ProductDTO;
import java.util.List;

public interface ProductDAO {
    public List<ProductDTO> findAll();
    public ProductDTO findOne();
    public int create( ProductDTO product );
    public int updateOne( ProductDTO product );
    public int deleteOne( ProductDTO product );
}
