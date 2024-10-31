package com.bs.di.services;

import com.bs.di.models.Product;
import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findOne(Long product_id);
}
