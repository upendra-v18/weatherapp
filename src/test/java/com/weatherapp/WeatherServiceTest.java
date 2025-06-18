package com.weatherapp;

import com.weatherapp.service.WeatherService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceTest {

    @Test
    void testGetWeatherWithValidCity() {
        WeatherService weatherService = new WeatherService();
        String response = weatherService.getWeather("Delhi");

        // Check if result is not null and contains city name
        assertNotNull(response, "Response should not be null");
        assertTrue(response.contains("Delhi"), "Response should contain the city name");
    }
}
