package com.example.relationaldatabase.service;

import com.example.relationaldatabase.entity.User;
import com.example.relationaldatabase.repository.UserRepository;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User registerUser(User user);

}
