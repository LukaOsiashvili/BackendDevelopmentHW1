package com.example.demo.repositories;

import com.example.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByCountry_CountryName(String countryName);

}
