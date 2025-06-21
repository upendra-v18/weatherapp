package com.weatherapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city) {
        return "Weather for " + city + ": [sample data]";
    }
}

