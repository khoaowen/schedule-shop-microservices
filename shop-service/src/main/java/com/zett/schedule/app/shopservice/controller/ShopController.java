package com.zett.schedule.app.shopservice.controller;

import com.zett.schedule.app.shopservice.model.Shop;
import com.zett.schedule.app.shopservice.repository.ShopRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RepositoryRestController
public class ShopController {
    private final ShopRepository shopRepository;
    private final RabbitTemplate rabbitTemplate;

    public ShopController(ShopRepository shopRepository, RabbitTemplate rabbitTemplate) {
        this.shopRepository = shopRepository;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping(path = "/shops")
    ResponseEntity<Shop> saveShop(@RequestBody Shop shop) {
        shopRepository.save(shop);
        rabbitTemplate.convertAndSend("notificationQueue", "Shop " + shop.getName() + " is created ");
        return ResponseEntity.ok().build();
    }
}
