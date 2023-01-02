package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.models.TypeNotification;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    public UserService() {

    }

    public List<User> GetAllusers() {

         List<User> userList=  new ArrayList<User>();

         List<TypeNotification> chanels = new ArrayList<TypeNotification>();

         List<Category> subscripts = new ArrayList<Category>();
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
        user1.Email = "usuario1@gmail.com";
        user1.Name = "Usuario 01";
        user1.PhoneNumber = "3124567891";
        user1.Channels = chanels;
        user1.Subscribed = subscripts;
        userList.add(user1);
        userList.add(user1);
        return userList;
    }
}
