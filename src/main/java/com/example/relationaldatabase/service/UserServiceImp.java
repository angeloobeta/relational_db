package com.example.relationaldatabase.service;

import com.example.relationaldatabase.entity.User;
import com.example.relationaldatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
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
