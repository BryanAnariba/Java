package com.bs.blog_auth.blog_auth.exceptions;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  private String resourceName;
  private String fieldName;
  private UUID fieldValue;

  public ResourceNotFoundException(String resourceName, String fieldName, UUID fieldValue) {
    super(String.format("%s Not Found with: %s : %s", resourceName, fieldName, fieldValue));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }

  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public UUID getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(UUID fieldValue) {
    this.fieldValue = fieldValue;
  }
 
}
