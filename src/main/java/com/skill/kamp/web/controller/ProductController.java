package com.skill.kamp.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "true" , allowCredentials = "true")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() throws JsonProcessingException {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public List<Product> getProductsId(@PathVariable String id) throws JsonProcessingException {
        return productService.getProductById(id);
    }

    @GetMapping("/filter/{filter}")
    public List<Product> getProductsFilter(@PathVariable String filter) throws JsonProcessingException {
        return productService.getProductByFilter(filter);
    }

}
