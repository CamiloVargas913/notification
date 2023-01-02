package com.example.demo.models;

import com.example.demo.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class defines a DTO of a Notification .
 * @version: 02/01/2023
 */
public class PushNotification extends Notification {
    private static Logger logger = LoggerFactory.getLogger(NotificationService.class);
    public static int CHANNEL_ID = 3;

    public PushNotification(int id, String messaje, int channel) {
        super(id, messaje, channel);
    }

    /**
     * Method that sends a push notification to a user through an specific channel
     * @version: 02/01/2023
     * @return void
     */
    @Override
    public void sendNotification() {
        logger.info("======================================");
        logger.info("Notification already sent to: " + getUser().getName());
        logger.info("Content: " + getMessaje());
        logger.info("Channel: Push notification");
        logger.info("======================================");
    }
}
