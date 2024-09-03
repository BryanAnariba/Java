package com.di.facturas.di_facturas;

import com.di.facturas.di_facturas.models.Item;
import com.di.facturas.di_facturas.models.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration()
@PropertySources({
  @PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
})
public class AppConfig {
  
  @Bean()
  List<Item> invoiceItems() {    
    List<Item> items = Arrays.asList(
      new Item(new Product("Camera", 800), 2),
      new Item(new Product("PS4", 400), 3)
    );
    
    return items;
  }
  
  @Bean() // default es como el @Primary()
  List<Item> invoiceItemsOffice() {    
    List<Item> items = Arrays.asList(
      new Item(new Product("Monitor Dell 24Inch", 100), 3),
      new Item(new Product("Notebook Dell", 600), 2),
      new Item(new Product("Pencils", 10), 5),
      new Item(new Product("Printer HP XS", 300), 1)
    );
    
    return items;
  }
  
}
