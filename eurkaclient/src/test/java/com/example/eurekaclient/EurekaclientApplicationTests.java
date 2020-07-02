package com.example.eurekaclient;

import com.example.eurekaclient.entity.User;
import com.example.eurekaclient.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EurekaclientApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setId(1);
        user.setAge(21);
        user.setName("婷婷");
        userMapper.insert(user);
    }
    
}
