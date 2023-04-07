package com.skill.kamp.web.controller;

import com.skill.kamp.web.config.JwtUtil;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.service.ProductService;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ProductService productService;

    @MockBean
    JwtUtil jwtUtil;


    @Test
    public void testGetAllProducts() throws Exception {
        String url = "/api/products";
        Product product = new Product();
        product.setId("test1");
        product.setStock(1);
        product.setName("test1");
        product.setImage("test1");
        product.setPrice(2);
        product.setCategory_id("test1");
        product.setCreated_by("test");
        product.setUpdated_by("test");
        List<Product> list = new ArrayList<>();
        list.add(product);
        given(productService.getAllProducts()).willReturn(list);
        mockMvc.perform(get(url))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product();
        product.setId("test1");
        product.setStock(1);
        product.setName("test1");
        product.setImage("test1");
        product.setPrice(2);
        product.setCategory_id("test1");
        product.setCreated_by("test");
        product.setUpdated_by("test");

        given(productService.getProductById("test1")).willReturn(product);

        mockMvc.perform(get("/api/products/test1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

    }

    @Test
    public void testGetProductByFilter() throws Exception {
        Product product = new Product();
        product.setId("test1");
        product.setStock(1);
        product.setName("test1");
        product.setImage("test1");
        product.setPrice(2);
        product.setCategory_id("test1");
        product.setCreated_by("test");
        product.setUpdated_by("test");
        List<Product> list = new ArrayList<>();
        list.add(product);

        given(productService.getProductByFilter("test1")).willReturn(list);

        mockMvc.perform(get("/api/products/filter/test1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

    }


}
