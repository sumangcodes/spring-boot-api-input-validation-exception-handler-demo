package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import com.example.demo.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @PostMapping
    public  ResponseEntity<Product>  createProduct(@Valid @RequestBody  Product product)
    {
        System.out.println("ttttttttttttttttttttttttttttttttttttttttt");
            return new ResponseEntity<>(product,HttpStatus.CREATED);
    }
    
}
