package com.bs.web_rest_api.validations;

import com.bs.web_rest_api.services.ProductServiceImpl;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class IsExistsValidation implements ConstraintValidator<IsExistsInDataBase, String>{

  @Autowired()
  private ProductServiceImpl productService;
  
  @Override
  public boolean isValid(String value, ConstraintValidatorContext cvc) {
    return !this.productService.existsBySku(value);
  }
  
}
