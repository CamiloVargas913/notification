package com.example.demo.services;

import com.example.demo.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service to send notifications
 * @version: 02/01/2023
 */
@Service
public class NotificationService {
<<<<<<< HEAD
    @Autowired
    private UserService userService;

    public void SendNotificaction(NotificationDTO data) {
        List<User> users = userService.FindUserCategory(data.categoriesList);
=======
    private static Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void SendNotificaction(List<User> users, NotificationDTO data) {
        logger.info("======================================");
>>>>>>> fe40fb1645400fa396448bceb276960324b09fe8
        users.forEach(user -> {
            user.channels.forEach(channel -> {
                if (channel.id == Email.CHANNEL_ID) {
                    Email email = new Email(1, data.message, Email.CHANNEL_ID);
                    email.setId(1);
                    email.setChannel(Email.CHANNEL_ID);
                    email.setUser(user);
                    email.setMessaje(data.message);
                    email.sendNotification();
                } else if (channel.id == PushNotification.CHANNEL_ID) {
                    PushNotification pushNot = new PushNotification(1, data.message, PushNotification.CHANNEL_ID);
                    pushNot.setId(1);
                    pushNot.setChannel(Email.CHANNEL_ID);
                    pushNot.setUser(user);
                    pushNot.setMessaje(data.message);
                    pushNot.sendNotification();
                } else if (channel.id == SMS.CHANNEL_ID) {
                    SMS sms = new SMS(1, data.message, SMS.CHANNEL_ID);
                    sms.setId(1);
                    sms.setChannel(Email.CHANNEL_ID);
                    sms.setUser(user);
                    sms.setMessaje(data.message);
                    sms.sendNotification();
                }
            });
        });
    }
}
