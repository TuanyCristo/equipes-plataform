package com.equipes_microservices.service_core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private long id;
    private String name;
    private String phonenumber;
    private User user;
    private Address address;
}
