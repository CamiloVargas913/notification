package com.example.demo.models;

import com.example.demo.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class defines the notification type Email.
 * @version: 02/01/2023
 */
public class Email extends Notification {
    private static Logger logger = LoggerFactory.getLogger(NotificationService.class);
    public static int CHANNEL_ID = 2;

    public Email(int id, String messaje, int channel) {
        super(id, messaje, channel);
    }

    /**
     * Method that sends an Email to a user through an specific channel
     * @version: 02/01/2023
     * @return void
     */
    @Override
    public void sendNotification() {
        logger.info("======================================");
        logger.info("Notification already sent to: " + getUser().getName());
        logger.info("Content: " + getMessaje());
        logger.info("Channel: Email");
        logger.info("======================================");
    }
}
