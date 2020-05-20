package com.zett.schedule.app.shopservice.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "notificationQueue")
public class NotificationReceiver {
    @RabbitHandler
    public void receive(String in) {
        System.out.println(" Shop Service received this bro " + in);
    }
}
