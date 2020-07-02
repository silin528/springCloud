package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.entity.User;
import com.example.eurekaclient.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {


    @Autowired
    private UserService userService;

    @Test
    void save() {
        User user = new User();
        user.setId(1);
        user.setAge(21);
        user.setName("婷婷");
        System.out.println(user);
        userService.save(user);
    }

//    @Test
//    void getUserList() {
//        System.out.println(userService);
//        List<User> userList =  userService.getUserList();
//        System.out.println(userList);
//    }
}