package com.bs.web_rest_api.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = IsExistsValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface IsExistsInDataBase {
  String message() default "This field already exists my friend!.";
  Class<?>[] groups() default{};
  Class<? extends Payload>[] payload() default{};
}
