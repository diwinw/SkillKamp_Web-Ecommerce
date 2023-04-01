package com.skill.kamp.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() throws JsonProcessingException {
        return productService.getAllProducts();
    }
//
//    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable Long id) throws Exception {
//        return productService.getProductById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Product createProduct(@RequestBody Product product) {
//        return productService.createProduct(product);
//    }
//
//    @PutMapping("/{id}")
//    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) throws Exception {
//        return productService.updateProduct(id, productDetails);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteProduct(@PathVariable Long id) throws Exception {
//        productService.deleteProduct(id);
//    }
}
