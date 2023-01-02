package com.example.demo.dao;

import com.example.demo.models.Notification;
import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;

public class NotificationDao {

    private List<User> filterUsersBySubscribed(List<Subscribed> subscribed) {
        List<User> subsUsers= new ArrayList<>();
        List<User> usuariosExistentes= new ArrayList<>();
        subscribed.forEach((subs)->{

        });
    }
    public void sendNotification(List<User> users, Notification notification) {

    }
}
