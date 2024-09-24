package com.bs.relations_api.relations_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptions extends RuntimeException {
  
  public static final long serialVersionUID = 1L;
  
  public ResourceNotFoundExceptions () {}
  
  public ResourceNotFoundExceptions (String mensaje) {
    super(mensaje);
  }
  
  public ResourceNotFoundExceptions (String mensaje, Throwable error) {
    super(mensaje);
  }
}
