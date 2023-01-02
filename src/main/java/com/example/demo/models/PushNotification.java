package com.example.demo.models;

import com.example.demo.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushNotification extends Notification {
    private static Logger logger = LoggerFactory.getLogger(NotificationService.class);
    public static int CHANNEL_ID = 3;
    public PushNotification(int id, String messaje, int channel) {
        super(id, messaje, channel);
    }

    @Override
    public void sendNotification() {
        logger.info("======================================");
        logger.info("Notification already sent to: "+ getUser().getName());
        logger.info("Content: "+ getMessaje());
        logger.info("Channel: Push notification");
        logger.info("======================================");
    }
}
