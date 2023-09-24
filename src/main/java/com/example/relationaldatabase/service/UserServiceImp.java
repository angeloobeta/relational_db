package com.example.relationaldatabase.service;

import com.example.relationaldatabase.entity.User;
import com.example.relationaldatabase.repository.UserRepository;

import java.util.List;

public class UserServiceImp implements UserService{
    private UserRepository userRepository;
    @Override
     public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
