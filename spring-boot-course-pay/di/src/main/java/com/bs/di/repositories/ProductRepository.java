package com.bs.di.repositories;

import com.bs.di.models.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository()
public class ProductRepository implements IProductRepository {

    private final List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Corsair DDR5", 22.99),
            new Product(2L, "CPU Intel Core I7", 499.99),
            new Product(3L, "RTX 3060 TI", 299.99)
        );
    }
    
    @Override
    public List<Product> findAll() {
        return this.data;
    }
    
    @Override
    public Product findOne(Long product_id) {
        return data.stream().filter(p -> p.getId().equals(product_id)).findFirst().orElse(null);
    }
}
