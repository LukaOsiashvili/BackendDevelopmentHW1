package com.example.demo.dto;

import com.example.demo.entities.Country;

public class CityDTO {

    private String cityName;
    private Country country;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
