package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.models.Notification;
import com.example.demo.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Mock
    private UserService userService;
    @InjectMocks
    private NotificationService notificationService;
    private List<Category> espera;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        espera = new ArrayList<Category>();
       var obje = new Category();
        obje.id = 1;
        obje.nameCategory = "Sports";

        espera.add(obje);
    }

    @Test
    void sendNotificaction() {
        Notification channelMock = mock(Notification.class);
        verify(channelMock, atLeastOnce());
    }
}