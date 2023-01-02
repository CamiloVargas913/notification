package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.models.TypeNotification;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service related with user functionalities
 * @version: 02/01/2023
 */
@Service
public class UserService {
    public List<User> userList;

    public List<TypeNotification> chanels;

    public List<Category> subscripts;

    public UserService() {
        userList = new ArrayList<User>();
        chanels = new ArrayList<TypeNotification>();
        subscripts = new ArrayList<Category>();
        var chanel = new TypeNotification();
        chanel.id = 1;
        chanel.nameTypeNotification = "SMS";
        chanels.add(chanel);
        chanels.add(chanel);

        var subscrip = new Category();
        subscrip.id = 1;
        subscrip.nameCategory = "Movies";

        subscripts.add(subscrip);
        subscripts.add(subscrip);

        var user1 = new User();
        user1.id = 1;
        user1.email = "usuario1@gmail.com";
        user1.name = "Usuario 01";
        user1.phoneNumber = "3124567891";
        user1.channels = chanels;
        user1.subscribed = subscripts;
        userList.add(user1);
        userList.add(user1);
    }

    public List<User> GetAllusers() {
        return userList;
    }

    public List<User> FindCategory() {
        return null;
    }
}
