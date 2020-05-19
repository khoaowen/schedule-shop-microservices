package com.zett.schedule.app.userservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "userinfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "USER_TYPE")
    private UserType userType;
    private String email;
    private String password;
}
