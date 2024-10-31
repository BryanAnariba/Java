package com.bs.di.services;

import com.bs.di.models.Product;
import com.bs.di.repositories.IProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class ProductService implements IProductService {
    
    // DI normal como angular private ProductRepository productRepository = new ProductRepository();
    
    // DI Con Spring implementa por medio de la interfaz
    @Autowired()
    private IProductRepository productRepository;
    
    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll().stream().map(product -> {
            Product p = new Product();
            p.setId(product.getId());
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            Double productPriceWithISV = p.getPrice();
            p.setPrice(productPriceWithISV.longValue() * 1.15);
            return p;
        }).collect(Collectors.toList());
    }
    
    @Override
    public Product findOne(Long product_id) {
        return this.productRepository.findOne(product_id);
    }
}
