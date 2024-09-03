package com.bs.web_rest_api.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// <IsRequired = esta es la interfaz, String = este es el tipo de dato a validar>

public class RequiredValidation implements ConstraintValidator<IsRequired, String>{

  @Override
  public boolean isValid(String value, ConstraintValidatorContext cvc) {
    if (value != null && !value.isBlank()) return true;
    return false;
  }
  
}
