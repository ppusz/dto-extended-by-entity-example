package com.example.entityextendendingpojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class UserDTO {

    @Id
    protected Long id;

    protected String name;
}
