package com.skill.kamp.web.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @MockBean
    ProductRepository productRepository;

    public String getListProduct(){
        return "[{\"id\":\"p001\",\"name\":\"เสื้อสีเขียว\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":100,\"stock\":50,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product1.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p002\",\"name\":\"เสื้อสีชมพู\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":150,\"stock\":25,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product2.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p003\",\"name\":\"เสื้อสีขาวลายน้ำเงิน\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":200,\"stock\":10,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product3.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p004\",\"name\":\"เสื้อสีแดง\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":300,\"stock\":5,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product4.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p005\",\"name\":\"เสื้อลายตาราง\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product5.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p006\",\"name\":\"เสื้อลายมินิมอล\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product6.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p007\",\"name\":\"ขุดบอดี้สูทขาว\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product7.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p008\",\"name\":\"ขุดบอดี้สูทจุดแดง\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product8.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p009\",\"name\":\"ขุดบอดี้สูท\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product9.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p010\",\"name\":\"ขุดบอดี้สูท2\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product10.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p011\",\"name\":\"ขุดบอดี้สูทดำ\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product11.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"},{\"id\":\"p012\",\"name\":\"ขุดบอดี้สูท3\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":50,\"stock\":100,\"category_id\":\"c002\",\"image\":\"http://localhost:8844/api/images/Product12.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"}]";
    }

    public String getProduct(){
        return "[{\"id\":\"p001\",\"name\":\"เสื้อสีเขียว\",\"description\":\"This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable.\\\\n It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. \\\\nThe t-shirt has a stylish design with vibrant colors that wont fade after washing. \\\\nIt is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.\",\"price\":100,\"stock\":50,\"category_id\":\"c001\",\"image\":\"http://localhost:8844/api/images/Product1.png\",\"created_date\":\"2023-04-06T20:30:27.974191\",\"created_by\":\"admin\",\"updated_date\":\"2023-04-06T20:30:27.974191\",\"updated_by\":\"admin\"}]";
    }


    @Test
    public void shouldReturnAllProductWhenGetAllProducts() throws JsonProcessingException {
        when(productRepository.getAllProduct()).thenReturn(getListProduct());
        List<Product> resultList = productService.getAllProducts();
        assertNotNull (resultList);
    }

    @Test
    public void shouldReturnProductWhenGetProductsById() throws JsonProcessingException {
        when(productRepository.getProductById("test")).thenReturn(getProduct());
        Product resultList = productService.getProductById("test");
        assertNotNull (resultList);
    }

    @Test
    public void shouldReturnProductWhenGetProductsByFilter() throws JsonProcessingException {
        when(productRepository.getProductByFilter("test")).thenReturn(getProduct());
        List<Product> resultList = productService.getProductByFilter("test");
        assertNotNull (resultList);
    }
}
