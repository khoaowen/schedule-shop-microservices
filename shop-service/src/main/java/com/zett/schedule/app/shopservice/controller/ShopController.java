package com.zett.schedule.app.shopservice.controller;

import com.zett.schedule.app.shopservice.repository.ShopRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    private final ShopRepository shopRepository;

    public ShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }
}
