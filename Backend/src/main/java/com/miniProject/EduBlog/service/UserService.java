package com.miniProject.EduBlog.service;

import com.miniProject.EduBlog.entity.User;
import com.miniProject.EduBlog.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ✅ Implementing getAllUsers()
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }    
}
