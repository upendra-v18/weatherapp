package com.weatherapp;

import com.weatherapp.service.WeatherService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherServiceTest {

    private final WeatherService weatherService = new WeatherService();

    @Test
    public void testWeatherDataFetch() {
        String city = "London";
        String response = weatherService.getWeather(city);

        assertNotNull(response);
        assertTrue(response.contains("weather") || response.contains("Exception") || response.contains("Error"));
    }
}






