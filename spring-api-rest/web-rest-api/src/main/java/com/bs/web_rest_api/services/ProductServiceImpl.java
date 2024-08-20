package com.bs.web_rest_api.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bs.web_rest_api.entities.Product;
import com.bs.web_rest_api.repositories.ProductRepository;

@Service()
public class ProductServiceImpl implements IProductService {

  @Autowired()
  private ProductRepository productRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Product> findAll() {
    return (List<Product>)this.productRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Optional<Product> findById(UUID product_id) {
    return this.productRepository.findById(product_id);
  }

  @Override
  @Transactional()
  public Product save(Product product) {
    return this.productRepository.save(product);
  }

  @Override
  @Transactional()
  public Optional<Product> delete(UUID product_id) {
    Optional<Product> existsProduct = this.productRepository.findById(product_id);
    existsProduct.ifPresent(prod -> {
      this.productRepository.delete(prod);
    });
    return existsProduct;
  }

}
