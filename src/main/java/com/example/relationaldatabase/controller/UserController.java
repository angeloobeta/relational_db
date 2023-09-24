package com.example.relationaldatabase.controller;

import com.example.relationaldatabase.entity.User;
import com.example.relationaldatabase.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping public class UserController {

    private UserService userService;
    @GetMapping("/users")
    public List<User> getAllUser(){
       return userService.getAllUser();
    }

    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User userdata){
        return userService.registerUser(userdata);
    }
}
