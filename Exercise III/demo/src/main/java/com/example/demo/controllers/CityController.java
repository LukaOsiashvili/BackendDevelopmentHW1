package com.example.demo.controllers;

import com.example.demo.entities.City;
import com.example.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private final CityService cityService;


    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    //If We Want To Get Whole City Entity
    @RequestMapping(value = "/method1/{country}", method = RequestMethod.GET, produces = {"application/json"})
    public List<City> getCityEntitiesByCountry(@PathVariable String country) {
        return cityService.getCityEntitiesByCountry(country);
    }

    //If We Want To Get Only City Names
    @RequestMapping(value = "/method2/{country}", method = RequestMethod.GET, produces = {"application/json"})
    public List<String> getCitiesByCountry(@PathVariable String country) {
        return cityService.getCitiesByCountry(country);
    }
}
