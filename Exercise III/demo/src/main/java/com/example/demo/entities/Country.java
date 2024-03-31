package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @SequenceGenerator(name = "country_country_id_seq", sequenceName = "country_country_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_country_id_seq")
    @Column(name = "country_id")
    private Long id;

    @Column(name = "country")
    private String Country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
