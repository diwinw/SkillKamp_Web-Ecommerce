package com.skill.kamp.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skill.kamp.web.config.JwtUtil;
import com.skill.kamp.web.model.Product;
import com.skill.kamp.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "true" , allowCredentials = "true")
public class CartController {
    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllCart(@RequestHeader("token") String token) throws JsonProcessingException {
        if(token== null || jwtUtil.getToken(token) == null){
            return new ResponseEntity("auth fail",
                    HttpStatus.BAD_REQUEST  );
        }
        Map<String,String> result = jwtUtil.getToken(token);
        List<Product> allItems = new ArrayList<>();
        for(String id : result.keySet()){
            Product product = productService.getProductById(id);
            product.setStock(Integer.parseInt(result.get(id)));
            allItems.add(product) ;

        }
        return ResponseEntity.ok(allItems);
    }

    @GetMapping("/update")
    public ResponseEntity<?> updateCart(@RequestHeader("token") String token,@RequestHeader("id") String id ,@RequestHeader("quantity") String quantity ) {
        Map<String,String> listItems =  jwtUtil.getToken(token);
        if(token== null || listItems == null){
            return new ResponseEntity("auth fail",
                    HttpStatus.BAD_REQUEST  );
        }
        Map<String,String> addItem = new HashMap<>();
        addItem.put(id,quantity);
        jwtUtil.updateToken(token,addItem);
        return ResponseEntity.ok(jwtUtil.getToken(token));
    }

    @GetMapping("/remove")
    public ResponseEntity<?> deleteCart(@RequestHeader("token") String token,@RequestHeader("id") String id  ) {
        Map<String,String> listItems =  jwtUtil.getToken(token);
        if(token== null || listItems == null){
            return new ResponseEntity("auth fail",
                    HttpStatus.BAD_REQUEST  );
        }
        jwtUtil.deleteToken(token,id);
        return ResponseEntity.ok(jwtUtil.getToken(token));
    }

}
