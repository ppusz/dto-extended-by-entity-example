package com.example.entityextendendingpojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "usr")
@Entity
//@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "usr_id")),
        @AttributeOverride(name = "name", column = @Column(name = "usr_name")),
        @AttributeOverride(name = "lastModified", column = @Column(name = "usr_last_modified"))
})
public class User extends UserDTO {

    private LocalDateTime lastModified;

}
