package com.example.demo.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "city")
public class City {

    @Id
    @SequenceGenerator(name = "city_city_id_seq", sequenceName = "city_city_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_city_id_seq")
    @Column(name = "city_id")
    private Long id;

    @Column(name = "city")
    private String city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Column(name = "country_id")
    private Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
