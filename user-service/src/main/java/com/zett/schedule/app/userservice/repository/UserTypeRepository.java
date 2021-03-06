package com.zett.schedule.app.userservice.repository;

import com.zett.schedule.app.userservice.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
