package com.dh.productservice.controller;

import com.dh.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductRestController {

    @GetMapping()
    public Product getProduct(@RequestParam String id, @RequestParam(defaultValue= "false") Boolean throwError) {
        if(throwError) {
            throw new RuntimeException();
        }
        return new Product(id, "Mouse", 10.0, "Instance 2");
    }
}