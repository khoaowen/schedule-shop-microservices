package com.zett.schedule.app.shopservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {
    @Value("${zett.rabbitmq.queue}")
    String queueName;

    public Queue notificationQueue() {
        return new Queue(queueName, false);
    }

}
