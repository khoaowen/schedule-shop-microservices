package com.zett.schedule.app.shopservice.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationReceiver {

    @RabbitListener(queues = "${zett.rabbitmq.queue}")
    public void receive(String in) {
        System.out.println(" Shop Service received this bro " + in);
    }
}
