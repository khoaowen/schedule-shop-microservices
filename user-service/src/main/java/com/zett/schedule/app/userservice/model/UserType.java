package com.zett.schedule.app.userservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "usertype")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String note;
    private String enteredBy;
    private Date enteredDate;
    private String modifiedBy;
    private Date modifiedDate;
    private Date endedDate;

}
