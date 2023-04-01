package com.skill.kamp.web.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
@Repository
public class ProductRepository {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public String getAllProduct(){
        String sql = "select array_to_json(array_agg(LIST.*)) as product from (select * from  ecommerce.product ) LIST ";

        HashMap<String,Object> params = new HashMap<>();
        return namedParameterJdbcTemplate.queryForObject(sql,params,String.class);

    }
}
