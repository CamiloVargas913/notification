package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        var user1 = new User();
        user1.id = 1;
        user1.Email = "usuario1@gmail.com";
        user1.Name = "Usuario 01";
        user1.PhoneNumber = "";

    }
}
