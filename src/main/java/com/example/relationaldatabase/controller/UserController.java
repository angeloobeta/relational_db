package com.example.relationaldatabase.controller;

import com.example.relationaldatabase.entity.User;
import com.example.relationaldatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class UserController {

    @Autowired
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
