package com.zett.schedule.app.userservice.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "notificationQueue")
public class NotificationReceiver {
    @RabbitHandler
    public void receive(String in) {
        System.out.println(" User Service received this bro " + in);
    }
}