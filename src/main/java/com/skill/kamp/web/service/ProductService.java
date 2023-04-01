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

    public List<Product> getAllProducts() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String productJson = productRepository.getAllProduct();
        List<Product> productList = objectMapper.readValue(productJson, new TypeReference<List<Product>>() {});
        return productList;
    }
//
//    public Product getProductById(Long id) throws Exception {
//        return productRepository.findById(id).orElseThrow(() -> new Exception("Product not found with id " + id));
//    }
//
//    public Product createProduct(Product product) {
//        return productRepository.save(product);
//    }
//
//    public Product updateProduct(Long id, Product productDetails) throws Exception {
//        Product product = productRepository.findById(id).orElseThrow(() -> new Exception("Product not found with id " + id));
//
//        product.setName(productDetails.getName());
//        product.setDescription(productDetails.getDescription());
//        product.setPrice(productDetails.getPrice());
//        product.setStock(productDetails.getStock());
//        product.setCategory(productDetails.getCategory());
//        product.setImage(productDetails.getImage());
//        product.setUpdatedBy(productDetails.getUpdatedBy());
//
//        return productRepository.save(product);
//    }
//
//    public void deleteProduct(Long id) throws Exception {
//        Product product = productRepository.findById(id).orElseThrow(() -> new Exception("Product not found with id " + id));
//
//        productRepository.delete(product);
//    }
}
