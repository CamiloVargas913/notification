package com.example.demo.controllers;

import com.example.demo.models.Notification;
import com.example.demo.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @PostMapping()
    public void NotificationUsers(@RequestBody Notification data){
        notificationService.SendNotificactio(data);
    }
}
