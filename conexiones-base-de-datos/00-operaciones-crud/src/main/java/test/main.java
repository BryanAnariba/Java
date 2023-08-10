package test;

import data.CategoryDAO;
import domain.Category;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
        
        CategoryDAO categoryDAO = new CategoryDAO();
        
        // Insertar Categoria
        Category category = new Category(7,"FOOD",true);
        System.out.println("POST - Rows Affected: " + categoryDAO.create(category));
        
        // Actualizar un registro
        category = new Category(0,"cakes",true);
        System.out.println("PUT - Rows Affected: " + categoryDAO.updateOne(category));
                
        
        // Eliminar un registro (SOFT DELETE)
        category = new Category(0);
        System.out.println("DELETE - Rows Affected: " + categoryDAO.deleteOne(category));
        
         // Obteniendo todas las categorias
        List<Category> categories = categoryDAO.getAll();
        categories.forEach(cat -> {
            System.out.println(cat);
        });
    }
    
}
