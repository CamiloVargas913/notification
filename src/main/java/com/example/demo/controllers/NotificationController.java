package com.example.demo.controllers;

import com.example.demo.models.NotificationDTO;
import com.example.demo.models.User;
import com.example.demo.services.NotificationService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @PostMapping()
    public void NotificationUsers(@RequestBody NotificationDTO data){
        notificationService.SendNotificaction(data);
    }
}
