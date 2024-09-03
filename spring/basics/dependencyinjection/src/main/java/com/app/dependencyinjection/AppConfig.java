package com.app.dependencyinjection;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.Resource;

import com.app.dependencyinjection.repositories.IProductRepository;
import com.app.dependencyinjection.repositories.ProductRepositoryJson;

@Configuration()
@PropertySources({
  @PropertySource("classpath:config.properties"),
})
public class AppConfig {

  @Value("classpath:data/products.json")
  private Resource resource;

  @Bean()
  IProductRepository productRepositoryJson() {
    return new ProductRepositoryJson(resource);
  }

}
