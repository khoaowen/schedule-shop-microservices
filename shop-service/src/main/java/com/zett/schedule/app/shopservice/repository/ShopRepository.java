package com.zett.schedule.app.shopservice.repository;

import com.zett.schedule.app.shopservice.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ShopRepository extends JpaRepository<Shop, Long> {
}
