package com.zett.schedule.app.userservice.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationReceiver {

    @RabbitListener(queues = "${zett.rabbitmq.queue}")
    public void receive(String in) {
        System.out.println(" User Service received this bro: " + in);
    }
}