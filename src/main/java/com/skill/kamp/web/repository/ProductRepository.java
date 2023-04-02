package com.skill.kamp.web.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

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

    public String getProductById(String id){
        String sql = "select array_to_json(array_agg(LIST.*)) as product from (select * from  ecommerce.product where id = '"+id+"' ) LIST ";

        HashMap<String,Object> params = new HashMap<>();
        return namedParameterJdbcTemplate.queryForObject(sql,params,String.class);

    }

    public String getProductByFilter(String filter){
        String sql = "select array_to_json(array_agg(LIST.*)) as product from (select * from  ecommerce.product where category_id = '"+filter+"' ) LIST ";

        HashMap<String,Object> params = new HashMap<>();
        return namedParameterJdbcTemplate.queryForObject(sql,params,String.class);

    }
}
