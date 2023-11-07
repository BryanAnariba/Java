
import data.categories.CategoryDAO_JDBC;
import data.products.ProductDAO_JDBC;
import dto.CategoryDTO;
import dto.ProductDTO;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        /********************************************************** CATEGORIES *****************************************************************/
        CategoryDAO_JDBC categoryDao = new CategoryDAO_JDBC();
        // Crear un registro
        /*
        CategoryDTO newCat = new CategoryDTO( "BEERS", true );
        System.out.println("Inserted Rows: " + categoryDao.create(newCat));
        */
        
        // Actualizar registro
        /*
        newCat = new CategoryDTO( 2,"CANDIES" , true);
        System.out.println("Modified Rows: " + categoryDao.updateOne(newCat));
        */
        
        // Eliminar registro
        /*
        newCat = new CategoryDTO(3, false);
        System.out.println("Deleted Rows:" + categoryDao.deleteOne(newCat));
        */
        
        // Obtener todos los registros de categorias
        List<CategoryDTO> categories = null;
        categories = categoryDao.findAll();
        categories.forEach(cat -> {
            System.out.println(cat);
        });
        
        
        /********************************************************** PRODUCTS *****************************************************************/
        ProductDAO_JDBC productDao = new ProductDAO_JDBC();
        
        // Obtener todos los registros de productos
        List<ProductDTO> products = null;
        products = productDao.findAll();
        products.forEach(product -> {
            System.out.println("Products Data: " + product);
        });
        
        // Obteniendo un producto
        ProductDTO product = null;
        ProductDTO productData= new ProductDTO(2);
        product = productDao.findOne(productData);
        System.out.println( "Product Data: " + product );
        
        // Creacion de un nuevo producto
        /*
        productData = new ProductDTO(1, "SALVA VIDA", "EL PLACER DE LOS CATRACHOS", 0.99, 50);
        System.out.println("Inserted Rows Affected: " + productDao.create(product));
        */
    }
    
}
