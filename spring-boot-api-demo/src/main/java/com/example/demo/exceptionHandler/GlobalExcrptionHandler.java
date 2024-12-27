package com.example.demo.exceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExcrptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException ex)
    {

        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        Map<String,String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach(e ->
        {
            String fieldname=    ((FieldError) e).getField();

            String error= e.getDefaultMessage();

            errors.put(fieldname, error);

           

        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        
    }

    
}
