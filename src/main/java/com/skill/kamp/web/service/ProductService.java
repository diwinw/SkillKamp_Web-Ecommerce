package com.skill.kamp.web.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    ObjectMapper objectMapper = new ObjectMapper();
    List<Product> productList = null;
    public List<Product> getAllProducts() throws JsonProcessingException {
        String productJson = productRepository.getAllProduct();
        productList = objectMapper.readValue(productJson, new TypeReference<List<Product>>() {});
        return productList;
    }

    public List<Product> getProductById(String id) throws JsonProcessingException {
        String productJson = productRepository.getProductById(id);
        productList = objectMapper.readValue(productJson, new TypeReference<List<Product>>() {});
        return productList;
    }


    public List<Product> getProductByFilter(String filter) throws JsonProcessingException {
        String productJson = productRepository.getProductByFilter(filter);
        productList = objectMapper.readValue(productJson, new TypeReference<List<Product>>() {});
        return productList;
    }
}
