package com.zett.schedule.app.userservice.controller;

import com.zett.schedule.app.userservice.model.UserInfo;
import com.zett.schedule.app.userservice.repository.UserInfoRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RepositoryRestController
public class UserInfoController {
    private final UserInfoRepository userRepository;
    private final RabbitTemplate rabbitTemplate;
    @Value("${zett.rabbitmq.queue}")
    String queueName;

    public UserInfoController(UserInfoRepository userRepository, RabbitTemplate rabbitTemplate) {
        this.userRepository = userRepository;
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/userInfoes")
    public ResponseEntity<List<UserInfo>> getUserInfoes() {
        List<UserInfo> all = userRepository.findAll();
        rabbitTemplate.convertAndSend(queueName, "UserController is getting users");
        return ResponseEntity.ok(all);
    }
}
