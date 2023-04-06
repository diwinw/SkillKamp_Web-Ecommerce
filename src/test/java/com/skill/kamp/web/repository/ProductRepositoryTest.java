package com.skill.kamp.web.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void shouldBeSuccessWhenGetAllProduct(){
        productRepository.getAllProduct();
    }
    @Test
    public void shouldBeSuccessWhenGetProductById(){
        productRepository.getProductById("p001");
    }
    @Test
    public void shouldBeSuccessWhenGetProductByFilter(){
        productRepository.getProductByFilter("p001");
    }
}
