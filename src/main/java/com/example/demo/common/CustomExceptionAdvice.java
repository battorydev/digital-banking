package com.example.demo.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionAdvice {

   @ExceptionHandler(Exception.class)
   public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
     return new ResponseEntity<>("Unexpected error occurred. Please contact customer support.", HttpStatus.INTERNAL_SERVER_ERROR);
   }

}
