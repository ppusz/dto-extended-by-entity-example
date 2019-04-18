package com.example.entityextendendingpojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "addresses")
@Entity
@Data
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "add_id")),
        @AttributeOverride(name = "address", column = @Column(name = "add_name")),
        @AttributeOverride(name = "lastModified", column = @Column(name = "add_last_modified"))
})
public class Address extends AddressDTO {

    private LocalDateTime lastModified;
}
