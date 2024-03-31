package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    //If We Want To Return Whole City Entity
    public List<City> getCityEntitiesByCountry(String countryName) {
        return cityRepository.findByCountry_CountryName(countryName);
    }

    //If We Want To Return Only City Names
    public List<String> getCitiesByCountry(String countryName) {
        List<City> cities = cityRepository.findByCountry_CountryName(countryName);
        List<String> cityNames = new ArrayList<>();
        for (City city : cities) {
            cityNames.add(city.getCity());
        }
        return cityNames;
    }

}
