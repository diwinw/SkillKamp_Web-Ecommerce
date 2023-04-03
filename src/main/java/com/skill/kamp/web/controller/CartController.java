package com.skill.kamp.web.controller;

import com.skill.kamp.web.config.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "true" , allowCredentials = "true")
public class CartController {
    @Autowired
    JwtUtil jwtUtil;

    @GetMapping
    public ResponseEntity<?> getAllCart(@RequestHeader("token") String token) {
        if(token== null || jwtUtil.getToken(token) == null){
            return new ResponseEntity("auth fail",
                    HttpStatus.BAD_REQUEST  );
        }
        return ResponseEntity.ok(jwtUtil.getToken(token));
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
