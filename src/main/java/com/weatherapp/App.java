package com.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("Weather App is running!");
    }

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city) {
        return "Weather for " + city + ": [sample data]";
    }
}

