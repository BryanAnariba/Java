
import data.categories.CategoryDAO_JDBC;
import dto.CategoryDTO;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        CategoryDAO_JDBC categoryDao = new CategoryDAO_JDBC();
        
        
        // Crear un registro
        //CategoryDTO newCat = new CategoryDTO( "BEERS", true );
        //System.out.println("Inserted Rows: " + categoryDao.create(newCat));
        
        // Actualizar registro
        CategoryDTO newCat = new CategoryDTO( 2,"CANDIES" , true);
        System.out.println("Modified Rows: " + categoryDao.updateOne(newCat));
        
        // Eliminar registro
        newCat = new CategoryDTO(3, false);
        System.out.println("Deleted Rows:" + categoryDao.deleteOne(newCat));
        
        // Obtener todos los registros
        List<CategoryDTO> categories = null;
        categories = categoryDao.findAll();
        categories.forEach(cat -> {
            System.out.println(cat);
        });

    }
    
}
