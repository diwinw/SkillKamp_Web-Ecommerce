package com.skill.kamp.web.controller;

import com.skill.kamp.web.config.JwtUtil;
import com.skill.kamp.web.model.LoginModel;
import com.skill.kamp.web.model.UserModel;
import com.skill.kamp.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "true" , allowCredentials = "true")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserModel signupRequest) {
        if(signupRequest.getEmail()!=null&& userRepository.checkUserExist(signupRequest.getEmail())!=0) {
            return new ResponseEntity("Username is already taken!",
                    HttpStatus.BAD_REQUEST);
        }
        userRepository.createNewUser(signupRequest.getName(),signupRequest.getEmail(),signupRequest.getPassword());
        return new ResponseEntity("create user success",
                HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginModel signupRequest) {
        if(signupRequest.getEmail()!=null
                && signupRequest .getPassword()!= null
                && userRepository.checkUserLogin(signupRequest.getEmail(),signupRequest.getPassword())==1) {
            final String token = jwtUtil.generateToken(signupRequest.getEmail());
            jwtUtil.putToken(token, new HashMap<>());
            return ResponseEntity.ok(token);
        }else{
            return new ResponseEntity("login fail",
                    HttpStatus.BAD_REQUEST  );
        }

    }
}
