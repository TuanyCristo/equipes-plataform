package com.equipes_microservices.service_core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "zip_id")
    private Zip zipcode;

}
