package com.example.eurekaclient.controller;

import com.example.eurekaclient.entity.User;
import com.example.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @GetMapping("/insert")
    public Boolean insert(@RequestParam("id") Integer id ,
                          @RequestParam("age") Integer age,
                          @RequestParam("name") String name) {
        User user = new User();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        return userService.save(user);
    }


}