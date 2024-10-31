package com.bs.di.repositories;

import com.bs.di.models.Product;
import java.util.List;

public interface IProductRepository {
    public List<Product> findAll();
    public Product findOne(Long product_id);
}
