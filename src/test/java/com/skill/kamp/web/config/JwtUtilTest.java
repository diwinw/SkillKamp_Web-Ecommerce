package com.skill.kamp.web.config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest

public class JwtUtilTest {
    @Test
    public void test(){
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("key1","v1");

        map1.put("key2","v2");

        map2.put("key1","v3");
        map2.put("key3","v3");

        map1.putAll(map2);

        System.out.println(map1);

    }

}
