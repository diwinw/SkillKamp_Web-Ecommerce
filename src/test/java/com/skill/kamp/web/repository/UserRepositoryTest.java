package com.skill.kamp.web.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void ShouldBeSuccessWhenCheckUser(){
        userRepository.checkUserLogin("dew","dew");
    }

//    @Test
//    public void ShouldBeSuccessWhenCreateUser(){
//        userRepository.createNewUser("test","dew","dew");
//    }

    @Test
    public void ShouldBeSuccessWhenCheckUserExist(){
        userRepository.checkUserExist("dew");
    }
}
