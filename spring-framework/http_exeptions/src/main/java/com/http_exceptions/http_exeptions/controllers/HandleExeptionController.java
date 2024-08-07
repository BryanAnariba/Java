package com.http_exceptions.http_exeptions.controllers;

import com.http_exceptions.http_exceptions.exceptions.UserNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import com.http_exceptions.http_exeptions.dtos.Error;
import org.springframework.http.converter.HttpMessageNotWritableException;

@RestControllerAdvice() //Ver E84
public class HandleExeptionController {

  // http://localhost:3500/api/http-exeptions/app
  @ExceptionHandler({ArithmeticException.class})
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public ResponseEntity<Error> divisionByZero(Exception ex) {
    Error e = new Error(ex.getMessage(), "Error dividiendo por cero", HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date());
    // return ResponseEntity.internalServerError().body(e);
    return ResponseEntity.status(e.getStatus()).body(e);
  }

  @ExceptionHandler({NumberFormatException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Map<String, Object> numberFormatException(Exception ex) {
    Map<String, Object> error = new HashMap<>();
    error.put("date", new Date());
    error.put("error", "Number does not have a valid format");
    error.put("message", ex.getMessage());
    error.put("status", HttpStatus.BAD_REQUEST.value());
    return error;
  }

  // http://localhost:3500/api/http-exeptions/appas
  @ExceptionHandler({NoResourceFoundException.class})
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseEntity<Error> notFound(NoResourceFoundException ex) {
    Error e = new Error(ex.getMessage(), "Endpoint not found", HttpStatus.NOT_FOUND.value(), new Date());
    // return ResponseEntity.internalServerError().body(e);
    return ResponseEntity.status(e.getStatus()).body(e);
  }

  // Excepcion generica: Este es el bueno bryan
  @ExceptionHandler({
    NullPointerException.class,
    HttpMessageNotWritableException.class,
    UserNotFoundException.class
  })
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Map<String, Object> userNotFoundException(Exception ex) {
    Map<String, Object> error = new HashMap<>();
    error.put("date", new Date());
    error.put("error", "Number does not have a valid format");
    error.put("message", ex.getMessage());
    error.put("status", HttpStatus.BAD_REQUEST.value());
    return error;
  }
}
