package com.example.smart_city.service;

import com.example.smart_city.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<String, String> users = new HashMap<>();
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean registerUser(User user) {
        if (users.containsKey(user.getEmail())) {
            return false; // Email already exists
        }
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        users.put(user.getEmail(), encodedPassword);
        return true;
    }

    public boolean authenticate(String email, String rawPassword) {
        String encodedPassword = users.get(email);
        return encodedPassword != null && passwordEncoder.matches(rawPassword, encodedPassword);
    }
}

