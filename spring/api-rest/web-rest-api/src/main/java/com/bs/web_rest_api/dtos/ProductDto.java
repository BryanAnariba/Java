package com.bs.web_rest_api.dtos;

import com.bs.web_rest_api.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;

// RECORDAR QUE SIN ESTO SIEMPRE FUNCIONA YA QUE EN LA ENTITI HAY DECORADORES ya estan las validaciones

@Component()
public class ProductDto implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return Product.class.isAssignableFrom(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    Product product = (Product)target;
    
    // Forma uno
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "Producto Name is required");
    
    // Forma 2
    if (product.getDescription() == null || product.getDescription().isBlank()) {
      errors.rejectValue("description", null, "Descriptions is required");
    }
    
    if (product.getPrice() == null || product.getPrice() < 0) {
      errors.rejectValue("price" ,null ,"Prices must be greater or equal than zero");
    }
  }
  
}
